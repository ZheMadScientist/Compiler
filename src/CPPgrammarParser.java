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
		T__0=1, OPERATOR_PRIORITY_1=2, OPERATOR_PRIORITY_2=3, BOPERATOR=4, VALUE=5, 
		TYPE=6, STRUCT=7, TDOUBLE=8, TBOOL=9, TSTRING=10, VOID=11, PRINT=12, NLCLEAR=13, 
		EQUALS=14, NEQUALS=15, ASSIGN=16, MULTIPLYING=17, DIVISION=18, PLUS=19, 
		MINUS=20, PLUSASS=21, MULTASS=22, DOUBLE=23, BOOL=24, INNER=25, ID=26, 
		OTHERID=27, STRING=28, DOT=29, TZ=30, BR=31, QUOTE=32, RKR=33, LKR=34, 
		RBR=35, LBR=36, WS=37;
	public static final int
		RULE_expr = 0, RULE_block = 1, RULE_declaring = 2, RULE_inbrackets = 3, 
		RULE_innsqbrackets = 4, RULE_operation = 5, RULE_mult_operation = 6, RULE_typing = 7, 
		RULE_assignment = 8, RULE_main = 9, RULE_printing = 10, RULE_structuring = 11, 
		RULE_equaliti = 12;
	public static final String[] ruleNames = {
		"expr", "block", "declaring", "inbrackets", "innsqbrackets", "operation", 
		"mult_operation", "typing", "assignment", "main", "printing", "structuring", 
		"equaliti"
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
		public DeclaringContext declaring() {
			return getRuleContext(DeclaringContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public StructuringContext structuring() {
			return getRuleContext(StructuringContext.class,0);
		}
		public EqualitiContext equaliti() {
			return getRuleContext(EqualitiContext.class,0);
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
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				main();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				typing();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				printing();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(29);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(30);
				declaring();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(31);
				operation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(32);
				structuring();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(33);
				equaliti();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(34);
				match(LBR);
				setState(35);
				expr();
				setState(36);
				match(RBR);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(38);
				match(LKR);
				setState(39);
				expr();
				setState(40);
				match(RKR);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(42);
				match(VALUE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(43);
				match(ID);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(44);
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
			setState(48); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(47);
				expr();
				}
				}
				setState(50); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VALUE) | (1L << TYPE) | (1L << STRUCT) | (1L << PRINT) | (1L << INNER) | (1L << ID) | (1L << LKR) | (1L << LBR))) != 0) );
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

	public static class DeclaringContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CPPgrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CPPgrammarParser.ID, i);
		}
		public TerminalNode TZ() { return getToken(CPPgrammarParser.TZ, 0); }
		public DeclaringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPgrammarListener ) ((CPPgrammarListener)listener).enterDeclaring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPgrammarListener ) ((CPPgrammarListener)listener).exitDeclaring(this);
		}
	}

	public final DeclaringContext declaring() throws RecognitionException {
		DeclaringContext _localctx = new DeclaringContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(ID);
			setState(53);
			match(ID);
			setState(54);
			match(TZ);
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
		enterRule(_localctx, 6, RULE_inbrackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(56);
			match(LKR);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VALUE) | (1L << TYPE) | (1L << STRUCT) | (1L << PRINT) | (1L << INNER) | (1L << ID) | (1L << LKR) | (1L << LBR))) != 0)) {
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
		enterRule(_localctx, 8, RULE_innsqbrackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(65);
			match(LBR);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VALUE) | (1L << TYPE) | (1L << STRUCT) | (1L << PRINT) | (1L << INNER) | (1L << ID) | (1L << LKR) | (1L << LBR))) != 0)) {
				{
				{
				setState(66);
				expr();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(RBR);
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

	public static class OperationContext extends ParserRuleContext {
		public List<Mult_operationContext> mult_operation() {
			return getRuleContexts(Mult_operationContext.class);
		}
		public Mult_operationContext mult_operation(int i) {
			return getRuleContext(Mult_operationContext.class,i);
		}
		public List<TerminalNode> OPERATOR_PRIORITY_2() { return getTokens(CPPgrammarParser.OPERATOR_PRIORITY_2); }
		public TerminalNode OPERATOR_PRIORITY_2(int i) {
			return getToken(CPPgrammarParser.OPERATOR_PRIORITY_2, i);
		}
		public TerminalNode TZ() { return getToken(CPPgrammarParser.TZ, 0); }
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
		enterRule(_localctx, 10, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			mult_operation();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATOR_PRIORITY_2) {
				{
				{
				setState(75);
				match(OPERATOR_PRIORITY_2);
				setState(76);
				mult_operation();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(82);
				match(TZ);
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

	public static class Mult_operationContext extends ParserRuleContext {
		public List<TerminalNode> VALUE() { return getTokens(CPPgrammarParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(CPPgrammarParser.VALUE, i);
		}
		public List<TerminalNode> INNER() { return getTokens(CPPgrammarParser.INNER); }
		public TerminalNode INNER(int i) {
			return getToken(CPPgrammarParser.INNER, i);
		}
		public List<TerminalNode> ID() { return getTokens(CPPgrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CPPgrammarParser.ID, i);
		}
		public List<TerminalNode> OPERATOR_PRIORITY_1() { return getTokens(CPPgrammarParser.OPERATOR_PRIORITY_1); }
		public TerminalNode OPERATOR_PRIORITY_1(int i) {
			return getToken(CPPgrammarParser.OPERATOR_PRIORITY_1, i);
		}
		public Mult_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPgrammarListener ) ((CPPgrammarListener)listener).enterMult_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPgrammarListener ) ((CPPgrammarListener)listener).exitMult_operation(this);
		}
	}

	public final Mult_operationContext mult_operation() throws RecognitionException {
		Mult_operationContext _localctx = new Mult_operationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mult_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VALUE) | (1L << INNER) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATOR_PRIORITY_1) {
				{
				{
				setState(86);
				match(OPERATOR_PRIORITY_1);
				setState(87);
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
				setState(92);
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
		public List<TerminalNode> TZ() { return getTokens(CPPgrammarParser.TZ); }
		public TerminalNode TZ(int i) {
			return getToken(CPPgrammarParser.TZ, i);
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
		enterRule(_localctx, 14, RULE_typing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(TYPE);
			setState(94);
			match(ID);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(95);
				match(ASSIGN);
				}
			}

			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(98);
				match(VALUE);
				}
				break;
			case 2:
				{
				setState(99);
				match(ID);
				}
				break;
			case 3:
				{
				setState(100);
				operation();
				}
				break;
			}
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(103);
				match(TZ);
				}
				break;
			}
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR) {
				{
				{
				setState(106);
				match(BR);
				setState(107);
				match(ID);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(108);
					match(ASSIGN);
					}
				}

				setState(114);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(111);
					match(VALUE);
					}
					break;
				case 2:
					{
					setState(112);
					match(ID);
					}
					break;
				case 3:
					{
					setState(113);
					operation();
					}
					break;
				}
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(121);
				match(TZ);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(CPPgrammarParser.ASSIGN, 0); }
		public TerminalNode TZ() { return getToken(CPPgrammarParser.TZ, 0); }
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
		enterRule(_localctx, 16, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !(_la==INNER || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(125);
			match(ASSIGN);
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(126);
				operation();
				}
				break;
			case 2:
				{
				setState(127);
				match(VALUE);
				}
				break;
			case 3:
				{
				setState(128);
				match(ID);
				}
				break;
			case 4:
				{
				setState(129);
				match(INNER);
				}
				break;
			}
			setState(132);
			match(TZ);
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
		enterRule(_localctx, 18, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(TYPE);
			setState(135);
			match(T__0);
			setState(136);
			innsqbrackets();
			setState(137);
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
		public TerminalNode TZ() { return getToken(CPPgrammarParser.TZ, 0); }
		public TerminalNode VALUE() { return getToken(CPPgrammarParser.VALUE, 0); }
		public TerminalNode INNER() { return getToken(CPPgrammarParser.INNER, 0); }
		public TerminalNode ID() { return getToken(CPPgrammarParser.ID, 0); }
		public InnsqbracketsContext innsqbrackets() {
			return getRuleContext(InnsqbracketsContext.class,0);
		}
		public TerminalNode NLCLEAR() { return getToken(CPPgrammarParser.NLCLEAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		enterRule(_localctx, 20, RULE_printing);
		int _la;
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(139);
				match(PRINT);
				setState(144);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VALUE:
					{
					setState(140);
					match(VALUE);
					}
					break;
				case INNER:
					{
					setState(141);
					match(INNER);
					}
					break;
				case ID:
					{
					setState(142);
					match(ID);
					}
					break;
				case LBR:
					{
					setState(143);
					innsqbrackets();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NLCLEAR) {
					{
					setState(146);
					match(NLCLEAR);
					}
				}

				setState(149);
				match(TZ);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(150);
				match(PRINT);
				setState(152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(151);
					expr();
					}
					}
					setState(154); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VALUE) | (1L << TYPE) | (1L << STRUCT) | (1L << PRINT) | (1L << INNER) | (1L << ID) | (1L << LKR) | (1L << LBR))) != 0) );
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NLCLEAR) {
					{
					setState(156);
					match(NLCLEAR);
					}
				}

				setState(159);
				match(TZ);
				}
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

	public static class StructuringContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(CPPgrammarParser.STRUCT, 0); }
		public TerminalNode ID() { return getToken(CPPgrammarParser.ID, 0); }
		public InbracketsContext inbrackets() {
			return getRuleContext(InbracketsContext.class,0);
		}
		public TerminalNode TZ() { return getToken(CPPgrammarParser.TZ, 0); }
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
		enterRule(_localctx, 22, RULE_structuring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(STRUCT);
			setState(164);
			match(ID);
			setState(165);
			inbrackets();
			setState(166);
			match(TZ);
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

	public static class EqualitiContext extends ParserRuleContext {
		public TerminalNode BOPERATOR() { return getToken(CPPgrammarParser.BOPERATOR, 0); }
		public List<TerminalNode> VALUE() { return getTokens(CPPgrammarParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(CPPgrammarParser.VALUE, i);
		}
		public List<TerminalNode> ID() { return getTokens(CPPgrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CPPgrammarParser.ID, i);
		}
		public List<TerminalNode> INNER() { return getTokens(CPPgrammarParser.INNER); }
		public TerminalNode INNER(int i) {
			return getToken(CPPgrammarParser.INNER, i);
		}
		public EqualitiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equaliti; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPgrammarListener ) ((CPPgrammarListener)listener).enterEqualiti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPgrammarListener ) ((CPPgrammarListener)listener).exitEqualiti(this);
		}
	}

	public final EqualitiContext equaliti() throws RecognitionException {
		EqualitiContext _localctx = new EqualitiContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_equaliti);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VALUE) | (1L << INNER) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(169);
			match(BOPERATOR);
			setState(170);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00af\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\60\n\2\3\3\6\3\63\n\3\r\3\16"+
		"\3\64\3\4\3\4\3\4\3\4\3\5\3\5\7\5=\n\5\f\5\16\5@\13\5\3\5\3\5\3\6\3\6"+
		"\7\6F\n\6\f\6\16\6I\13\6\3\6\3\6\3\7\3\7\3\7\7\7P\n\7\f\7\16\7S\13\7\3"+
		"\7\5\7V\n\7\3\b\3\b\3\b\7\b[\n\b\f\b\16\b^\13\b\3\t\3\t\3\t\5\tc\n\t\3"+
		"\t\3\t\3\t\5\th\n\t\3\t\5\tk\n\t\3\t\3\t\3\t\5\tp\n\t\3\t\3\t\3\t\5\t"+
		"u\n\t\7\tw\n\t\f\t\16\tz\13\t\3\t\5\t}\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u0085\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u0093"+
		"\n\f\3\f\5\f\u0096\n\f\3\f\3\f\3\f\6\f\u009b\n\f\r\f\16\f\u009c\3\f\5"+
		"\f\u00a0\n\f\3\f\3\f\5\f\u00a4\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\4\4\2\7\7\33\34\3"+
		"\2\33\34\2\u00c8\2/\3\2\2\2\4\62\3\2\2\2\6\66\3\2\2\2\b:\3\2\2\2\nC\3"+
		"\2\2\2\fL\3\2\2\2\16W\3\2\2\2\20_\3\2\2\2\22~\3\2\2\2\24\u0088\3\2\2\2"+
		"\26\u00a3\3\2\2\2\30\u00a5\3\2\2\2\32\u00aa\3\2\2\2\34\60\5\24\13\2\35"+
		"\60\5\20\t\2\36\60\5\26\f\2\37\60\5\22\n\2 \60\5\6\4\2!\60\5\f\7\2\"\60"+
		"\5\30\r\2#\60\5\32\16\2$%\7&\2\2%&\5\2\2\2&\'\7%\2\2\'\60\3\2\2\2()\7"+
		"$\2\2)*\5\2\2\2*+\7#\2\2+\60\3\2\2\2,\60\7\7\2\2-\60\7\34\2\2.\60\7\33"+
		"\2\2/\34\3\2\2\2/\35\3\2\2\2/\36\3\2\2\2/\37\3\2\2\2/ \3\2\2\2/!\3\2\2"+
		"\2/\"\3\2\2\2/#\3\2\2\2/$\3\2\2\2/(\3\2\2\2/,\3\2\2\2/-\3\2\2\2/.\3\2"+
		"\2\2\60\3\3\2\2\2\61\63\5\2\2\2\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2"+
		"\2\2\64\65\3\2\2\2\65\5\3\2\2\2\66\67\7\34\2\2\678\7\34\2\289\7 \2\29"+
		"\7\3\2\2\2:>\7$\2\2;=\5\2\2\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2"+
		"?A\3\2\2\2@>\3\2\2\2AB\7#\2\2B\t\3\2\2\2CG\7&\2\2DF\5\2\2\2ED\3\2\2\2"+
		"FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7%\2\2K\13\3\2\2"+
		"\2LQ\5\16\b\2MN\7\5\2\2NP\5\16\b\2OM\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2"+
		"\2\2RU\3\2\2\2SQ\3\2\2\2TV\7 \2\2UT\3\2\2\2UV\3\2\2\2V\r\3\2\2\2W\\\t"+
		"\2\2\2XY\7\4\2\2Y[\t\2\2\2ZX\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]"+
		"\17\3\2\2\2^\\\3\2\2\2_`\7\b\2\2`b\7\34\2\2ac\7\22\2\2ba\3\2\2\2bc\3\2"+
		"\2\2cg\3\2\2\2dh\7\7\2\2eh\7\34\2\2fh\5\f\7\2gd\3\2\2\2ge\3\2\2\2gf\3"+
		"\2\2\2gh\3\2\2\2hj\3\2\2\2ik\7 \2\2ji\3\2\2\2jk\3\2\2\2kx\3\2\2\2lm\7"+
		"!\2\2mo\7\34\2\2np\7\22\2\2on\3\2\2\2op\3\2\2\2pt\3\2\2\2qu\7\7\2\2ru"+
		"\7\34\2\2su\5\f\7\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2tu\3\2\2\2uw\3\2\2\2"+
		"vl\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y|\3\2\2\2zx\3\2\2\2{}\7 \2\2"+
		"|{\3\2\2\2|}\3\2\2\2}\21\3\2\2\2~\177\t\3\2\2\177\u0084\7\22\2\2\u0080"+
		"\u0085\5\f\7\2\u0081\u0085\7\7\2\2\u0082\u0085\7\34\2\2\u0083\u0085\7"+
		"\33\2\2\u0084\u0080\3\2\2\2\u0084\u0081\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7 \2\2\u0087\23\3\2\2\2"+
		"\u0088\u0089\7\b\2\2\u0089\u008a\7\3\2\2\u008a\u008b\5\n\6\2\u008b\u008c"+
		"\5\b\5\2\u008c\25\3\2\2\2\u008d\u0092\7\16\2\2\u008e\u0093\7\7\2\2\u008f"+
		"\u0093\7\33\2\2\u0090\u0093\7\34\2\2\u0091\u0093\5\n\6\2\u0092\u008e\3"+
		"\2\2\2\u0092\u008f\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093"+
		"\u0095\3\2\2\2\u0094\u0096\7\17\2\2\u0095\u0094\3\2\2\2\u0095\u0096\3"+
		"\2\2\2\u0096\u0097\3\2\2\2\u0097\u00a4\7 \2\2\u0098\u009a\7\16\2\2\u0099"+
		"\u009b\5\2\2\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u00a0\7\17\2\2\u009f"+
		"\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7 "+
		"\2\2\u00a2\u00a4\3\2\2\2\u00a3\u008d\3\2\2\2\u00a3\u0098\3\2\2\2\u00a4"+
		"\27\3\2\2\2\u00a5\u00a6\7\t\2\2\u00a6\u00a7\7\34\2\2\u00a7\u00a8\5\b\5"+
		"\2\u00a8\u00a9\7 \2\2\u00a9\31\3\2\2\2\u00aa\u00ab\t\2\2\2\u00ab\u00ac"+
		"\7\6\2\2\u00ac\u00ad\t\2\2\2\u00ad\33\3\2\2\2\26/\64>GQU\\bgjotx|\u0084"+
		"\u0092\u0095\u009c\u009f\u00a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}