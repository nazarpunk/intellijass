package guru.xgm.jass.openapi.actionSystem.convert.jass2angelscript;

import guru.xgm.jass.openapi.actionSystem.convert.Jass2AnyVisitor;
import guru.xgm.jass.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Objects;

public class Jass2AngelScriptVisitor extends Jass2AnyVisitor {

    Jass2AngelScriptVisitor() {

    }

    @Override
    public @NotNull String getConvertedTypeName(@NotNull String type) {
        return switch (type) {
            case "integer" -> "int";
            case "real" -> "float";
            case "boolean" -> "bool";
            default -> type;
        };
    }

    @Override
    public void appendString(@NotNull String str) {
        stringBuffer.append("\"\"").append(str).append("\"\"");
    }

    @Override
    public void appendReal(@NotNull String real) {
        stringBuffer.append(real).append("f");
    }

    // --- variable
    private void appendVarExpr(@Nullable JassExpr expr) {
        if (expr == null) return;
        if (Objects.equals(expr.getText(), "null")) return;
        stringBuffer.append(" = ");
        expr.accept(this);
    }

    @Override
    public void appendVar(boolean constant, boolean global, boolean array, @NotNull String type, String name, @Nullable JassExpr expr) {
        if (constant) stringBuffer.append("const ");
        if (array) {
            stringBuffer.append("array<").append(type).append("> ").append(name);
        } else {
            stringBuffer.append(type).append(" ").append(name);
            appendVarExpr(expr);
        }
        appendStatementLineEnd();
    }

    // --- function
    @Override
    public void appendFunction(@Nullable String returns, String name, @NotNull List<JassParam> params, @NotNull List<JassStmt> statements) {
        if (returns == null) {
            stringBuffer.append("void");
        } else {
            if (returns.equals("code")) {
                stringBuffer.append("BoolexprFunc@");
            } else {
                stringBuffer.append(returns);
            }
        }
        stringBuffer.append(' ').append(name).append("(");
        for (int i = 0; i < params.size(); i++) {
            final var param = params.get(i);
            final var type = param.getTypeName();
            if (type.getCode() != null) {
                stringBuffer.append("BoolexprFunc@");
            } else {
                stringBuffer.append(getConvertedTypeName(type.getText()));
            }
            stringBuffer.append(' ').append(param.getId().getText());
            if (i < params.size() - 1) stringBuffer.append(", ");
        }
        stringBuffer.append("){\n");
        for (JassStmt stmt : statements) stmt.accept(this);
        stringBuffer.append("}\n");
    }

    // --- statement

    // func as code
    @Override
    public void appendFunctionAsCode(@NotNull String name) {
        stringBuffer.append("@").append(name);
    }

    // if
    @Override
    public void visitIfStmt(@NotNull JassIfStmt o) {
        stringBuffer.append("if (");
        acceptExpr(o.getExpr());
        stringBuffer.append("){\n");
        for (JassStmt stmt : o.getStmtList()) stmt.accept(this);
        stringBuffer.append("}\n");
        for (JassElseIfStmt stmt : o.getElseIfStmtList()) stmt.accept(this);
        for (JassElseStmt stmt : o.getElseStmtList()) stmt.accept(this);
    }

    @Override
    public void visitElseIfStmt(@NotNull JassElseIfStmt o) {
        stringBuffer.append("else if (");
        acceptExpr(o.getExpr());
        stringBuffer.append("){\n");
        for (JassStmt stmt : o.getStmtList()) stmt.accept(this);
        stringBuffer.append("}\n");
    }

    @Override
    public void visitElseStmt(@NotNull JassElseStmt o) {
        stringBuffer.append("else {\n");
        for (JassStmt stmt : o.getStmtList()) stmt.accept(this);
        stringBuffer.append("}\n");
    }

    // set
    @Override
    public void visitSetStmt(@NotNull JassSetStmt o) {
        final var id = o.getId();
        if (id != null) stringBuffer.append(id.getText());
        final var arr = o.getArrayAccess();
        if (arr != null) arr.accept(this);
        final var expr = o.getExpr();
        if (expr != null) {
            stringBuffer.append(" = ");
            final String s = expr.getText();
            if (s.equals("null")) {
                stringBuffer.append("nil");
            } else {
                expr.accept(this);
            }
        }
        appendStatementLineEnd();
    }

    // loop
    @Override
    public void visitLoopStmt(@NotNull JassLoopStmt o) {
        stringBuffer.append("while (true) {\n");
        for (JassStmt stmt : o.getStmtList()) stmt.accept(this);
        stringBuffer.append("}\n");
    }

    @Override
    public void visitExitWhenStmt(@NotNull JassExitWhenStmt o) {
        final var expr = o.getExpr();
        if (expr == null) return;
        stringBuffer.append("if (");
        expr.accept(this);
        stringBuffer.append(") break;\n");
    }

}
