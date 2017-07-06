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
		MINUS=20, PLUSASS=21, MULTASS=22, RETURN=23, DOUBLE=24, BOOL=25, INNER=26, 
		ID=27, STRING=28, DOT=29, TZ=30, BR=31, QUOTE=32, RKR=33, LKR=34, RBR=35, 
		LBR=36, WS=37;
	public static final int
		RULE_expr = 0, RULE_block = 1, RULE_inbrackets = 2, RULE_innsqbrackets = 3, 
		RULE_operation = 4, RULE_mult_operation = 5, RULE_typing = 6, RULE_assignment = 7, 
		RULE_main = 8, RULE_printing = 9, RULE_structuring = 10, RULE_returning = 11, 
		RULE_declaring = 12;
	public static final String[] ruleNames = {
		"expr", "block", "inbrackets", "innsqbrackets", "operation", "mult_operation", 
		"typing", "assignment", "main", "printing", "structuring", "returning", 
		"declaring"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", null, null, null, null, null, "'struct'", "'double'", 
		"'bool'", "'string'", "'void'", null, null, "'=='", "'!='", "'='", "'*'", 
		"'/'", "'+'", "'-'", "'+='", "'*='", "'return'", null, null, null, null, 
		null, "'.'", "';'", "','", "'\"'", "'}'", "'{'", "')'", "'('"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "OPERATOR_PRIORITY_1", "OPERATOR_PRIORITY_2", "BOPERATOR", 
		"VALUE", "TYPE", "STRUCT", "TDOUBLE", "TBOOL", "TSTRING", "VOID", "PRINT", 
		"NLCLEAR", "EQUALS", "NEQUALS", "ASSIGN", "MULTIPLYING", "DIVISION", "PLUS", 
		"MINUS", "PLUSASS", "MULTASS", "RETURN", "DOUBLE", "BOOL", "INNER", "ID", 
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
		public Mult_operationContext mult_operation() {
			return getRuleContext(Mult_operationContext.class,0);
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
		public DeclaringContext declaring() {
			return getRuleContext(DeclaringContext.class,0);
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
			setState(46);
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
				mult_operation();
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
				returning();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(34);
				declaring();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(35);
				match(LBR);
				setState(36);
				expr();
				setState(37);
				match(RBR);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(39);
				match(LKR);
				setState(40);
				expr();
				setState(41);
				match(RKR);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(43);
				match(VALUE);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(44);
				match(ID);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(45);
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
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				expr();
				}
				}
				setState(51); 
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
			setState(53);
			match(LKR);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VALUE) | (1L << TYPE) | (1L << STRUCT) | (1L << PRINT) | (1L << RETURN) | (1L << INNER) | (1L << ID) | (1L << LKR) | (1L << LBR))) != 0)) {
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
		enterRule(_localctx, 6, RULE_innsqbrackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(LBR);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VALUE) | (1L << TYPE) | (1L << STRUCT) | (1L << PRINT) | (1L << RETURN) | (1L << INNER) | (1L << ID) | (1L << LKR) | (1L << LBR))) != 0)) {
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
		public List<TerminalNode> ID() { return getTokens(CPPgrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CPPgrammarParser.ID, i);
		}
		public List<TerminalNode> VALUE() { return getTokens(CPPgrammarParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(CPPgrammarParser.VALUE, i);
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
		enterRule(_localctx, 10, RULE_mult_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_la = _input.LA(1);
			if ( !(_la==VALUE || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATOR_PRIORITY_1) {
				{
				{
				setState(80);
				match(OPERATOR_PRIORITY_1);
				setState(81);
				_la = _input.LA(1);
				if ( !(_la==VALUE || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(86);
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
		enterRule(_localctx, 12, RULE_typing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(TYPE);
			setState(88);
			match(ID);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(89);
				match(ASSIGN);
				}
			}

			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(92);
				match(VALUE);
				}
				break;
			case 2:
				{
				setState(93);
				match(ID);
				}
				break;
			case 3:
				{
				setState(94);
				operation();
				}
				break;
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR) {
				{
				{
				setState(97);
				match(BR);
				setState(98);
				match(ID);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(99);
					match(ASSIGN);
					}
				}

				setState(105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(102);
					match(VALUE);
					}
					break;
				case 2:
					{
					setState(103);
					match(ID);
					}
					break;
				case 3:
					{
					setState(104);
					operation();
					}
					break;
				}
				}
				}
				setState(111);
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
		enterRule(_localctx, 14, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !(_la==INNER || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(113);
			match(ASSIGN);
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(114);
				operation();
				}
				break;
			case 2:
				{
				setState(115);
				match(VALUE);
				}
				break;
			case 3:
				{
				setState(116);
				match(ID);
				}
				break;
			case 4:
				{
				setState(117);
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
		enterRule(_localctx, 16, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(TYPE);
			setState(121);
			match(T__0);
			setState(122);
			innsqbrackets();
			setState(123);
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
		public TerminalNode VALUE() { return getToken(CPPgrammarParser.VALUE, 0); }
		public TerminalNode INNER() { return getToken(CPPgrammarParser.INNER, 0); }
		public TerminalNode ID() { return getToken(CPPgrammarParser.ID, 0); }
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
		enterRule(_localctx, 18, RULE_printing);
		int _la;
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(125);
				match(PRINT);
				setState(126);
				innsqbrackets();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(127);
				match(PRINT);
				setState(132);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VALUE:
					{
					setState(128);
					match(VALUE);
					}
					break;
				case INNER:
					{
					setState(129);
					match(INNER);
					}
					break;
				case ID:
					{
					setState(130);
					match(ID);
					}
					break;
				case LBR:
					{
					setState(131);
					innsqbrackets();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NLCLEAR) {
					{
					setState(134);
					match(NLCLEAR);
					}
				}

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
		enterRule(_localctx, 20, RULE_structuring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(STRUCT);
			setState(140);
			match(ID);
			setState(141);
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
		enterRule(_localctx, 22, RULE_returning);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(RETURN);
			setState(144);
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

	public static class DeclaringContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CPPgrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CPPgrammarParser.ID, i);
		}
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
		enterRule(_localctx, 24, RULE_declaring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(ID);
			setState(147);
			match(ID);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u0098\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\61\n\2\3\3\6\3\64\n\3\r\3"+
		"\16\3\65\3\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\4\3\4\3\5\3\5\7\5C\n\5\f\5"+
		"\16\5F\13\5\3\5\3\5\3\6\3\6\3\6\7\6M\n\6\f\6\16\6P\13\6\3\7\3\7\3\7\7"+
		"\7U\n\7\f\7\16\7X\13\7\3\b\3\b\3\b\5\b]\n\b\3\b\3\b\3\b\5\bb\n\b\3\b\3"+
		"\b\3\b\5\bg\n\b\3\b\3\b\3\b\5\bl\n\b\7\bn\n\b\f\b\16\bq\13\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\ty\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13\u0087\n\13\3\13\5\13\u008a\n\13\5\13\u008c\n\13\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\2\5\4\2\7\7\35\35\3\2\34\35\4\2\7\7\34\35\2\u00ad\2\60\3\2\2"+
		"\2\4\63\3\2\2\2\6\67\3\2\2\2\b@\3\2\2\2\nI\3\2\2\2\fQ\3\2\2\2\16Y\3\2"+
		"\2\2\20r\3\2\2\2\22z\3\2\2\2\24\u008b\3\2\2\2\26\u008d\3\2\2\2\30\u0091"+
		"\3\2\2\2\32\u0094\3\2\2\2\34\61\5\22\n\2\35\61\5\16\b\2\36\61\5\24\13"+
		"\2\37\61\5\20\t\2 \61\5\f\7\2!\61\5\n\6\2\"\61\5\26\f\2#\61\5\30\r\2$"+
		"\61\5\32\16\2%&\7&\2\2&\'\5\2\2\2\'(\7%\2\2(\61\3\2\2\2)*\7$\2\2*+\5\2"+
		"\2\2+,\7#\2\2,\61\3\2\2\2-\61\7\7\2\2.\61\7\35\2\2/\61\7\34\2\2\60\34"+
		"\3\2\2\2\60\35\3\2\2\2\60\36\3\2\2\2\60\37\3\2\2\2\60 \3\2\2\2\60!\3\2"+
		"\2\2\60\"\3\2\2\2\60#\3\2\2\2\60$\3\2\2\2\60%\3\2\2\2\60)\3\2\2\2\60-"+
		"\3\2\2\2\60.\3\2\2\2\60/\3\2\2\2\61\3\3\2\2\2\62\64\5\2\2\2\63\62\3\2"+
		"\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\5\3\2\2\2\67;\7$\2\2"+
		"8:\5\2\2\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2"+
		">?\7#\2\2?\7\3\2\2\2@D\7&\2\2AC\5\2\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2"+
		"DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7%\2\2H\t\3\2\2\2IN\5\f\7\2JK\7\5\2\2"+
		"KM\5\f\7\2LJ\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\13\3\2\2\2PN\3\2\2"+
		"\2QV\t\2\2\2RS\7\4\2\2SU\t\2\2\2TR\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2"+
		"\2W\r\3\2\2\2XV\3\2\2\2YZ\7\b\2\2Z\\\7\35\2\2[]\7\22\2\2\\[\3\2\2\2\\"+
		"]\3\2\2\2]a\3\2\2\2^b\7\7\2\2_b\7\35\2\2`b\5\n\6\2a^\3\2\2\2a_\3\2\2\2"+
		"a`\3\2\2\2ab\3\2\2\2bo\3\2\2\2cd\7!\2\2df\7\35\2\2eg\7\22\2\2fe\3\2\2"+
		"\2fg\3\2\2\2gk\3\2\2\2hl\7\7\2\2il\7\35\2\2jl\5\n\6\2kh\3\2\2\2ki\3\2"+
		"\2\2kj\3\2\2\2kl\3\2\2\2ln\3\2\2\2mc\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2"+
		"\2\2p\17\3\2\2\2qo\3\2\2\2rs\t\3\2\2sx\7\22\2\2ty\5\n\6\2uy\7\7\2\2vy"+
		"\7\35\2\2wy\7\34\2\2xt\3\2\2\2xu\3\2\2\2xv\3\2\2\2xw\3\2\2\2y\21\3\2\2"+
		"\2z{\7\b\2\2{|\7\3\2\2|}\5\b\5\2}~\5\6\4\2~\23\3\2\2\2\177\u0080\7\16"+
		"\2\2\u0080\u008c\5\b\5\2\u0081\u0086\7\16\2\2\u0082\u0087\7\7\2\2\u0083"+
		"\u0087\7\34\2\2\u0084\u0087\7\35\2\2\u0085\u0087\5\b\5\2\u0086\u0082\3"+
		"\2\2\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087"+
		"\u0089\3\2\2\2\u0088\u008a\7\17\2\2\u0089\u0088\3\2\2\2\u0089\u008a\3"+
		"\2\2\2\u008a\u008c\3\2\2\2\u008b\177\3\2\2\2\u008b\u0081\3\2\2\2\u008c"+
		"\25\3\2\2\2\u008d\u008e\7\t\2\2\u008e\u008f\7\35\2\2\u008f\u0090\5\6\4"+
		"\2\u0090\27\3\2\2\2\u0091\u0092\7\31\2\2\u0092\u0093\t\4\2\2\u0093\31"+
		"\3\2\2\2\u0094\u0095\7\35\2\2\u0095\u0096\7\35\2\2\u0096\33\3\2\2\2\21"+
		"\60\65;DNV\\afkox\u0086\u0089\u008b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}