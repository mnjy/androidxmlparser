// Generated from src\colors\Colors.g4 by ANTLR 4.4

package colors;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ColorsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, HEX=4, NAME=5, EQUALS=6, QUOTE=7, OPENBRACKET=8, 
		CLOSEBRACKET=9, SLASH=10, COMMENT=11, NEWLINE=12, WS=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "HEX", "NAME", "EQUALS", "QUOTE", "OPENBRACKET", 
		"CLOSEBRACKET", "SLASH", "COMMENT", "NEWLINE", "WS"
	};


	public ColorsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Colors.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17f\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5\66\n\5\f"+
		"\5\16\59\13\5\3\6\3\6\7\6=\n\6\f\6\16\6@\13\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\fR\n\f\f\f\16\fU\13\f\3\f"+
		"\3\f\3\f\3\f\3\r\6\r\\\n\r\r\r\16\r]\3\16\6\16a\n\16\r\16\16\16b\3\16"+
		"\3\16\3S\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\3\2\6\5\2\62;C\\c|\5\2C\\aac|\4\2\f\f\17\17\4\2\13\13\"\"j\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5\"\3\2\2\2\7,\3\2\2\2\t\62\3\2\2\2"+
		"\13:\3\2\2\2\rA\3\2\2\2\17C\3\2\2\2\21E\3\2\2\2\23G\3\2\2\2\25I\3\2\2"+
		"\2\27K\3\2\2\2\31[\3\2\2\2\33`\3\2\2\2\35\36\7p\2\2\36\37\7c\2\2\37 \7"+
		"o\2\2 !\7g\2\2!\4\3\2\2\2\"#\7t\2\2#$\7g\2\2$%\7u\2\2%&\7q\2\2&\'\7w\2"+
		"\2\'(\7t\2\2()\7e\2\2)*\7g\2\2*+\7u\2\2+\6\3\2\2\2,-\7e\2\2-.\7q\2\2."+
		"/\7n\2\2/\60\7q\2\2\60\61\7t\2\2\61\b\3\2\2\2\62\63\7%\2\2\63\67\t\2\2"+
		"\2\64\66\t\2\2\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28"+
		"\n\3\2\2\29\67\3\2\2\2:>\t\3\2\2;=\t\3\2\2<;\3\2\2\2=@\3\2\2\2><\3\2\2"+
		"\2>?\3\2\2\2?\f\3\2\2\2@>\3\2\2\2AB\7?\2\2B\16\3\2\2\2CD\7$\2\2D\20\3"+
		"\2\2\2EF\7>\2\2F\22\3\2\2\2GH\7@\2\2H\24\3\2\2\2IJ\7\61\2\2J\26\3\2\2"+
		"\2KL\7>\2\2LM\7#\2\2MN\7/\2\2NO\7/\2\2OS\3\2\2\2PR\13\2\2\2QP\3\2\2\2"+
		"RU\3\2\2\2ST\3\2\2\2SQ\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\t\4\2\2WX\3\2\2\2"+
		"XY\b\f\2\2Y\30\3\2\2\2Z\\\t\4\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2"+
		"\2\2^\32\3\2\2\2_a\t\5\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2cd\3"+
		"\2\2\2de\b\16\2\2e\34\3\2\2\2\b\2\67>S]b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}