// This is a generated file. Not intended for manual editing.
package guru.xgm.vjass.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static guru.xgm.vjass.psi.VjassTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import guru.xgm.vjass.psi.*;

public class VjassFuncDefImpl extends ASTWrapperPsiElement implements VjassFuncDef {

  public VjassFuncDefImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VjassVisitor visitor) {
    visitor.visitFuncDef(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VjassVisitor) accept((VjassVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VjassFuncDefName getFuncDefName() {
    return findChildByClass(VjassFuncDefName.class);
  }

  @Override
  @Nullable
  public VjassFuncReturns getFuncReturns() {
    return findChildByClass(VjassFuncReturns.class);
  }

  @Override
  @Nullable
  public VjassFuncTakes getFuncTakes() {
    return findChildByClass(VjassFuncTakes.class);
  }

  @Override
  @NotNull
  public List<VjassStmt> getStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VjassStmt.class);
  }

  @Override
  @Nullable
  public VjassVis getVis() {
    return findChildByClass(VjassVis.class);
  }

}
