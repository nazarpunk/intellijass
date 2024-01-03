// This is a generated file. Not intended for manual editing.
package guru.xgm.zinc.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ZincBracedStmt extends PsiElement {

  @NotNull
  List<ZincBreakStmt> getBreakStmtList();

  @NotNull
  List<ZincCallSetStmt> getCallSetStmtList();

  @NotNull
  List<ZincDoStmt> getDoStmtList();

  @NotNull
  List<ZincForStmt> getForStmtList();

  @NotNull
  List<ZincIfStmt> getIfStmtList();

  @NotNull
  List<ZincLvarStmt> getLvarStmtList();

  @NotNull
  List<ZincReturnStmt> getReturnStmtList();

  @NotNull
  List<ZincWhileStmt> getWhileStmtList();

}
