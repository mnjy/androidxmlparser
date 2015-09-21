// Generated from src\dimens\Dimens.g4 by ANTLR 4.4

package dimens;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DimensLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, SIZE=5, NAME=6, EQUALS=7, QUOTE=8, OPENBRACKET=9, 
		CLOSEBRACKET=10, SLASH=11, COMMENT=12, NEWLINE=13, WS=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "SIZE", "NAME", "EQUALS", "QUOTE", "OPENBRACKET", 
		"CLOSEBRACKET", "SLASH", "COMMENT", "NEWLINE", "WS"
	};


	public DimensLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Dimens.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20j\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6"+
		"\3\6\7\6:\n\6\f\6\16\6=\13\6\3\7\3\7\7\7A\n\7\f\7\16\7D\13\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\rV\n\r\f\r"+
		"\16\rY\13\r\3\r\3\r\3\r\3\r\3\16\6\16`\n\16\r\16\16\16a\3\17\6\17e\n\17"+
		"\r\17\16\17f\3\17\3\17\3W\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\3\2\6\3\2\62;\5\2C\\aac|\4\2\f\f\17\17\4"+
		"\2\13\13\"\"n\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5%\3\2"+
		"\2\2\7*\3\2\2\2\t\64\3\2\2\2\13\67\3\2\2\2\r>\3\2\2\2\17E\3\2\2\2\21G"+
		"\3\2\2\2\23I\3\2\2\2\25K\3\2\2\2\27M\3\2\2\2\31O\3\2\2\2\33_\3\2\2\2\35"+
		"d\3\2\2\2\37 \7f\2\2 !\7k\2\2!\"\7o\2\2\"#\7g\2\2#$\7p\2\2$\4\3\2\2\2"+
		"%&\7p\2\2&\'\7c\2\2\'(\7o\2\2()\7g\2\2)\6\3\2\2\2*+\7t\2\2+,\7g\2\2,-"+
		"\7u\2\2-.\7q\2\2./\7w\2\2/\60\7t\2\2\60\61\7e\2\2\61\62\7g\2\2\62\63\7"+
		"u\2\2\63\b\3\2\2\2\64\65\7f\2\2\65\66\7r\2\2\66\n\3\2\2\2\67;\t\2\2\2"+
		"8:\t\2\2\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\f\3\2\2\2=;\3\2\2"+
		"\2>B\t\3\2\2?A\t\3\2\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\16\3\2"+
		"\2\2DB\3\2\2\2EF\7?\2\2F\20\3\2\2\2GH\7$\2\2H\22\3\2\2\2IJ\7>\2\2J\24"+
		"\3\2\2\2KL\7@\2\2L\26\3\2\2\2MN\7\61\2\2N\30\3\2\2\2OP\7>\2\2PQ\7#\2\2"+
		"QR\7/\2\2RS\7/\2\2SW\3\2\2\2TV\13\2\2\2UT\3\2\2\2VY\3\2\2\2WX\3\2\2\2"+
		"WU\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\t\4\2\2[\\\3\2\2\2\\]\b\r\2\2]\32\3\2"+
		"\2\2^`\t\4\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\34\3\2\2\2ce\t"+
		"\5\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\b\17\2\2i\36"+
		"\3\2\2\2\b\2;BWaf\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}