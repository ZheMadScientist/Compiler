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
		RULE_assignment = 8, RULE_main = 9, RULE_printing = 10, RULE_structuring = 11;
	public static final String[] ruleNames = {
		"expr", "block", "declaring", "inbrackets", "innsqbrackets", "operation", 
		"mult_operation", "typing", "assignment", "main", "printing", "structuring"
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
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				main();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				typing();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				printing();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(27);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(28);
				declaring();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(29);
				operation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(30);
				structuring();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(31);
				match(LBR);
				setState(32);
				expr();
				setState(33);
				match(RBR);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(35);
				match(LKR);
				setState(36);
				expr();
				setState(37);
				match(RKR);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(39);
				match(VALUE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(40);
				match(ID);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(41);
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
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				expr();
				}
				}
				setState(47); 
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
			setState(49);
			match(ID);
			setState(50);
			match(ID);
			setState(51);
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
			setState(53);
			match(LKR);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VALUE) | (1L << TYPE) | (1L << STRUCT) | (1L << PRINT) | (1L << INNER) | (1L << ID) | (1L << LKR) | (1L << LBR))) != 0)) {
				{
				{
				setState(54);
				expr();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
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
			setState(62);
			match(LBR);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VALUE) | (1L << TYPE) | (1L << STRUCT) | (1L << PRINT) | (1L << INNER) | (1L << ID) | (1L << LKR) | (1L << LBR))) != 0)) {
				{
				{
				setState(63);
				expr();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
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
		public TerminalNode TZ() { return getToken(CPPgrammarParser.TZ, 0); }
		public List<TerminalNode> OPERATOR_PRIORITY_2() { return getTokens(CPPgrammarParser.OPERATOR_PRIORITY_2); }
		public TerminalNode OPERATOR_PRIORITY_2(int i) {
			return getToken(CPPgrammarParser.OPERATOR_PRIORITY_2, i);
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
		enterRule(_localctx, 10, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			mult_operation();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATOR_PRIORITY_2) {
				{
				{
				setState(72);
				match(OPERATOR_PRIORITY_2);
				setState(73);
				mult_operation();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
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
			setState(81);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VALUE) | (1L << INNER) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATOR_PRIORITY_1) {
				{
				{
				setState(82);
				match(OPERATOR_PRIORITY_1);
				setState(83);
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
				setState(88);
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
			setState(89);
			match(TYPE);
			setState(90);
			match(ID);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(91);
				match(ASSIGN);
				}
			}

			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(94);
				match(VALUE);
				}
				break;
			case 2:
				{
				setState(95);
				match(ID);
				}
				break;
			case 3:
				{
				setState(96);
				operation();
				}
				break;
			}
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(99);
				match(TZ);
				}
				break;
			}
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR) {
				{
				{
				setState(102);
				match(BR);
				setState(103);
				match(ID);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(104);
					match(ASSIGN);
					}
				}

				setState(110);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(107);
					match(VALUE);
					}
					break;
				case 2:
					{
					setState(108);
					match(ID);
					}
					break;
				case 3:
					{
					setState(109);
					operation();
					}
					break;
				}
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TZ) {
				{
				setState(117);
				match(TZ);
				}
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
			setState(120);
			_la = _input.LA(1);
			if ( !(_la==INNER || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(121);
			match(ASSIGN);
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(122);
				operation();
				}
				break;
			case 2:
				{
				setState(123);
				match(VALUE);
				}
				break;
			case 3:
				{
				setState(124);
				match(ID);
				}
				break;
			case 4:
				{
				setState(125);
				match(INNER);
				}
				break;
			}
			setState(128);
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
			setState(130);
			match(TYPE);
			setState(131);
			match(T__0);
			setState(132);
			innsqbrackets();
			setState(133);
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
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(135);
				match(PRINT);
				setState(140);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VALUE:
					{
					setState(136);
					match(VALUE);
					}
					break;
				case INNER:
					{
					setState(137);
					match(INNER);
					}
					break;
				case ID:
					{
					setState(138);
					match(ID);
					}
					break;
				case LBR:
					{
					setState(139);
					innsqbrackets();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(142);
				match(TZ);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(143);
				match(PRINT);
				setState(148);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VALUE:
					{
					setState(144);
					match(VALUE);
					}
					break;
				case INNER:
					{
					setState(145);
					match(INNER);
					}
					break;
				case ID:
					{
					setState(146);
					match(ID);
					}
					break;
				case LBR:
					{
					setState(147);
					innsqbrackets();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NLCLEAR) {
					{
					setState(150);
					match(NLCLEAR);
					}
				}

				setState(153);
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
			setState(156);
			match(STRUCT);
			setState(157);
			match(ID);
			setState(158);
			inbrackets();
			setState(159);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00a4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\5\2-\n\2\3\3\6\3\60\n\3\r\3\16\3\61\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\7\5:\n\5\f\5\16\5=\13\5\3\5\3\5\3\6\3\6\7\6C\n\6\f\6\16\6"+
		"F\13\6\3\6\3\6\3\7\3\7\3\7\7\7M\n\7\f\7\16\7P\13\7\3\7\3\7\3\b\3\b\3\b"+
		"\7\bW\n\b\f\b\16\bZ\13\b\3\t\3\t\3\t\5\t_\n\t\3\t\3\t\3\t\5\td\n\t\3\t"+
		"\5\tg\n\t\3\t\3\t\3\t\5\tl\n\t\3\t\3\t\3\t\5\tq\n\t\7\ts\n\t\f\t\16\t"+
		"v\13\t\3\t\5\ty\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0081\n\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u008f\n\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u0097\n\f\3\f\5\f\u009a\n\f\3\f\5\f\u009d\n\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\4\4\2\7\7\33\34\3"+
		"\2\33\34\2\u00bd\2,\3\2\2\2\4/\3\2\2\2\6\63\3\2\2\2\b\67\3\2\2\2\n@\3"+
		"\2\2\2\fI\3\2\2\2\16S\3\2\2\2\20[\3\2\2\2\22z\3\2\2\2\24\u0084\3\2\2\2"+
		"\26\u009c\3\2\2\2\30\u009e\3\2\2\2\32-\5\24\13\2\33-\5\20\t\2\34-\5\26"+
		"\f\2\35-\5\22\n\2\36-\5\6\4\2\37-\5\f\7\2 -\5\30\r\2!\"\7&\2\2\"#\5\2"+
		"\2\2#$\7%\2\2$-\3\2\2\2%&\7$\2\2&\'\5\2\2\2\'(\7#\2\2(-\3\2\2\2)-\7\7"+
		"\2\2*-\7\34\2\2+-\7\33\2\2,\32\3\2\2\2,\33\3\2\2\2,\34\3\2\2\2,\35\3\2"+
		"\2\2,\36\3\2\2\2,\37\3\2\2\2, \3\2\2\2,!\3\2\2\2,%\3\2\2\2,)\3\2\2\2,"+
		"*\3\2\2\2,+\3\2\2\2-\3\3\2\2\2.\60\5\2\2\2/.\3\2\2\2\60\61\3\2\2\2\61"+
		"/\3\2\2\2\61\62\3\2\2\2\62\5\3\2\2\2\63\64\7\34\2\2\64\65\7\34\2\2\65"+
		"\66\7 \2\2\66\7\3\2\2\2\67;\7$\2\28:\5\2\2\298\3\2\2\2:=\3\2\2\2;9\3\2"+
		"\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7#\2\2?\t\3\2\2\2@D\7&\2\2AC\5\2"+
		"\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7%"+
		"\2\2H\13\3\2\2\2IN\5\16\b\2JK\7\5\2\2KM\5\16\b\2LJ\3\2\2\2MP\3\2\2\2N"+
		"L\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7 \2\2R\r\3\2\2\2SX\t\2\2\2"+
		"TU\7\4\2\2UW\t\2\2\2VT\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\17\3\2\2"+
		"\2ZX\3\2\2\2[\\\7\b\2\2\\^\7\34\2\2]_\7\22\2\2^]\3\2\2\2^_\3\2\2\2_c\3"+
		"\2\2\2`d\7\7\2\2ad\7\34\2\2bd\5\f\7\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2cd"+
		"\3\2\2\2df\3\2\2\2eg\7 \2\2fe\3\2\2\2fg\3\2\2\2gt\3\2\2\2hi\7!\2\2ik\7"+
		"\34\2\2jl\7\22\2\2kj\3\2\2\2kl\3\2\2\2lp\3\2\2\2mq\7\7\2\2nq\7\34\2\2"+
		"oq\5\f\7\2pm\3\2\2\2pn\3\2\2\2po\3\2\2\2pq\3\2\2\2qs\3\2\2\2rh\3\2\2\2"+
		"sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2ux\3\2\2\2vt\3\2\2\2wy\7 \2\2xw\3\2\2\2"+
		"xy\3\2\2\2y\21\3\2\2\2z{\t\3\2\2{\u0080\7\22\2\2|\u0081\5\f\7\2}\u0081"+
		"\7\7\2\2~\u0081\7\34\2\2\177\u0081\7\33\2\2\u0080|\3\2\2\2\u0080}\3\2"+
		"\2\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083"+
		"\7 \2\2\u0083\23\3\2\2\2\u0084\u0085\7\b\2\2\u0085\u0086\7\3\2\2\u0086"+
		"\u0087\5\n\6\2\u0087\u0088\5\b\5\2\u0088\25\3\2\2\2\u0089\u008e\7\16\2"+
		"\2\u008a\u008f\7\7\2\2\u008b\u008f\7\33\2\2\u008c\u008f\7\34\2\2\u008d"+
		"\u008f\5\n\6\2\u008e\u008a\3\2\2\2\u008e\u008b\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u009d\7 \2\2\u0091"+
		"\u0096\7\16\2\2\u0092\u0097\7\7\2\2\u0093\u0097\7\33\2\2\u0094\u0097\7"+
		"\34\2\2\u0095\u0097\5\n\6\2\u0096\u0092\3\2\2\2\u0096\u0093\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u009a\7\17"+
		"\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009d\7 \2\2\u009c\u0089\3\2\2\2\u009c\u0091\3\2\2\2\u009d\27\3\2\2\2"+
		"\u009e\u009f\7\t\2\2\u009f\u00a0\7\34\2\2\u00a0\u00a1\5\b\5\2\u00a1\u00a2"+
		"\7 \2\2\u00a2\31\3\2\2\2\24,\61;DNX^cfkptx\u0080\u008e\u0096\u0099\u009c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}