// This is a generated file. Not intended for manual editing.
package me.rexim.morganey.plugin.parser.generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import me.rexim.morganey.plugin.parser.generated.psi.Binding;
import me.rexim.morganey.plugin.parser.generated.psi.Term;
import me.rexim.morganey.plugin.parser.generated.psi.Variable;
import me.rexim.morganey.plugin.parser.generated.psi.Visitor;
import org.jetbrains.annotations.NotNull;

public class BindingImpl extends ASTWrapperPsiElement implements Binding {

  public BindingImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitBinding(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }


  @NotNull
  @Override
  public Term getTerm() { return findNotNullChildByClass(Term.class); }

  @Override
  @NotNull
  public Variable getVariable() {
    return findNotNullChildByClass(Variable.class);
  }

}
