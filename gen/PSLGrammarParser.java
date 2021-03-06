// Generated from /Users/robertswanson/dev/dsl/src/PSLGrammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PSLGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, PRIORITY=4, REQUIRE=5, PREFER=6, IF=7, THEN=8, 
		OTHERWISE=9, WHEN=10, AND=11, OR=12, TAKING=13, BEFORE=14, CREDITS=15, 
		HOURS=16, IN=17, UPPER=18, DIVISION=19, OF=20, LATER=21, EARLIER=22, LESS=23, 
		MORE_=24, SEMESTER=25, PLAN=26, CLASSES=27, COURSES=28, NOT=29, STRING=30, 
		PERIOD=31, OPENPAREND=32, CLOSEPAREND=33, NUM=34, NAME=35, WS=36;
	public static final int
		RULE_start = 0, RULE_block = 1, RULE_body = 2, RULE_statement = 3, RULE_priority = 4, 
		RULE_require = 5, RULE_prefer = 6, RULE_if_ = 7, RULE_otherwiseIf = 8, 
		RULE_otherwise = 9, RULE_when = 10, RULE_condition = 11, RULE_rConstraint = 12, 
		RULE_pConstraint = 13, RULE_courseNameList = 14, RULE_courseName = 15, 
		RULE_credit_hours = 16, RULE_course_classes = 17, RULE_semester_plan = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "block", "body", "statement", "priority", "require", "prefer", 
			"if_", "otherwiseIf", "otherwise", "when", "condition", "rConstraint", 
			"pConstraint", "courseNameList", "courseName", "credit_hours", "course_classes", 
			"semester_plan"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "','", "'priority'", "'require'", "'prefer'", "'if'", 
			"'then'", "'otherwise'", "'when'", "'and'", "'or'", "'taking'", "'before'", 
			"'credits'", "'hours'", "'in'", "'upper'", "'division'", "'of'", "'later'", 
			"'earlier'", "'less'", "'more'", "'semester'", "'plan'", "'classes'", 
			"'courses'", "'not'", null, "'.'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "PRIORITY", "REQUIRE", "PREFER", "IF", "THEN", 
			"OTHERWISE", "WHEN", "AND", "OR", "TAKING", "BEFORE", "CREDITS", "HOURS", 
			"IN", "UPPER", "DIVISION", "OF", "LATER", "EARLIER", "LESS", "MORE_", 
			"SEMESTER", "PLAN", "CLASSES", "COURSES", "NOT", "STRING", "PERIOD", 
			"OPENPAREND", "CLOSEPAREND", "NUM", "NAME", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "PSLGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PSLGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PSLGrammarParser.EOF, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLGrammarVisitor ) return ((PSLGrammarVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				block();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
			setState(43);
			match(EOF);
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
		public TerminalNode NAME() { return getToken(PSLGrammarParser.NAME, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLGrammarVisitor ) return ((PSLGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(NAME);
			setState(46);
			body();
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

	public static class BodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLGrammarVisitor ) return ((PSLGrammarVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__0);
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				statement();
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIORITY) | (1L << REQUIRE) | (1L << PREFER) | (1L << IF) | (1L << WHEN))) != 0) );
			setState(54);
			match(T__1);
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

	public static class StatementContext extends ParserRuleContext {
		public RequireContext require() {
			return getRuleContext(RequireContext.class,0);
		}
		public PriorityContext priority() {
			return getRuleContext(PriorityContext.class,0);
		}
		public PreferContext prefer() {
			return getRuleContext(PreferContext.class,0);
		}
		public If_Context if_() {
			return getRuleContext(If_Context.class,0);
		}
		public WhenContext when() {
			return getRuleContext(WhenContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLGrammarVisitor ) return ((PSLGrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REQUIRE:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				require();
				}
				break;
			case PRIORITY:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				priority();
				}
				break;
			case PREFER:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				prefer();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				if_();
				}
				break;
			case WHEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				when();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PriorityContext extends ParserRuleContext {
		public TerminalNode PRIORITY() { return getToken(PSLGrammarParser.PRIORITY, 0); }
		public TerminalNode NAME() { return getToken(PSLGrammarParser.NAME, 0); }
		public TerminalNode NUM() { return getToken(PSLGrammarParser.NUM, 0); }
		public TerminalNode PERIOD() { return getToken(PSLGrammarParser.PERIOD, 0); }
		public PriorityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_priority; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).enterPriority(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).exitPriority(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLGrammarVisitor ) return ((PSLGrammarVisitor<? extends T>)visitor).visitPriority(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PriorityContext priority() throws RecognitionException {
		PriorityContext _localctx = new PriorityContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_priority);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(PRIORITY);
			setState(64);
			match(NAME);
			setState(65);
			match(NUM);
			setState(66);
			match(PERIOD);
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

	public static class RequireContext extends ParserRuleContext {
		public TerminalNode REQUIRE() { return getToken(PSLGrammarParser.REQUIRE, 0); }
		public RConstraintContext rConstraint() {
			return getRuleContext(RConstraintContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(PSLGrammarParser.PERIOD, 0); }
		public TerminalNode NOT() { return getToken(PSLGrammarParser.NOT, 0); }
		public RequireContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_require; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).enterRequire(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).exitRequire(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLGrammarVisitor ) return ((PSLGrammarVisitor<? extends T>)visitor).visitRequire(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequireContext require() throws RecognitionException {
		RequireContext _localctx = new RequireContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_require);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(REQUIRE);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(69);
				match(NOT);
				}
			}

			setState(72);
			rConstraint();
			setState(73);
			match(PERIOD);
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

	public static class PreferContext extends ParserRuleContext {
		public TerminalNode PREFER() { return getToken(PSLGrammarParser.PREFER, 0); }
		public TerminalNode NAME() { return getToken(PSLGrammarParser.NAME, 0); }
		public PConstraintContext pConstraint() {
			return getRuleContext(PConstraintContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(PSLGrammarParser.PERIOD, 0); }
		public TerminalNode NOT() { return getToken(PSLGrammarParser.NOT, 0); }
		public PreferContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).enterPrefer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).exitPrefer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLGrammarVisitor ) return ((PSLGrammarVisitor<? extends T>)visitor).visitPrefer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreferContext prefer() throws RecognitionException {
		PreferContext _localctx = new PreferContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_prefer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(PREFER);
			setState(76);
			match(NAME);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(77);
				match(NOT);
				}
			}

			setState(80);
			pConstraint();
			setState(81);
			match(PERIOD);
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

	public static class If_Context extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PSLGrammarParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(PSLGrammarParser.THEN, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<OtherwiseIfContext> otherwiseIf() {
			return getRuleContexts(OtherwiseIfContext.class);
		}
		public OtherwiseIfContext otherwiseIf(int i) {
			return getRuleContext(OtherwiseIfContext.class,i);
		}
		public OtherwiseContext otherwise() {
			return getRuleContext(OtherwiseContext.class,0);
		}
		public If_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).enterIf_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).exitIf_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLGrammarVisitor ) return ((PSLGrammarVisitor<? extends T>)visitor).visitIf_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_Context if_() throws RecognitionException {
		If_Context _localctx = new If_Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(IF);
			setState(84);
			condition();
			setState(85);
			match(THEN);
			setState(86);
			body();
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(87);
					otherwiseIf();
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OTHERWISE) {
				{
				setState(93);
				otherwise();
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

	public static class OtherwiseIfContext extends ParserRuleContext {
		public TerminalNode OTHERWISE() { return getToken(PSLGrammarParser.OTHERWISE, 0); }
		public TerminalNode IF() { return getToken(PSLGrammarParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(PSLGrammarParser.THEN, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public OtherwiseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherwiseIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).enterOtherwiseIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).exitOtherwiseIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLGrammarVisitor ) return ((PSLGrammarVisitor<? extends T>)visitor).visitOtherwiseIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherwiseIfContext otherwiseIf() throws RecognitionException {
		OtherwiseIfContext _localctx = new OtherwiseIfContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_otherwiseIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(OTHERWISE);
			setState(97);
			match(IF);
			setState(98);
			condition();
			setState(99);
			match(THEN);
			setState(100);
			body();
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

	public static class OtherwiseContext extends ParserRuleContext {
		public TerminalNode OTHERWISE() { return getToken(PSLGrammarParser.OTHERWISE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public OtherwiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherwise; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).enterOtherwise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).exitOtherwise(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLGrammarVisitor ) return ((PSLGrammarVisitor<? extends T>)visitor).visitOtherwise(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherwiseContext otherwise() throws RecognitionException {
		OtherwiseContext _localctx = new OtherwiseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_otherwise);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(OTHERWISE);
			setState(103);
			body();
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

	public static class WhenContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(PSLGrammarParser.WHEN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public WhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).enterWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).exitWhen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLGrammarVisitor ) return ((PSLGrammarVisitor<? extends T>)visitor).visitWhen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenContext when() throws RecognitionException {
		WhenContext _localctx = new WhenContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_when);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(WHEN);
			setState(106);
			condition();
			setState(107);
			body();
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode TAKING() { return getToken(PSLGrammarParser.TAKING, 0); }
		public TerminalNode STRING() { return getToken(PSLGrammarParser.STRING, 0); }
		public TerminalNode OPENPAREND() { return getToken(PSLGrammarParser.OPENPAREND, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode AND() { return getToken(PSLGrammarParser.AND, 0); }
		public TerminalNode CLOSEPAREND() { return getToken(PSLGrammarParser.CLOSEPAREND, 0); }
		public TerminalNode OR() { return getToken(PSLGrammarParser.OR, 0); }
		public TerminalNode NOT() { return getToken(PSLGrammarParser.NOT, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLGrammarVisitor ) return ((PSLGrammarVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condition);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(TAKING);
				setState(110);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(OPENPAREND);
				setState(112);
				condition();
				setState(113);
				match(AND);
				setState(114);
				condition();
				setState(115);
				match(CLOSEPAREND);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				match(OPENPAREND);
				setState(118);
				condition();
				setState(119);
				match(OR);
				setState(120);
				condition();
				setState(121);
				match(CLOSEPAREND);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				match(OPENPAREND);
				setState(124);
				condition();
				setState(125);
				match(CLOSEPAREND);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(127);
				match(OPENPAREND);
				setState(128);
				match(NOT);
				setState(129);
				condition();
				setState(130);
				match(CLOSEPAREND);
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

	public static class RConstraintContext extends ParserRuleContext {
		public CourseNameListContext courseNameList() {
			return getRuleContext(CourseNameListContext.class,0);
		}
		public TerminalNode NUM() { return getToken(PSLGrammarParser.NUM, 0); }
		public Credit_hoursContext credit_hours() {
			return getRuleContext(Credit_hoursContext.class,0);
		}
		public TerminalNode IN() { return getToken(PSLGrammarParser.IN, 0); }
		public Semester_planContext semester_plan() {
			return getRuleContext(Semester_planContext.class,0);
		}
		public TerminalNode OF() { return getToken(PSLGrammarParser.OF, 0); }
		public TerminalNode UPPER() { return getToken(PSLGrammarParser.UPPER, 0); }
		public TerminalNode DIVISION() { return getToken(PSLGrammarParser.DIVISION, 0); }
		public TerminalNode TAKING() { return getToken(PSLGrammarParser.TAKING, 0); }
		public TerminalNode BEFORE() { return getToken(PSLGrammarParser.BEFORE, 0); }
		public CourseNameContext courseName() {
			return getRuleContext(CourseNameContext.class,0);
		}
		public RConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).enterRConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).exitRConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLGrammarVisitor ) return ((PSLGrammarVisitor<? extends T>)visitor).visitRConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RConstraintContext rConstraint() throws RecognitionException {
		RConstraintContext _localctx = new RConstraintContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_rConstraint);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				courseNameList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(NUM);
				setState(136);
				credit_hours();
				setState(137);
				match(IN);
				setState(138);
				semester_plan();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(NUM);
				setState(141);
				match(OF);
				setState(142);
				courseNameList();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				match(NUM);
				setState(144);
				match(UPPER);
				setState(145);
				match(DIVISION);
				setState(146);
				credit_hours();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				match(TAKING);
				setState(148);
				courseNameList();
				setState(149);
				match(BEFORE);
				setState(150);
				courseName();
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

	public static class PConstraintContext extends ParserRuleContext {
		public RConstraintContext rConstraint() {
			return getRuleContext(RConstraintContext.class,0);
		}
		public TerminalNode LATER() { return getToken(PSLGrammarParser.LATER, 0); }
		public Course_classesContext course_classes() {
			return getRuleContext(Course_classesContext.class,0);
		}
		public TerminalNode EARLIER() { return getToken(PSLGrammarParser.EARLIER, 0); }
		public TerminalNode MORE_() { return getToken(PSLGrammarParser.MORE_, 0); }
		public TerminalNode IN() { return getToken(PSLGrammarParser.IN, 0); }
		public Semester_planContext semester_plan() {
			return getRuleContext(Semester_planContext.class,0);
		}
		public TerminalNode LESS() { return getToken(PSLGrammarParser.LESS, 0); }
		public Credit_hoursContext credit_hours() {
			return getRuleContext(Credit_hoursContext.class,0);
		}
		public PConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).enterPConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).exitPConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLGrammarVisitor ) return ((PSLGrammarVisitor<? extends T>)visitor).visitPConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PConstraintContext pConstraint() throws RecognitionException {
		PConstraintContext _localctx = new PConstraintContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pConstraint);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				rConstraint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(LATER);
				setState(156);
				course_classes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(EARLIER);
				setState(158);
				course_classes();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				match(MORE_);
				setState(160);
				course_classes();
				setState(161);
				match(IN);
				setState(162);
				semester_plan();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				match(LESS);
				setState(165);
				course_classes();
				setState(166);
				match(IN);
				setState(167);
				semester_plan();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(169);
				match(MORE_);
				setState(170);
				credit_hours();
				setState(171);
				match(IN);
				setState(172);
				semester_plan();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(174);
				match(LESS);
				setState(175);
				credit_hours();
				setState(176);
				match(IN);
				setState(177);
				semester_plan();
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

	public static class CourseNameListContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(PSLGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(PSLGrammarParser.STRING, i);
		}
		public CourseNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_courseNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).enterCourseNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).exitCourseNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLGrammarVisitor ) return ((PSLGrammarVisitor<? extends T>)visitor).visitCourseNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CourseNameListContext courseNameList() throws RecognitionException {
		CourseNameListContext _localctx = new CourseNameListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_courseNameList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(181);
					match(STRING);
					setState(182);
					match(T__2);
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(188);
			match(STRING);
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

	public static class CourseNameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(PSLGrammarParser.STRING, 0); }
		public CourseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_courseName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).enterCourseName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).exitCourseName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLGrammarVisitor ) return ((PSLGrammarVisitor<? extends T>)visitor).visitCourseName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CourseNameContext courseName() throws RecognitionException {
		CourseNameContext _localctx = new CourseNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_courseName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(STRING);
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

	public static class Credit_hoursContext extends ParserRuleContext {
		public TerminalNode CREDITS() { return getToken(PSLGrammarParser.CREDITS, 0); }
		public TerminalNode HOURS() { return getToken(PSLGrammarParser.HOURS, 0); }
		public Credit_hoursContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_credit_hours; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).enterCredit_hours(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).exitCredit_hours(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLGrammarVisitor ) return ((PSLGrammarVisitor<? extends T>)visitor).visitCredit_hours(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Credit_hoursContext credit_hours() throws RecognitionException {
		Credit_hoursContext _localctx = new Credit_hoursContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_credit_hours);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !(_la==CREDITS || _la==HOURS) ) {
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

	public static class Course_classesContext extends ParserRuleContext {
		public TerminalNode COURSES() { return getToken(PSLGrammarParser.COURSES, 0); }
		public TerminalNode CLASSES() { return getToken(PSLGrammarParser.CLASSES, 0); }
		public Course_classesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_course_classes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).enterCourse_classes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).exitCourse_classes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLGrammarVisitor ) return ((PSLGrammarVisitor<? extends T>)visitor).visitCourse_classes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Course_classesContext course_classes() throws RecognitionException {
		Course_classesContext _localctx = new Course_classesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_course_classes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_la = _input.LA(1);
			if ( !(_la==CLASSES || _la==COURSES) ) {
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

	public static class Semester_planContext extends ParserRuleContext {
		public TerminalNode SEMESTER() { return getToken(PSLGrammarParser.SEMESTER, 0); }
		public TerminalNode PLAN() { return getToken(PSLGrammarParser.PLAN, 0); }
		public Semester_planContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semester_plan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).enterSemester_plan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSLGrammarListener ) ((PSLGrammarListener)listener).exitSemester_plan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLGrammarVisitor ) return ((PSLGrammarVisitor<? extends T>)visitor).visitSemester_plan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Semester_planContext semester_plan() throws RecognitionException {
		Semester_planContext _localctx = new Semester_planContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_semester_plan);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_la = _input.LA(1);
			if ( !(_la==SEMESTER || _la==PLAN) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00c9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\6\2*\n\2\r\2\16\2+\3\2\3\2\3\3\3\3\3\3\3\4\3"+
		"\4\6\4\65\n\4\r\4\16\4\66\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5@\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\5\7I\n\7\3\7\3\7\3\7\3\b\3\b\3\b\5\bQ\n\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\7\t[\n\t\f\t\16\t^\13\t\3\t\5\ta\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u0087\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u009b\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b6\n\17\3\20\3\20\7\20\u00ba"+
		"\n\20\f\20\16\20\u00bd\13\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\5\3"+
		"\2\21\22\3\2\35\36\3\2\33\34\2\u00ce\2)\3\2\2\2\4/\3\2\2\2\6\62\3\2\2"+
		"\2\b?\3\2\2\2\nA\3\2\2\2\fF\3\2\2\2\16M\3\2\2\2\20U\3\2\2\2\22b\3\2\2"+
		"\2\24h\3\2\2\2\26k\3\2\2\2\30\u0086\3\2\2\2\32\u009a\3\2\2\2\34\u00b5"+
		"\3\2\2\2\36\u00bb\3\2\2\2 \u00c0\3\2\2\2\"\u00c2\3\2\2\2$\u00c4\3\2\2"+
		"\2&\u00c6\3\2\2\2(*\5\4\3\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,-"+
		"\3\2\2\2-.\7\2\2\3.\3\3\2\2\2/\60\7%\2\2\60\61\5\6\4\2\61\5\3\2\2\2\62"+
		"\64\7\3\2\2\63\65\5\b\5\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66"+
		"\67\3\2\2\2\678\3\2\2\289\7\4\2\29\7\3\2\2\2:@\5\f\7\2;@\5\n\6\2<@\5\16"+
		"\b\2=@\5\20\t\2>@\5\26\f\2?:\3\2\2\2?;\3\2\2\2?<\3\2\2\2?=\3\2\2\2?>\3"+
		"\2\2\2@\t\3\2\2\2AB\7\6\2\2BC\7%\2\2CD\7$\2\2DE\7!\2\2E\13\3\2\2\2FH\7"+
		"\7\2\2GI\7\37\2\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\5\32\16\2KL\7!\2\2L"+
		"\r\3\2\2\2MN\7\b\2\2NP\7%\2\2OQ\7\37\2\2PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2"+
		"RS\5\34\17\2ST\7!\2\2T\17\3\2\2\2UV\7\t\2\2VW\5\30\r\2WX\7\n\2\2X\\\5"+
		"\6\4\2Y[\5\22\n\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]`\3\2\2\2"+
		"^\\\3\2\2\2_a\5\24\13\2`_\3\2\2\2`a\3\2\2\2a\21\3\2\2\2bc\7\13\2\2cd\7"+
		"\t\2\2de\5\30\r\2ef\7\n\2\2fg\5\6\4\2g\23\3\2\2\2hi\7\13\2\2ij\5\6\4\2"+
		"j\25\3\2\2\2kl\7\f\2\2lm\5\30\r\2mn\5\6\4\2n\27\3\2\2\2op\7\17\2\2p\u0087"+
		"\7 \2\2qr\7\"\2\2rs\5\30\r\2st\7\r\2\2tu\5\30\r\2uv\7#\2\2v\u0087\3\2"+
		"\2\2wx\7\"\2\2xy\5\30\r\2yz\7\16\2\2z{\5\30\r\2{|\7#\2\2|\u0087\3\2\2"+
		"\2}~\7\"\2\2~\177\5\30\r\2\177\u0080\7#\2\2\u0080\u0087\3\2\2\2\u0081"+
		"\u0082\7\"\2\2\u0082\u0083\7\37\2\2\u0083\u0084\5\30\r\2\u0084\u0085\7"+
		"#\2\2\u0085\u0087\3\2\2\2\u0086o\3\2\2\2\u0086q\3\2\2\2\u0086w\3\2\2\2"+
		"\u0086}\3\2\2\2\u0086\u0081\3\2\2\2\u0087\31\3\2\2\2\u0088\u009b\5\36"+
		"\20\2\u0089\u008a\7$\2\2\u008a\u008b\5\"\22\2\u008b\u008c\7\23\2\2\u008c"+
		"\u008d\5&\24\2\u008d\u009b\3\2\2\2\u008e\u008f\7$\2\2\u008f\u0090\7\26"+
		"\2\2\u0090\u009b\5\36\20\2\u0091\u0092\7$\2\2\u0092\u0093\7\24\2\2\u0093"+
		"\u0094\7\25\2\2\u0094\u009b\5\"\22\2\u0095\u0096\7\17\2\2\u0096\u0097"+
		"\5\36\20\2\u0097\u0098\7\20\2\2\u0098\u0099\5 \21\2\u0099\u009b\3\2\2"+
		"\2\u009a\u0088\3\2\2\2\u009a\u0089\3\2\2\2\u009a\u008e\3\2\2\2\u009a\u0091"+
		"\3\2\2\2\u009a\u0095\3\2\2\2\u009b\33\3\2\2\2\u009c\u00b6\5\32\16\2\u009d"+
		"\u009e\7\27\2\2\u009e\u00b6\5$\23\2\u009f\u00a0\7\30\2\2\u00a0\u00b6\5"+
		"$\23\2\u00a1\u00a2\7\32\2\2\u00a2\u00a3\5$\23\2\u00a3\u00a4\7\23\2\2\u00a4"+
		"\u00a5\5&\24\2\u00a5\u00b6\3\2\2\2\u00a6\u00a7\7\31\2\2\u00a7\u00a8\5"+
		"$\23\2\u00a8\u00a9\7\23\2\2\u00a9\u00aa\5&\24\2\u00aa\u00b6\3\2\2\2\u00ab"+
		"\u00ac\7\32\2\2\u00ac\u00ad\5\"\22\2\u00ad\u00ae\7\23\2\2\u00ae\u00af"+
		"\5&\24\2\u00af\u00b6\3\2\2\2\u00b0\u00b1\7\31\2\2\u00b1\u00b2\5\"\22\2"+
		"\u00b2\u00b3\7\23\2\2\u00b3\u00b4\5&\24\2\u00b4\u00b6\3\2\2\2\u00b5\u009c"+
		"\3\2\2\2\u00b5\u009d\3\2\2\2\u00b5\u009f\3\2\2\2\u00b5\u00a1\3\2\2\2\u00b5"+
		"\u00a6\3\2\2\2\u00b5\u00ab\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b6\35\3\2\2"+
		"\2\u00b7\u00b8\7 \2\2\u00b8\u00ba\7\5\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\u00bf\7 \2\2\u00bf\37\3\2\2\2\u00c0\u00c1\7 \2\2"+
		"\u00c1!\3\2\2\2\u00c2\u00c3\t\2\2\2\u00c3#\3\2\2\2\u00c4\u00c5\t\3\2\2"+
		"\u00c5%\3\2\2\2\u00c6\u00c7\t\4\2\2\u00c7\'\3\2\2\2\r+\66?HP\\`\u0086"+
		"\u009a\u00b5\u00bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}