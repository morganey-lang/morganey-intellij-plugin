// This is a generated file. Not intended for manual editing.
package me.rexim.morganey.plugin.parser.generated;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import static me.rexim.morganey.plugin.parser.generated.GeneratedTypes.APPLICATION;
import static me.rexim.morganey.plugin.parser.generated.GeneratedTypes.BINDING;
import static me.rexim.morganey.plugin.parser.generated.GeneratedTypes.CHARACTER_LITERAL;
import static me.rexim.morganey.plugin.parser.generated.GeneratedTypes.FUNCTION;
import static me.rexim.morganey.plugin.parser.generated.GeneratedTypes.LAMBDA_SYMBOL;
import static me.rexim.morganey.plugin.parser.generated.GeneratedTypes.LIST_LITERAL;
import static me.rexim.morganey.plugin.parser.generated.GeneratedTypes.LITERAL;
import static me.rexim.morganey.plugin.parser.generated.GeneratedTypes.LOADING;
import static me.rexim.morganey.plugin.parser.generated.GeneratedTypes.MODULE_PATH;
import static me.rexim.morganey.plugin.parser.generated.GeneratedTypes.NUMBER_OR_CHARACTER;
import static me.rexim.morganey.plugin.parser.generated.GeneratedTypes.NUMERIC_LITERAL;
import static me.rexim.morganey.plugin.parser.generated.GeneratedTypes.STRING_LITERAL;
import static me.rexim.morganey.plugin.parser.generated.GeneratedTypes.VARIABLE;
import static me.rexim.morganey.plugin.parser.generated.GeneratedTypes._TERM_;

import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class GeneratedParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == APPLICATION) {
      r = application(b, 0);
    }
    else if (t == BINDING) {
      r = binding(b, 0);
    }
    else if (t == CHARACTER_LITERAL) {
      r = consumeToken(b, CHARACTER_LITERAL);
    }
    else if (t == FUNCTION) {
      r = function(b, 0);
    }
    else if (t == LAMBDA_SYMBOL) {
      r = consumeToken(b, LAMBDA_SYMBOL);
    }
    else if (t == LIST_LITERAL) {
      r = consumeToken(b, LIST_LITERAL);
    }
    else if (t == LITERAL) {
      r = literal(b, 0);
    }
    else if (t == LOADING) {
      r = loading(b, 0);
    }
    else if (t == MODULE_PATH) {
      r = consumeToken(b, MODULE_PATH);
    }
    else if (t == NUMBER_OR_CHARACTER) {
      r = consumeToken(b, NUMBER_OR_CHARACTER);
    }
    else if (t == NUMERIC_LITERAL) {
      r = consumeToken(b, NUMERIC_LITERAL);
    }
    else if (t == STRING_LITERAL) {
      r = consumeToken(b, STRING_LITERAL);
    }
    else if (t == VARIABLE) {
      r = variable(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return term(b, l + 1);
  }

  /* ********************************************************** */
  // <term> <term> { <term> }
  public static boolean application(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "application")) return false;
    if (!nextTokenIs(b, _TERM_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = term(b, l + 1);
    r = r && term(b, l + 1);
    r = r && term(b, l + 1);
    exit_section_(b, m, APPLICATION, r);
    return r;
  }

  /* ********************************************************** */
  // <variable> ":=" <term>
  public static boolean binding(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binding")) return false;
    if (!nextTokenIs(b, _TERM_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable(b, l + 1);
    r = r && consumeToken(b, ":=");
    r = r && term(b, l + 1);
    exit_section_(b, m, BINDING, r);
    return r;
  }

  /* ********************************************************** */
  // '[\u0020-\u00B0]'
  //                       | '\\[\\'"bfnrt"']'
  public static boolean character_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "character_literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CHARACTER_LITERAL, "<character - literal>");
    r = consumeToken(b, "[\\u0020-\\u00B0]");
    if (!r) r = character_literal_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '\\[\\'"bfnrt"']'
  private static boolean character_literal_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "character_literal_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "\\\\[\\\\");
    r = r && consumeToken(b, "bfnrt");
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <lambda-symbol> <variable> "." { <variable> "." } <term>
  public static boolean function(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function")) return false;
    if (!nextTokenIs(b, LAMBDA_SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = lambda_symbol(b, l + 1);
    r = r && variable(b, l + 1);
    r = r && consumeToken(b, ".");
    r = r && function_3(b, l + 1);
    r = r && term(b, l + 1);
    exit_section_(b, m, FUNCTION, r);
    return r;
  }

  // <variable> "."
  private static boolean function_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable(b, l + 1);
    r = r && consumeToken(b, ".");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '[\""]'
  static boolean java_string_literal(PsiBuilder b, int l) {
    return consumeToken(b, "[\\\"\"]");
  }

  /* ********************************************************** */
  // "?"
  //                   | "\\"
  public static boolean lambda_symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_symbol")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LAMBDA_SYMBOL, "<lambda - symbol>");
    r = consumeToken(b, "?");
    if (!r) r = consumeToken(b, "\\");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "[" [ term { "," term } ] "]"
  //                  | "[" <term> [ "," <term> ] ".." <term> "]"
  public static boolean list_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LIST_LITERAL, "<list - literal>");
    r = list_literal_0(b, l + 1);
    if (!r) r = list_literal_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "[" [ term { "," term } ] "]"
  private static boolean list_literal_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_literal_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "[");
    r = r && list_literal_0_1(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  // [ term { "," term } ]
  private static boolean list_literal_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_literal_0_1")) return false;
    list_literal_0_1_0(b, l + 1);
    return true;
  }

  // term { "," term }
  private static boolean list_literal_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_literal_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = term(b, l + 1);
    r = r && list_literal_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "," term
  private static boolean list_literal_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_literal_0_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "[" <term> [ "," <term> ] ".." <term> "]"
  private static boolean list_literal_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_literal_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "[");
    r = r && term(b, l + 1);
    r = r && list_literal_1_2(b, l + 1);
    r = r && consumeToken(b, "..");
    r = r && term(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  // [ "," <term> ]
  private static boolean list_literal_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_literal_1_2")) return false;
    list_literal_1_2_0(b, l + 1);
    return true;
  }

  // "," <term>
  private static boolean list_literal_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_literal_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <numeric-literal>
  //             | <character-literal>
  //             | <string-literal>
  //             | <list-literal>
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = numeric_literal(b, l + 1);
    if (!r) r = character_literal(b, l + 1);
    if (!r) r = string_literal(b, l + 1);
    if (!r) r = list_literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "load" <module-path>
  public static boolean loading(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loading")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOADING, "<loading>");
    r = consumeToken(b, "load");
    r = r && module_path(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "[a-zA-Z][a-zA-Z0-9.]*"
  public static boolean module_path(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_path")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODULE_PATH, "<module - path>");
    r = consumeToken(b, "[a-zA-Z][a-zA-Z0-9.]*");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <numeric-literal>
  //                         | <character-literal>
  public static boolean number_or_character(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number_or_character")) return false;
    if (!nextTokenIs(b, "<number - or - character>", CHARACTER_LITERAL, NUMERIC_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMBER_OR_CHARACTER, "<number - or - character>");
    r = numeric_literal(b, l + 1);
    if (!r) r = character_literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "[0-9]+"
  public static boolean numeric_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numeric_literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMERIC_LITERAL, "<numeric - literal>");
    r = consumeToken(b, "[0-9]+");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <java-string-literal>
  public static boolean string_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_literal")) return false;
    if (!nextTokenIs(b, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = java_string_literal(b, l + 1);
    exit_section_(b, m, STRING_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // <function>
  static boolean term(PsiBuilder b, int l) {
    return function(b, l + 1);
  }

  /* ********************************************************** */
  // "[a-zA-Z][a-zA-Z0-9]*"
  public static boolean variable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE, "<variable>");
    r = consumeToken(b, "[a-zA-Z][a-zA-Z0-9]*");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
