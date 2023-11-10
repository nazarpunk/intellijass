// This is a generated file. Not intended for manual editing.
package guru.xgm.jass.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static guru.xgm.jass.psi.TypesJASS.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import guru.xgm.jass.psi.*;

public class JASSExpressionImpl extends ASTWrapperPsiElement implements JASSExpression {

  public JASSExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JASSVisitor visitor) {
    visitor.visitExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JASSVisitor) accept((JASSVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<JASSAdditionExpression> getAdditionExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JASSAdditionExpression.class);
  }

}
