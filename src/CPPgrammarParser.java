// Generated from CPPgrammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CPPgrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, OPERATOR=2, BOPERATOR=3, VALUE=4, TYPE=5, STRUCT=6, TDOUBLE=7, 
		TBOOL=8, TSTRING=9, VOID=10, PRINT=11, EQUALS=12, NEQUALS=13, ASSIGN=14, 
		PLUS=15, MINUS=16, MULTIPLYING=17, DIVISION=18, PLUSASS=19, MULTASS=20, 
		RETURN=21, DOUBLE=22, BOOL=23, INNER=24, ID=25, STRING=26, DOT=27, TZ=28, 
		BR=29, QUOTE=30, RKR=31, LKR=32, RBR=33, LBR=34, FUNC=35, WS=36;
	public static final int
		RULE_expr = 0, RULE_block = 1, RULE_inbrackets = 2, RULE_innsqbrackets = 3, 
		RULE_operation = 4, RULE_typing = 5, RULE_assignment = 6, RULE_main = 7, 
		RULE_printing = 8, RULE_structuring = 9, RULE_returning = 10;
	public static final String[] ruleNames = {
		"expr", "block", "inbrackets", "innsqbrackets", "operation", "typing", 
		"assignment", "main", "printing", "structuring", "returning"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", null, null, null, null, "'struct'", "'double'", "'bool'", 
		"'string'", "'void'", null, "'=='", "'!='", "'='", "'+'", "'-'", "'*'", 
		"'/'", "'+='", "'*='", "'return'", null, null, null, null, null, "'.'", 
		"';'", "','", "'\"'", "'}'", "'{'", "')'", "'('", "'func'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "OPERATOR", "BOPERATOR", "VALUE", "TYPE", "STRUCT", "TDOUBLE", 
		"TBOOL", "TSTRING", "VOID", "PRINT", "EQUALS", "NEQUALS", "ASSIGN", "PLUS", 
		"MINUS", "MULTIPLYING", "DIVISION", "PLUSASS", "MULTASS", "RETURN", "DOUBLE", 
		"BOOL", "INNER", "ID", "STRING", "DOT", "TZ", "BR", "QUOTE", "RKR", "LKR", 
		"RBR", "LBR", "FUNC", "WS"
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

	@Override
	public String getGrammarFileName() { return "CPPgrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CPPgrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExprContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TypingContext typing() {
			return getRuleContext(TypingContext.class,0);
		}
		public PrintingContext printing() {
			return getRuleContext(PrintingContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public StructuringContext structuring() {
			return getRuleContext(StructuringContext.class,0);
		}
		public ReturningContext returning() {
			return getRuleContext(ReturningContext.class,0);
		}
		public TerminalNode LBR() { return getToken(CPPgrammarParser.LBR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBR() { return getToken(CPPgrammarParser.RBR, 0); }
		public TerminalNode LKR() { return getToken(CPPgrammarParser.LKR, 0); }
		public TerminalNode RKR() { return getToken(CPPgrammarParser.RKR, 0); }
		public TerminalNode VALUE() { return getToken(CPPgrammarParser.VALUE, 0); }
		public TerminalNode ID() { return getToken(CPPgrammarParser.ID, 0); }
		public TerminalNode INNER() { return getToken(CPPgrammarParser.INNER, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPgrammarListener ) ((CPPgrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPgrammarListener ) ((CPPgrammarListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				main();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				typing();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
				printing();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(25);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(26);
				operation();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(27);
				structuring();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(28);
				returning();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(29);
				match(LBR);
				setState(30);
				expr();
				setState(31);
				match(RBR);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(33);
				match(LKR);
				setState(34);
				expr();
				setState(35);
				match(RKR);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(37);
				match(VALUE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(38);
				match(ID);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(39);
				match(INNER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPgrammarListener ) ((CPPgrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPgrammarListener ) ((CPPgrammarListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				expr();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VALUE) | (1L << TYPE) | (1L << STRUCT) | (1L << PRINT) | (1L << RETURN) | (1L << INNER) | (1L << ID) | (1L << LKR) | (1L << LBR))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InbracketsContext extends ParserRuleContext {
		public TerminalNode LKR() { return getToken(CPPgrammarParser.LKR, 0); }
		public TerminalNode RKR() { return getToken(CPPgrammarParser.RKR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public InbracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inbrackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPgrammarListener ) ((CPPgrammarListener)listener).enterInbrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPgrammarListener ) ((CPPgrammarListener)listener).exitInbrackets(this);
		}
	}

	public final InbracketsContext inbrackets() throws RecognitionException {
		InbracketsContext _localctx = new InbracketsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_inbrackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(47);
			match(LKR);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VALUE) | (1L << TYPE) | (1L << STRUCT) | (1L << PRINT) | (1L << RETURN) | (1L << INNER) | (1L << ID) | (1L << LKR) | (1L << LBR))) != 0)) {
				{
				{
				setState(48);
				expr();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			match(RKR);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnsqbracketsContext extends ParserRuleContext {
		public TerminalNode LBR() { return getToken(CPPgrammarParser.LBR, 0); }
		public TerminalNode RBR() { return getToken(CPPgrammarParser.RBR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public InnsqbracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innsqbrackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPgrammarListener ) ((CPPgrammarListener)listener).enterInnsqbrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPgrammarListener ) ((CPPgrammarListener)listener).exitInnsqbrackets(this);
		}
	}

	public final InnsqbracketsContext innsqbrackets() throws RecognitionException {
		InnsqbracketsContext _localctx = new InnsqbracketsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_innsqbrackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(LBR);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VALUE) | (1L << TYPE) | (1L << STRUCT) | (1L << PRINT) | (1L << RETURN) | (1L << INNER) | (1L << ID) | (1L << LKR) | (1L << LBR))) != 0)) {
				{
				{
				setState(57);
				expr();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(RBR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationContext extends ParserRuleContext {
		public TerminalNode OPERATOR() { return getToken(CPPgrammarParser.OPERATOR, 0); }
		public List<TerminalNode> ID() { return getTokens(CPPgrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CPPgrammarParser.ID, i);
		}
		public List<TerminalNode> VALUE() { return getTokens(CPPgrammarParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(CPPgrammarParser.VALUE, i);
		}
		public List<TerminalNode> INNER() { return getTokens(CPPgrammarParser.INNER); }
		public TerminalNode INNER(int i) {
			return getToken(CPPgrammarParser.INNER, i);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPgrammarListener ) ((CPPgrammarListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPgrammarListener ) ((CPPgrammarListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VALUE) | (1L << INNER) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(66);
			match(OPERATOR);
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(67);
				match(ID);
				}
				break;
			case 2:
				{
				setState(68);
				match(VALUE);
				}
				break;
			case 3:
				{
				setState(69);
				match(INNER);
				}
				break;
			case 4:
				{
				setState(70);
				operation();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypingContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(CPPgrammarParser.TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(CPPgrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CPPgrammarParser.ID, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(CPPgrammarParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(CPPgrammarParser.ASSIGN, i);
		}
		public List<TerminalNode> VALUE() { return getTokens(CPPgrammarParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(CPPgrammarParser.VALUE, i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<TerminalNode> BR() { return getTokens(CPPgrammarParser.BR); }
		public TerminalNode BR(int i) {
			return getToken(CPPgrammarParser.BR, i);
		}
		public TypingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPgrammarListener ) ((CPPgrammarListener)listener).enterTyping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPgrammarListener ) ((CPPgrammarListener)listener).exitTyping(this);
		}
	}

	public final TypingContext typing() throws RecognitionException {
		TypingContext _localctx = new TypingContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(TYPE);
			setState(74);
			match(ID);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(75);
				match(ASSIGN);
				}
			}

			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(78);
				match(VALUE);
				}
				break;
			case 2:
				{
				setState(79);
				match(ID);
				}
				break;
			case 3:
				{
				setState(80);
				operation();
				}
				break;
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR) {
				{
				{
				setState(83);
				match(BR);
				setState(84);
				match(ID);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(85);
					match(ASSIGN);
					}
				}

				setState(91);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(88);
					match(VALUE);
					}
					break;
				case 2:
					{
					setState(89);
					match(ID);
					}
					break;
				case 3:
					{
					setState(90);
					operation();
					}
					break;
				}
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(CPPgrammarParser.ASSIGN, 0); }
		public List<TerminalNode> ID() { return getTokens(CPPgrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CPPgrammarParser.ID, i);
		}
		public List<TerminalNode> INNER() { return getTokens(CPPgrammarParser.INNER); }
		public TerminalNode INNER(int i) {
			return getToken(CPPgrammarParser.INNER, i);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode VALUE() { return getToken(CPPgrammarParser.VALUE, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPgrammarListener ) ((CPPgrammarListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPgrammarListener ) ((CPPgrammarListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_la = _input.LA(1);
			if ( !(_la==INNER || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(99);
			match(ASSIGN);
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(100);
				operation();
				}
				break;
			case 2:
				{
				setState(101);
				match(VALUE);
				}
				break;
			case 3:
				{
				setState(102);
				match(ID);
				}
				break;
			case 4:
				{
				setState(103);
				match(INNER);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(CPPgrammarParser.TYPE, 0); }
		public InnsqbracketsContext innsqbrackets() {
			return getRuleContext(InnsqbracketsContext.class,0);
		}
		public InbracketsContext inbrackets() {
			return getRuleContext(InbracketsContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPgrammarListener ) ((CPPgrammarListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPgrammarListener ) ((CPPgrammarListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(TYPE);
			setState(107);
			match(T__0);
			setState(108);
			innsqbrackets();
			setState(109);
			inbrackets();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintingContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(CPPgrammarParser.PRINT, 0); }
		public InnsqbracketsContext innsqbrackets() {
			return getRuleContext(InnsqbracketsContext.class,0);
		}
		public PrintingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPgrammarListener ) ((CPPgrammarListener)listener).enterPrinting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPgrammarListener ) ((CPPgrammarListener)listener).exitPrinting(this);
		}
	}

	public final PrintingContext printing() throws RecognitionException {
		PrintingContext _localctx = new PrintingContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_printing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(PRINT);
			setState(112);
			innsqbrackets();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructuringContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(CPPgrammarParser.STRUCT, 0); }
		public TerminalNode ID() { return getToken(CPPgrammarParser.ID, 0); }
		public InbracketsContext inbrackets() {
			return getRuleContext(InbracketsContext.class,0);
		}
		public StructuringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPgrammarListener ) ((CPPgrammarListener)listener).enterStructuring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPgrammarListener ) ((CPPgrammarListener)listener).exitStructuring(this);
		}
	}

	public final StructuringContext structuring() throws RecognitionException {
		StructuringContext _localctx = new StructuringContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_structuring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(STRUCT);
			setState(115);
			match(ID);
			setState(116);
			inbrackets();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturningContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CPPgrammarParser.RETURN, 0); }
		public TerminalNode ID() { return getToken(CPPgrammarParser.ID, 0); }
		public TerminalNode VALUE() { return getToken(CPPgrammarParser.VALUE, 0); }
		public TerminalNode INNER() { return getToken(CPPgrammarParser.INNER, 0); }
		public ReturningContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returning; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPgrammarListener ) ((CPPgrammarListener)listener).enterReturning(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPgrammarListener ) ((CPPgrammarListener)listener).exitReturning(this);
		}
	}

	public final ReturningContext returning() throws RecognitionException {
		ReturningContext _localctx = new ReturningContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_returning);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(RETURN);
			setState(119);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VALUE) | (1L << INNER) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&|\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\5\2+\n\2\3\3\6\3.\n\3\r\3\16\3/\3\4\3\4\7\4\64\n\4\f\4\16\4\67"+
		"\13\4\3\4\3\4\3\5\3\5\7\5=\n\5\f\5\16\5@\13\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6J\n\6\3\7\3\7\3\7\5\7O\n\7\3\7\3\7\3\7\5\7T\n\7\3\7\3\7\3"+
		"\7\5\7Y\n\7\3\7\3\7\3\7\5\7^\n\7\7\7`\n\7\f\7\16\7c\13\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\bk\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\4\4\2\6\6\32\33\3"+
		"\2\32\33\2\u008d\2*\3\2\2\2\4-\3\2\2\2\6\61\3\2\2\2\b:\3\2\2\2\nC\3\2"+
		"\2\2\fK\3\2\2\2\16d\3\2\2\2\20l\3\2\2\2\22q\3\2\2\2\24t\3\2\2\2\26x\3"+
		"\2\2\2\30+\5\20\t\2\31+\5\f\7\2\32+\5\22\n\2\33+\5\16\b\2\34+\5\n\6\2"+
		"\35+\5\24\13\2\36+\5\26\f\2\37 \7$\2\2 !\5\2\2\2!\"\7#\2\2\"+\3\2\2\2"+
		"#$\7\"\2\2$%\5\2\2\2%&\7!\2\2&+\3\2\2\2\'+\7\6\2\2(+\7\33\2\2)+\7\32\2"+
		"\2*\30\3\2\2\2*\31\3\2\2\2*\32\3\2\2\2*\33\3\2\2\2*\34\3\2\2\2*\35\3\2"+
		"\2\2*\36\3\2\2\2*\37\3\2\2\2*#\3\2\2\2*\'\3\2\2\2*(\3\2\2\2*)\3\2\2\2"+
		"+\3\3\2\2\2,.\5\2\2\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\5\3"+
		"\2\2\2\61\65\7\"\2\2\62\64\5\2\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3"+
		"\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\7!\2\29\7\3\2\2\2:>\7"+
		"$\2\2;=\5\2\2\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3"+
		"\2\2\2AB\7#\2\2B\t\3\2\2\2CD\t\2\2\2DI\7\4\2\2EJ\7\33\2\2FJ\7\6\2\2GJ"+
		"\7\32\2\2HJ\5\n\6\2IE\3\2\2\2IF\3\2\2\2IG\3\2\2\2IH\3\2\2\2J\13\3\2\2"+
		"\2KL\7\7\2\2LN\7\33\2\2MO\7\20\2\2NM\3\2\2\2NO\3\2\2\2OS\3\2\2\2PT\7\6"+
		"\2\2QT\7\33\2\2RT\5\n\6\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2ST\3\2\2\2Ta\3"+
		"\2\2\2UV\7\37\2\2VX\7\33\2\2WY\7\20\2\2XW\3\2\2\2XY\3\2\2\2Y]\3\2\2\2"+
		"Z^\7\6\2\2[^\7\33\2\2\\^\5\n\6\2]Z\3\2\2\2][\3\2\2\2]\\\3\2\2\2]^\3\2"+
		"\2\2^`\3\2\2\2_U\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\r\3\2\2\2ca\3"+
		"\2\2\2de\t\3\2\2ej\7\20\2\2fk\5\n\6\2gk\7\6\2\2hk\7\33\2\2ik\7\32\2\2"+
		"jf\3\2\2\2jg\3\2\2\2jh\3\2\2\2ji\3\2\2\2k\17\3\2\2\2lm\7\7\2\2mn\7\3\2"+
		"\2no\5\b\5\2op\5\6\4\2p\21\3\2\2\2qr\7\r\2\2rs\5\b\5\2s\23\3\2\2\2tu\7"+
		"\b\2\2uv\7\33\2\2vw\5\6\4\2w\25\3\2\2\2xy\7\27\2\2yz\t\2\2\2z\27\3\2\2"+
		"\2\r*/\65>INSX]aj";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}