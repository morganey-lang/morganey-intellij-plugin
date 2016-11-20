// This is a generated file. Not intended for manual editing.
package me.rexim.morganey.plugin.parser.generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import me.rexim.morganey.plugin.parser.generated.psi.Function;
import me.rexim.morganey.plugin.parser.generated.psi.LambdaSymbol;
import me.rexim.morganey.plugin.parser.generated.psi.Variable;
import me.rexim.morganey.plugin.parser.generated.psi.Visitor;
import org.jetbrains.annotations.NotNull;

import java.util.List;


public class FunctionImpl extends ASTWrapperPsiElement implements Function {

  public FunctionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitFunction(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public LambdaSymbol getLambdaSymbol() {
    return findNotNullChildByClass(LambdaSymbol.class);
  }

  @NotNull
  @Override
  public PsiElement getTerm() { return findNotNullChildByClass(PsiElement.class);}

  @Override
  @NotNull
  public List<Variable> getVariableList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Variable.class);
  }

}
