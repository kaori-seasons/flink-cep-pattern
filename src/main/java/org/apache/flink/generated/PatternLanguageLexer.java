// Generated from PatternLanguage.g4 by ANTLR 4.7.1

package org.apache.flink.generated;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PatternLanguageLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SKIP_NO_SKIP", "SKIP_SKIP_PAST_LAST", "SKIP_SKIP_TO_FIRST", "SKIP_SKIP_TO_LAST", 
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
		"STRING_LITERAL", "EscapeSequence", "IDENT", "IntegerLiteral", "FloatingPointLiteral", 
		"OctalEscape", "UnicodeEscape", "DecimalIntegerLiteral", "HexIntegerLiteral", 
		"OctalIntegerLiteral", "BinaryIntegerLiteral", "IntegerTypeSuffix", "DecimalNumeral", 
		"Digits", "Digit", "NonZeroDigit", "DigitOrUnderscore", "Underscores", 
		"HexNumeral", "HexDigits", "HexDigit", "HexDigitOrUnderscore", "OctalNumeral", 
		"OctalDigits", "OctalDigit", "OctalDigitOrUnderscore", "BinaryNumeral", 
		"BinaryDigits", "BinaryDigit", "BinaryDigitOrUnderscore", "DecimalFloatingPointLiteral", 
		"ExponentPart", "ExponentIndicator", "SignedInteger", "Sign", "FloatTypeSuffix", 
		"HexadecimalFloatingPointLiteral", "HexSignificand", "BinaryExponent", 
		"BinaryExponentIndicator"
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


	public PatternLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PatternLanguage.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2n\u0425\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3"+
		"+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\38\38\39"+
		"\39\3:\3:\3:\3;\3;\3;\3;\3<\3<\3<\3=\3=\3=\3=\3>\3>\3>\3?\3?\3@\3@\3A"+
		"\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3K\3L"+
		"\3L\3M\3M\3N\3N\3O\3O\3O\3P\3P\3Q\3Q\3R\3R\3R\3S\3S\3T\3T\3T\3U\3U\3V"+
		"\3V\3W\3W\3X\3X\3X\3Y\3Y\3Z\3Z\3Z\3[\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3"+
		"`\3`\3a\3a\3b\3b\3c\3c\3d\3d\3e\6e\u02fb\ne\re\16e\u02fc\3e\3e\3f\3f\3"+
		"f\3f\7f\u0305\nf\ff\16f\u0308\13f\3f\3f\3f\5f\u030d\nf\5f\u030f\nf\3f"+
		"\3f\3g\3g\3g\3g\7g\u0317\ng\fg\16g\u031a\13g\3g\3g\3g\3g\3g\3h\3h\3h\7"+
		"h\u0324\nh\fh\16h\u0327\13h\3h\3h\3i\3i\3i\7i\u032e\ni\fi\16i\u0331\13"+
		"i\3i\3i\3j\3j\3j\7j\u0338\nj\fj\16j\u033b\13j\3j\3j\3k\3k\3k\3k\3k\5k"+
		"\u0344\nk\3l\3l\7l\u0348\nl\fl\16l\u034b\13l\3m\3m\3m\3m\5m\u0351\nm\3"+
		"n\3n\5n\u0355\nn\3o\3o\3o\3o\3o\3o\3o\3o\3o\5o\u0360\no\3p\3p\3p\3p\3"+
		"p\3p\3p\3q\3q\5q\u036b\nq\3r\3r\5r\u036f\nr\3s\3s\5s\u0373\ns\3t\3t\5"+
		"t\u0377\nt\3u\3u\3v\3v\7v\u037d\nv\fv\16v\u0380\13v\3v\3v\5v\u0384\nv"+
		"\3v\3v\3v\5v\u0389\nv\5v\u038b\nv\3w\3w\7w\u038f\nw\fw\16w\u0392\13w\3"+
		"w\5w\u0395\nw\3x\3x\5x\u0399\nx\3y\3y\3z\3z\5z\u039f\nz\3{\6{\u03a2\n"+
		"{\r{\16{\u03a3\3|\3|\3|\3|\3}\3}\7}\u03ac\n}\f}\16}\u03af\13}\3}\5}\u03b2"+
		"\n}\3~\3~\3\177\3\177\5\177\u03b8\n\177\3\u0080\3\u0080\5\u0080\u03bc"+
		"\n\u0080\3\u0080\3\u0080\3\u0081\3\u0081\7\u0081\u03c2\n\u0081\f\u0081"+
		"\16\u0081\u03c5\13\u0081\3\u0081\5\u0081\u03c8\n\u0081\3\u0082\3\u0082"+
		"\3\u0083\3\u0083\5\u0083\u03ce\n\u0083\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0085\3\u0085\7\u0085\u03d6\n\u0085\f\u0085\16\u0085\u03d9\13\u0085"+
		"\3\u0085\5\u0085\u03dc\n\u0085\3\u0086\3\u0086\3\u0087\3\u0087\5\u0087"+
		"\u03e2\n\u0087\3\u0088\3\u0088\3\u0088\5\u0088\u03e7\n\u0088\3\u0088\5"+
		"\u0088\u03ea\n\u0088\3\u0088\5\u0088\u03ed\n\u0088\3\u0088\3\u0088\3\u0088"+
		"\5\u0088\u03f2\n\u0088\3\u0088\5\u0088\u03f5\n\u0088\3\u0088\3\u0088\3"+
		"\u0088\5\u0088\u03fa\n\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u03ff\n\u0088"+
		"\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008b\5\u008b\u0407\n\u008b"+
		"\3\u008b\3\u008b\3\u008c\3\u008c\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e"+
		"\5\u008e\u0412\n\u008e\3\u008f\3\u008f\5\u008f\u0416\n\u008f\3\u008f\3"+
		"\u008f\3\u008f\5\u008f\u041b\n\u008f\3\u008f\3\u008f\5\u008f\u041f\n\u008f"+
		"\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091\3\u0318\2\u0092\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{"+
		"?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091"+
		"J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5"+
		"T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7]\u00b9"+
		"^\u00bb_\u00bd`\u00bfa\u00c1b\u00c3c\u00c5d\u00c7e\u00c9f\u00cbg\u00cd"+
		"h\u00cfi\u00d1j\u00d3k\u00d5\2\u00d7l\u00d9m\u00dbn\u00dd\2\u00df\2\u00e1"+
		"\2\u00e3\2\u00e5\2\u00e7\2\u00e9\2\u00eb\2\u00ed\2\u00ef\2\u00f1\2\u00f3"+
		"\2\u00f5\2\u00f7\2\u00f9\2\u00fb\2\u00fd\2\u00ff\2\u0101\2\u0103\2\u0105"+
		"\2\u0107\2\u0109\2\u010b\2\u010d\2\u010f\2\u0111\2\u0113\2\u0115\2\u0117"+
		"\2\u0119\2\u011b\2\u011d\2\u011f\2\u0121\2\3\2\25\5\2\13\f\16\17\"\"\4"+
		"\2\f\f\17\17\4\2^^bb\4\2))^^\4\2$$^^\n\2$$))^^ddhhppttvv\5\2&&aac|\6\2"+
		"&&\62;aac|\4\2NNnn\3\2\63;\4\2ZZzz\5\2\62;CHch\3\2\629\4\2DDdd\3\2\62"+
		"\63\4\2GGgg\4\2--//\6\2FFHHffhh\4\2RRrr\2\u043b\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3"+
		"\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2"+
		"\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab"+
		"\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2"+
		"\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd"+
		"\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2"+
		"\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf"+
		"\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2"+
		"\2\2\u00db\3\2\2\2\3\u0123\3\2\2\2\5\u012b\3\2\2\2\7\u013a\3\2\2\2\t\u0148"+
		"\3\2\2\2\13\u0155\3\2\2\2\r\u0158\3\2\2\2\17\u0160\3\2\2\2\21\u0165\3"+
		"\2\2\2\23\u016c\3\2\2\2\25\u0173\3\2\2\2\27\u0176\3\2\2\2\31\u017a\3\2"+
		"\2\2\33\u017e\3\2\2\2\35\u0184\3\2\2\2\37\u0187\3\2\2\2!\u018b\3\2\2\2"+
		"#\u018f\3\2\2\2%\u0193\3\2\2\2\'\u0197\3\2\2\2)\u019a\3\2\2\2+\u019d\3"+
		"\2\2\2-\u01a5\3\2\2\2/\u01b1\3\2\2\2\61\u01bc\3\2\2\2\63\u01c3\3\2\2\2"+
		"\65\u01c8\3\2\2\2\67\u01da\3\2\2\29\u01e0\3\2\2\2;\u01e3\3\2\2\2=\u01e8"+
		"\3\2\2\2?\u01ee\3\2\2\2A\u01f4\3\2\2\2C\u01fb\3\2\2\2E\u0200\3\2\2\2G"+
		"\u0206\3\2\2\2I\u020a\3\2\2\2K\u020f\3\2\2\2M\u0214\3\2\2\2O\u021a\3\2"+
		"\2\2Q\u0221\3\2\2\2S\u0229\3\2\2\2U\u022d\3\2\2\2W\u0234\3\2\2\2Y\u023c"+
		"\3\2\2\2[\u0241\3\2\2\2]\u024d\3\2\2\2_\u025a\3\2\2\2a\u025f\3\2\2\2c"+
		"\u026b\3\2\2\2e\u0278\3\2\2\2g\u027d\3\2\2\2i\u0283\3\2\2\2k\u0288\3\2"+
		"\2\2m\u028f\3\2\2\2o\u0291\3\2\2\2q\u0293\3\2\2\2s\u0295\3\2\2\2u\u0298"+
		"\3\2\2\2w\u029c\3\2\2\2y\u029f\3\2\2\2{\u02a3\3\2\2\2}\u02a6\3\2\2\2\177"+
		"\u02a8\3\2\2\2\u0081\u02aa\3\2\2\2\u0083\u02ac\3\2\2\2\u0085\u02ae\3\2"+
		"\2\2\u0087\u02b0\3\2\2\2\u0089\u02b2\3\2\2\2\u008b\u02b4\3\2\2\2\u008d"+
		"\u02b6\3\2\2\2\u008f\u02b8\3\2\2\2\u0091\u02ba\3\2\2\2\u0093\u02bc\3\2"+
		"\2\2\u0095\u02be\3\2\2\2\u0097\u02c1\3\2\2\2\u0099\u02c3\3\2\2\2\u009b"+
		"\u02c5\3\2\2\2\u009d\u02c7\3\2\2\2\u009f\u02ca\3\2\2\2\u00a1\u02cc\3\2"+
		"\2\2\u00a3\u02ce\3\2\2\2\u00a5\u02d1\3\2\2\2\u00a7\u02d3\3\2\2\2\u00a9"+
		"\u02d6\3\2\2\2\u00ab\u02d8\3\2\2\2\u00ad\u02da\3\2\2\2\u00af\u02dc\3\2"+
		"\2\2\u00b1\u02df\3\2\2\2\u00b3\u02e1\3\2\2\2\u00b5\u02e4\3\2\2\2\u00b7"+
		"\u02e7\3\2\2\2\u00b9\u02e9\3\2\2\2\u00bb\u02eb\3\2\2\2\u00bd\u02ed\3\2"+
		"\2\2\u00bf\u02ef\3\2\2\2\u00c1\u02f1\3\2\2\2\u00c3\u02f3\3\2\2\2\u00c5"+
		"\u02f5\3\2\2\2\u00c7\u02f7\3\2\2\2\u00c9\u02fa\3\2\2\2\u00cb\u0300\3\2"+
		"\2\2\u00cd\u0312\3\2\2\2\u00cf\u0320\3\2\2\2\u00d1\u032a\3\2\2\2\u00d3"+
		"\u0334\3\2\2\2\u00d5\u033e\3\2\2\2\u00d7\u0345\3\2\2\2\u00d9\u0350\3\2"+
		"\2\2\u00db\u0354\3\2\2\2\u00dd\u035f\3\2\2\2\u00df\u0361\3\2\2\2\u00e1"+
		"\u0368\3\2\2\2\u00e3\u036c\3\2\2\2\u00e5\u0370\3\2\2\2\u00e7\u0374\3\2"+
		"\2\2\u00e9\u0378\3\2\2\2\u00eb\u038a\3\2\2\2\u00ed\u038c\3\2\2\2\u00ef"+
		"\u0398\3\2\2\2\u00f1\u039a\3\2\2\2\u00f3\u039e\3\2\2\2\u00f5\u03a1\3\2"+
		"\2\2\u00f7\u03a5\3\2\2\2\u00f9\u03a9\3\2\2\2\u00fb\u03b3\3\2\2\2\u00fd"+
		"\u03b7\3\2\2\2\u00ff\u03b9\3\2\2\2\u0101\u03bf\3\2\2\2\u0103\u03c9\3\2"+
		"\2\2\u0105\u03cd\3\2\2\2\u0107\u03cf\3\2\2\2\u0109\u03d3\3\2\2\2\u010b"+
		"\u03dd\3\2\2\2\u010d\u03e1\3\2\2\2\u010f\u03fe\3\2\2\2\u0111\u0400\3\2"+
		"\2\2\u0113\u0403\3\2\2\2\u0115\u0406\3\2\2\2\u0117\u040a\3\2\2\2\u0119"+
		"\u040c\3\2\2\2\u011b\u040e\3\2\2\2\u011d\u041e\3\2\2\2\u011f\u0420\3\2"+
		"\2\2\u0121\u0423\3\2\2\2\u0123\u0124\7p\2\2\u0124\u0125\7q\2\2\u0125\u0126"+
		"\7a\2\2\u0126\u0127\7u\2\2\u0127\u0128\7m\2\2\u0128\u0129\7k\2\2\u0129"+
		"\u012a\7r\2\2\u012a\4\3\2\2\2\u012b\u012c\7u\2\2\u012c\u012d\7m\2\2\u012d"+
		"\u012e\7k\2\2\u012e\u012f\7r\2\2\u012f\u0130\7a\2\2\u0130\u0131\7r\2\2"+
		"\u0131\u0132\7c\2\2\u0132\u0133\7u\2\2\u0133\u0134\7v\2\2\u0134\u0135"+
		"\7a\2\2\u0135\u0136\7n\2\2\u0136\u0137\7c\2\2\u0137\u0138\7u\2\2\u0138"+
		"\u0139\7v\2\2\u0139\6\3\2\2\2\u013a\u013b\7u\2\2\u013b\u013c\7m\2\2\u013c"+
		"\u013d\7k\2\2\u013d\u013e\7r\2\2\u013e\u013f\7a\2\2\u013f\u0140\7v\2\2"+
		"\u0140\u0141\7q\2\2\u0141\u0142\7a\2\2\u0142\u0143\7h\2\2\u0143\u0144"+
		"\7k\2\2\u0144\u0145\7t\2\2\u0145\u0146\7u\2\2\u0146\u0147\7v\2\2\u0147"+
		"\b\3\2\2\2\u0148\u0149\7u\2\2\u0149\u014a\7m\2\2\u014a\u014b\7k\2\2\u014b"+
		"\u014c\7r\2\2\u014c\u014d\7a\2\2\u014d\u014e\7v\2\2\u014e\u014f\7q\2\2"+
		"\u014f\u0150\7a\2\2\u0150\u0151\7n\2\2\u0151\u0152\7c\2\2\u0152\u0153"+
		"\7u\2\2\u0153\u0154\7v\2\2\u0154\n\3\2\2\2\u0155\u0156\7k\2\2\u0156\u0157"+
		"\7p\2\2\u0157\f\3\2\2\2\u0158\u0159\7d\2\2\u0159\u015a\7g\2\2\u015a\u015b"+
		"\7v\2\2\u015b\u015c\7y\2\2\u015c\u015d\7g\2\2\u015d\u015e\7g\2\2\u015e"+
		"\u015f\7p\2\2\u015f\16\3\2\2\2\u0160\u0161\7n\2\2\u0161\u0162\7k\2\2\u0162"+
		"\u0163\7m\2\2\u0163\u0164\7g\2\2\u0164\20\3\2\2\2\u0165\u0166\7t\2\2\u0166"+
		"\u0167\7g\2\2\u0167\u0168\7i\2\2\u0168\u0169\7g\2\2\u0169\u016a\7z\2\2"+
		"\u016a\u016b\7r\2\2\u016b\22\3\2\2\2\u016c\u016d\7g\2\2\u016d\u016e\7"+
		"u\2\2\u016e\u016f\7e\2\2\u016f\u0170\7c\2\2\u0170\u0171\7r\2\2\u0171\u0172"+
		"\7g\2\2\u0172\24\3\2\2\2\u0173\u0174\7q\2\2\u0174\u0175\7t\2\2\u0175\26"+
		"\3\2\2\2\u0176\u0177\7c\2\2\u0177\u0178\7p\2\2\u0178\u0179\7f\2\2\u0179"+
		"\30\3\2\2\2\u017a\u017b\7p\2\2\u017b\u017c\7q\2\2\u017c\u017d\7v\2\2\u017d"+
		"\32\3\2\2\2\u017e\u017f\7y\2\2\u017f\u0180\7j\2\2\u0180\u0181\7g\2\2\u0181"+
		"\u0182\7t\2\2\u0182\u0183\7g\2\2\u0183\34\3\2\2\2\u0184\u0185\7c\2\2\u0185"+
		"\u0186\7u\2\2\u0186\36\3\2\2\2\u0187\u0188\7u\2\2\u0188\u0189\7w\2\2\u0189"+
		"\u018a\7o\2\2\u018a \3\2\2\2\u018b\u018c\7c\2\2\u018c\u018d\7x\2\2\u018d"+
		"\u018e\7i\2\2\u018e\"\3\2\2\2\u018f\u0190\7o\2\2\u0190\u0191\7c\2\2\u0191"+
		"\u0192\7z\2\2\u0192$\3\2\2\2\u0193\u0194\7o\2\2\u0194\u0195\7k\2\2\u0195"+
		"\u0196\7p\2\2\u0196&\3\2\2\2\u0197\u0198\7q\2\2\u0198\u0199\7p\2\2\u0199"+
		"(\3\2\2\2\u019a\u019b\7k\2\2\u019b\u019c\7u\2\2\u019c*\3\2\2\2\u019d\u019e"+
		"\7y\2\2\u019e\u019f\7g\2\2\u019f\u01a0\7g\2\2\u01a0\u01a1\7m\2\2\u01a1"+
		"\u01a2\7f\2\2\u01a2\u01a3\7c\2\2\u01a3\u01a4\7{\2\2\u01a4,\3\2\2\2\u01a5"+
		"\u01a6\7n\2\2\u01a6\u01a7\7c\2\2\u01a7\u01a8\7u\2\2\u01a8\u01a9\7v\2\2"+
		"\u01a9\u01aa\7y\2\2\u01aa\u01ab\7g\2\2\u01ab\u01ac\7g\2\2\u01ac\u01ad"+
		"\7m\2\2\u01ad\u01ae\7f\2\2\u01ae\u01af\7c\2\2\u01af\u01b0\7{\2\2\u01b0"+
		".\3\2\2\2\u01b1\u01b2\7k\2\2\u01b2\u01b3\7p\2\2\u01b3\u01b4\7u\2\2\u01b4"+
		"\u01b5\7v\2\2\u01b5\u01b6\7c\2\2\u01b6\u01b7\7p\2\2\u01b7\u01b8\7e\2\2"+
		"\u01b8\u01b9\7g\2\2\u01b9\u01ba\7q\2\2\u01ba\u01bb\7h\2\2\u01bb\60\3\2"+
		"\2\2\u01bc\u01bd\7v\2\2\u01bd\u01be\7{\2\2\u01be\u01bf\7r\2\2\u01bf\u01c0"+
		"\7g\2\2\u01c0\u01c1\7q\2\2\u01c1\u01c2\7h\2\2\u01c2\62\3\2\2\2\u01c3\u01c4"+
		"\7e\2\2\u01c4\u01c5\7c\2\2\u01c5\u01c6\7u\2\2\u01c6\u01c7\7v\2\2\u01c7"+
		"\64\3\2\2\2\u01c8\u01c9\7e\2\2\u01c9\u01ca\7w\2\2\u01ca\u01cb\7t\2\2\u01cb"+
		"\u01cc\7t\2\2\u01cc\u01cd\7g\2\2\u01cd\u01ce\7p\2\2\u01ce\u01cf\7v\2\2"+
		"\u01cf\u01d0\7a\2\2\u01d0\u01d1\7v\2\2\u01d1\u01d2\7k\2\2\u01d2\u01d3"+
		"\7o\2\2\u01d3\u01d4\7g\2\2\u01d4\u01d5\7u\2\2\u01d5\u01d6\7v\2\2\u01d6"+
		"\u01d7\7c\2\2\u01d7\u01d8\7o\2\2\u01d8\u01d9\7r\2\2\u01d9\66\3\2\2\2\u01da"+
		"\u01db\7w\2\2\u01db\u01dc\7p\2\2\u01dc\u01dd\7v\2\2\u01dd\u01de\7k\2\2"+
		"\u01de\u01df\7n\2\2\u01df8\3\2\2\2\u01e0\u01e1\7c\2\2\u01e1\u01e2\7v\2"+
		"\2\u01e2:\3\2\2\2\u01e3\u01e4\7{\2\2\u01e4\u01e5\7g\2\2\u01e5\u01e6\7"+
		"c\2\2\u01e6\u01e7\7t\2\2\u01e7<\3\2\2\2\u01e8\u01e9\7{\2\2\u01e9\u01ea"+
		"\7g\2\2\u01ea\u01eb\7c\2\2\u01eb\u01ec\7t\2\2\u01ec\u01ed\7u\2\2\u01ed"+
		">\3\2\2\2\u01ee\u01ef\7o\2\2\u01ef\u01f0\7q\2\2\u01f0\u01f1\7p\2\2\u01f1"+
		"\u01f2\7v\2\2\u01f2\u01f3\7j\2\2\u01f3@\3\2\2\2\u01f4\u01f5\7o\2\2\u01f5"+
		"\u01f6\7q\2\2\u01f6\u01f7\7p\2\2\u01f7\u01f8\7v\2\2\u01f8\u01f9\7j\2\2"+
		"\u01f9\u01fa\7u\2\2\u01faB\3\2\2\2\u01fb\u01fc\7y\2\2\u01fc\u01fd\7g\2"+
		"\2\u01fd\u01fe\7g\2\2\u01fe\u01ff\7m\2\2\u01ffD\3\2\2\2\u0200\u0201\7"+
		"y\2\2\u0201\u0202\7g\2\2\u0202\u0203\7g\2\2\u0203\u0204\7m\2\2\u0204\u0205"+
		"\7u\2\2\u0205F\3\2\2\2\u0206\u0207\7f\2\2\u0207\u0208\7c\2\2\u0208\u0209"+
		"\7{\2\2\u0209H\3\2\2\2\u020a\u020b\7f\2\2\u020b\u020c\7c\2\2\u020c\u020d"+
		"\7{\2\2\u020d\u020e\7u\2\2\u020eJ\3\2\2\2\u020f\u0210\7j\2\2\u0210\u0211"+
		"\7q\2\2\u0211\u0212\7w\2\2\u0212\u0213\7t\2\2\u0213L\3\2\2\2\u0214\u0215"+
		"\7j\2\2\u0215\u0216\7q\2\2\u0216\u0217\7w\2\2\u0217\u0218\7t\2\2\u0218"+
		"\u0219\7u\2\2\u0219N\3\2\2\2\u021a\u021b\7o\2\2\u021b\u021c\7k\2\2\u021c"+
		"\u021d\7p\2\2\u021d\u021e\7w\2\2\u021e\u021f\7v\2\2\u021f\u0220\7g\2\2"+
		"\u0220P\3\2\2\2\u0221\u0222\7o\2\2\u0222\u0223\7k\2\2\u0223\u0224\7p\2"+
		"\2\u0224\u0225\7w\2\2\u0225\u0226\7v\2\2\u0226\u0227\7g\2\2\u0227\u0228"+
		"\7u\2\2\u0228R\3\2\2\2\u0229\u022a\7u\2\2\u022a\u022b\7g\2\2\u022b\u022c"+
		"\7e\2\2\u022cT\3\2\2\2\u022d\u022e\7u\2\2\u022e\u022f\7g\2\2\u022f\u0230"+
		"\7e\2\2\u0230\u0231\7q\2\2\u0231\u0232\7p\2\2\u0232\u0233\7f\2\2\u0233"+
		"V\3\2\2\2\u0234\u0235\7u\2\2\u0235\u0236\7g\2\2\u0236\u0237\7e\2\2\u0237"+
		"\u0238\7q\2\2\u0238\u0239\7p\2\2\u0239\u023a\7f\2\2\u023a\u023b\7u\2\2"+
		"\u023bX\3\2\2\2\u023c\u023d\7o\2\2\u023d\u023e\7u\2\2\u023e\u023f\7g\2"+
		"\2\u023f\u0240\7e\2\2\u0240Z\3\2\2\2\u0241\u0242\7o\2\2\u0242\u0243\7"+
		"k\2\2\u0243\u0244\7n\2\2\u0244\u0245\7n\2\2\u0245\u0246\7k\2\2\u0246\u0247"+
		"\7u\2\2\u0247\u0248\7g\2\2\u0248\u0249\7e\2\2\u0249\u024a\7q\2\2\u024a"+
		"\u024b\7p\2\2\u024b\u024c\7f\2\2\u024c\\\3\2\2\2\u024d\u024e\7o\2\2\u024e"+
		"\u024f\7k\2\2\u024f\u0250\7n\2\2\u0250\u0251\7n\2\2\u0251\u0252\7k\2\2"+
		"\u0252\u0253\7u\2\2\u0253\u0254\7g\2\2\u0254\u0255\7e\2\2\u0255\u0256"+
		"\7q\2\2\u0256\u0257\7p\2\2\u0257\u0258\7f\2\2\u0258\u0259\7u\2\2\u0259"+
		"^\3\2\2\2\u025a\u025b\7w\2\2\u025b\u025c\7u\2\2\u025c\u025d\7g\2\2\u025d"+
		"\u025e\7e\2\2\u025e`\3\2\2\2\u025f\u0260\7o\2\2\u0260\u0261\7k\2\2\u0261"+
		"\u0262\7e\2\2\u0262\u0263\7t\2\2\u0263\u0264\7q\2\2\u0264\u0265\7u\2\2"+
		"\u0265\u0266\7g\2\2\u0266\u0267\7e\2\2\u0267\u0268\7q\2\2\u0268\u0269"+
		"\7p\2\2\u0269\u026a\7f\2\2\u026ab\3\2\2\2\u026b\u026c\7o\2\2\u026c\u026d"+
		"\7k\2\2\u026d\u026e\7e\2\2\u026e\u026f\7t\2\2\u026f\u0270\7q\2\2\u0270"+
		"\u0271\7u\2\2\u0271\u0272\7g\2\2\u0272\u0273\7e\2\2\u0273\u0274\7q\2\2"+
		"\u0274\u0275\7p\2\2\u0275\u0276\7f\2\2\u0276\u0277\7u\2\2\u0277d\3\2\2"+
		"\2\u0278\u0279\7v\2\2\u0279\u027a\7t\2\2\u027a\u027b\7w\2\2\u027b\u027c"+
		"\7g\2\2\u027cf\3\2\2\2\u027d\u027e\7h\2\2\u027e\u027f\7c\2\2\u027f\u0280"+
		"\7n\2\2\u0280\u0281\7u\2\2\u0281\u0282\7g\2\2\u0282h\3\2\2\2\u0283\u0284"+
		"\7p\2\2\u0284\u0285\7w\2\2\u0285\u0286\7n\2\2\u0286\u0287\7n\2\2\u0287"+
		"j\3\2\2\2\u0288\u0289\7y\2\2\u0289\u028a\7k\2\2\u028a\u028b\7v\2\2\u028b"+
		"\u028c\7j\2\2\u028c\u028d\7k\2\2\u028d\u028e\7p\2\2\u028el\3\2\2\2\u028f"+
		"\u0290\7j\2\2\u0290n\3\2\2\2\u0291\u0292\7o\2\2\u0292p\3\2\2\2\u0293\u0294"+
		"\7u\2\2\u0294r\3\2\2\2\u0295\u0296\7o\2\2\u0296\u0297\7u\2\2\u0297t\3"+
		"\2\2\2\u0298\u0299\7#\2\2\u0299\u029a\7/\2\2\u029a\u029b\7@\2\2\u029b"+
		"v\3\2\2\2\u029c\u029d\7/\2\2\u029d\u029e\7@\2\2\u029ex\3\2\2\2\u029f\u02a0"+
		"\7/\2\2\u02a0\u02a1\7@\2\2\u02a1\u02a2\7@\2\2\u02a2z\3\2\2\2\u02a3\u02a4"+
		"\7?\2\2\u02a4\u02a5\7@\2\2\u02a5|\3\2\2\2\u02a6\u02a7\7?\2\2\u02a7~\3"+
		"\2\2\2\u02a8\u02a9\7A\2\2\u02a9\u0080\3\2\2\2\u02aa\u02ab\7*\2\2\u02ab"+
		"\u0082\3\2\2\2\u02ac\u02ad\7+\2\2\u02ad\u0084\3\2\2\2\u02ae\u02af\7]\2"+
		"\2\u02af\u0086\3\2\2\2\u02b0\u02b1\7_\2\2\u02b1\u0088\3\2\2\2\u02b2\u02b3"+
		"\7}\2\2\u02b3\u008a\3\2\2\2\u02b4\u02b5\7\177\2\2\u02b5\u008c\3\2\2\2"+
		"\u02b6\u02b7\7<\2\2\u02b7\u008e\3\2\2\2\u02b8\u02b9\7.\2\2\u02b9\u0090"+
		"\3\2\2\2\u02ba\u02bb\7#\2\2\u02bb\u0092\3\2\2\2\u02bc\u02bd\7\u0080\2"+
		"\2\u02bd\u0094\3\2\2\2\u02be\u02bf\7#\2\2\u02bf\u02c0\7?\2\2\u02c0\u0096"+
		"\3\2\2\2\u02c1\u02c2\7\61\2\2\u02c2\u0098\3\2\2\2\u02c3\u02c4\7-\2\2\u02c4"+
		"\u009a\3\2\2\2\u02c5\u02c6\7/\2\2\u02c6\u009c\3\2\2\2\u02c7\u02c8\7/\2"+
		"\2\u02c8\u02c9\7/\2\2\u02c9\u009e\3\2\2\2\u02ca\u02cb\7,\2\2\u02cb\u00a0"+
		"\3\2\2\2\u02cc\u02cd\7\'\2\2\u02cd\u00a2\3\2\2\2\u02ce\u02cf\7@\2\2\u02cf"+
		"\u02d0\7?\2\2\u02d0\u00a4\3\2\2\2\u02d1\u02d2\7@\2\2\u02d2\u00a6\3\2\2"+
		"\2\u02d3\u02d4\7>\2\2\u02d4\u02d5\7?\2\2\u02d5\u00a8\3\2\2\2\u02d6\u02d7"+
		"\7>\2\2\u02d7\u00aa\3\2\2\2\u02d8\u02d9\7`\2\2\u02d9\u00ac\3\2\2\2\u02da"+
		"\u02db\7~\2\2\u02db\u00ae\3\2\2\2\u02dc\u02dd\7~\2\2\u02dd\u02de\7~\2"+
		"\2\u02de\u00b0\3\2\2\2\u02df\u02e0\7(\2\2\u02e0\u00b2\3\2\2\2\u02e1\u02e2"+
		"\7(\2\2\u02e2\u02e3\7?\2\2\u02e3\u00b4\3\2\2\2\u02e4\u02e5\7(\2\2\u02e5"+
		"\u02e6\7(\2\2\u02e6\u00b6\3\2\2\2\u02e7\u02e8\7=\2\2\u02e8\u00b8\3\2\2"+
		"\2\u02e9\u02ea\7\60\2\2\u02ea\u00ba\3\2\2\2\u02eb\u02ec\7\u1901\2\2\u02ec"+
		"\u00bc\3\2\2\2\u02ed\u02ee\7\u1900\2\2\u02ee\u00be\3\2\2\2\u02ef\u02f0"+
		"\7\u18ff\2\2\u02f0\u00c0\3\2\2\2\u02f1\u02f2\7^\2\2\u02f2\u00c2\3\2\2"+
		"\2\u02f3\u02f4\7b\2\2\u02f4\u00c4\3\2\2\2\u02f5\u02f6\7B\2\2\u02f6\u00c6"+
		"\3\2\2\2\u02f7\u02f8\7%\2\2\u02f8\u00c8\3\2\2\2\u02f9\u02fb\t\2\2\2\u02fa"+
		"\u02f9\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fc\u02fd\3\2"+
		"\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\be\2\2\u02ff\u00ca\3\2\2\2\u0300"+
		"\u0301\7\61\2\2\u0301\u0302\7\61\2\2\u0302\u0306\3\2\2\2\u0303\u0305\n"+
		"\3\2\2\u0304\u0303\3\2\2\2\u0305\u0308\3\2\2\2\u0306\u0304\3\2\2\2\u0306"+
		"\u0307\3\2\2\2\u0307\u030e\3\2\2\2\u0308\u0306\3\2\2\2\u0309\u030f\7\f"+
		"\2\2\u030a\u030c\7\17\2\2\u030b\u030d\7\f\2\2\u030c\u030b\3\2\2\2\u030c"+
		"\u030d\3\2\2\2\u030d\u030f\3\2\2\2\u030e\u0309\3\2\2\2\u030e\u030a\3\2"+
		"\2\2\u030e\u030f\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0311\bf\2\2\u0311"+
		"\u00cc\3\2\2\2\u0312\u0313\7\61\2\2\u0313\u0314\7,\2\2\u0314\u0318\3\2"+
		"\2\2\u0315\u0317\13\2\2\2\u0316\u0315\3\2\2\2\u0317\u031a\3\2\2\2\u0318"+
		"\u0319\3\2\2\2\u0318\u0316\3\2\2\2\u0319\u031b\3\2\2\2\u031a\u0318\3\2"+
		"\2\2\u031b\u031c\7,\2\2\u031c\u031d\7\61\2\2\u031d\u031e\3\2\2\2\u031e"+
		"\u031f\bg\2\2\u031f\u00ce\3\2\2\2\u0320\u0325\7b\2\2\u0321\u0324\5\u00d5"+
		"k\2\u0322\u0324\n\4\2\2\u0323\u0321\3\2\2\2\u0323\u0322\3\2\2\2\u0324"+
		"\u0327\3\2\2\2\u0325\u0323\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0328\3\2"+
		"\2\2\u0327\u0325\3\2\2\2\u0328\u0329\7b\2\2\u0329\u00d0\3\2\2\2\u032a"+
		"\u032f\7)\2\2\u032b\u032e\5\u00d5k\2\u032c\u032e\n\5\2\2\u032d\u032b\3"+
		"\2\2\2\u032d\u032c\3\2\2\2\u032e\u0331\3\2\2\2\u032f\u032d\3\2\2\2\u032f"+
		"\u0330\3\2\2\2\u0330\u0332\3\2\2\2\u0331\u032f\3\2\2\2\u0332\u0333\7)"+
		"\2\2\u0333\u00d2\3\2\2\2\u0334\u0339\7$\2\2\u0335\u0338\5\u00d5k\2\u0336"+
		"\u0338\n\6\2\2\u0337\u0335\3\2\2\2\u0337\u0336\3\2\2\2\u0338\u033b\3\2"+
		"\2\2\u0339\u0337\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033c\3\2\2\2\u033b"+
		"\u0339\3\2\2\2\u033c\u033d\7$\2\2\u033d\u00d4\3\2\2\2\u033e\u0343\7^\2"+
		"\2\u033f\u0344\t\7\2\2\u0340\u0344\5\u00dfp\2\u0341\u0344\5\u00ddo\2\u0342"+
		"\u0344\13\2\2\2\u0343\u033f\3\2\2\2\u0343\u0340\3\2\2\2\u0343\u0341\3"+
		"\2\2\2\u0343\u0342\3\2\2\2\u0344\u00d6\3\2\2\2\u0345\u0349\t\b\2\2\u0346"+
		"\u0348\t\t\2\2\u0347\u0346\3\2\2\2\u0348\u034b\3\2\2\2\u0349\u0347\3\2"+
		"\2\2\u0349\u034a\3\2\2\2\u034a\u00d8\3\2\2\2\u034b\u0349\3\2\2\2\u034c"+
		"\u0351\5\u00e1q\2\u034d\u0351\5\u00e3r\2\u034e\u0351\5\u00e5s\2\u034f"+
		"\u0351\5\u00e7t\2\u0350\u034c\3\2\2\2\u0350\u034d\3\2\2\2\u0350\u034e"+
		"\3\2\2\2\u0350\u034f\3\2\2\2\u0351\u00da\3\2\2\2\u0352\u0355\5\u010f\u0088"+
		"\2\u0353\u0355\5\u011b\u008e\2\u0354\u0352\3\2\2\2\u0354\u0353\3\2\2\2"+
		"\u0355\u00dc\3\2\2\2\u0356\u0357\7^\2\2\u0357\u0358\4\62\65\2\u0358\u0359"+
		"\4\629\2\u0359\u0360\4\629\2\u035a\u035b\7^\2\2\u035b\u035c\4\629\2\u035c"+
		"\u0360\4\629\2\u035d\u035e\7^\2\2\u035e\u0360\4\629\2\u035f\u0356\3\2"+
		"\2\2\u035f\u035a\3\2\2\2\u035f\u035d\3\2\2\2\u0360\u00de\3\2\2\2\u0361"+
		"\u0362\7^\2\2\u0362\u0363\7w\2\2\u0363\u0364\5\u00fb~\2\u0364\u0365\5"+
		"\u00fb~\2\u0365\u0366\5\u00fb~\2\u0366\u0367\5\u00fb~\2\u0367\u00e0\3"+
		"\2\2\2\u0368\u036a\5\u00ebv\2\u0369\u036b\5\u00e9u\2\u036a\u0369\3\2\2"+
		"\2\u036a\u036b\3\2\2\2\u036b\u00e2\3\2\2\2\u036c\u036e\5\u00f7|\2\u036d"+
		"\u036f\5\u00e9u\2\u036e\u036d\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u00e4"+
		"\3\2\2\2\u0370\u0372\5\u00ff\u0080\2\u0371\u0373\5\u00e9u\2\u0372\u0371"+
		"\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u00e6\3\2\2\2\u0374\u0376\5\u0107\u0084"+
		"\2\u0375\u0377\5\u00e9u\2\u0376\u0375\3\2\2\2\u0376\u0377\3\2\2\2\u0377"+
		"\u00e8\3\2\2\2\u0378\u0379\t\n\2\2\u0379\u00ea\3\2\2\2\u037a\u038b\7\62"+
		"\2\2\u037b\u037d\7\62\2\2\u037c\u037b\3\2\2\2\u037d\u0380\3\2\2\2\u037e"+
		"\u037c\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0381\3\2\2\2\u0380\u037e\3\2"+
		"\2\2\u0381\u0388\5\u00f1y\2\u0382\u0384\5\u00edw\2\u0383\u0382\3\2\2\2"+
		"\u0383\u0384\3\2\2\2\u0384\u0389\3\2\2\2\u0385\u0386\5\u00f5{\2\u0386"+
		"\u0387\5\u00edw\2\u0387\u0389\3\2\2\2\u0388\u0383\3\2\2\2\u0388\u0385"+
		"\3\2\2\2\u0389\u038b\3\2\2\2\u038a\u037a\3\2\2\2\u038a\u037e\3\2\2\2\u038b"+
		"\u00ec\3\2\2\2\u038c\u0394\5\u00efx\2\u038d\u038f\5\u00f3z\2\u038e\u038d"+
		"\3\2\2\2\u038f\u0392\3\2\2\2\u0390\u038e\3\2\2\2\u0390\u0391\3\2\2\2\u0391"+
		"\u0393\3\2\2\2\u0392\u0390\3\2\2\2\u0393\u0395\5\u00efx\2\u0394\u0390"+
		"\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u00ee\3\2\2\2\u0396\u0399\7\62\2\2"+
		"\u0397\u0399\5\u00f1y\2\u0398\u0396\3\2\2\2\u0398\u0397\3\2\2\2\u0399"+
		"\u00f0\3\2\2\2\u039a\u039b\t\13\2\2\u039b\u00f2\3\2\2\2\u039c\u039f\5"+
		"\u00efx\2\u039d\u039f\7a\2\2\u039e\u039c\3\2\2\2\u039e\u039d\3\2\2\2\u039f"+
		"\u00f4\3\2\2\2\u03a0\u03a2\7a\2\2\u03a1\u03a0\3\2\2\2\u03a2\u03a3\3\2"+
		"\2\2\u03a3\u03a1\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u00f6\3\2\2\2\u03a5"+
		"\u03a6\7\62\2\2\u03a6\u03a7\t\f\2\2\u03a7\u03a8\5\u00f9}\2\u03a8\u00f8"+
		"\3\2\2\2\u03a9\u03b1\5\u00fb~\2\u03aa\u03ac\5\u00fd\177\2\u03ab\u03aa"+
		"\3\2\2\2\u03ac\u03af\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae"+
		"\u03b0\3\2\2\2\u03af\u03ad\3\2\2\2\u03b0\u03b2\5\u00fb~\2\u03b1\u03ad"+
		"\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u00fa\3\2\2\2\u03b3\u03b4\t\r\2\2\u03b4"+
		"\u00fc\3\2\2\2\u03b5\u03b8\5\u00fb~\2\u03b6\u03b8\7a\2\2\u03b7\u03b5\3"+
		"\2\2\2\u03b7\u03b6\3\2\2\2\u03b8\u00fe\3\2\2\2\u03b9\u03bb\7\62\2\2\u03ba"+
		"\u03bc\5\u00f5{\2\u03bb\u03ba\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03bd"+
		"\3\2\2\2\u03bd\u03be\5\u0101\u0081\2\u03be\u0100\3\2\2\2\u03bf\u03c7\5"+
		"\u0103\u0082\2\u03c0\u03c2\5\u0105\u0083\2\u03c1\u03c0\3\2\2\2\u03c2\u03c5"+
		"\3\2\2\2\u03c3\u03c1\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c6\3\2\2\2\u03c5"+
		"\u03c3\3\2\2\2\u03c6\u03c8\5\u0103\u0082\2\u03c7\u03c3\3\2\2\2\u03c7\u03c8"+
		"\3\2\2\2\u03c8\u0102\3\2\2\2\u03c9\u03ca\t\16\2\2\u03ca\u0104\3\2\2\2"+
		"\u03cb\u03ce\5\u0103\u0082\2\u03cc\u03ce\7a\2\2\u03cd\u03cb\3\2\2\2\u03cd"+
		"\u03cc\3\2\2\2\u03ce\u0106\3\2\2\2\u03cf\u03d0\7\62\2\2\u03d0\u03d1\t"+
		"\17\2\2\u03d1\u03d2\5\u0109\u0085\2\u03d2\u0108\3\2\2\2\u03d3\u03db\5"+
		"\u010b\u0086\2\u03d4\u03d6\5\u010d\u0087\2\u03d5\u03d4\3\2\2\2\u03d6\u03d9"+
		"\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03da\3\2\2\2\u03d9"+
		"\u03d7\3\2\2\2\u03da\u03dc\5\u010b\u0086\2\u03db\u03d7\3\2\2\2\u03db\u03dc"+
		"\3\2\2\2\u03dc\u010a\3\2\2\2\u03dd\u03de\t\20\2\2\u03de\u010c\3\2\2\2"+
		"\u03df\u03e2\5\u010b\u0086\2\u03e0\u03e2\7a\2\2\u03e1\u03df\3\2\2\2\u03e1"+
		"\u03e0\3\2\2\2\u03e2\u010e\3\2\2\2\u03e3\u03e4\5\u00edw\2\u03e4\u03e6"+
		"\7\60\2\2\u03e5\u03e7\5\u00edw\2\u03e6\u03e5\3\2\2\2\u03e6\u03e7\3\2\2"+
		"\2\u03e7\u03e9\3\2\2\2\u03e8\u03ea\5\u0111\u0089\2\u03e9\u03e8\3\2\2\2"+
		"\u03e9\u03ea\3\2\2\2\u03ea\u03ec\3\2\2\2\u03eb\u03ed\5\u0119\u008d\2\u03ec"+
		"\u03eb\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ff\3\2\2\2\u03ee\u03ef\7\60"+
		"\2\2\u03ef\u03f1\5\u00edw\2\u03f0\u03f2\5\u0111\u0089\2\u03f1\u03f0\3"+
		"\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f4\3\2\2\2\u03f3\u03f5\5\u0119\u008d"+
		"\2\u03f4\u03f3\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03ff\3\2\2\2\u03f6\u03f7"+
		"\5\u00edw\2\u03f7\u03f9\5\u0111\u0089\2\u03f8\u03fa\5\u0119\u008d\2\u03f9"+
		"\u03f8\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03ff\3\2\2\2\u03fb\u03fc\5\u00ed"+
		"w\2\u03fc\u03fd\5\u0119\u008d\2\u03fd\u03ff\3\2\2\2\u03fe\u03e3\3\2\2"+
		"\2\u03fe\u03ee\3\2\2\2\u03fe\u03f6\3\2\2\2\u03fe\u03fb\3\2\2\2\u03ff\u0110"+
		"\3\2\2\2\u0400\u0401\5\u0113\u008a\2\u0401\u0402\5\u0115\u008b\2\u0402"+
		"\u0112\3\2\2\2\u0403\u0404\t\21\2\2\u0404\u0114\3\2\2\2\u0405\u0407\5"+
		"\u0117\u008c\2\u0406\u0405\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0408\3\2"+
		"\2\2\u0408\u0409\5\u00edw\2\u0409\u0116\3\2\2\2\u040a\u040b\t\22\2\2\u040b"+
		"\u0118\3\2\2\2\u040c\u040d\t\23\2\2\u040d\u011a\3\2\2\2\u040e\u040f\5"+
		"\u011d\u008f\2\u040f\u0411\5\u011f\u0090\2\u0410\u0412\5\u0119\u008d\2"+
		"\u0411\u0410\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u011c\3\2\2\2\u0413\u0415"+
		"\5\u00f7|\2\u0414\u0416\7\60\2\2\u0415\u0414\3\2\2\2\u0415\u0416\3\2\2"+
		"\2\u0416\u041f\3\2\2\2\u0417\u0418\7\62\2\2\u0418\u041a\t\f\2\2\u0419"+
		"\u041b\5\u00f9}\2\u041a\u0419\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u041c"+
		"\3\2\2\2\u041c\u041d\7\60\2\2\u041d\u041f\5\u00f9}\2\u041e\u0413\3\2\2"+
		"\2\u041e\u0417\3\2\2\2\u041f\u011e\3\2\2\2\u0420\u0421\5\u0121\u0091\2"+
		"\u0421\u0422\5\u0115\u008b\2\u0422\u0120\3\2\2\2\u0423\u0424\t\24\2\2"+
		"\u0424\u0122\3\2\2\2\67\2\u02fa\u02fc\u0306\u030c\u030e\u0318\u0323\u0325"+
		"\u032d\u032f\u0337\u0339\u0343\u0349\u0350\u0354\u035f\u036a\u036e\u0372"+
		"\u0376\u037e\u0383\u0388\u038a\u0390\u0394\u0398\u039e\u03a3\u03ad\u03b1"+
		"\u03b7\u03bb\u03c3\u03c7\u03cd\u03d7\u03db\u03e1\u03e6\u03e9\u03ec\u03f1"+
		"\u03f4\u03f9\u03fe\u0406\u0411\u0415\u041a\u041e\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}