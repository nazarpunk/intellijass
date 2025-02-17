package raft.war.language.vjass.grammar;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static raft.war.language.vjass.psi.VjassTypes.*;
%%

%{
  public _VjassLexer() {
    this((java.io.Reader)null);
  }
        int commentDepth = 0;
%}

%public
%class _VjassLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

//EOL=\R
//WHITE_SPACE=\s+
WHITE_SPACE=[ \t\n\x0B\f\r]+
REALVAL=[0-9]+\.[0-9]*|\.[0-9]+
HEXVAL=(0x|\$)[0-9a-fA-F]+
INTVAL=[0-9]+
RAWVAL='[^']*'
STRVAL=\"([^\"\\]|\\.)*\"
ID=[A-Za-z_][_0-9A-Za-z]*
LINE_COMMENT="//"[^\n]*

%state COMMENT

%%

<YYINITIAL> {

  {WHITE_SPACE}               { return WHITE_SPACE; }


  "and"                       { return AND; }
  "array"                     { return ARRAY; }
  "boolean"                   { return BOOLEAN; }
  "code"                      { return CODE; }
  "call"                      { return CALL; }
  "constant"                  { return CONSTANT; }
  "debug"                     { return DEBUG; }
  "else"                      { return ELSE; }
  "elseif"                    { return ELSEIF; }
  "endfunction"               { return ENDFUNCTION; }
  "endif"                     { return ENDIF; }
  "endloop"                   { return ENDLOOP; }
  "endglobals"                { return ENDGLOBALS; }
  "endmodule"                 { return ENDMODULE; }
  "endstruct"                 { return ENDSTRUCT; }
  "endlibrary"                { return ENDLIBRARY; }
  "extends"                   { return EXTENDS; }
  "endmethod"                 { return ENDMETHOD; }
  "exitwhen"                  { return EXITWHEN; }
  "false"                     { return FALSE; }
  "function"                  { return FUNCTION; }
  "globals"                   { return GLOBALS; }
  "handle"                    { return HANDLE; }
  "hook"                      { return HOOK; }
  "if"                        { return IF; }
  "implement"                 { return IMPLEMENT; }
  "integer"                   { return INTEGER; }
  "initializer"               { return INITIALIZER; }
  "library"                   { return LIBRARY; }
  "local"                     { return LOCAL; }
  "loop"                      { return LOOP; }
  "method"                    { return METHOD; }
  "module"                    { return MODULE; }
  "native"                    { return NATIVE; }
  "needs"                     { return NEEDS; }
  "not"                       { return NOT; }
  "nothing"                   { return NOTHING; }
  "null"                      { return NULL; }
  "or"                        { return OR; }
  "optional"                  { return OPTIONAL; }
  "private"                   { return PRIVATE; }
  "public"                    { return PUBLIC; }
  "real"                      { return REAL; }
  "returns"                   { return RETURNS; }
  "return"                    { return RETURN; }
  "requires"                  { return REQUIRES; }
  "scope"                     { return SCOPE; }
  "endscope"                  { return ENDSCOPE; }
  "static"                    { return STATIC; }
  "set"                       { return SET; }
  "string"                    { return STRING; }
  "struct"                    { return STRUCT; }
  "uses"                      { return USES; }
  "takes"                     { return TAKES; }
  "then"                      { return THEN; }
  "true"                      { return TRUE; }
  "type"                      { return TYPE; }
  "."                         { return DOT; }
  ","                         { return COMMA; }
  "=="                        { return EQ_EQ; }
  "="                         { return EQ; }
  "!="                        { return NEQ; }
  "<="                        { return LT_EQ; }
  "<"                         { return LT; }
  ">="                        { return GT_EQ; }
  ">"                         { return GT; }
  "+"                         { return PLUS; }
  "-"                         { return MINUS; }
  "*"                         { return MUL; }
  "/"                         { return DIV; }
  "("                         { return LPAREN; }
  ")"                         { return RPAREN; }
  "["                         { return LBRACK; }
  "]"                         { return RBRACK; }
  "KEY"                       { return KEY; }
  {REALVAL}                   { return REALVAL; }
  {HEXVAL}                    { return HEXVAL; }
  {INTVAL}                    { return INTVAL; }
  {RAWVAL}                    { return RAWVAL; }
  {STRVAL}                    { return STRVAL; }
  {ID}                        { return ID; }

  {LINE_COMMENT}       { return LINE_COMMENT; }

   "/*"  {
          yybegin(COMMENT);
          commentDepth = 1;
          return BLOCK_COMMENT;
        }
}

<COMMENT> {
    "/*"  {
            commentDepth++;
            return BLOCK_COMMENT;
        }

    "*/"    {
          commentDepth--;
          if(commentDepth == 0) {
              yybegin(YYINITIAL);
          }
          return BLOCK_COMMENT;
      }

    [\s\S] {/*ignore*/}

    <<EOF>> {
        yybegin(YYINITIAL);
        return BLOCK_COMMENT;
    }
}

[^] { return BAD_CHARACTER; }
