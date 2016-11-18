// This is a generated file. Not intended for manual editing.
package me.rexim.morganey.plugin.parser.generated;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import me.rexim.morganey.plugin.parser.generated.psi.impl.ApplicationImpl;
import me.rexim.morganey.plugin.parser.generated.psi.impl.BindingImpl;
import me.rexim.morganey.plugin.parser.generated.psi.impl.CharacterLiteralImpl;
import me.rexim.morganey.plugin.parser.generated.psi.impl.FunctionImpl;
import me.rexim.morganey.plugin.parser.generated.psi.impl.LambdaSymbolImpl;
import me.rexim.morganey.plugin.parser.generated.psi.impl.ListLiteralImpl;
import me.rexim.morganey.plugin.parser.generated.psi.impl.LiteralImpl;
import me.rexim.morganey.plugin.parser.generated.psi.impl.LoadingImpl;
import me.rexim.morganey.plugin.parser.generated.psi.impl.ModulePathImpl;
import me.rexim.morganey.plugin.parser.generated.psi.impl.NumberOrCharacterImpl;
import me.rexim.morganey.plugin.parser.generated.psi.impl.NumericLiteralImpl;
import me.rexim.morganey.plugin.parser.generated.psi.impl.StringLiteralImpl;
import me.rexim.morganey.plugin.parser.generated.psi.impl.VariableImpl;

public interface GeneratedTypes {

  IElementType APPLICATION = new IElementType("APPLICATION", null);
  IElementType BINDING = new IElementType("BINDING", null);
  IElementType FUNCTION = new IElementType("FUNCTION", null);
  IElementType LITERAL = new IElementType("LITERAL", null);
  IElementType LOADING = new IElementType("LOADING", null);
  IElementType VARIABLE = new IElementType("VARIABLE", null);

  IElementType CHARACTER_LITERAL = new IElementType("character_literal", null);
  IElementType LAMBDA_SYMBOL = new IElementType("lambda_symbol", null);
  IElementType LIST_LITERAL = new IElementType("list_literal", null);
  IElementType MODULE_PATH = new IElementType("module_path", null);
  IElementType NUMBER_OR_CHARACTER = new IElementType("number_or_character", null);
  IElementType NUMERIC_LITERAL = new IElementType("numeric_literal", null);
  IElementType STRING_LITERAL = new IElementType("string_literal", null);
  IElementType _TERM_ = new IElementType("<term>", null);

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == APPLICATION) {
        return new ApplicationImpl(node);
      }
      else if (type == BINDING) {
        return new BindingImpl(node);
      }
      else if (type == CHARACTER_LITERAL) {
        return new CharacterLiteralImpl(node);
      }
      else if (type == FUNCTION) {
        return new FunctionImpl(node);
      }
      else if (type == LAMBDA_SYMBOL) {
        return new LambdaSymbolImpl(node);
      }
      else if (type == LIST_LITERAL) {
        return new ListLiteralImpl(node);
      }
      else if (type == LITERAL) {
        return new LiteralImpl(node);
      }
      else if (type == LOADING) {
        return new LoadingImpl(node);
      }
      else if (type == MODULE_PATH) {
        return new ModulePathImpl(node);
      }
      else if (type == NUMBER_OR_CHARACTER) {
        return new NumberOrCharacterImpl(node);
      }
      else if (type == NUMERIC_LITERAL) {
        return new NumericLiteralImpl(node);
      }
      else if (type == STRING_LITERAL) {
        return new StringLiteralImpl(node);
      }
      else if (type == VARIABLE) {
        return new VariableImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
