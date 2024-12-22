// Generated by JFlex 1.9.1 http://jflex.de/  (tweaked for IntelliJ platform)
// source: JassLexer.flex

package raft.war.language.jass.grammar;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static raft.war.language.jass.psi.JassTypes.*;


public class _JassLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int RAWVAL_STATE = 2;
  public static final int STRVAL_STATE = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1,  1,  2, 2
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\u10ff\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\3\1\22\0\1\1\1\3\1\4"+
    "\1\0\1\5\2\0\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\11\20\2\0\1\21"+
    "\1\22\1\23\2\0\32\24\1\25\1\26\1\27\1\0"+
    "\1\30\1\0\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\24\1\42\1\43\1\24\1\44"+
    "\1\45\1\46\1\24\1\47\1\50\1\51\1\52\1\53"+
    "\1\54\1\55\1\56\1\24\u0185\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[512];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\1\1\1\3\1\1\1\4\1\5"+
    "\1\6\1\7\1\10\1\11\1\12\1\1\1\13\2\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\15\20\1\23"+
    "\1\24\1\25\1\23\1\26\1\27\1\30\1\31\1\0"+
    "\1\32\1\33\1\34\13\20\1\35\4\20\1\36\6\20"+
    "\1\37\16\20\1\40\2\20\1\41\5\20\1\42\2\20"+
    "\1\43\12\20\1\44\1\20\1\45\2\20\1\46\1\47"+
    "\1\50\1\51\1\20\1\52\3\20\1\53\3\20\1\54"+
    "\2\20\1\55\2\20\1\56\1\20\1\57\7\20\1\60"+
    "\1\61\3\20\1\62\1\20\1\63\1\20\1\64\1\65"+
    "\1\66\2\20\1\67\1\70\3\20\1\71\1\72";

  private static int [] zzUnpackAction() {
    int [] result = new int[166];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\57\0\136\0\215\0\274\0\353\0\215\0\u011a"+
    "\0\215\0\215\0\215\0\215\0\215\0\215\0\215\0\u0149"+
    "\0\u0178\0\u01a7\0\u01d6\0\u0205\0\u0234\0\u0263\0\u0292\0\215"+
    "\0\215\0\u02c1\0\u02f0\0\u031f\0\u034e\0\u037d\0\u03ac\0\u03db"+
    "\0\u040a\0\u0439\0\u0468\0\u0497\0\u04c6\0\u04f5\0\215\0\215"+
    "\0\215\0\u0524\0\215\0\u011a\0\u0149\0\u0553\0\u011a\0\215"+
    "\0\215\0\215\0\u0582\0\u05b1\0\u05e0\0\u060f\0\u063e\0\u066d"+
    "\0\u069c\0\u06cb\0\u06fa\0\u0729\0\u0758\0\u0292\0\u0787\0\u07b6"+
    "\0\u07e5\0\u0814\0\u0292\0\u0843\0\u0872\0\u08a1\0\u08d0\0\u08ff"+
    "\0\u092e\0\u0292\0\u095d\0\u098c\0\u09bb\0\u09ea\0\u0a19\0\u0a48"+
    "\0\u0a77\0\u0aa6\0\u0ad5\0\u0b04\0\u0b33\0\u0b62\0\u0b91\0\u0bc0"+
    "\0\u0292\0\u0bef\0\u0c1e\0\u0292\0\u0c4d\0\u0c7c\0\u0cab\0\u0cda"+
    "\0\u0d09\0\u0292\0\u0d38\0\u0d67\0\u0d96\0\u0dc5\0\u0df4\0\u0e23"+
    "\0\u0e52\0\u0e81\0\u0eb0\0\u0edf\0\u0f0e\0\u0f3d\0\u0f6c\0\u0292"+
    "\0\u0f9b\0\u0292\0\u0fca\0\u0ff9\0\u0292\0\u0292\0\u0292\0\u0292"+
    "\0\u1028\0\u0292\0\u1057\0\u1086\0\u10b5\0\u0292\0\u10e4\0\u1113"+
    "\0\u1142\0\u0292\0\u1171\0\u11a0\0\u0292\0\u11cf\0\u11fe\0\u0292"+
    "\0\u122d\0\u0292\0\u125c\0\u128b\0\u12ba\0\u12e9\0\u1318\0\u1347"+
    "\0\u1376\0\u0292\0\u13a5\0\u13d4\0\u1403\0\u1432\0\u0292\0\u1461"+
    "\0\u0292\0\u1490\0\u0292\0\u0292\0\u0292\0\u14bf\0\u14ee\0\u0292"+
    "\0\u0292\0\u151d\0\u154c\0\u157b\0\u0292\0\u0292";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[166];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\2\5\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\4\1\31\1\27"+
    "\1\32\1\27\1\33\1\34\1\35\1\36\1\37\1\27"+
    "\1\40\1\27\1\41\1\42\1\43\1\27\1\44\1\45"+
    "\1\46\5\27\6\47\1\50\54\47\1\51\21\47\1\52"+
    "\30\47\60\0\2\5\76\0\1\53\53\0\2\54\3\0"+
    "\1\54\4\0\26\54\17\0\2\55\54\0\1\56\55\0"+
    "\1\55\1\0\2\23\34\0\1\57\16\0\1\55\1\0"+
    "\2\23\60\0\1\60\56\0\1\61\56\0\1\62\53\0"+
    "\2\27\3\0\1\27\3\0\27\27\17\0\2\27\3\0"+
    "\1\27\3\0\14\27\1\63\2\27\1\64\7\27\17\0"+
    "\2\27\3\0\1\27\3\0\1\27\1\65\13\27\1\66"+
    "\11\27\17\0\2\27\3\0\1\27\3\0\5\27\1\67"+
    "\21\27\17\0\2\27\3\0\1\27\3\0\13\27\1\70"+
    "\1\71\10\27\1\72\1\27\17\0\2\27\3\0\1\27"+
    "\3\0\1\27\1\73\20\27\1\74\4\27\17\0\2\27"+
    "\3\0\1\27\3\0\13\27\1\75\13\27\17\0\2\27"+
    "\3\0\1\27\3\0\6\27\1\76\20\27\17\0\2\27"+
    "\3\0\1\27\3\0\15\27\1\77\11\27\17\0\2\27"+
    "\3\0\1\27\3\0\1\27\1\100\13\27\1\101\4\27"+
    "\1\102\4\27\17\0\2\27\3\0\1\27\3\0\17\27"+
    "\1\103\7\27\17\0\2\27\3\0\1\27\3\0\5\27"+
    "\1\104\21\27\17\0\2\27\3\0\1\27\3\0\5\27"+
    "\1\105\21\27\17\0\2\27\3\0\1\27\3\0\1\27"+
    "\1\106\6\27\1\107\6\27\1\110\6\27\1\111\4\0"+
    "\1\47\21\0\1\47\30\0\2\56\1\0\54\56\17\0"+
    "\2\27\3\0\1\27\3\0\4\27\1\112\22\27\17\0"+
    "\2\27\3\0\1\27\3\0\17\27\1\113\7\27\17\0"+
    "\2\27\3\0\1\27\3\0\13\27\1\114\13\27\17\0"+
    "\2\27\3\0\1\27\3\0\14\27\1\115\12\27\17\0"+
    "\2\27\3\0\1\27\3\0\2\27\1\116\24\27\17\0"+
    "\2\27\3\0\1\27\3\0\20\27\1\117\6\27\17\0"+
    "\2\27\3\0\1\27\3\0\4\27\1\120\22\27\17\0"+
    "\2\27\3\0\1\27\3\0\11\27\1\121\7\27\1\122"+
    "\5\27\17\0\2\27\3\0\1\27\3\0\13\27\1\123"+
    "\13\27\17\0\2\27\3\0\1\27\3\0\14\27\1\124"+
    "\12\27\17\0\2\27\3\0\1\27\3\0\15\27\1\125"+
    "\11\27\17\0\2\27\3\0\1\27\3\0\3\27\1\126"+
    "\11\27\1\127\11\27\17\0\2\27\3\0\1\27\3\0"+
    "\21\27\1\130\5\27\17\0\2\27\3\0\1\27\3\0"+
    "\21\27\1\131\5\27\17\0\2\27\3\0\1\27\3\0"+
    "\13\27\1\132\13\27\17\0\2\27\3\0\1\27\3\0"+
    "\21\27\1\133\5\27\17\0\2\27\3\0\1\27\3\0"+
    "\21\27\1\134\5\27\17\0\2\27\3\0\1\27\3\0"+
    "\12\27\1\135\14\27\17\0\2\27\3\0\1\27\3\0"+
    "\5\27\1\136\21\27\17\0\2\27\3\0\1\27\3\0"+
    "\22\27\1\137\4\27\17\0\2\27\3\0\1\27\3\0"+
    "\16\27\1\140\10\27\17\0\2\27\3\0\1\27\3\0"+
    "\1\27\1\141\25\27\17\0\2\27\3\0\1\27\3\0"+
    "\13\27\1\142\13\27\17\0\2\27\3\0\1\27\3\0"+
    "\20\27\1\143\6\27\17\0\2\27\3\0\1\27\3\0"+
    "\22\27\1\144\4\27\17\0\2\27\3\0\1\27\3\0"+
    "\5\27\1\145\21\27\17\0\2\27\3\0\1\27\3\0"+
    "\6\27\1\146\1\147\1\27\1\150\1\27\1\151\13\27"+
    "\17\0\2\27\3\0\1\27\3\0\21\27\1\152\5\27"+
    "\17\0\2\27\3\0\1\27\3\0\5\27\1\153\21\27"+
    "\17\0\2\27\3\0\1\27\3\0\20\27\1\154\6\27"+
    "\17\0\2\27\3\0\1\27\3\0\3\27\1\155\23\27"+
    "\17\0\2\27\3\0\1\27\3\0\2\27\1\156\24\27"+
    "\17\0\2\27\3\0\1\27\3\0\1\27\1\157\25\27"+
    "\17\0\2\27\3\0\1\27\3\0\16\27\1\160\10\27"+
    "\17\0\2\27\3\0\1\27\3\0\11\27\1\161\15\27"+
    "\17\0\2\27\3\0\1\27\3\0\13\27\1\162\13\27"+
    "\17\0\2\27\3\0\1\27\3\0\22\27\1\163\4\27"+
    "\17\0\2\27\3\0\1\27\3\0\5\27\1\164\21\27"+
    "\17\0\2\27\3\0\1\27\3\0\14\27\1\165\12\27"+
    "\17\0\2\27\3\0\1\27\3\0\5\27\1\166\21\27"+
    "\17\0\2\27\3\0\1\27\3\0\5\27\1\167\21\27"+
    "\17\0\2\27\3\0\1\27\3\0\26\27\1\170\17\0"+
    "\2\27\3\0\1\27\3\0\21\27\1\171\5\27\17\0"+
    "\2\27\3\0\1\27\3\0\7\27\1\172\17\27\17\0"+
    "\2\27\3\0\1\27\3\0\11\27\1\173\15\27\17\0"+
    "\2\27\3\0\1\27\3\0\22\27\1\174\4\27\17\0"+
    "\2\27\3\0\1\27\3\0\13\27\1\175\13\27\17\0"+
    "\2\27\3\0\1\27\3\0\6\27\1\176\20\27\17\0"+
    "\2\27\3\0\1\27\3\0\15\27\1\177\11\27\17\0"+
    "\2\27\3\0\1\27\3\0\24\27\1\200\2\27\17\0"+
    "\2\27\3\0\1\27\3\0\14\27\1\201\12\27\17\0"+
    "\2\27\3\0\1\27\3\0\5\27\1\202\21\27\17\0"+
    "\2\27\3\0\1\27\3\0\21\27\1\203\5\27\17\0"+
    "\2\27\3\0\1\27\3\0\1\27\1\204\25\27\17\0"+
    "\2\27\3\0\1\27\3\0\13\27\1\205\13\27\17\0"+
    "\2\27\3\0\1\27\3\0\23\27\1\206\3\27\17\0"+
    "\2\27\3\0\1\27\3\0\17\27\1\207\7\27\17\0"+
    "\2\27\3\0\1\27\3\0\20\27\1\210\6\27\17\0"+
    "\2\27\3\0\1\27\3\0\1\27\1\211\25\27\17\0"+
    "\2\27\3\0\1\27\3\0\6\27\1\212\20\27\17\0"+
    "\2\27\3\0\1\27\3\0\14\27\1\213\12\27\17\0"+
    "\2\27\3\0\1\27\3\0\15\27\1\214\11\27\17\0"+
    "\2\27\3\0\1\27\3\0\15\27\1\215\11\27\17\0"+
    "\2\27\3\0\1\27\3\0\10\27\1\216\16\27\17\0"+
    "\2\27\3\0\1\27\3\0\4\27\1\217\22\27\17\0"+
    "\2\27\3\0\1\27\3\0\11\27\1\220\15\27\17\0"+
    "\2\27\3\0\1\27\3\0\13\27\1\221\13\27\17\0"+
    "\2\27\3\0\1\27\3\0\5\27\1\222\21\27\17\0"+
    "\2\27\3\0\1\27\3\0\14\27\1\223\12\27\17\0"+
    "\2\27\3\0\1\27\3\0\14\27\1\224\12\27\17\0"+
    "\2\27\3\0\1\27\3\0\3\27\1\225\23\27\17\0"+
    "\2\27\3\0\1\27\3\0\2\27\1\226\24\27\17\0"+
    "\2\27\3\0\1\27\3\0\16\27\1\227\10\27\17\0"+
    "\2\27\3\0\1\27\3\0\5\27\1\230\21\27\17\0"+
    "\2\27\3\0\1\27\3\0\20\27\1\231\6\27\17\0"+
    "\2\27\3\0\1\27\3\0\15\27\1\232\11\27\17\0"+
    "\2\27\3\0\1\27\3\0\20\27\1\233\6\27\17\0"+
    "\2\27\3\0\1\27\3\0\20\27\1\234\6\27\17\0"+
    "\2\27\3\0\1\27\3\0\21\27\1\235\5\27\17\0"+
    "\2\27\3\0\1\27\3\0\21\27\1\236\5\27\17\0"+
    "\2\27\3\0\1\27\3\0\1\27\1\237\25\27\17\0"+
    "\2\27\3\0\1\27\3\0\14\27\1\240\12\27\17\0"+
    "\2\27\3\0\1\27\3\0\14\27\1\241\12\27\17\0"+
    "\2\27\3\0\1\27\3\0\11\27\1\242\15\27\17\0"+
    "\2\27\3\0\1\27\3\0\13\27\1\243\13\27\17\0"+
    "\2\27\3\0\1\27\3\0\15\27\1\244\11\27\17\0"+
    "\2\27\3\0\1\27\3\0\20\27\1\245\6\27\17\0"+
    "\2\27\3\0\1\27\3\0\14\27\1\246\12\27";

  private static int [] zzUnpacktrans() {
    int [] result = new int[5546];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\2\1\1\11\1\1\7\11\10\1\2\11"+
    "\15\1\3\11\1\1\1\11\3\1\1\0\3\11\164\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[166];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  protected int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
  public _JassLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _JassLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            switch (zzLexicalState) {
            case RAWVAL_STATE: {
              yybegin(YYINITIAL); return RAWVAL;
            }  // fall though
            case 167: break;
            case STRVAL_STATE: {
              yybegin(YYINITIAL); return STRVAL;
            }  // fall though
            case 168: break;
            default:
        return null;
        }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return BAD_CHARACTER;
            }
          // fall through
          case 59: break;
          case 2:
            { return WHITE_SPACE;
            }
          // fall through
          case 60: break;
          case 3:
            { yybegin(STRVAL_STATE);
            }
          // fall through
          case 61: break;
          case 4:
            { yybegin(RAWVAL_STATE);
            }
          // fall through
          case 62: break;
          case 5:
            { return LPAREN;
            }
          // fall through
          case 63: break;
          case 6:
            { return RPAREN;
            }
          // fall through
          case 64: break;
          case 7:
            { return MUL;
            }
          // fall through
          case 65: break;
          case 8:
            { return PLUS;
            }
          // fall through
          case 66: break;
          case 9:
            { return COMMA;
            }
          // fall through
          case 67: break;
          case 10:
            { return MINUS;
            }
          // fall through
          case 68: break;
          case 11:
            { return DIV;
            }
          // fall through
          case 69: break;
          case 12:
            { return INTVAL;
            }
          // fall through
          case 70: break;
          case 13:
            { return LT;
            }
          // fall through
          case 71: break;
          case 14:
            { return EQ;
            }
          // fall through
          case 72: break;
          case 15:
            { return GT;
            }
          // fall through
          case 73: break;
          case 16:
            { return ID;
            }
          // fall through
          case 74: break;
          case 17:
            { return LBRACK;
            }
          // fall through
          case 75: break;
          case 18:
            { return RBRACK;
            }
          // fall through
          case 76: break;
          case 19:
            { /*ignore*/
            }
          // fall through
          case 77: break;
          case 20:
            { yybegin(YYINITIAL); return RAWVAL;
            }
          // fall through
          case 78: break;
          case 21:
            { yybegin(YYINITIAL); return STRVAL;
            }
          // fall through
          case 79: break;
          case 22:
            { return NEQ;
            }
          // fall through
          case 80: break;
          case 23:
            { return HEXVAL;
            }
          // fall through
          case 81: break;
          case 24:
            { return REALVAL;
            }
          // fall through
          case 82: break;
          case 25:
            { return LINE_COMMENT;
            }
          // fall through
          case 83: break;
          case 26:
            { return LT_EQ;
            }
          // fall through
          case 84: break;
          case 27:
            { return EQ_EQ;
            }
          // fall through
          case 85: break;
          case 28:
            { return GT_EQ;
            }
          // fall through
          case 86: break;
          case 29:
            { return IF;
            }
          // fall through
          case 87: break;
          case 30:
            { return OR;
            }
          // fall through
          case 88: break;
          case 31:
            { return AND;
            }
          // fall through
          case 89: break;
          case 32:
            { return NOT;
            }
          // fall through
          case 90: break;
          case 33:
            { return SET;
            }
          // fall through
          case 91: break;
          case 34:
            { return CALL;
            }
          // fall through
          case 92: break;
          case 35:
            { return ELSE;
            }
          // fall through
          case 93: break;
          case 36:
            { return LOOP;
            }
          // fall through
          case 94: break;
          case 37:
            { return NULL;
            }
          // fall through
          case 95: break;
          case 38:
            { return THEN;
            }
          // fall through
          case 96: break;
          case 39:
            { return TRUE;
            }
          // fall through
          case 97: break;
          case 40:
            { return TYPE;
            }
          // fall through
          case 98: break;
          case 41:
            { return ARRAY;
            }
          // fall through
          case 99: break;
          case 42:
            { return DEBUG;
            }
          // fall through
          case 100: break;
          case 43:
            { return ENDIF;
            }
          // fall through
          case 101: break;
          case 44:
            { return FALSE;
            }
          // fall through
          case 102: break;
          case 45:
            { return LOCAL;
            }
          // fall through
          case 103: break;
          case 46:
            { return TAKES;
            }
          // fall through
          case 104: break;
          case 47:
            { return ELSEIF;
            }
          // fall through
          case 105: break;
          case 48:
            { return NATIVE;
            }
          // fall through
          case 106: break;
          case 49:
            { return RETURN;
            }
          // fall through
          case 107: break;
          case 50:
            { return ENDLOOP;
            }
          // fall through
          case 108: break;
          case 51:
            { return EXTENDS;
            }
          // fall through
          case 109: break;
          case 52:
            { return GLOBALS;
            }
          // fall through
          case 110: break;
          case 53:
            { return RETURNS;
            }
          // fall through
          case 111: break;
          case 54:
            { return CONSTANT;
            }
          // fall through
          case 112: break;
          case 55:
            { return EXITWHEN;
            }
          // fall through
          case 113: break;
          case 56:
            { return FUNCTION;
            }
          // fall through
          case 114: break;
          case 57:
            { return ENDGLOBALS;
            }
          // fall through
          case 115: break;
          case 58:
            { return ENDFUNCTION;
            }
          // fall through
          case 116: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
