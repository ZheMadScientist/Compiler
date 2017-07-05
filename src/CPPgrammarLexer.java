// Generated from CPPgrammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CPPgrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, OPERATOR=2, BOPERATOR=3, VALUE=4, TYPE=5, STRUCT=6, TDOUBLE=7, 
		TBOOL=8, TSTRING=9, VOID=10, PRINT=11, NLCLEAR=12, EQUALS=13, NEQUALS=14, 
		ASSIGN=15, MULTIPLYING=16, DIVISION=17, PLUS=18, MINUS=19, PLUSASS=20, 
		MULTASS=21, RETURN=22, DOUBLE=23, BOOL=24, INNER=25, ID=26, STRING=27, 
		DOT=28, TZ=29, BR=30, QUOTE=31, RKR=32, LKR=33, RBR=34, LBR=35, WS=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "OPERATOR", "BOPERATOR", "VALUE", "TYPE", "STRUCT", "TDOUBLE", 
		"TBOOL", "TSTRING", "VOID", "PRINT", "NLCLEAR", "EQUALS", "NEQUALS", "ASSIGN", 
		"MULTIPLYING", "DIVISION", "PLUS", "MINUS", "PLUSASS", "MULTASS", "RETURN", 
		"DOUBLE", "BOOL", "INNER", "ID", "STRING", "DOT", "TZ", "BR", "QUOTE", 
		"RKR", "LKR", "RBR", "LBR", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", null, null, null, null, "'struct'", "'double'", "'bool'", 
		"'string'", "'void'", null, null, "'=='", "'!='", "'='", "'*'", "'/'", 
		"'+'", "'-'", "'+='", "'*='", "'return'", null, null, null, null, null, 
		"'.'", "';'", "','", "'\"'", "'}'", "'{'", "')'", "'('"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "OPERATOR", "BOPERATOR", "VALUE", "TYPE", "STRUCT", "TDOUBLE", 
		"TBOOL", "TSTRING", "VOID", "PRINT", "NLCLEAR", "EQUALS", "NEQUALS", "ASSIGN", 
		"MULTIPLYING", "DIVISION", "PLUS", "MINUS", "PLUSASS", "MULTASS", "RETURN", 
		"DOUBLE", "BOOL", "INNER", "ID", "STRING", "DOT", "TZ", "BR", "QUOTE", 
		"RKR", "LKR", "RBR", "LBR", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public CPPgrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CPPgrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0115\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3W\n\3\3\4\3\4\5\4[\n\4\3\5\3\5\3\5\5\5`\n\5\3\6\3\6\3\6\3\6\5"+
		"\6f\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u009a\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u00a9\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\5\30\u00c9\n\30\3\30\6\30\u00cc\n\30\r\30\16"+
		"\30\u00cd\3\30\5\30\u00d1\n\30\3\30\7\30\u00d4\n\30\f\30\16\30\u00d7\13"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00e2\n\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\7\32\u00ea\n\32\f\32\16\32\u00ed\13\32\3\33"+
		"\3\33\7\33\u00f1\n\33\f\33\16\33\u00f4\13\33\3\34\3\34\7\34\u00f8\n\34"+
		"\f\34\16\34\u00fb\13\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 "+
		"\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\6%\u0110\n%\r%\16%\u0111\3%\3%\3\u00f9\2"+
		"&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&\3\2\6\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17"+
		"==\2\u012b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5V\3\2\2\2\7Z\3\2\2\2\t_\3\2\2\2\13"+
		"e\3\2\2\2\rg\3\2\2\2\17n\3\2\2\2\21u\3\2\2\2\23z\3\2\2\2\25\u0081\3\2"+
		"\2\2\27\u0099\3\2\2\2\31\u00a8\3\2\2\2\33\u00aa\3\2\2\2\35\u00ad\3\2\2"+
		"\2\37\u00b0\3\2\2\2!\u00b2\3\2\2\2#\u00b4\3\2\2\2%\u00b6\3\2\2\2\'\u00b8"+
		"\3\2\2\2)\u00ba\3\2\2\2+\u00bd\3\2\2\2-\u00c0\3\2\2\2/\u00c8\3\2\2\2\61"+
		"\u00e1\3\2\2\2\63\u00e3\3\2\2\2\65\u00ee\3\2\2\2\67\u00f5\3\2\2\29\u00fe"+
		"\3\2\2\2;\u0100\3\2\2\2=\u0102\3\2\2\2?\u0104\3\2\2\2A\u0106\3\2\2\2C"+
		"\u0108\3\2\2\2E\u010a\3\2\2\2G\u010c\3\2\2\2I\u010f\3\2\2\2KL\7o\2\2L"+
		"M\7c\2\2MN\7k\2\2NO\7p\2\2O\4\3\2\2\2PW\5%\23\2QW\5\'\24\2RW\5!\21\2S"+
		"W\5#\22\2TW\5)\25\2UW\5+\26\2VP\3\2\2\2VQ\3\2\2\2VR\3\2\2\2VS\3\2\2\2"+
		"VT\3\2\2\2VU\3\2\2\2W\6\3\2\2\2X[\5\33\16\2Y[\5\35\17\2ZX\3\2\2\2ZY\3"+
		"\2\2\2[\b\3\2\2\2\\`\5/\30\2]`\5\61\31\2^`\5\67\34\2_\\\3\2\2\2_]\3\2"+
		"\2\2_^\3\2\2\2`\n\3\2\2\2af\5\23\n\2bf\5\21\t\2cf\5\17\b\2df\5\25\13\2"+
		"ea\3\2\2\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2f\f\3\2\2\2gh\7u\2\2hi\7v\2\2"+
		"ij\7t\2\2jk\7w\2\2kl\7e\2\2lm\7v\2\2m\16\3\2\2\2no\7f\2\2op\7q\2\2pq\7"+
		"w\2\2qr\7d\2\2rs\7n\2\2st\7g\2\2t\20\3\2\2\2uv\7d\2\2vw\7q\2\2wx\7q\2"+
		"\2xy\7n\2\2y\22\3\2\2\2z{\7u\2\2{|\7v\2\2|}\7t\2\2}~\7k\2\2~\177\7p\2"+
		"\2\177\u0080\7i\2\2\u0080\24\3\2\2\2\u0081\u0082\7x\2\2\u0082\u0083\7"+
		"q\2\2\u0083\u0084\7k\2\2\u0084\u0085\7f\2\2\u0085\26\3\2\2\2\u0086\u0087"+
		"\7r\2\2\u0087\u0088\7t\2\2\u0088\u0089\7k\2\2\u0089\u008a\7p\2\2\u008a"+
		"\u008b\7v\2\2\u008b\u009a\7h\2\2\u008c\u008d\7e\2\2\u008d\u008e\7q\2\2"+
		"\u008e\u008f\7w\2\2\u008f\u0090\7v\2\2\u0090\u0091\7>\2\2\u0091\u009a"+
		"\7>\2\2\u0092\u0093\7e\2\2\u0093\u0094\7q\2\2\u0094\u0095\7w\2\2\u0095"+
		"\u0096\7v\2\2\u0096\u0097\7\"\2\2\u0097\u0098\7>\2\2\u0098\u009a\7>\2"+
		"\2\u0099\u0086\3\2\2\2\u0099\u008c\3\2\2\2\u0099\u0092\3\2\2\2\u009a\30"+
		"\3\2\2\2\u009b\u009c\7>\2\2\u009c\u009d\7>\2\2\u009d\u009e\7\"\2\2\u009e"+
		"\u009f\7g\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7f\2\2\u00a1\u00a9\7n\2\2"+
		"\u00a2\u00a3\7>\2\2\u00a3\u00a4\7>\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6"+
		"\7p\2\2\u00a6\u00a7\7f\2\2\u00a7\u00a9\7n\2\2\u00a8\u009b\3\2\2\2\u00a8"+
		"\u00a2\3\2\2\2\u00a9\32\3\2\2\2\u00aa\u00ab\7?\2\2\u00ab\u00ac\7?\2\2"+
		"\u00ac\34\3\2\2\2\u00ad\u00ae\7#\2\2\u00ae\u00af\7?\2\2\u00af\36\3\2\2"+
		"\2\u00b0\u00b1\7?\2\2\u00b1 \3\2\2\2\u00b2\u00b3\7,\2\2\u00b3\"\3\2\2"+
		"\2\u00b4\u00b5\7\61\2\2\u00b5$\3\2\2\2\u00b6\u00b7\7-\2\2\u00b7&\3\2\2"+
		"\2\u00b8\u00b9\7/\2\2\u00b9(\3\2\2\2\u00ba\u00bb\7-\2\2\u00bb\u00bc\7"+
		"?\2\2\u00bc*\3\2\2\2\u00bd\u00be\7,\2\2\u00be\u00bf\7?\2\2\u00bf,\3\2"+
		"\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4"+
		"\7w\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6\7p\2\2\u00c6.\3\2\2\2\u00c7\u00c9"+
		"\7/\2\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca"+
		"\u00cc\t\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00d1\7\60\2\2\u00d0"+
		"\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d5\3\2\2\2\u00d2\u00d4\t\2"+
		"\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\60\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7v\2\2"+
		"\u00d9\u00da\7t\2\2\u00da\u00db\7w\2\2\u00db\u00e2\7g\2\2\u00dc\u00dd"+
		"\7h\2\2\u00dd\u00de\7c\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7u\2\2\u00e0"+
		"\u00e2\7g\2\2\u00e1\u00d8\3\2\2\2\u00e1\u00dc\3\2\2\2\u00e2\62\3\2\2\2"+
		"\u00e3\u00e4\5\65\33\2\u00e4\u00e5\59\35\2\u00e5\u00eb\5\65\33\2\u00e6"+
		"\u00e7\59\35\2\u00e7\u00e8\5\65\33\2\u00e8\u00ea\3\2\2\2\u00e9\u00e6\3"+
		"\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\64\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f2\t\3\2\2\u00ef\u00f1\t\4\2"+
		"\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3\66\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f9\7$\2\2\u00f6"+
		"\u00f8\13\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00fa\3"+
		"\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc"+
		"\u00fd\7$\2\2\u00fd8\3\2\2\2\u00fe\u00ff\7\60\2\2\u00ff:\3\2\2\2\u0100"+
		"\u0101\7=\2\2\u0101<\3\2\2\2\u0102\u0103\7.\2\2\u0103>\3\2\2\2\u0104\u0105"+
		"\7$\2\2\u0105@\3\2\2\2\u0106\u0107\7\177\2\2\u0107B\3\2\2\2\u0108\u0109"+
		"\7}\2\2\u0109D\3\2\2\2\u010a\u010b\7+\2\2\u010bF\3\2\2\2\u010c\u010d\7"+
		"*\2\2\u010dH\3\2\2\2\u010e\u0110\t\5\2\2\u010f\u010e\3\2\2\2\u0110\u0111"+
		"\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0114\b%\2\2\u0114J\3\2\2\2\22\2VZ_e\u0099\u00a8\u00c8\u00cd\u00d0\u00d5"+
		"\u00e1\u00eb\u00f2\u00f9\u0111\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}