package ;

import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static generated.GeneratedTypes.*;

%%

%{
  public _MorganeyLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _MorganeyLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s


%%
<YYINITIAL> {
  {WHITE_SPACE}              { return com.intellij.psi.TokenType.WHITE_SPACE; }

  "<function>"               { return <FUNCTION>; }
  "<application>"            { return <APPLICATION>; }
  "<literal>"                { return <LITERAL>; }
  "<variable>"               { return <VARIABLE>; }
  "<term>"                   { return <TERM>; }
  "<module-path>"            { return <MODULE-PATH>; }
  "<numeric-literal>"        { return <NUMERIC-LITERAL>; }
  "<character-literal>"      { return <CHARACTER-LITERAL>; }
  "<string-literal>"         { return <STRING-LITERAL>; }
  "<list-literal>"           { return <LIST-LITERAL>; }
  "<java-string-literal>"    { return <JAVA-STRING-LITERAL>; }
  "<lambda-symbol>"          { return <LAMBDA-SYMBOL>; }


}

[^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
