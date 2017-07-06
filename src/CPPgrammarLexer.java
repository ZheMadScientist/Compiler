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
		T__0=1, OPERATOR_PRIORITY_1=2, OPERATOR_PRIORITY_2=3, BOPERATOR=4, VALUE=5, 
		TYPE=6, STRUCT=7, TDOUBLE=8, TBOOL=9, TSTRING=10, VOID=11, PRINT=12, NLCLEAR=13, 
		EQUALS=14, NEQUALS=15, ASSIGN=16, MULTIPLYING=17, DIVISION=18, PLUS=19, 
		MINUS=20, PLUSASS=21, MULTASS=22, DOUBLE=23, BOOL=24, INNER=25, ID=26, 
		OTHERID=27, STRING=28, DOT=29, TZ=30, BR=31, QUOTE=32, RKR=33, LKR=34, 
		RBR=35, LBR=36, WS=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "OPERATOR_PRIORITY_1", "OPERATOR_PRIORITY_2", "BOPERATOR", "VALUE", 
		"TYPE", "STRUCT", "TDOUBLE", "TBOOL", "TSTRING", "VOID", "PRINT", "NLCLEAR", 
		"EQUALS", "NEQUALS", "ASSIGN", "MULTIPLYING", "DIVISION", "PLUS", "MINUS", 
		"PLUSASS", "MULTASS", "DOUBLE", "BOOL", "INNER", "ID", "OTHERID", "STRING", 
		"DOT", "TZ", "BR", "QUOTE", "RKR", "LKR", "RBR", "LBR", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", null, null, null, null, null, "'struct'", "'double'", 
		"'bool'", "'string'", "'void'", null, null, "'=='", "'!='", "'='", "'*'", 
		"'/'", "'+'", "'-'", "'+='", "'*='", null, null, null, null, null, null, 
		"'.'", "';'", "','", "'\"'", "'}'", "'{'", "')'", "'('"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "OPERATOR_PRIORITY_1", "OPERATOR_PRIORITY_2", "BOPERATOR", 
		"VALUE", "TYPE", "STRUCT", "TDOUBLE", "TBOOL", "TSTRING", "VOID", "PRINT", 
		"NLCLEAR", "EQUALS", "NEQUALS", "ASSIGN", "MULTIPLYING", "DIVISION", "PLUS", 
		"MINUS", "PLUSASS", "MULTASS", "DOUBLE", "BOOL", "INNER", "ID", "OTHERID", 
		"STRING", "DOT", "TZ", "BR", "QUOTE", "RKR", "LKR", "RBR", "LBR", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u0119\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\5"+
		"\3V\n\3\3\4\3\4\3\4\5\4[\n\4\3\5\3\5\5\5_\n\5\3\6\3\6\3\6\5\6d\n\6\3\7"+
		"\3\7\3\7\3\7\5\7j\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u009e\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ad\n\16\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\5\30\u00c6\n\30\3\30\6\30\u00c9\n\30\r\30\16\30\u00ca"+
		"\3\30\5\30\u00ce\n\30\3\30\7\30\u00d1\n\30\f\30\16\30\u00d4\13\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00df\n\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\7\32\u00e7\n\32\f\32\16\32\u00ea\13\32\3\33\3\33\7\33"+
		"\u00ee\n\33\f\33\16\33\u00f1\13\33\3\34\3\34\7\34\u00f5\n\34\f\34\16\34"+
		"\u00f8\13\34\3\35\3\35\7\35\u00fc\n\35\f\35\16\35\u00ff\13\35\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\6&\u0114"+
		"\n&\r&\16&\u0115\3&\3&\3\u00fd\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\6\3\2\62;\5"+
		"\2C\\aac|\6\2\62;C\\aac|\6\2\13\f\17\17\"\"==\2\u012f\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\3M\3\2\2\2\5U\3\2\2\2\7Z\3\2\2\2\t^\3\2\2\2\13c\3\2\2\2\ri\3"+
		"\2\2\2\17k\3\2\2\2\21r\3\2\2\2\23y\3\2\2\2\25~\3\2\2\2\27\u0085\3\2\2"+
		"\2\31\u009d\3\2\2\2\33\u00ac\3\2\2\2\35\u00ae\3\2\2\2\37\u00b1\3\2\2\2"+
		"!\u00b4\3\2\2\2#\u00b6\3\2\2\2%\u00b8\3\2\2\2\'\u00ba\3\2\2\2)\u00bc\3"+
		"\2\2\2+\u00be\3\2\2\2-\u00c1\3\2\2\2/\u00c5\3\2\2\2\61\u00de\3\2\2\2\63"+
		"\u00e0\3\2\2\2\65\u00eb\3\2\2\2\67\u00f2\3\2\2\29\u00f9\3\2\2\2;\u0102"+
		"\3\2\2\2=\u0104\3\2\2\2?\u0106\3\2\2\2A\u0108\3\2\2\2C\u010a\3\2\2\2E"+
		"\u010c\3\2\2\2G\u010e\3\2\2\2I\u0110\3\2\2\2K\u0113\3\2\2\2MN\7o\2\2N"+
		"O\7c\2\2OP\7k\2\2PQ\7p\2\2Q\4\3\2\2\2RV\5#\22\2SV\5%\23\2TV\5-\27\2UR"+
		"\3\2\2\2US\3\2\2\2UT\3\2\2\2V\6\3\2\2\2W[\5\'\24\2X[\5)\25\2Y[\5+\26\2"+
		"ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[\b\3\2\2\2\\_\5\35\17\2]_\5\37\20\2^\\"+
		"\3\2\2\2^]\3\2\2\2_\n\3\2\2\2`d\5/\30\2ad\5\61\31\2bd\59\35\2c`\3\2\2"+
		"\2ca\3\2\2\2cb\3\2\2\2d\f\3\2\2\2ej\5\25\13\2fj\5\23\n\2gj\5\21\t\2hj"+
		"\5\27\f\2ie\3\2\2\2if\3\2\2\2ig\3\2\2\2ih\3\2\2\2j\16\3\2\2\2kl\7u\2\2"+
		"lm\7v\2\2mn\7t\2\2no\7w\2\2op\7e\2\2pq\7v\2\2q\20\3\2\2\2rs\7f\2\2st\7"+
		"q\2\2tu\7w\2\2uv\7d\2\2vw\7n\2\2wx\7g\2\2x\22\3\2\2\2yz\7d\2\2z{\7q\2"+
		"\2{|\7q\2\2|}\7n\2\2}\24\3\2\2\2~\177\7u\2\2\177\u0080\7v\2\2\u0080\u0081"+
		"\7t\2\2\u0081\u0082\7k\2\2\u0082\u0083\7p\2\2\u0083\u0084\7i\2\2\u0084"+
		"\26\3\2\2\2\u0085\u0086\7x\2\2\u0086\u0087\7q\2\2\u0087\u0088\7k\2\2\u0088"+
		"\u0089\7f\2\2\u0089\30\3\2\2\2\u008a\u008b\7r\2\2\u008b\u008c\7t\2\2\u008c"+
		"\u008d\7k\2\2\u008d\u008e\7p\2\2\u008e\u008f\7v\2\2\u008f\u009e\7h\2\2"+
		"\u0090\u0091\7e\2\2\u0091\u0092\7q\2\2\u0092\u0093\7w\2\2\u0093\u0094"+
		"\7v\2\2\u0094\u0095\7>\2\2\u0095\u009e\7>\2\2\u0096\u0097\7e\2\2\u0097"+
		"\u0098\7q\2\2\u0098\u0099\7w\2\2\u0099\u009a\7v\2\2\u009a\u009b\7\"\2"+
		"\2\u009b\u009c\7>\2\2\u009c\u009e\7>\2\2\u009d\u008a\3\2\2\2\u009d\u0090"+
		"\3\2\2\2\u009d\u0096\3\2\2\2\u009e\32\3\2\2\2\u009f\u00a0\7>\2\2\u00a0"+
		"\u00a1\7>\2\2\u00a1\u00a2\7\"\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7p\2"+
		"\2\u00a4\u00a5\7f\2\2\u00a5\u00ad\7n\2\2\u00a6\u00a7\7>\2\2\u00a7\u00a8"+
		"\7>\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7f\2\2\u00ab"+
		"\u00ad\7n\2\2\u00ac\u009f\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ad\34\3\2\2\2"+
		"\u00ae\u00af\7?\2\2\u00af\u00b0\7?\2\2\u00b0\36\3\2\2\2\u00b1\u00b2\7"+
		"#\2\2\u00b2\u00b3\7?\2\2\u00b3 \3\2\2\2\u00b4\u00b5\7?\2\2\u00b5\"\3\2"+
		"\2\2\u00b6\u00b7\7,\2\2\u00b7$\3\2\2\2\u00b8\u00b9\7\61\2\2\u00b9&\3\2"+
		"\2\2\u00ba\u00bb\7-\2\2\u00bb(\3\2\2\2\u00bc\u00bd\7/\2\2\u00bd*\3\2\2"+
		"\2\u00be\u00bf\7-\2\2\u00bf\u00c0\7?\2\2\u00c0,\3\2\2\2\u00c1\u00c2\7"+
		",\2\2\u00c2\u00c3\7?\2\2\u00c3.\3\2\2\2\u00c4\u00c6\7/\2\2\u00c5\u00c4"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c9\t\2\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ce\7\60\2\2\u00cd\u00cc\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00d2\3\2\2\2\u00cf\u00d1\t\2\2\2\u00d0\u00cf\3\2"+
		"\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\60\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7t\2\2"+
		"\u00d7\u00d8\7w\2\2\u00d8\u00df\7g\2\2\u00d9\u00da\7h\2\2\u00da\u00db"+
		"\7c\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd\7u\2\2\u00dd\u00df\7g\2\2\u00de"+
		"\u00d5\3\2\2\2\u00de\u00d9\3\2\2\2\u00df\62\3\2\2\2\u00e0\u00e1\5\65\33"+
		"\2\u00e1\u00e2\5;\36\2\u00e2\u00e8\5\65\33\2\u00e3\u00e4\5;\36\2\u00e4"+
		"\u00e5\5\65\33\2\u00e5\u00e7\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e7\u00ea\3"+
		"\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\64\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00eb\u00ef\t\3\2\2\u00ec\u00ee\t\4\2\2\u00ed\u00ec\3\2"+
		"\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\66\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f6\t\3\2\2\u00f3\u00f5\t\4\2"+
		"\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7"+
		"\3\2\2\2\u00f78\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fd\7$\2\2\u00fa\u00fc"+
		"\13\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fe\3\2\2\2"+
		"\u00fd\u00fb\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101"+
		"\7$\2\2\u0101:\3\2\2\2\u0102\u0103\7\60\2\2\u0103<\3\2\2\2\u0104\u0105"+
		"\7=\2\2\u0105>\3\2\2\2\u0106\u0107\7.\2\2\u0107@\3\2\2\2\u0108\u0109\7"+
		"$\2\2\u0109B\3\2\2\2\u010a\u010b\7\177\2\2\u010bD\3\2\2\2\u010c\u010d"+
		"\7}\2\2\u010dF\3\2\2\2\u010e\u010f\7+\2\2\u010fH\3\2\2\2\u0110\u0111\7"+
		"*\2\2\u0111J\3\2\2\2\u0112\u0114\t\5\2\2\u0113\u0112\3\2\2\2\u0114\u0115"+
		"\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0118\b&\2\2\u0118L\3\2\2\2\24\2UZ^ci\u009d\u00ac\u00c5\u00ca\u00cd\u00d2"+
		"\u00de\u00e8\u00ef\u00f6\u00fd\u0115\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}