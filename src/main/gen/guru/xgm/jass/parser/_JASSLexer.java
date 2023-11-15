// Generated by JFlex 1.9.1 http://jflex.de/  (tweaked for IntelliJ platform)
// source: _JASSLexer.flex

package guru.xgm.jass.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static guru.xgm.jass.psi.TypesJASS.*;


public class _JASSLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

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
    "\11\0\1\1\1\2\3\3\22\0\1\1\1\4\1\5"+
    "\1\0\1\6\2\0\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\11\21\2\0\1\22"+
    "\1\23\1\24\2\0\6\25\24\26\1\27\1\30\1\31"+
    "\1\0\1\26\1\0\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\1\26\1\43\1\44\1\26"+
    "\1\45\1\46\1\47\1\26\1\50\1\51\1\52\1\53"+
    "\1\54\1\55\1\56\1\57\1\26\12\0\1\60\u01a2\0"+
    "\2\60\326\0\u0100\60";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
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
    "\1\0\1\1\1\2\4\1\1\3\1\4\1\5\1\6"+
    "\1\7\1\10\1\1\1\11\2\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\15\16\1\21\1\0\1\22\1\0"+
    "\1\23\1\0\1\24\1\25\1\26\1\0\1\27\1\30"+
    "\1\31\13\16\1\32\4\16\1\33\6\16\1\34\16\16"+
    "\1\35\2\16\1\36\5\16\1\37\2\16\1\40\12\16"+
    "\1\41\2\16\1\42\2\16\1\43\1\44\1\45\1\46"+
    "\1\16\1\47\3\16\1\50\3\16\1\51\2\16\1\52"+
    "\3\16\1\53\1\16\1\54\7\16\1\55\1\16\1\56"+
    "\3\16\1\57\1\16\1\60\1\16\1\61\1\62\1\63"+
    "\1\64\2\16\1\65\1\66\3\16\1\67\1\70";

  private static int [] zzUnpackAction() {
    int [] result = new int[169];
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
    "\0\0\0\61\0\142\0\223\0\304\0\365\0\u0126\0\61"+
    "\0\61\0\61\0\61\0\61\0\61\0\u0157\0\u0188\0\u01b9"+
    "\0\u01ea\0\u021b\0\u024c\0\u027d\0\u02ae\0\61\0\61\0\u02df"+
    "\0\u0310\0\u0341\0\u0372\0\u03a3\0\u03d4\0\u0405\0\u0436\0\u0467"+
    "\0\u0498\0\u04c9\0\u04fa\0\u052b\0\61\0\304\0\61\0\u055c"+
    "\0\365\0\u0126\0\61\0\u0157\0\u058d\0\365\0\61\0\61"+
    "\0\61\0\u05be\0\u05ef\0\u0620\0\u0651\0\u0682\0\u06b3\0\u06e4"+
    "\0\u0715\0\u0746\0\u0777\0\u07a8\0\u02ae\0\u07d9\0\u080a\0\u083b"+
    "\0\u086c\0\u02ae\0\u089d\0\u08ce\0\u08ff\0\u0930\0\u0961\0\u0992"+
    "\0\u02ae\0\u09c3\0\u09f4\0\u0a25\0\u0a56\0\u0a87\0\u0ab8\0\u0ae9"+
    "\0\u0b1a\0\u0b4b\0\u0b7c\0\u0bad\0\u0bde\0\u0c0f\0\u0c40\0\u0c71"+
    "\0\u0ca2\0\u0cd3\0\u02ae\0\u0d04\0\u0d35\0\u0d66\0\u0d97\0\u0dc8"+
    "\0\u02ae\0\u0df9\0\u0e2a\0\u0e5b\0\u0e8c\0\u0ebd\0\u0eee\0\u0f1f"+
    "\0\u0f50\0\u0f81\0\u0fb2\0\u0fe3\0\u1014\0\u1045\0\u02ae\0\u1076"+
    "\0\u10a7\0\u02ae\0\u10d8\0\u1109\0\u02ae\0\u02ae\0\u02ae\0\u02ae"+
    "\0\u113a\0\u02ae\0\u116b\0\u119c\0\u11cd\0\u02ae\0\u11fe\0\u122f"+
    "\0\u1260\0\u02ae\0\u1291\0\u12c2\0\u02ae\0\u12f3\0\u1324\0\u1355"+
    "\0\u02ae\0\u1386\0\u02ae\0\u13b7\0\u13e8\0\u1419\0\u144a\0\u147b"+
    "\0\u14ac\0\u14dd\0\u02ae\0\u150e\0\u153f\0\u1570\0\u15a1\0\u15d2"+
    "\0\u02ae\0\u1603\0\u02ae\0\u1634\0\u02ae\0\u02ae\0\u02ae\0\u02ae"+
    "\0\u1665\0\u1696\0\u02ae\0\u02ae\0\u16c7\0\u16f8\0\u1729\0\u02ae"+
    "\0\u02ae";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[169];
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
    "\1\2\3\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\2\25\1\26\1\2\1\27\1\30"+
    "\1\25\1\31\1\32\1\33\1\34\1\35\1\25\1\36"+
    "\1\25\1\37\1\40\1\41\1\25\1\42\1\43\1\44"+
    "\5\25\1\2\62\0\3\3\100\0\1\45\35\0\5\46"+
    "\1\47\22\46\1\50\30\46\20\0\2\51\3\0\1\51"+
    "\4\0\6\51\21\0\7\52\1\53\51\52\20\0\2\54"+
    "\56\0\1\55\57\0\1\54\1\0\2\21\34\0\1\56"+
    "\20\0\1\54\1\0\2\21\62\0\1\57\60\0\1\60"+
    "\60\0\1\61\55\0\2\25\3\0\2\25\3\0\26\25"+
    "\21\0\2\25\3\0\2\25\3\0\13\25\1\62\2\25"+
    "\1\63\7\25\21\0\2\25\3\0\2\25\3\0\1\64"+
    "\13\25\1\65\11\25\21\0\2\25\3\0\2\25\3\0"+
    "\4\25\1\66\21\25\21\0\2\25\3\0\2\25\3\0"+
    "\12\25\1\67\1\70\10\25\1\71\1\25\21\0\2\25"+
    "\3\0\2\25\3\0\1\72\20\25\1\73\4\25\21\0"+
    "\2\25\3\0\2\25\3\0\12\25\1\74\13\25\21\0"+
    "\2\25\3\0\2\25\3\0\5\25\1\75\20\25\21\0"+
    "\2\25\3\0\2\25\3\0\14\25\1\76\11\25\21\0"+
    "\2\25\3\0\2\25\3\0\1\77\13\25\1\100\4\25"+
    "\1\101\4\25\21\0\2\25\3\0\2\25\3\0\16\25"+
    "\1\102\7\25\21\0\2\25\3\0\2\25\3\0\4\25"+
    "\1\103\21\25\21\0\2\25\3\0\2\25\3\0\4\25"+
    "\1\104\21\25\21\0\2\25\3\0\2\25\3\0\1\105"+
    "\6\25\1\106\6\25\1\107\6\25\1\110\1\0\2\46"+
    "\2\0\54\46\1\0\2\55\1\0\56\55\20\0\2\25"+
    "\3\0\2\25\3\0\3\25\1\111\22\25\21\0\2\25"+
    "\3\0\2\25\3\0\16\25\1\112\7\25\21\0\2\25"+
    "\3\0\2\25\3\0\12\25\1\113\13\25\21\0\2\25"+
    "\3\0\2\25\3\0\13\25\1\114\12\25\21\0\2\25"+
    "\3\0\2\25\3\0\1\25\1\115\24\25\21\0\2\25"+
    "\3\0\2\25\3\0\17\25\1\116\6\25\21\0\2\25"+
    "\3\0\2\25\3\0\3\25\1\117\22\25\21\0\2\25"+
    "\3\0\2\25\3\0\10\25\1\120\7\25\1\121\5\25"+
    "\21\0\2\25\3\0\2\25\3\0\12\25\1\122\13\25"+
    "\21\0\2\25\3\0\2\25\3\0\13\25\1\123\12\25"+
    "\21\0\2\25\3\0\2\25\3\0\14\25\1\124\11\25"+
    "\21\0\2\25\3\0\2\25\3\0\2\25\1\125\11\25"+
    "\1\126\11\25\21\0\2\25\3\0\2\25\3\0\20\25"+
    "\1\127\5\25\21\0\2\25\3\0\2\25\3\0\20\25"+
    "\1\130\5\25\21\0\2\25\3\0\2\25\3\0\12\25"+
    "\1\131\13\25\21\0\2\25\3\0\2\25\3\0\20\25"+
    "\1\132\5\25\21\0\2\25\3\0\2\25\3\0\20\25"+
    "\1\133\5\25\21\0\2\25\3\0\2\25\3\0\11\25"+
    "\1\134\14\25\21\0\2\25\3\0\2\25\3\0\4\25"+
    "\1\135\21\25\21\0\2\25\3\0\2\25\3\0\21\25"+
    "\1\136\4\25\21\0\2\25\3\0\2\25\3\0\15\25"+
    "\1\137\10\25\21\0\2\25\3\0\2\25\3\0\1\140"+
    "\25\25\21\0\2\25\3\0\2\25\3\0\12\25\1\141"+
    "\13\25\21\0\2\25\3\0\2\25\3\0\17\25\1\142"+
    "\6\25\21\0\2\25\3\0\2\25\3\0\21\25\1\143"+
    "\4\25\21\0\2\25\3\0\2\25\3\0\4\25\1\144"+
    "\21\25\21\0\2\25\3\0\2\25\3\0\5\25\1\145"+
    "\1\146\1\25\1\147\1\25\1\150\13\25\21\0\2\25"+
    "\3\0\2\25\3\0\20\25\1\151\5\25\21\0\2\25"+
    "\3\0\2\25\3\0\4\25\1\152\21\25\21\0\2\25"+
    "\3\0\2\25\3\0\17\25\1\153\6\25\21\0\2\25"+
    "\3\0\2\25\3\0\2\25\1\154\23\25\21\0\2\25"+
    "\3\0\2\25\3\0\1\25\1\155\24\25\21\0\2\25"+
    "\3\0\2\25\3\0\1\156\25\25\21\0\2\25\3\0"+
    "\2\25\3\0\15\25\1\157\10\25\21\0\2\25\3\0"+
    "\2\25\3\0\10\25\1\160\15\25\21\0\2\25\3\0"+
    "\2\25\3\0\7\25\1\161\16\25\21\0\2\25\3\0"+
    "\2\25\3\0\12\25\1\162\13\25\21\0\2\25\3\0"+
    "\2\25\3\0\21\25\1\163\4\25\21\0\2\25\3\0"+
    "\2\25\3\0\4\25\1\164\21\25\21\0\2\25\3\0"+
    "\2\25\3\0\13\25\1\165\12\25\21\0\2\25\3\0"+
    "\2\25\3\0\4\25\1\166\21\25\21\0\2\25\3\0"+
    "\2\25\3\0\4\25\1\167\21\25\21\0\2\25\3\0"+
    "\2\25\3\0\25\25\1\170\21\0\2\25\3\0\2\25"+
    "\3\0\20\25\1\171\5\25\21\0\2\25\3\0\2\25"+
    "\3\0\6\25\1\172\17\25\21\0\2\25\3\0\2\25"+
    "\3\0\10\25\1\173\15\25\21\0\2\25\3\0\2\25"+
    "\3\0\21\25\1\174\4\25\21\0\2\25\3\0\2\25"+
    "\3\0\12\25\1\175\13\25\21\0\2\25\3\0\2\25"+
    "\3\0\5\25\1\176\20\25\21\0\2\25\3\0\2\25"+
    "\3\0\14\25\1\177\11\25\21\0\2\25\3\0\2\25"+
    "\3\0\23\25\1\200\2\25\21\0\2\25\3\0\2\25"+
    "\3\0\13\25\1\201\12\25\21\0\2\25\3\0\2\25"+
    "\3\0\4\25\1\202\21\25\21\0\2\25\3\0\2\25"+
    "\3\0\20\25\1\203\5\25\21\0\2\25\3\0\2\25"+
    "\3\0\1\204\25\25\21\0\2\25\3\0\2\25\3\0"+
    "\12\25\1\205\13\25\21\0\2\25\3\0\2\25\3\0"+
    "\22\25\1\206\3\25\21\0\2\25\3\0\2\25\3\0"+
    "\10\25\1\207\15\25\21\0\2\25\3\0\2\25\3\0"+
    "\16\25\1\210\7\25\21\0\2\25\3\0\2\25\3\0"+
    "\17\25\1\211\6\25\21\0\2\25\3\0\2\25\3\0"+
    "\1\212\25\25\21\0\2\25\3\0\2\25\3\0\5\25"+
    "\1\213\20\25\21\0\2\25\3\0\2\25\3\0\13\25"+
    "\1\214\12\25\21\0\2\25\3\0\2\25\3\0\14\25"+
    "\1\215\11\25\21\0\2\25\3\0\2\25\3\0\14\25"+
    "\1\216\11\25\21\0\2\25\3\0\2\25\3\0\7\25"+
    "\1\217\16\25\21\0\2\25\3\0\2\25\3\0\3\25"+
    "\1\220\22\25\21\0\2\25\3\0\2\25\3\0\10\25"+
    "\1\221\15\25\21\0\2\25\3\0\2\25\3\0\12\25"+
    "\1\222\13\25\21\0\2\25\3\0\2\25\3\0\4\25"+
    "\1\223\21\25\21\0\2\25\3\0\2\25\3\0\13\25"+
    "\1\224\12\25\21\0\2\25\3\0\2\25\3\0\13\25"+
    "\1\225\12\25\21\0\2\25\3\0\2\25\3\0\13\25"+
    "\1\226\12\25\21\0\2\25\3\0\2\25\3\0\2\25"+
    "\1\227\23\25\21\0\2\25\3\0\2\25\3\0\1\25"+
    "\1\230\24\25\21\0\2\25\3\0\2\25\3\0\15\25"+
    "\1\231\10\25\21\0\2\25\3\0\2\25\3\0\4\25"+
    "\1\232\21\25\21\0\2\25\3\0\2\25\3\0\17\25"+
    "\1\233\6\25\21\0\2\25\3\0\2\25\3\0\14\25"+
    "\1\234\11\25\21\0\2\25\3\0\2\25\3\0\17\25"+
    "\1\235\6\25\21\0\2\25\3\0\2\25\3\0\6\25"+
    "\1\236\17\25\21\0\2\25\3\0\2\25\3\0\17\25"+
    "\1\237\6\25\21\0\2\25\3\0\2\25\3\0\20\25"+
    "\1\240\5\25\21\0\2\25\3\0\2\25\3\0\20\25"+
    "\1\241\5\25\21\0\2\25\3\0\2\25\3\0\1\242"+
    "\25\25\21\0\2\25\3\0\2\25\3\0\13\25\1\243"+
    "\12\25\21\0\2\25\3\0\2\25\3\0\13\25\1\244"+
    "\12\25\21\0\2\25\3\0\2\25\3\0\10\25\1\245"+
    "\15\25\21\0\2\25\3\0\2\25\3\0\12\25\1\246"+
    "\13\25\21\0\2\25\3\0\2\25\3\0\14\25\1\247"+
    "\11\25\21\0\2\25\3\0\2\25\3\0\17\25\1\250"+
    "\6\25\21\0\2\25\3\0\2\25\3\0\13\25\1\251"+
    "\12\25\1\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[5978];
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
    "\1\0\1\11\5\1\6\11\10\1\2\11\15\1\1\11"+
    "\1\0\1\11\1\0\1\1\1\0\1\11\2\1\1\0"+
    "\3\11\170\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[169];
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
  public _JASSLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _JASSLexer(java.io.Reader in) {
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
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return BAD_CHARACTER;
            }
          // fall through
          case 57: break;
          case 2:
            { return WHITE_SPACE;
            }
          // fall through
          case 58: break;
          case 3:
            { return LP;
            }
          // fall through
          case 59: break;
          case 4:
            { return RP;
            }
          // fall through
          case 60: break;
          case 5:
            { return MUL;
            }
          // fall through
          case 61: break;
          case 6:
            { return PLUS;
            }
          // fall through
          case 62: break;
          case 7:
            { return COMMA;
            }
          // fall through
          case 63: break;
          case 8:
            { return MINUS;
            }
          // fall through
          case 64: break;
          case 9:
            { return DIV;
            }
          // fall through
          case 65: break;
          case 10:
            { return INTVAL;
            }
          // fall through
          case 66: break;
          case 11:
            { return LT;
            }
          // fall through
          case 67: break;
          case 12:
            { return EQ;
            }
          // fall through
          case 68: break;
          case 13:
            { return GT;
            }
          // fall through
          case 69: break;
          case 14:
            { return ID;
            }
          // fall through
          case 70: break;
          case 15:
            { return LB;
            }
          // fall through
          case 71: break;
          case 16:
            { return RB;
            }
          // fall through
          case 72: break;
          case 17:
            { return NEQ;
            }
          // fall through
          case 73: break;
          case 18:
            { return STRVAL;
            }
          // fall through
          case 74: break;
          case 19:
            { return HEXVAL;
            }
          // fall through
          case 75: break;
          case 20:
            { return RAWVAL;
            }
          // fall through
          case 76: break;
          case 21:
            { return REALVAL;
            }
          // fall through
          case 77: break;
          case 22:
            { return SINGLE_LINE_COMMENT;
            }
          // fall through
          case 78: break;
          case 23:
            { return LTEQ;
            }
          // fall through
          case 79: break;
          case 24:
            { return EQEQ;
            }
          // fall through
          case 80: break;
          case 25:
            { return GTEQ;
            }
          // fall through
          case 81: break;
          case 26:
            { return IF;
            }
          // fall through
          case 82: break;
          case 27:
            { return OR;
            }
          // fall through
          case 83: break;
          case 28:
            { return AND;
            }
          // fall through
          case 84: break;
          case 29:
            { return NOT;
            }
          // fall through
          case 85: break;
          case 30:
            { return SET;
            }
          // fall through
          case 86: break;
          case 31:
            { return CALL;
            }
          // fall through
          case 87: break;
          case 32:
            { return ELSE;
            }
          // fall through
          case 88: break;
          case 33:
            { return LOOP;
            }
          // fall through
          case 89: break;
          case 34:
            { return NULL;
            }
          // fall through
          case 90: break;
          case 35:
            { return THEN;
            }
          // fall through
          case 91: break;
          case 36:
            { return TRUE;
            }
          // fall through
          case 92: break;
          case 37:
            { return TYPE;
            }
          // fall through
          case 93: break;
          case 38:
            { return ARRAY;
            }
          // fall through
          case 94: break;
          case 39:
            { return DEBUG;
            }
          // fall through
          case 95: break;
          case 40:
            { return ENDIF;
            }
          // fall through
          case 96: break;
          case 41:
            { return FALSE;
            }
          // fall through
          case 97: break;
          case 42:
            { return LOCAL;
            }
          // fall through
          case 98: break;
          case 43:
            { return TAKES;
            }
          // fall through
          case 99: break;
          case 44:
            { return ELSEIF;
            }
          // fall through
          case 100: break;
          case 45:
            { return NATIVE;
            }
          // fall through
          case 101: break;
          case 46:
            { return RETURN;
            }
          // fall through
          case 102: break;
          case 47:
            { return ENDLOOP;
            }
          // fall through
          case 103: break;
          case 48:
            { return EXTENDS;
            }
          // fall through
          case 104: break;
          case 49:
            { return GLOBALS;
            }
          // fall through
          case 105: break;
          case 50:
            { return NOTHING;
            }
          // fall through
          case 106: break;
          case 51:
            { return RETURNS;
            }
          // fall through
          case 107: break;
          case 52:
            { return CONSTANT;
            }
          // fall through
          case 108: break;
          case 53:
            { return EXITWHEN;
            }
          // fall through
          case 109: break;
          case 54:
            { return FUNCTION;
            }
          // fall through
          case 110: break;
          case 55:
            { return ENDGLOBALS;
            }
          // fall through
          case 111: break;
          case 56:
            { return ENDFUNCTION;
            }
          // fall through
          case 112: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
