// This is a generated file. Not intended for manual editing.
package me.rexim.morganey.plugin.parser.generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import me.rexim.morganey.plugin.parser.generated.psi.Application;
import me.rexim.morganey.plugin.parser.generated.psi.Term;
import me.rexim.morganey.plugin.parser.generated.psi.Visitor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ApplicationImpl extends ASTWrapperPsiElement implements Application {

  public ApplicationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitApplication(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<Term> getTermList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Term.class);
  }

}
