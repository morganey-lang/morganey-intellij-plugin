// This is a generated file. Not intended for manual editing.
package me.rexim.morganey.plugin.parser.generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import me.rexim.morganey.plugin.parser.generated.psi.CharacterLiteral;
import me.rexim.morganey.plugin.parser.generated.psi.ListLiteral;
import me.rexim.morganey.plugin.parser.generated.psi.Literal;
import me.rexim.morganey.plugin.parser.generated.psi.NumericLiteral;
import me.rexim.morganey.plugin.parser.generated.psi.StringLiteral;
import me.rexim.morganey.plugin.parser.generated.psi.Visitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class LiteralImpl extends ASTWrapperPsiElement implements Literal {

  public LiteralImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitLiteral(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CharacterLiteral getCharacterLiteral() {
    return findChildByClass(CharacterLiteral.class);
  }

  @Override
  @Nullable
  public ListLiteral getListLiteral() {
    return findChildByClass(ListLiteral.class);
  }

  @Override
  @Nullable
  public NumericLiteral getNumericLiteral() {
    return findChildByClass(NumericLiteral.class);
  }

  @Override
  @Nullable
  public StringLiteral getStringLiteral() {
    return findChildByClass(StringLiteral.class);
  }

}
