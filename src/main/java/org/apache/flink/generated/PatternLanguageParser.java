// Generated from PatternLanguage.g4 by ANTLR 4.7.1

package org.apache.flink.generated;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PatternLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SKIP_NO_SKIP=1, SKIP_SKIP_PAST_LAST=2, SKIP_SKIP_TO_FIRST=3, SKIP_SKIP_TO_LAST=4, 
		IN_SET=5, BETWEEN=6, LIKE=7, REGEXP=8, ESCAPE=9, OR_EXPR=10, AND_EXPR=11, 
		NOT_EXPR=12, WHERE=13, AS=14, SUM=15, AVG=16, MAX=17, MIN=18, ON=19, IS=20, 
		WEEKDAY=21, LW=22, INSTANCEOF=23, TYPEOF=24, CAST=25, CURRENT_TIMESTAMP=26, 
		UNTIL=27, AT=28, TIMEPERIOD_YEAR=29, TIMEPERIOD_YEARS=30, TIMEPERIOD_MONTH=31, 
		TIMEPERIOD_MONTHS=32, TIMEPERIOD_WEEK=33, TIMEPERIOD_WEEKS=34, TIMEPERIOD_DAY=35, 
		TIMEPERIOD_DAYS=36, TIMEPERIOD_HOUR=37, TIMEPERIOD_HOURS=38, TIMEPERIOD_MINUTE=39, 
		TIMEPERIOD_MINUTES=40, TIMEPERIOD_SEC=41, TIMEPERIOD_SECOND=42, TIMEPERIOD_SECONDS=43, 
		TIMEPERIOD_MILLISEC=44, TIMEPERIOD_MILLISECOND=45, TIMEPERIOD_MILLISECONDS=46, 
		TIMEPERIOD_MICROSEC=47, TIMEPERIOD_MICROSECOND=48, TIMEPERIOD_MICROSECONDS=49, 
		BOOLEAN_TRUE=50, BOOLEAN_FALSE=51, VALUE_NULL=52, WITHIN=53, HOUR_SHORT=54, 
		MINUTE_SHORT=55, SECOND_SHORT=56, MILLSECONDS_SHORT=57, NOT_FOLLOWED_BY=58, 
		FOLLOWED_BY=59, FOLLOWED_BY_ANY=60, GOES=61, EQUALS=62, QUESTION=63, LPAREN=64, 
		RPAREN=65, LBRACK=66, RBRACK=67, LCURLY=68, RCURLY=69, COLON=70, COMMA=71, 
		LNOT=72, BNOT=73, NOT_EQUAL=74, DIV=75, PLUS=76, MINUS=77, DEC=78, STAR=79, 
		MOD=80, GE=81, GT=82, LE=83, LT=84, BXOR=85, BOR=86, LOR=87, BAND=88, 
		BAND_ASSIGN=89, LAND=90, SEMI=91, DOT=92, NUM_LONG=93, NUM_DOUBLE=94, 
		NUM_FLOAT=95, ESCAPECHAR=96, ESCAPEBACKTICK=97, ATCHAR=98, HASHCHAR=99, 
		WS=100, SL_COMMENT=101, ML_COMMENT=102, TICKED_STRING_LITERAL=103, QUOTED_STRING_LITERAL=104, 
		STRING_LITERAL=105, IDENT=106, IntegerLiteral=107, FloatingPointLiteral=108;
	public static final int
		RULE_startPatternExpressionRule = 0, RULE_patternExpression = 1, RULE_skipStrategy = 2, 
		RULE_followedByOrNext = 3, RULE_followedBy = 4, RULE_followedByAny = 5, 
		RULE_notFollowedBy = 6, RULE_timeWindow = 7, RULE_patternFilterExpression = 8, 
		RULE_patternFilterExpressionMandatory = 9, RULE_patternFilterExpressionOptional = 10, 
		RULE_quantifier = 11, RULE_number_quantifier_greedy = 12, RULE_number_quantifier = 13, 
		RULE_star_quantifier = 14, RULE_plus_quantifier = 15, RULE_upper_bound = 16, 
		RULE_upper_bound_limited = 17, RULE_upper_bound_unlimited = 18, RULE_classIdentifier = 19, 
		RULE_escapableStr = 20, RULE_stopCondition = 21, RULE_expressionList = 22, 
		RULE_expression = 23, RULE_evalOrExpression = 24, RULE_evalAndExpression = 25, 
		RULE_negatedExpression = 26, RULE_evalEqualsExpression = 27, RULE_evalRelationalExpression = 28, 
		RULE_concatenationExpr = 29, RULE_additiveExpression = 30, RULE_multiplyExpression = 31, 
		RULE_unaryExpression = 32, RULE_eventProperty = 33, RULE_eventPropertyAtomic = 34, 
		RULE_eventPropertyIdent = 35, RULE_constant = 36, RULE_numberconstant = 37, 
		RULE_stringconstant = 38, RULE_keywordAllowedIdent = 39, RULE_number = 40;
	public static final String[] ruleNames = {
		"startPatternExpressionRule", "patternExpression", "skipStrategy", "followedByOrNext", 
		"followedBy", "followedByAny", "notFollowedBy", "timeWindow", "patternFilterExpression", 
		"patternFilterExpressionMandatory", "patternFilterExpressionOptional", 
		"quantifier", "number_quantifier_greedy", "number_quantifier", "star_quantifier", 
		"plus_quantifier", "upper_bound", "upper_bound_limited", "upper_bound_unlimited", 
		"classIdentifier", "escapableStr", "stopCondition", "expressionList", 
		"expression", "evalOrExpression", "evalAndExpression", "negatedExpression", 
		"evalEqualsExpression", "evalRelationalExpression", "concatenationExpr", 
		"additiveExpression", "multiplyExpression", "unaryExpression", "eventProperty", 
		"eventPropertyAtomic", "eventPropertyIdent", "constant", "numberconstant", 
		"stringconstant", "keywordAllowedIdent", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'no_skip'", "'skip_past_last'", "'skip_to_first'", "'skip_to_last'", 
		"'in'", "'between'", "'like'", "'regexp'", "'escape'", "'or'", "'and'", 
		"'not'", "'where'", "'as'", "'sum'", "'avg'", "'max'", "'min'", "'on'", 
		"'is'", "'weekday'", "'lastweekday'", "'instanceof'", "'typeof'", "'cast'", 
		"'current_timestamp'", "'until'", "'at'", "'year'", "'years'", "'month'", 
		"'months'", "'week'", "'weeks'", "'day'", "'days'", "'hour'", "'hours'", 
		"'minute'", "'minutes'", "'sec'", "'second'", "'seconds'", "'msec'", "'millisecond'", 
		"'milliseconds'", "'usec'", "'microsecond'", "'microseconds'", "'true'", 
		"'false'", "'null'", "'within'", "'h'", "'m'", "'s'", "'ms'", "'!->'", 
		"'->'", "'->>'", "'=>'", "'='", "'?'", "'('", "')'", "'['", "']'", "'{'", 
		"'}'", "':'", "','", "'!'", "'~'", "'!='", "'/'", "'+'", "'-'", "'--'", 
		"'*'", "'%'", "'>='", "'>'", "'<='", "'<'", "'^'", "'|'", "'||'", "'&'", 
		"'&='", "'&&'", "';'", "'.'", "'\u18FF'", "'\u18FE'", "'\u18FD'", "'\\'", 
		"'`'", "'@'", "'#'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SKIP_NO_SKIP", "SKIP_SKIP_PAST_LAST", "SKIP_SKIP_TO_FIRST", "SKIP_SKIP_TO_LAST", 
		"IN_SET", "BETWEEN", "LIKE", "REGEXP", "ESCAPE", "OR_EXPR", "AND_EXPR", 
		"NOT_EXPR", "WHERE", "AS", "SUM", "AVG", "MAX", "MIN", "ON", "IS", "WEEKDAY", 
		"LW", "INSTANCEOF", "TYPEOF", "CAST", "CURRENT_TIMESTAMP", "UNTIL", "AT", 
		"TIMEPERIOD_YEAR", "TIMEPERIOD_YEARS", "TIMEPERIOD_MONTH", "TIMEPERIOD_MONTHS", 
		"TIMEPERIOD_WEEK", "TIMEPERIOD_WEEKS", "TIMEPERIOD_DAY", "TIMEPERIOD_DAYS", 
		"TIMEPERIOD_HOUR", "TIMEPERIOD_HOURS", "TIMEPERIOD_MINUTE", "TIMEPERIOD_MINUTES", 
		"TIMEPERIOD_SEC", "TIMEPERIOD_SECOND", "TIMEPERIOD_SECONDS", "TIMEPERIOD_MILLISEC", 
		"TIMEPERIOD_MILLISECOND", "TIMEPERIOD_MILLISECONDS", "TIMEPERIOD_MICROSEC", 
		"TIMEPERIOD_MICROSECOND", "TIMEPERIOD_MICROSECONDS", "BOOLEAN_TRUE", "BOOLEAN_FALSE", 
		"VALUE_NULL", "WITHIN", "HOUR_SHORT", "MINUTE_SHORT", "SECOND_SHORT", 
		"MILLSECONDS_SHORT", "NOT_FOLLOWED_BY", "FOLLOWED_BY", "FOLLOWED_BY_ANY", 
		"GOES", "EQUALS", "QUESTION", "LPAREN", "RPAREN", "LBRACK", "RBRACK", 
		"LCURLY", "RCURLY", "COLON", "COMMA", "LNOT", "BNOT", "NOT_EQUAL", "DIV", 
		"PLUS", "MINUS", "DEC", "STAR", "MOD", "GE", "GT", "LE", "LT", "BXOR", 
		"BOR", "LOR", "BAND", "BAND_ASSIGN", "LAND", "SEMI", "DOT", "NUM_LONG", 
		"NUM_DOUBLE", "NUM_FLOAT", "ESCAPECHAR", "ESCAPEBACKTICK", "ATCHAR", "HASHCHAR", 
		"WS", "SL_COMMENT", "ML_COMMENT", "TICKED_STRING_LITERAL", "QUOTED_STRING_LITERAL", 
		"STRING_LITERAL", "IDENT", "IntegerLiteral", "FloatingPointLiteral"
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
	public String getGrammarFileName() { return "PatternLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PatternLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartPatternExpressionRuleContext extends ParserRuleContext {
		public PatternExpressionContext patternExpression() {
			return getRuleContext(PatternExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PatternLanguageParser.EOF, 0); }
		public StartPatternExpressionRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startPatternExpressionRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterStartPatternExpressionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitStartPatternExpressionRule(this);
		}
	}

	public final StartPatternExpressionRuleContext startPatternExpressionRule() throws RecognitionException {
		StartPatternExpressionRuleContext _localctx = new StartPatternExpressionRuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startPatternExpressionRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			patternExpression();
			setState(83);
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

	public static class PatternExpressionContext extends ParserRuleContext {
		public SkipStrategyContext skipStrategy() {
			return getRuleContext(SkipStrategyContext.class,0);
		}
		public PatternFilterExpressionContext patternFilterExpression() {
			return getRuleContext(PatternFilterExpressionContext.class,0);
		}
		public List<FollowedByOrNextContext> followedByOrNext() {
			return getRuleContexts(FollowedByOrNextContext.class);
		}
		public FollowedByOrNextContext followedByOrNext(int i) {
			return getRuleContext(FollowedByOrNextContext.class,i);
		}
		public TimeWindowContext timeWindow() {
			return getRuleContext(TimeWindowContext.class,0);
		}
		public PatternExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterPatternExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitPatternExpression(this);
		}
	}

	public final PatternExpressionContext patternExpression() throws RecognitionException {
		PatternExpressionContext _localctx = new PatternExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_patternExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			skipStrategy();
			setState(86);
			patternFilterExpression();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (NOT_FOLLOWED_BY - 58)) | (1L << (FOLLOWED_BY - 58)) | (1L << (FOLLOWED_BY_ANY - 58)) | (1L << (LNOT - 58)) | (1L << (TICKED_STRING_LITERAL - 58)) | (1L << (IDENT - 58)))) != 0)) {
				{
				{
				setState(87);
				followedByOrNext();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITHIN) {
				{
				setState(93);
				timeWindow();
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

	public static class SkipStrategyContext extends ParserRuleContext {
		public Token s;
		public Token k;
		public Token m;
		public TerminalNode MOD() { return getToken(PatternLanguageParser.MOD, 0); }
		public StringconstantContext stringconstant() {
			return getRuleContext(StringconstantContext.class,0);
		}
		public TerminalNode SKIP_SKIP_TO_FIRST() { return getToken(PatternLanguageParser.SKIP_SKIP_TO_FIRST, 0); }
		public TerminalNode LBRACK() { return getToken(PatternLanguageParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(PatternLanguageParser.RBRACK, 0); }
		public TerminalNode SKIP_SKIP_TO_LAST() { return getToken(PatternLanguageParser.SKIP_SKIP_TO_LAST, 0); }
		public TerminalNode SKIP_NO_SKIP() { return getToken(PatternLanguageParser.SKIP_NO_SKIP, 0); }
		public TerminalNode SKIP_SKIP_PAST_LAST() { return getToken(PatternLanguageParser.SKIP_SKIP_PAST_LAST, 0); }
		public SkipStrategyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skipStrategy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterSkipStrategy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitSkipStrategy(this);
		}
	}

	public final SkipStrategyContext skipStrategy() throws RecognitionException {
		SkipStrategyContext _localctx = new SkipStrategyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_skipStrategy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(MOD);
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SKIP_NO_SKIP:
				{
				{
				setState(97);
				((SkipStrategyContext)_localctx).s = match(SKIP_NO_SKIP);
				}
				}
				break;
			case SKIP_SKIP_PAST_LAST:
				{
				{
				setState(98);
				((SkipStrategyContext)_localctx).s = match(SKIP_SKIP_PAST_LAST);
				}
				}
				break;
			case SKIP_SKIP_TO_FIRST:
				{
				setState(99);
				((SkipStrategyContext)_localctx).s = match(SKIP_SKIP_TO_FIRST);
				setState(100);
				((SkipStrategyContext)_localctx).k = match(LBRACK);
				setState(101);
				stringconstant();
				setState(102);
				((SkipStrategyContext)_localctx).m = match(RBRACK);
				}
				break;
			case SKIP_SKIP_TO_LAST:
				{
				setState(104);
				((SkipStrategyContext)_localctx).s = match(SKIP_SKIP_TO_LAST);
				setState(105);
				((SkipStrategyContext)_localctx).k = match(LBRACK);
				setState(106);
				stringconstant();
				setState(107);
				((SkipStrategyContext)_localctx).m = match(RBRACK);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FollowedByOrNextContext extends ParserRuleContext {
		public Token f;
		public FollowedByContext followedBy() {
			return getRuleContext(FollowedByContext.class,0);
		}
		public FollowedByAnyContext followedByAny() {
			return getRuleContext(FollowedByAnyContext.class,0);
		}
		public NotFollowedByContext notFollowedBy() {
			return getRuleContext(NotFollowedByContext.class,0);
		}
		public PatternFilterExpressionContext patternFilterExpression() {
			return getRuleContext(PatternFilterExpressionContext.class,0);
		}
		public TerminalNode LNOT() { return getToken(PatternLanguageParser.LNOT, 0); }
		public FollowedByOrNextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_followedByOrNext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterFollowedByOrNext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitFollowedByOrNext(this);
		}
	}

	public final FollowedByOrNextContext followedByOrNext() throws RecognitionException {
		FollowedByOrNextContext _localctx = new FollowedByOrNextContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_followedByOrNext);
		int _la;
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOLLOWED_BY:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				followedBy();
				}
				break;
			case FOLLOWED_BY_ANY:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				followedByAny();
				}
				break;
			case NOT_FOLLOWED_BY:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				notFollowedBy();
				}
				break;
			case LNOT:
			case TICKED_STRING_LITERAL:
			case IDENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LNOT) {
					{
					setState(114);
					((FollowedByOrNextContext)_localctx).f = match(LNOT);
					}
				}

				setState(117);
				patternFilterExpression();
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

	public static class FollowedByContext extends ParserRuleContext {
		public Token f;
		public PatternFilterExpressionContext patternFilterExpression() {
			return getRuleContext(PatternFilterExpressionContext.class,0);
		}
		public TerminalNode FOLLOWED_BY() { return getToken(PatternLanguageParser.FOLLOWED_BY, 0); }
		public FollowedByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_followedBy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterFollowedBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitFollowedBy(this);
		}
	}

	public final FollowedByContext followedBy() throws RecognitionException {
		FollowedByContext _localctx = new FollowedByContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_followedBy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			((FollowedByContext)_localctx).f = match(FOLLOWED_BY);
			setState(121);
			patternFilterExpression();
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

	public static class FollowedByAnyContext extends ParserRuleContext {
		public Token f;
		public PatternFilterExpressionContext patternFilterExpression() {
			return getRuleContext(PatternFilterExpressionContext.class,0);
		}
		public TerminalNode FOLLOWED_BY_ANY() { return getToken(PatternLanguageParser.FOLLOWED_BY_ANY, 0); }
		public FollowedByAnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_followedByAny; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterFollowedByAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitFollowedByAny(this);
		}
	}

	public final FollowedByAnyContext followedByAny() throws RecognitionException {
		FollowedByAnyContext _localctx = new FollowedByAnyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_followedByAny);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			((FollowedByAnyContext)_localctx).f = match(FOLLOWED_BY_ANY);
			setState(124);
			patternFilterExpression();
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

	public static class NotFollowedByContext extends ParserRuleContext {
		public Token f;
		public PatternFilterExpressionContext patternFilterExpression() {
			return getRuleContext(PatternFilterExpressionContext.class,0);
		}
		public TerminalNode NOT_FOLLOWED_BY() { return getToken(PatternLanguageParser.NOT_FOLLOWED_BY, 0); }
		public NotFollowedByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notFollowedBy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterNotFollowedBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitNotFollowedBy(this);
		}
	}

	public final NotFollowedByContext notFollowedBy() throws RecognitionException {
		NotFollowedByContext _localctx = new NotFollowedByContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_notFollowedBy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			((NotFollowedByContext)_localctx).f = match(NOT_FOLLOWED_BY);
			setState(127);
			patternFilterExpression();
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

	public static class TimeWindowContext extends ParserRuleContext {
		public NumberconstantContext c;
		public Token u;
		public TerminalNode WITHIN() { return getToken(PatternLanguageParser.WITHIN, 0); }
		public NumberconstantContext numberconstant() {
			return getRuleContext(NumberconstantContext.class,0);
		}
		public TerminalNode HOUR_SHORT() { return getToken(PatternLanguageParser.HOUR_SHORT, 0); }
		public TerminalNode MINUTE_SHORT() { return getToken(PatternLanguageParser.MINUTE_SHORT, 0); }
		public TerminalNode SECOND_SHORT() { return getToken(PatternLanguageParser.SECOND_SHORT, 0); }
		public TerminalNode MILLSECONDS_SHORT() { return getToken(PatternLanguageParser.MILLSECONDS_SHORT, 0); }
		public TimeWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterTimeWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitTimeWindow(this);
		}
	}

	public final TimeWindowContext timeWindow() throws RecognitionException {
		TimeWindowContext _localctx = new TimeWindowContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_timeWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(WITHIN);
			setState(130);
			((TimeWindowContext)_localctx).c = numberconstant();
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HOUR_SHORT:
				{
				setState(131);
				((TimeWindowContext)_localctx).u = match(HOUR_SHORT);
				}
				break;
			case MINUTE_SHORT:
				{
				setState(132);
				((TimeWindowContext)_localctx).u = match(MINUTE_SHORT);
				}
				break;
			case SECOND_SHORT:
				{
				setState(133);
				((TimeWindowContext)_localctx).u = match(SECOND_SHORT);
				}
				break;
			case MILLSECONDS_SHORT:
				{
				setState(134);
				((TimeWindowContext)_localctx).u = match(MILLSECONDS_SHORT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PatternFilterExpressionContext extends ParserRuleContext {
		public PatternFilterExpressionOptionalContext patternFilterExpressionOptional() {
			return getRuleContext(PatternFilterExpressionOptionalContext.class,0);
		}
		public PatternFilterExpressionMandatoryContext patternFilterExpressionMandatory() {
			return getRuleContext(PatternFilterExpressionMandatoryContext.class,0);
		}
		public PatternFilterExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternFilterExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterPatternFilterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitPatternFilterExpression(this);
		}
	}

	public final PatternFilterExpressionContext patternFilterExpression() throws RecognitionException {
		PatternFilterExpressionContext _localctx = new PatternFilterExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_patternFilterExpression);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				patternFilterExpressionOptional();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				patternFilterExpressionMandatory();
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

	public static class PatternFilterExpressionMandatoryContext extends ParserRuleContext {
		public Token i;
		public ClassIdentifierContext classIdentifier() {
			return getRuleContext(ClassIdentifierContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(PatternLanguageParser.EQUALS, 0); }
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public StopConditionContext stopCondition() {
			return getRuleContext(StopConditionContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(PatternLanguageParser.IDENT, 0); }
		public PatternFilterExpressionMandatoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternFilterExpressionMandatory; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterPatternFilterExpressionMandatory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitPatternFilterExpressionMandatory(this);
		}
	}

	public final PatternFilterExpressionMandatoryContext patternFilterExpressionMandatory() throws RecognitionException {
		PatternFilterExpressionMandatoryContext _localctx = new PatternFilterExpressionMandatoryContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_patternFilterExpressionMandatory);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(141);
				((PatternFilterExpressionMandatoryContext)_localctx).i = match(IDENT);
				setState(142);
				match(EQUALS);
				}
				break;
			}
			setState(145);
			classIdentifier();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LCURLY - 68)) | (1L << (PLUS - 68)) | (1L << (STAR - 68)))) != 0)) {
				{
				setState(146);
				quantifier();
				}
			}

			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(149);
				expressionList();
				}
			}

			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(152);
				stopCondition();
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

	public static class PatternFilterExpressionOptionalContext extends ParserRuleContext {
		public Token i;
		public ClassIdentifierContext classIdentifier() {
			return getRuleContext(ClassIdentifierContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(PatternLanguageParser.QUESTION, 0); }
		public TerminalNode EQUALS() { return getToken(PatternLanguageParser.EQUALS, 0); }
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(PatternLanguageParser.IDENT, 0); }
		public PatternFilterExpressionOptionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternFilterExpressionOptional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterPatternFilterExpressionOptional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitPatternFilterExpressionOptional(this);
		}
	}

	public final PatternFilterExpressionOptionalContext patternFilterExpressionOptional() throws RecognitionException {
		PatternFilterExpressionOptionalContext _localctx = new PatternFilterExpressionOptionalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_patternFilterExpressionOptional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(155);
				((PatternFilterExpressionOptionalContext)_localctx).i = match(IDENT);
				setState(156);
				match(EQUALS);
				}
				break;
			}
			setState(159);
			classIdentifier();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LCURLY - 68)) | (1L << (PLUS - 68)) | (1L << (STAR - 68)))) != 0)) {
				{
				setState(160);
				quantifier();
				}
			}

			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(163);
				expressionList();
				}
			}

			setState(166);
			match(QUESTION);
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

	public static class QuantifierContext extends ParserRuleContext {
		public Plus_quantifierContext plus_quantifier() {
			return getRuleContext(Plus_quantifierContext.class,0);
		}
		public Star_quantifierContext star_quantifier() {
			return getRuleContext(Star_quantifierContext.class,0);
		}
		public Number_quantifierContext number_quantifier() {
			return getRuleContext(Number_quantifierContext.class,0);
		}
		public Number_quantifier_greedyContext number_quantifier_greedy() {
			return getRuleContext(Number_quantifier_greedyContext.class,0);
		}
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitQuantifier(this);
		}
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_quantifier);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				plus_quantifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				star_quantifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				number_quantifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				number_quantifier_greedy();
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

	public static class Number_quantifier_greedyContext extends ParserRuleContext {
		public Token s;
		public Token t;
		public NumberconstantContext numberconstant() {
			return getRuleContext(NumberconstantContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(PatternLanguageParser.QUESTION, 0); }
		public TerminalNode LCURLY() { return getToken(PatternLanguageParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(PatternLanguageParser.RCURLY, 0); }
		public Upper_boundContext upper_bound() {
			return getRuleContext(Upper_boundContext.class,0);
		}
		public Number_quantifier_greedyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_quantifier_greedy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterNumber_quantifier_greedy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitNumber_quantifier_greedy(this);
		}
	}

	public final Number_quantifier_greedyContext number_quantifier_greedy() throws RecognitionException {
		Number_quantifier_greedyContext _localctx = new Number_quantifier_greedyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_number_quantifier_greedy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			((Number_quantifier_greedyContext)_localctx).s = match(LCURLY);
			setState(175);
			numberconstant();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(176);
				upper_bound();
				}
			}

			setState(179);
			((Number_quantifier_greedyContext)_localctx).t = match(RCURLY);
			setState(180);
			match(QUESTION);
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

	public static class Number_quantifierContext extends ParserRuleContext {
		public Token s;
		public Token t;
		public NumberconstantContext numberconstant() {
			return getRuleContext(NumberconstantContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(PatternLanguageParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(PatternLanguageParser.RCURLY, 0); }
		public Upper_boundContext upper_bound() {
			return getRuleContext(Upper_boundContext.class,0);
		}
		public Number_quantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterNumber_quantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitNumber_quantifier(this);
		}
	}

	public final Number_quantifierContext number_quantifier() throws RecognitionException {
		Number_quantifierContext _localctx = new Number_quantifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_number_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			((Number_quantifierContext)_localctx).s = match(LCURLY);
			setState(183);
			numberconstant();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(184);
				upper_bound();
				}
			}

			setState(187);
			((Number_quantifierContext)_localctx).t = match(RCURLY);
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

	public static class Star_quantifierContext extends ParserRuleContext {
		public Token r;
		public TerminalNode STAR() { return getToken(PatternLanguageParser.STAR, 0); }
		public Star_quantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterStar_quantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitStar_quantifier(this);
		}
	}

	public final Star_quantifierContext star_quantifier() throws RecognitionException {
		Star_quantifierContext _localctx = new Star_quantifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_star_quantifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			((Star_quantifierContext)_localctx).r = match(STAR);
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

	public static class Plus_quantifierContext extends ParserRuleContext {
		public Token q;
		public TerminalNode PLUS() { return getToken(PatternLanguageParser.PLUS, 0); }
		public Plus_quantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterPlus_quantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitPlus_quantifier(this);
		}
	}

	public final Plus_quantifierContext plus_quantifier() throws RecognitionException {
		Plus_quantifierContext _localctx = new Plus_quantifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_plus_quantifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			((Plus_quantifierContext)_localctx).q = match(PLUS);
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

	public static class Upper_boundContext extends ParserRuleContext {
		public Token z;
		public TerminalNode COMMA() { return getToken(PatternLanguageParser.COMMA, 0); }
		public Upper_bound_unlimitedContext upper_bound_unlimited() {
			return getRuleContext(Upper_bound_unlimitedContext.class,0);
		}
		public Upper_bound_limitedContext upper_bound_limited() {
			return getRuleContext(Upper_bound_limitedContext.class,0);
		}
		public Upper_boundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upper_bound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterUpper_bound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitUpper_bound(this);
		}
	}

	public final Upper_boundContext upper_bound() throws RecognitionException {
		Upper_boundContext _localctx = new Upper_boundContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_upper_bound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			((Upper_boundContext)_localctx).z = match(COMMA);
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(194);
				upper_bound_unlimited();
				}
				break;
			case 2:
				{
				setState(195);
				upper_bound_limited();
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

	public static class Upper_bound_limitedContext extends ParserRuleContext {
		public NumberconstantContext numberconstant() {
			return getRuleContext(NumberconstantContext.class,0);
		}
		public Upper_bound_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upper_bound_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterUpper_bound_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitUpper_bound_limited(this);
		}
	}

	public final Upper_bound_limitedContext upper_bound_limited() throws RecognitionException {
		Upper_bound_limitedContext _localctx = new Upper_bound_limitedContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_upper_bound_limited);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			numberconstant();
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

	public static class Upper_bound_unlimitedContext extends ParserRuleContext {
		public Token k;
		public TerminalNode PLUS() { return getToken(PatternLanguageParser.PLUS, 0); }
		public Upper_bound_unlimitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upper_bound_unlimited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterUpper_bound_unlimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitUpper_bound_unlimited(this);
		}
	}

	public final Upper_bound_unlimitedContext upper_bound_unlimited() throws RecognitionException {
		Upper_bound_unlimitedContext _localctx = new Upper_bound_unlimitedContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_upper_bound_unlimited);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			((Upper_bound_unlimitedContext)_localctx).k = match(PLUS);
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

	public static class ClassIdentifierContext extends ParserRuleContext {
		public EscapableStrContext i1;
		public EscapableStrContext i2;
		public List<EscapableStrContext> escapableStr() {
			return getRuleContexts(EscapableStrContext.class);
		}
		public EscapableStrContext escapableStr(int i) {
			return getRuleContext(EscapableStrContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(PatternLanguageParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PatternLanguageParser.DOT, i);
		}
		public ClassIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterClassIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitClassIdentifier(this);
		}
	}

	public final ClassIdentifierContext classIdentifier() throws RecognitionException {
		ClassIdentifierContext _localctx = new ClassIdentifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_classIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			((ClassIdentifierContext)_localctx).i1 = escapableStr();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(203);
				match(DOT);
				setState(204);
				((ClassIdentifierContext)_localctx).i2 = escapableStr();
				}
				}
				setState(209);
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

	public static class EscapableStrContext extends ParserRuleContext {
		public Token i1;
		public Token i3;
		public TerminalNode IDENT() { return getToken(PatternLanguageParser.IDENT, 0); }
		public TerminalNode TICKED_STRING_LITERAL() { return getToken(PatternLanguageParser.TICKED_STRING_LITERAL, 0); }
		public EscapableStrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escapableStr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterEscapableStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitEscapableStr(this);
		}
	}

	public final EscapableStrContext escapableStr() throws RecognitionException {
		EscapableStrContext _localctx = new EscapableStrContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_escapableStr);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				((EscapableStrContext)_localctx).i1 = match(IDENT);
				}
				break;
			case TICKED_STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				((EscapableStrContext)_localctx).i3 = match(TICKED_STRING_LITERAL);
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

	public static class StopConditionContext extends ParserRuleContext {
		public Token left;
		public Token right;
		public TerminalNode LBRACK() { return getToken(PatternLanguageParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(PatternLanguageParser.RBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StopConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stopCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterStopCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitStopCondition(this);
		}
	}

	public final StopConditionContext stopCondition() throws RecognitionException {
		StopConditionContext _localctx = new StopConditionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_stopCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(214);
			((StopConditionContext)_localctx).left = match(LBRACK);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESCAPE) | (1L << NOT_EXPR) | (1L << SUM) | (1L << AVG) | (1L << MAX) | (1L << MIN) | (1L << WEEKDAY) | (1L << LW) | (1L << INSTANCEOF) | (1L << TYPEOF) | (1L << CAST) | (1L << UNTIL) | (1L << AT) | (1L << BOOLEAN_TRUE) | (1L << BOOLEAN_FALSE) | (1L << VALUE_NULL))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (PLUS - 76)) | (1L << (MINUS - 76)) | (1L << (TICKED_STRING_LITERAL - 76)) | (1L << (QUOTED_STRING_LITERAL - 76)) | (1L << (STRING_LITERAL - 76)) | (1L << (IDENT - 76)) | (1L << (IntegerLiteral - 76)) | (1L << (FloatingPointLiteral - 76)))) != 0)) {
				{
				setState(215);
				expression();
				}
			}

			setState(218);
			((StopConditionContext)_localctx).right = match(RBRACK);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public Token left;
		public Token right;
		public TerminalNode LPAREN() { return getToken(PatternLanguageParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PatternLanguageParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(220);
			((ExpressionListContext)_localctx).left = match(LPAREN);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESCAPE) | (1L << NOT_EXPR) | (1L << SUM) | (1L << AVG) | (1L << MAX) | (1L << MIN) | (1L << WEEKDAY) | (1L << LW) | (1L << INSTANCEOF) | (1L << TYPEOF) | (1L << CAST) | (1L << UNTIL) | (1L << AT) | (1L << BOOLEAN_TRUE) | (1L << BOOLEAN_FALSE) | (1L << VALUE_NULL))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (PLUS - 76)) | (1L << (MINUS - 76)) | (1L << (TICKED_STRING_LITERAL - 76)) | (1L << (QUOTED_STRING_LITERAL - 76)) | (1L << (STRING_LITERAL - 76)) | (1L << (IDENT - 76)) | (1L << (IntegerLiteral - 76)) | (1L << (FloatingPointLiteral - 76)))) != 0)) {
				{
				setState(221);
				expression();
				}
			}

			setState(224);
			((ExpressionListContext)_localctx).right = match(RPAREN);
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

	public static class ExpressionContext extends ParserRuleContext {
		public EvalOrExpressionContext evalOrExpression() {
			return getRuleContext(EvalOrExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			evalOrExpression();
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

	public static class EvalOrExpressionContext extends ParserRuleContext {
		public Token op;
		public List<EvalAndExpressionContext> evalAndExpression() {
			return getRuleContexts(EvalAndExpressionContext.class);
		}
		public EvalAndExpressionContext evalAndExpression(int i) {
			return getRuleContext(EvalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OR_EXPR() { return getTokens(PatternLanguageParser.OR_EXPR); }
		public TerminalNode OR_EXPR(int i) {
			return getToken(PatternLanguageParser.OR_EXPR, i);
		}
		public EvalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterEvalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitEvalOrExpression(this);
		}
	}

	public final EvalOrExpressionContext evalOrExpression() throws RecognitionException {
		EvalOrExpressionContext _localctx = new EvalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_evalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			evalAndExpression();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR_EXPR) {
				{
				{
				setState(229);
				((EvalOrExpressionContext)_localctx).op = match(OR_EXPR);
				setState(230);
				evalAndExpression();
				}
				}
				setState(235);
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

	public static class EvalAndExpressionContext extends ParserRuleContext {
		public Token op;
		public List<NegatedExpressionContext> negatedExpression() {
			return getRuleContexts(NegatedExpressionContext.class);
		}
		public NegatedExpressionContext negatedExpression(int i) {
			return getRuleContext(NegatedExpressionContext.class,i);
		}
		public List<TerminalNode> AND_EXPR() { return getTokens(PatternLanguageParser.AND_EXPR); }
		public TerminalNode AND_EXPR(int i) {
			return getToken(PatternLanguageParser.AND_EXPR, i);
		}
		public EvalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterEvalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitEvalAndExpression(this);
		}
	}

	public final EvalAndExpressionContext evalAndExpression() throws RecognitionException {
		EvalAndExpressionContext _localctx = new EvalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_evalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			negatedExpression();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND_EXPR) {
				{
				{
				setState(237);
				((EvalAndExpressionContext)_localctx).op = match(AND_EXPR);
				setState(238);
				negatedExpression();
				}
				}
				setState(243);
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

	public static class NegatedExpressionContext extends ParserRuleContext {
		public EvalEqualsExpressionContext evalEqualsExpression() {
			return getRuleContext(EvalEqualsExpressionContext.class,0);
		}
		public TerminalNode NOT_EXPR() { return getToken(PatternLanguageParser.NOT_EXPR, 0); }
		public NegatedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negatedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterNegatedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitNegatedExpression(this);
		}
	}

	public final NegatedExpressionContext negatedExpression() throws RecognitionException {
		NegatedExpressionContext _localctx = new NegatedExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_negatedExpression);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESCAPE:
			case SUM:
			case AVG:
			case MAX:
			case MIN:
			case WEEKDAY:
			case LW:
			case INSTANCEOF:
			case TYPEOF:
			case CAST:
			case UNTIL:
			case AT:
			case BOOLEAN_TRUE:
			case BOOLEAN_FALSE:
			case VALUE_NULL:
			case PLUS:
			case MINUS:
			case TICKED_STRING_LITERAL:
			case QUOTED_STRING_LITERAL:
			case STRING_LITERAL:
			case IDENT:
			case IntegerLiteral:
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				evalEqualsExpression();
				}
				break;
			case NOT_EXPR:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(NOT_EXPR);
				setState(246);
				evalEqualsExpression();
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

	public static class EvalEqualsExpressionContext extends ParserRuleContext {
		public Token eq;
		public Token is;
		public Token isnot;
		public Token ne;
		public List<EvalRelationalExpressionContext> evalRelationalExpression() {
			return getRuleContexts(EvalRelationalExpressionContext.class);
		}
		public EvalRelationalExpressionContext evalRelationalExpression(int i) {
			return getRuleContext(EvalRelationalExpressionContext.class,i);
		}
		public List<TerminalNode> NOT_EXPR() { return getTokens(PatternLanguageParser.NOT_EXPR); }
		public TerminalNode NOT_EXPR(int i) {
			return getToken(PatternLanguageParser.NOT_EXPR, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(PatternLanguageParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(PatternLanguageParser.EQUALS, i);
		}
		public List<TerminalNode> IS() { return getTokens(PatternLanguageParser.IS); }
		public TerminalNode IS(int i) {
			return getToken(PatternLanguageParser.IS, i);
		}
		public List<TerminalNode> NOT_EQUAL() { return getTokens(PatternLanguageParser.NOT_EQUAL); }
		public TerminalNode NOT_EQUAL(int i) {
			return getToken(PatternLanguageParser.NOT_EQUAL, i);
		}
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public EvalEqualsExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evalEqualsExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterEvalEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitEvalEqualsExpression(this);
		}
	}

	public final EvalEqualsExpressionContext evalEqualsExpression() throws RecognitionException {
		EvalEqualsExpressionContext _localctx = new EvalEqualsExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_evalEqualsExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			evalRelationalExpression();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (IS - 20)) | (1L << (EQUALS - 20)) | (1L << (NOT_EQUAL - 20)))) != 0)) {
				{
				{
				setState(255);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(250);
					((EvalEqualsExpressionContext)_localctx).eq = match(EQUALS);
					}
					break;
				case 2:
					{
					setState(251);
					((EvalEqualsExpressionContext)_localctx).is = match(IS);
					}
					break;
				case 3:
					{
					setState(252);
					((EvalEqualsExpressionContext)_localctx).isnot = match(IS);
					setState(253);
					match(NOT_EXPR);
					}
					break;
				case 4:
					{
					setState(254);
					((EvalEqualsExpressionContext)_localctx).ne = match(NOT_EQUAL);
					}
					break;
				}
				setState(259);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ESCAPE:
				case SUM:
				case AVG:
				case MAX:
				case MIN:
				case WEEKDAY:
				case LW:
				case INSTANCEOF:
				case TYPEOF:
				case CAST:
				case UNTIL:
				case AT:
				case BOOLEAN_TRUE:
				case BOOLEAN_FALSE:
				case VALUE_NULL:
				case PLUS:
				case MINUS:
				case TICKED_STRING_LITERAL:
				case QUOTED_STRING_LITERAL:
				case STRING_LITERAL:
				case IDENT:
				case IntegerLiteral:
				case FloatingPointLiteral:
					{
					setState(257);
					evalRelationalExpression();
					}
					break;
				case LPAREN:
					{
					{
					setState(258);
					expressionList();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(265);
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

	public static class EvalRelationalExpressionContext extends ParserRuleContext {
		public Token r;
		public Token n;
		public Token in;
		public Token l;
		public Token col;
		public List<ConcatenationExprContext> concatenationExpr() {
			return getRuleContexts(ConcatenationExprContext.class);
		}
		public ConcatenationExprContext concatenationExpr(int i) {
			return getRuleContext(ConcatenationExprContext.class,i);
		}
		public TerminalNode NOT_EXPR() { return getToken(PatternLanguageParser.NOT_EXPR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN_SET() { return getToken(PatternLanguageParser.IN_SET, 0); }
		public TerminalNode LPAREN() { return getToken(PatternLanguageParser.LPAREN, 0); }
		public TerminalNode LBRACK() { return getToken(PatternLanguageParser.LBRACK, 0); }
		public TerminalNode RPAREN() { return getToken(PatternLanguageParser.RPAREN, 0); }
		public TerminalNode RBRACK() { return getToken(PatternLanguageParser.RBRACK, 0); }
		public List<TerminalNode> LT() { return getTokens(PatternLanguageParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(PatternLanguageParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(PatternLanguageParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(PatternLanguageParser.GT, i);
		}
		public List<TerminalNode> LE() { return getTokens(PatternLanguageParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(PatternLanguageParser.LE, i);
		}
		public List<TerminalNode> GE() { return getTokens(PatternLanguageParser.GE); }
		public TerminalNode GE(int i) {
			return getToken(PatternLanguageParser.GE, i);
		}
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public TerminalNode COLON() { return getToken(PatternLanguageParser.COLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PatternLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PatternLanguageParser.COMMA, i);
		}
		public EvalRelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evalRelationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterEvalRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitEvalRelationalExpression(this);
		}
	}

	public final EvalRelationalExpressionContext evalRelationalExpression() throws RecognitionException {
		EvalRelationalExpressionContext _localctx = new EvalRelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_evalRelationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			concatenationExpr();
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR_EXPR:
			case AND_EXPR:
			case IS:
			case EQUALS:
			case RPAREN:
			case RBRACK:
			case COLON:
			case COMMA:
			case NOT_EQUAL:
			case GE:
			case GT:
			case LE:
			case LT:
				{
				{
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (GE - 81)) | (1L << (GT - 81)) | (1L << (LE - 81)) | (1L << (LT - 81)))) != 0)) {
					{
					{
					setState(271);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LT:
						{
						setState(267);
						((EvalRelationalExpressionContext)_localctx).r = match(LT);
						}
						break;
					case GT:
						{
						setState(268);
						((EvalRelationalExpressionContext)_localctx).r = match(GT);
						}
						break;
					case LE:
						{
						setState(269);
						((EvalRelationalExpressionContext)_localctx).r = match(LE);
						}
						break;
					case GE:
						{
						setState(270);
						((EvalRelationalExpressionContext)_localctx).r = match(GE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(275);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ESCAPE:
					case SUM:
					case AVG:
					case MAX:
					case MIN:
					case WEEKDAY:
					case LW:
					case INSTANCEOF:
					case TYPEOF:
					case CAST:
					case UNTIL:
					case AT:
					case BOOLEAN_TRUE:
					case BOOLEAN_FALSE:
					case VALUE_NULL:
					case PLUS:
					case MINUS:
					case TICKED_STRING_LITERAL:
					case QUOTED_STRING_LITERAL:
					case STRING_LITERAL:
					case IDENT:
					case IntegerLiteral:
					case FloatingPointLiteral:
						{
						setState(273);
						concatenationExpr();
						}
						break;
					case LPAREN:
						{
						{
						setState(274);
						expressionList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case IN_SET:
			case NOT_EXPR:
				{
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT_EXPR) {
					{
					setState(282);
					((EvalRelationalExpressionContext)_localctx).n = match(NOT_EXPR);
					}
				}

				{
				{
				setState(285);
				((EvalRelationalExpressionContext)_localctx).in = match(IN_SET);
				setState(288);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAREN:
					{
					setState(286);
					((EvalRelationalExpressionContext)_localctx).l = match(LPAREN);
					}
					break;
				case LBRACK:
					{
					setState(287);
					((EvalRelationalExpressionContext)_localctx).l = match(LBRACK);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(290);
				expression();
				setState(300);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COLON:
					{
					{
					setState(291);
					((EvalRelationalExpressionContext)_localctx).col = match(COLON);
					{
					setState(292);
					expression();
					}
					}
					}
					break;
				case RPAREN:
				case RBRACK:
				case COMMA:
					{
					{
					setState(297);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(293);
						match(COMMA);
						setState(294);
						expression();
						}
						}
						setState(299);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(304);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RPAREN:
					{
					setState(302);
					((EvalRelationalExpressionContext)_localctx).r = match(RPAREN);
					}
					break;
				case RBRACK:
					{
					setState(303);
					((EvalRelationalExpressionContext)_localctx).r = match(RBRACK);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ConcatenationExprContext extends ParserRuleContext {
		public Token c;
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> LOR() { return getTokens(PatternLanguageParser.LOR); }
		public TerminalNode LOR(int i) {
			return getToken(PatternLanguageParser.LOR, i);
		}
		public ConcatenationExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatenationExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterConcatenationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitConcatenationExpr(this);
		}
	}

	public final ConcatenationExprContext concatenationExpr() throws RecognitionException {
		ConcatenationExprContext _localctx = new ConcatenationExprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_concatenationExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			additiveExpression();
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOR) {
				{
				setState(309);
				((ConcatenationExprContext)_localctx).c = match(LOR);
				setState(310);
				additiveExpression();
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOR) {
					{
					{
					setState(311);
					match(LOR);
					setState(312);
					additiveExpression();
					}
					}
					setState(317);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplyExpressionContext> multiplyExpression() {
			return getRuleContexts(MultiplyExpressionContext.class);
		}
		public MultiplyExpressionContext multiplyExpression(int i) {
			return getRuleContext(MultiplyExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(PatternLanguageParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(PatternLanguageParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(PatternLanguageParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(PatternLanguageParser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			multiplyExpression();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(321);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(322);
				multiplyExpression();
				}
				}
				setState(327);
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

	public static class MultiplyExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(PatternLanguageParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(PatternLanguageParser.STAR, i);
		}
		public List<TerminalNode> DIV() { return getTokens(PatternLanguageParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(PatternLanguageParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(PatternLanguageParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(PatternLanguageParser.MOD, i);
		}
		public MultiplyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterMultiplyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitMultiplyExpression(this);
		}
	}

	public final MultiplyExpressionContext multiplyExpression() throws RecognitionException {
		MultiplyExpressionContext _localctx = new MultiplyExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_multiplyExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			unaryExpression();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (DIV - 75)) | (1L << (STAR - 75)) | (1L << (MOD - 75)))) != 0)) {
				{
				{
				setState(329);
				_la = _input.LA(1);
				if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (DIV - 75)) | (1L << (STAR - 75)) | (1L << (MOD - 75)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(330);
				unaryExpression();
				}
				}
				setState(335);
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(PatternLanguageParser.MINUS, 0); }
		public EventPropertyContext eventProperty() {
			return getRuleContext(EventPropertyContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_unaryExpression);
		try {
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				match(MINUS);
				setState(337);
				eventProperty();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(339);
				eventProperty();
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

	public static class EventPropertyContext extends ParserRuleContext {
		public List<EventPropertyAtomicContext> eventPropertyAtomic() {
			return getRuleContexts(EventPropertyAtomicContext.class);
		}
		public EventPropertyAtomicContext eventPropertyAtomic(int i) {
			return getRuleContext(EventPropertyAtomicContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(PatternLanguageParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PatternLanguageParser.DOT, i);
		}
		public EventPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterEventProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitEventProperty(this);
		}
	}

	public final EventPropertyContext eventProperty() throws RecognitionException {
		EventPropertyContext _localctx = new EventPropertyContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_eventProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			eventPropertyAtomic();
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(343);
				match(DOT);
				setState(344);
				eventPropertyAtomic();
				}
				}
				setState(349);
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

	public static class EventPropertyAtomicContext extends ParserRuleContext {
		public Token lb;
		public NumberContext ni;
		public Token q;
		public Token lp;
		public Token s;
		public Token q1;
		public EventPropertyIdentContext eventPropertyIdent() {
			return getRuleContext(EventPropertyIdentContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(PatternLanguageParser.RBRACK, 0); }
		public TerminalNode RPAREN() { return getToken(PatternLanguageParser.RPAREN, 0); }
		public TerminalNode LBRACK() { return getToken(PatternLanguageParser.LBRACK, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PatternLanguageParser.LPAREN, 0); }
		public TerminalNode QUESTION() { return getToken(PatternLanguageParser.QUESTION, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(PatternLanguageParser.STRING_LITERAL, 0); }
		public TerminalNode QUOTED_STRING_LITERAL() { return getToken(PatternLanguageParser.QUOTED_STRING_LITERAL, 0); }
		public EventPropertyAtomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventPropertyAtomic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterEventPropertyAtomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitEventPropertyAtomic(this);
		}
	}

	public final EventPropertyAtomicContext eventPropertyAtomic() throws RecognitionException {
		EventPropertyAtomicContext _localctx = new EventPropertyAtomicContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_eventPropertyAtomic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			eventPropertyIdent();
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				{
				setState(351);
				((EventPropertyAtomicContext)_localctx).lb = match(LBRACK);
				setState(352);
				((EventPropertyAtomicContext)_localctx).ni = number();
				setState(353);
				match(RBRACK);
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(354);
					((EventPropertyAtomicContext)_localctx).q = match(QUESTION);
					}
				}

				}
				break;
			case LPAREN:
				{
				setState(357);
				((EventPropertyAtomicContext)_localctx).lp = match(LPAREN);
				setState(360);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING_LITERAL:
					{
					setState(358);
					((EventPropertyAtomicContext)_localctx).s = match(STRING_LITERAL);
					}
					break;
				case QUOTED_STRING_LITERAL:
					{
					setState(359);
					((EventPropertyAtomicContext)_localctx).s = match(QUOTED_STRING_LITERAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(362);
				match(RPAREN);
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(363);
					((EventPropertyAtomicContext)_localctx).q = match(QUESTION);
					}
				}

				}
				break;
			case QUESTION:
				{
				setState(366);
				((EventPropertyAtomicContext)_localctx).q1 = match(QUESTION);
				}
				break;
			case IN_SET:
			case OR_EXPR:
			case AND_EXPR:
			case NOT_EXPR:
			case IS:
			case EQUALS:
			case RPAREN:
			case RBRACK:
			case COLON:
			case COMMA:
			case NOT_EQUAL:
			case DIV:
			case PLUS:
			case MINUS:
			case STAR:
			case MOD:
			case GE:
			case GT:
			case LE:
			case LT:
			case LOR:
			case DOT:
				break;
			default:
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

	public static class EventPropertyIdentContext extends ParserRuleContext {
		public KeywordAllowedIdentContext ipi;
		public KeywordAllowedIdentContext ipi2;
		public List<KeywordAllowedIdentContext> keywordAllowedIdent() {
			return getRuleContexts(KeywordAllowedIdentContext.class);
		}
		public KeywordAllowedIdentContext keywordAllowedIdent(int i) {
			return getRuleContext(KeywordAllowedIdentContext.class,i);
		}
		public List<TerminalNode> ESCAPECHAR() { return getTokens(PatternLanguageParser.ESCAPECHAR); }
		public TerminalNode ESCAPECHAR(int i) {
			return getToken(PatternLanguageParser.ESCAPECHAR, i);
		}
		public List<TerminalNode> DOT() { return getTokens(PatternLanguageParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PatternLanguageParser.DOT, i);
		}
		public EventPropertyIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventPropertyIdent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterEventPropertyIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitEventPropertyIdent(this);
		}
	}

	public final EventPropertyIdentContext eventPropertyIdent() throws RecognitionException {
		EventPropertyIdentContext _localctx = new EventPropertyIdentContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_eventPropertyIdent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			((EventPropertyIdentContext)_localctx).ipi = keywordAllowedIdent();
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ESCAPECHAR) {
				{
				{
				setState(370);
				match(ESCAPECHAR);
				setState(371);
				match(DOT);
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESCAPE) | (1L << SUM) | (1L << AVG) | (1L << MAX) | (1L << MIN) | (1L << WEEKDAY) | (1L << LW) | (1L << INSTANCEOF) | (1L << TYPEOF) | (1L << CAST) | (1L << UNTIL) | (1L << AT))) != 0) || _la==TICKED_STRING_LITERAL || _la==IDENT) {
					{
					setState(372);
					((EventPropertyIdentContext)_localctx).ipi2 = keywordAllowedIdent();
					}
				}

				}
				}
				setState(379);
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

	public static class ConstantContext extends ParserRuleContext {
		public Token t;
		public Token f;
		public Token nu;
		public NumberconstantContext numberconstant() {
			return getRuleContext(NumberconstantContext.class,0);
		}
		public StringconstantContext stringconstant() {
			return getRuleContext(StringconstantContext.class,0);
		}
		public TerminalNode BOOLEAN_TRUE() { return getToken(PatternLanguageParser.BOOLEAN_TRUE, 0); }
		public TerminalNode BOOLEAN_FALSE() { return getToken(PatternLanguageParser.BOOLEAN_FALSE, 0); }
		public TerminalNode VALUE_NULL() { return getToken(PatternLanguageParser.VALUE_NULL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_constant);
		try {
			setState(385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case IntegerLiteral:
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				numberconstant();
				}
				break;
			case QUOTED_STRING_LITERAL:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				stringconstant();
				}
				break;
			case BOOLEAN_TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(382);
				((ConstantContext)_localctx).t = match(BOOLEAN_TRUE);
				}
				break;
			case BOOLEAN_FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(383);
				((ConstantContext)_localctx).f = match(BOOLEAN_FALSE);
				}
				break;
			case VALUE_NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(384);
				((ConstantContext)_localctx).nu = match(VALUE_NULL);
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

	public static class NumberconstantContext extends ParserRuleContext {
		public Token m;
		public Token p;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(PatternLanguageParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(PatternLanguageParser.PLUS, 0); }
		public NumberconstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberconstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterNumberconstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitNumberconstant(this);
		}
	}

	public final NumberconstantContext numberconstant() throws RecognitionException {
		NumberconstantContext _localctx = new NumberconstantContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_numberconstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				setState(387);
				((NumberconstantContext)_localctx).m = match(MINUS);
				}
				break;
			case PLUS:
				{
				setState(388);
				((NumberconstantContext)_localctx).p = match(PLUS);
				}
				break;
			case IntegerLiteral:
			case FloatingPointLiteral:
				break;
			default:
				break;
			}
			setState(391);
			number();
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

	public static class StringconstantContext extends ParserRuleContext {
		public Token sl;
		public Token qsl;
		public TerminalNode STRING_LITERAL() { return getToken(PatternLanguageParser.STRING_LITERAL, 0); }
		public TerminalNode QUOTED_STRING_LITERAL() { return getToken(PatternLanguageParser.QUOTED_STRING_LITERAL, 0); }
		public StringconstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringconstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterStringconstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitStringconstant(this);
		}
	}

	public final StringconstantContext stringconstant() throws RecognitionException {
		StringconstantContext _localctx = new StringconstantContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_stringconstant);
		try {
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				((StringconstantContext)_localctx).sl = match(STRING_LITERAL);
				}
				break;
			case QUOTED_STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				((StringconstantContext)_localctx).qsl = match(QUOTED_STRING_LITERAL);
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

	public static class KeywordAllowedIdentContext extends ParserRuleContext {
		public Token i1;
		public Token i2;
		public TerminalNode IDENT() { return getToken(PatternLanguageParser.IDENT, 0); }
		public TerminalNode TICKED_STRING_LITERAL() { return getToken(PatternLanguageParser.TICKED_STRING_LITERAL, 0); }
		public TerminalNode AT() { return getToken(PatternLanguageParser.AT, 0); }
		public TerminalNode ESCAPE() { return getToken(PatternLanguageParser.ESCAPE, 0); }
		public TerminalNode SUM() { return getToken(PatternLanguageParser.SUM, 0); }
		public TerminalNode AVG() { return getToken(PatternLanguageParser.AVG, 0); }
		public TerminalNode MAX() { return getToken(PatternLanguageParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(PatternLanguageParser.MIN, 0); }
		public TerminalNode UNTIL() { return getToken(PatternLanguageParser.UNTIL, 0); }
		public TerminalNode WEEKDAY() { return getToken(PatternLanguageParser.WEEKDAY, 0); }
		public TerminalNode LW() { return getToken(PatternLanguageParser.LW, 0); }
		public TerminalNode INSTANCEOF() { return getToken(PatternLanguageParser.INSTANCEOF, 0); }
		public TerminalNode TYPEOF() { return getToken(PatternLanguageParser.TYPEOF, 0); }
		public TerminalNode CAST() { return getToken(PatternLanguageParser.CAST, 0); }
		public KeywordAllowedIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordAllowedIdent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterKeywordAllowedIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitKeywordAllowedIdent(this);
		}
	}

	public final KeywordAllowedIdentContext keywordAllowedIdent() throws RecognitionException {
		KeywordAllowedIdentContext _localctx = new KeywordAllowedIdentContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_keywordAllowedIdent);
		try {
			setState(411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				((KeywordAllowedIdentContext)_localctx).i1 = match(IDENT);
				}
				break;
			case TICKED_STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				((KeywordAllowedIdentContext)_localctx).i2 = match(TICKED_STRING_LITERAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(399);
				match(AT);
				}
				break;
			case ESCAPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(400);
				match(ESCAPE);
				}
				break;
			case SUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(401);
				match(SUM);
				}
				break;
			case AVG:
				enterOuterAlt(_localctx, 6);
				{
				setState(402);
				match(AVG);
				}
				break;
			case MAX:
				enterOuterAlt(_localctx, 7);
				{
				setState(403);
				match(MAX);
				}
				break;
			case MIN:
				enterOuterAlt(_localctx, 8);
				{
				setState(404);
				match(MIN);
				}
				break;
			case UNTIL:
				enterOuterAlt(_localctx, 9);
				{
				setState(405);
				match(UNTIL);
				}
				break;
			case WEEKDAY:
				enterOuterAlt(_localctx, 10);
				{
				setState(406);
				match(WEEKDAY);
				}
				break;
			case LW:
				enterOuterAlt(_localctx, 11);
				{
				setState(407);
				match(LW);
				}
				break;
			case INSTANCEOF:
				enterOuterAlt(_localctx, 12);
				{
				setState(408);
				match(INSTANCEOF);
				}
				break;
			case TYPEOF:
				enterOuterAlt(_localctx, 13);
				{
				setState(409);
				match(TYPEOF);
				}
				break;
			case CAST:
				enterOuterAlt(_localctx, 14);
				{
				setState(410);
				match(CAST);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(PatternLanguageParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(PatternLanguageParser.FloatingPointLiteral, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatternLanguageListener ) ((PatternLanguageListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_la = _input.LA(1);
			if ( !(_la==IntegerLiteral || _la==FloatingPointLiteral) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3n\u01a2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\7\3[\n\3\f\3\16\3^\13\3\3\3\5\3a\n\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4p\n\4\3\5\3\5\3\5\3\5\5\5v\n\5"+
		"\3\5\5\5y\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u008a\n\t\3\n\3\n\5\n\u008e\n\n\3\13\3\13\5\13\u0092\n\13\3\13"+
		"\3\13\5\13\u0096\n\13\3\13\5\13\u0099\n\13\3\13\5\13\u009c\n\13\3\f\3"+
		"\f\5\f\u00a0\n\f\3\f\3\f\5\f\u00a4\n\f\3\f\5\f\u00a7\n\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\5\r\u00af\n\r\3\16\3\16\3\16\5\16\u00b4\n\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\5\17\u00bc\n\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\22\5\22\u00c7\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\7\25\u00d0\n"+
		"\25\f\25\16\25\u00d3\13\25\3\26\3\26\5\26\u00d7\n\26\3\27\3\27\5\27\u00db"+
		"\n\27\3\27\3\27\3\30\3\30\5\30\u00e1\n\30\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\32\7\32\u00ea\n\32\f\32\16\32\u00ed\13\32\3\33\3\33\3\33\7\33\u00f2"+
		"\n\33\f\33\16\33\u00f5\13\33\3\34\3\34\3\34\5\34\u00fa\n\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u0102\n\35\3\35\3\35\5\35\u0106\n\35\7\35\u0108"+
		"\n\35\f\35\16\35\u010b\13\35\3\36\3\36\3\36\3\36\3\36\5\36\u0112\n\36"+
		"\3\36\3\36\5\36\u0116\n\36\7\36\u0118\n\36\f\36\16\36\u011b\13\36\3\36"+
		"\5\36\u011e\n\36\3\36\3\36\3\36\5\36\u0123\n\36\3\36\3\36\3\36\3\36\3"+
		"\36\7\36\u012a\n\36\f\36\16\36\u012d\13\36\5\36\u012f\n\36\3\36\3\36\5"+
		"\36\u0133\n\36\5\36\u0135\n\36\3\37\3\37\3\37\3\37\3\37\7\37\u013c\n\37"+
		"\f\37\16\37\u013f\13\37\5\37\u0141\n\37\3 \3 \3 \7 \u0146\n \f \16 \u0149"+
		"\13 \3!\3!\3!\7!\u014e\n!\f!\16!\u0151\13!\3\"\3\"\3\"\3\"\5\"\u0157\n"+
		"\"\3#\3#\3#\7#\u015c\n#\f#\16#\u015f\13#\3$\3$\3$\3$\3$\5$\u0166\n$\3"+
		"$\3$\3$\5$\u016b\n$\3$\3$\5$\u016f\n$\3$\5$\u0172\n$\3%\3%\3%\3%\5%\u0178"+
		"\n%\7%\u017a\n%\f%\16%\u017d\13%\3&\3&\3&\3&\3&\5&\u0184\n&\3\'\3\'\5"+
		"\'\u0188\n\'\3\'\3\'\3(\3(\5(\u018e\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\5)\u019e\n)\3*\3*\3*\2\2+\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2\5\3\2NO\4\2MMQR\3\2mn\2\u01cc"+
		"\2T\3\2\2\2\4W\3\2\2\2\6b\3\2\2\2\bx\3\2\2\2\nz\3\2\2\2\f}\3\2\2\2\16"+
		"\u0080\3\2\2\2\20\u0083\3\2\2\2\22\u008d\3\2\2\2\24\u0091\3\2\2\2\26\u009f"+
		"\3\2\2\2\30\u00ae\3\2\2\2\32\u00b0\3\2\2\2\34\u00b8\3\2\2\2\36\u00bf\3"+
		"\2\2\2 \u00c1\3\2\2\2\"\u00c3\3\2\2\2$\u00c8\3\2\2\2&\u00ca\3\2\2\2(\u00cc"+
		"\3\2\2\2*\u00d6\3\2\2\2,\u00d8\3\2\2\2.\u00de\3\2\2\2\60\u00e4\3\2\2\2"+
		"\62\u00e6\3\2\2\2\64\u00ee\3\2\2\2\66\u00f9\3\2\2\28\u00fb\3\2\2\2:\u010c"+
		"\3\2\2\2<\u0136\3\2\2\2>\u0142\3\2\2\2@\u014a\3\2\2\2B\u0156\3\2\2\2D"+
		"\u0158\3\2\2\2F\u0160\3\2\2\2H\u0173\3\2\2\2J\u0183\3\2\2\2L\u0187\3\2"+
		"\2\2N\u018d\3\2\2\2P\u019d\3\2\2\2R\u019f\3\2\2\2TU\5\4\3\2UV\7\2\2\3"+
		"V\3\3\2\2\2WX\5\6\4\2X\\\5\22\n\2Y[\5\b\5\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2"+
		"\2\2\\]\3\2\2\2]`\3\2\2\2^\\\3\2\2\2_a\5\20\t\2`_\3\2\2\2`a\3\2\2\2a\5"+
		"\3\2\2\2bo\7R\2\2cp\7\3\2\2dp\7\4\2\2ef\7\5\2\2fg\7D\2\2gh\5N(\2hi\7E"+
		"\2\2ip\3\2\2\2jk\7\6\2\2kl\7D\2\2lm\5N(\2mn\7E\2\2np\3\2\2\2oc\3\2\2\2"+
		"od\3\2\2\2oe\3\2\2\2oj\3\2\2\2p\7\3\2\2\2qy\5\n\6\2ry\5\f\7\2sy\5\16\b"+
		"\2tv\7J\2\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wy\5\22\n\2xq\3\2\2\2xr\3\2\2"+
		"\2xs\3\2\2\2xu\3\2\2\2y\t\3\2\2\2z{\7=\2\2{|\5\22\n\2|\13\3\2\2\2}~\7"+
		">\2\2~\177\5\22\n\2\177\r\3\2\2\2\u0080\u0081\7<\2\2\u0081\u0082\5\22"+
		"\n\2\u0082\17\3\2\2\2\u0083\u0084\7\67\2\2\u0084\u0089\5L\'\2\u0085\u008a"+
		"\78\2\2\u0086\u008a\79\2\2\u0087\u008a\7:\2\2\u0088\u008a\7;\2\2\u0089"+
		"\u0085\3\2\2\2\u0089\u0086\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2"+
		"\2\2\u008a\21\3\2\2\2\u008b\u008e\5\26\f\2\u008c\u008e\5\24\13\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\23\3\2\2\2\u008f\u0090\7l\2\2"+
		"\u0090\u0092\7@\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0095\5(\25\2\u0094\u0096\5\30\r\2\u0095\u0094\3\2\2\2"+
		"\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0099\5.\30\2\u0098\u0097"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u009c\5,\27\2\u009b"+
		"\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\25\3\2\2\2\u009d\u009e\7l\2\2"+
		"\u009e\u00a0\7@\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1"+
		"\3\2\2\2\u00a1\u00a3\5(\25\2\u00a2\u00a4\5\30\r\2\u00a3\u00a2\3\2\2\2"+
		"\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a7\5.\30\2\u00a6\u00a5"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7A\2\2\u00a9"+
		"\27\3\2\2\2\u00aa\u00af\5 \21\2\u00ab\u00af\5\36\20\2\u00ac\u00af\5\34"+
		"\17\2\u00ad\u00af\5\32\16\2\u00ae\u00aa\3\2\2\2\u00ae\u00ab\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\31\3\2\2\2\u00b0\u00b1\7F\2\2"+
		"\u00b1\u00b3\5L\'\2\u00b2\u00b4\5\"\22\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\7G\2\2\u00b6\u00b7\7A\2\2\u00b7"+
		"\33\3\2\2\2\u00b8\u00b9\7F\2\2\u00b9\u00bb\5L\'\2\u00ba\u00bc\5\"\22\2"+
		"\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be"+
		"\7G\2\2\u00be\35\3\2\2\2\u00bf\u00c0\7Q\2\2\u00c0\37\3\2\2\2\u00c1\u00c2"+
		"\7N\2\2\u00c2!\3\2\2\2\u00c3\u00c6\7I\2\2\u00c4\u00c7\5&\24\2\u00c5\u00c7"+
		"\5$\23\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7#\3\2\2\2\u00c8"+
		"\u00c9\5L\'\2\u00c9%\3\2\2\2\u00ca\u00cb\7N\2\2\u00cb\'\3\2\2\2\u00cc"+
		"\u00d1\5*\26\2\u00cd\u00ce\7^\2\2\u00ce\u00d0\5*\26\2\u00cf\u00cd\3\2"+
		"\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		")\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d7\7l\2\2\u00d5\u00d7\7i\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7+\3\2\2\2\u00d8\u00da\7D\2\2\u00d9"+
		"\u00db\5\60\31\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3"+
		"\2\2\2\u00dc\u00dd\7E\2\2\u00dd-\3\2\2\2\u00de\u00e0\7B\2\2\u00df\u00e1"+
		"\5\60\31\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2"+
		"\u00e2\u00e3\7C\2\2\u00e3/\3\2\2\2\u00e4\u00e5\5\62\32\2\u00e5\61\3\2"+
		"\2\2\u00e6\u00eb\5\64\33\2\u00e7\u00e8\7\f\2\2\u00e8\u00ea\5\64\33\2\u00e9"+
		"\u00e7\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\63\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f3\5\66\34\2\u00ef"+
		"\u00f0\7\r\2\2\u00f0\u00f2\5\66\34\2\u00f1\u00ef\3\2\2\2\u00f2\u00f5\3"+
		"\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\65\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f6\u00fa\58\35\2\u00f7\u00f8\7\16\2\2\u00f8\u00fa\5"+
		"8\35\2\u00f9\u00f6\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\67\3\2\2\2\u00fb"+
		"\u0109\5:\36\2\u00fc\u0102\7@\2\2\u00fd\u0102\7\26\2\2\u00fe\u00ff\7\26"+
		"\2\2\u00ff\u0102\7\16\2\2\u0100\u0102\7L\2\2\u0101\u00fc\3\2\2\2\u0101"+
		"\u00fd\3\2\2\2\u0101\u00fe\3\2\2\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2"+
		"\2\2\u0103\u0106\5:\36\2\u0104\u0106\5.\30\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0104\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0101\3\2\2\2\u0108\u010b\3\2"+
		"\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a9\3\2\2\2\u010b\u0109"+
		"\3\2\2\2\u010c\u0134\5<\37\2\u010d\u0112\7V\2\2\u010e\u0112\7T\2\2\u010f"+
		"\u0112\7U\2\2\u0110\u0112\7S\2\2\u0111\u010d\3\2\2\2\u0111\u010e\3\2\2"+
		"\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0116"+
		"\5<\37\2\u0114\u0116\5.\30\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116"+
		"\u0118\3\2\2\2\u0117\u0111\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u0119\u011a\3\2\2\2\u011a\u0135\3\2\2\2\u011b\u0119\3\2\2\2\u011c"+
		"\u011e\7\16\2\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3"+
		"\2\2\2\u011f\u0122\7\7\2\2\u0120\u0123\7B\2\2\u0121\u0123\7D\2\2\u0122"+
		"\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u012e\5\60"+
		"\31\2\u0125\u0126\7H\2\2\u0126\u012f\5\60\31\2\u0127\u0128\7I\2\2\u0128"+
		"\u012a\5\60\31\2\u0129\u0127\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3"+
		"\2\2\2\u012b\u012c\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012e"+
		"\u0125\3\2\2\2\u012e\u012b\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u0133\7C"+
		"\2\2\u0131\u0133\7E\2\2\u0132\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133"+
		"\u0135\3\2\2\2\u0134\u0119\3\2\2\2\u0134\u011d\3\2\2\2\u0135;\3\2\2\2"+
		"\u0136\u0140\5> \2\u0137\u0138\7Y\2\2\u0138\u013d\5> \2\u0139\u013a\7"+
		"Y\2\2\u013a\u013c\5> \2\u013b\u0139\3\2\2\2\u013c\u013f\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2"+
		"\2\2\u0140\u0137\3\2\2\2\u0140\u0141\3\2\2\2\u0141=\3\2\2\2\u0142\u0147"+
		"\5@!\2\u0143\u0144\t\2\2\2\u0144\u0146\5@!\2\u0145\u0143\3\2\2\2\u0146"+
		"\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148?\3\2\2\2"+
		"\u0149\u0147\3\2\2\2\u014a\u014f\5B\"\2\u014b\u014c\t\3\2\2\u014c\u014e"+
		"\5B\"\2\u014d\u014b\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150A\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\7O\2\2\u0153"+
		"\u0157\5D#\2\u0154\u0157\5J&\2\u0155\u0157\5D#\2\u0156\u0152\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0156\u0155\3\2\2\2\u0157C\3\2\2\2\u0158\u015d\5F$\2\u0159"+
		"\u015a\7^\2\2\u015a\u015c\5F$\2\u015b\u0159\3\2\2\2\u015c\u015f\3\2\2"+
		"\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015eE\3\2\2\2\u015f\u015d"+
		"\3\2\2\2\u0160\u0171\5H%\2\u0161\u0162\7D\2\2\u0162\u0163\5R*\2\u0163"+
		"\u0165\7E\2\2\u0164\u0166\7A\2\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2"+
		"\2\u0166\u0172\3\2\2\2\u0167\u016a\7B\2\2\u0168\u016b\7k\2\2\u0169\u016b"+
		"\7j\2\2\u016a\u0168\3\2\2\2\u016a\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016e\7C\2\2\u016d\u016f\7A\2\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2"+
		"\2\u016f\u0172\3\2\2\2\u0170\u0172\7A\2\2\u0171\u0161\3\2\2\2\u0171\u0167"+
		"\3\2\2\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172G\3\2\2\2\u0173"+
		"\u017b\5P)\2\u0174\u0175\7b\2\2\u0175\u0177\7^\2\2\u0176\u0178\5P)\2\u0177"+
		"\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0174\3\2"+
		"\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"I\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u0184\5L\'\2\u017f\u0184\5N(\2\u0180"+
		"\u0184\7\64\2\2\u0181\u0184\7\65\2\2\u0182\u0184\7\66\2\2\u0183\u017e"+
		"\3\2\2\2\u0183\u017f\3\2\2\2\u0183\u0180\3\2\2\2\u0183\u0181\3\2\2\2\u0183"+
		"\u0182\3\2\2\2\u0184K\3\2\2\2\u0185\u0188\7O\2\2\u0186\u0188\7N\2\2\u0187"+
		"\u0185\3\2\2\2\u0187\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\3\2"+
		"\2\2\u0189\u018a\5R*\2\u018aM\3\2\2\2\u018b\u018e\7k\2\2\u018c\u018e\7"+
		"j\2\2\u018d\u018b\3\2\2\2\u018d\u018c\3\2\2\2\u018eO\3\2\2\2\u018f\u019e"+
		"\7l\2\2\u0190\u019e\7i\2\2\u0191\u019e\7\36\2\2\u0192\u019e\7\13\2\2\u0193"+
		"\u019e\7\21\2\2\u0194\u019e\7\22\2\2\u0195\u019e\7\23\2\2\u0196\u019e"+
		"\7\24\2\2\u0197\u019e\7\35\2\2\u0198\u019e\7\27\2\2\u0199\u019e\7\30\2"+
		"\2\u019a\u019e\7\31\2\2\u019b\u019e\7\32\2\2\u019c\u019e\7\33\2\2\u019d"+
		"\u018f\3\2\2\2\u019d\u0190\3\2\2\2\u019d\u0191\3\2\2\2\u019d\u0192\3\2"+
		"\2\2\u019d\u0193\3\2\2\2\u019d\u0194\3\2\2\2\u019d\u0195\3\2\2\2\u019d"+
		"\u0196\3\2\2\2\u019d\u0197\3\2\2\2\u019d\u0198\3\2\2\2\u019d\u0199\3\2"+
		"\2\2\u019d\u019a\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019c\3\2\2\2\u019e"+
		"Q\3\2\2\2\u019f\u01a0\t\4\2\2\u01a0S\3\2\2\2\67\\`oux\u0089\u008d\u0091"+
		"\u0095\u0098\u009b\u009f\u00a3\u00a6\u00ae\u00b3\u00bb\u00c6\u00d1\u00d6"+
		"\u00da\u00e0\u00eb\u00f3\u00f9\u0101\u0105\u0109\u0111\u0115\u0119\u011d"+
		"\u0122\u012b\u012e\u0132\u0134\u013d\u0140\u0147\u014f\u0156\u015d\u0165"+
		"\u016a\u016e\u0171\u0177\u017b\u0183\u0187\u018d\u019d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}