// This is a generated file. Not intended for manual editing.
package me.rexim.morganey.plugin.parser.generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import me.rexim.morganey.plugin.parser.generated.psi.Loading;
import me.rexim.morganey.plugin.parser.generated.psi.ModulePath;
import me.rexim.morganey.plugin.parser.generated.psi.Visitor;
import org.jetbrains.annotations.NotNull;

public class LoadingImpl extends ASTWrapperPsiElement implements Loading {

  public LoadingImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitLoading(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ModulePath getModulePath() {
    return findNotNullChildByClass(ModulePath.class);
  }

}
