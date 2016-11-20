// This is a generated file. Not intended for manual editing.
package me.rexim.morganey.plugin.parser.generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import me.rexim.morganey.plugin.parser.generated.psi.ModulePath;
import me.rexim.morganey.plugin.parser.generated.psi.Visitor;
import org.jetbrains.annotations.NotNull;

public class ModulePathImpl extends ASTWrapperPsiElement implements ModulePath {

  public ModulePathImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitModulePath(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

}
