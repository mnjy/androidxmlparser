// Generated from src\dimens\Dimens.g4 by ANTLR 4.4

package dimens;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DimensParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, SIZE=5, NAME=6, EQUALS=7, QUOTE=8, OPENBRACKET=9, 
		CLOSEBRACKET=10, SLASH=11, COMMENT=12, NEWLINE=13, WS=14;
	public static final String[] tokenNames = {
		"<INVALID>", "'dimen'", "'name'", "'resources'", "'dp'", "SIZE", "NAME", 
		"'='", "'\"'", "'<'", "'>'", "'/'", "COMMENT", "NEWLINE", "WS"
	};
	public static final int
		RULE_root = 0, RULE_file = 1, RULE_line = 2, RULE_open = 3, RULE_close = 4;
	public static final String[] ruleNames = {
		"root", "file", "line", "open", "close"
	};

	@Override
	public String getGrammarFileName() { return "Dimens.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DimensParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DimensParser.EOF, 0); }
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimensListener ) ((DimensListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimensListener ) ((DimensListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10); file();
			setState(11); match(EOF);
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

	public static class FileContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(DimensParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DimensParser.NEWLINE, i);
		}
		public OpenContext open() {
			return getRuleContext(OpenContext.class,0);
		}
		public CloseContext close() {
			return getRuleContext(CloseContext.class,0);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimensListener ) ((DimensListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimensListener ) ((DimensListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); open();
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(14); match(NEWLINE);
				setState(16);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(15); line();
					}
					break;
				}
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(23); close();
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

	public static class LineContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(DimensParser.EQUALS, 0); }
		public TerminalNode CLOSEBRACKET(int i) {
			return getToken(DimensParser.CLOSEBRACKET, i);
		}
		public List<TerminalNode> OPENBRACKET() { return getTokens(DimensParser.OPENBRACKET); }
		public TerminalNode NAME() { return getToken(DimensParser.NAME, 0); }
		public TerminalNode SLASH() { return getToken(DimensParser.SLASH, 0); }
		public TerminalNode SIZE() { return getToken(DimensParser.SIZE, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(DimensParser.QUOTE); }
		public List<TerminalNode> CLOSEBRACKET() { return getTokens(DimensParser.CLOSEBRACKET); }
		public TerminalNode QUOTE(int i) {
			return getToken(DimensParser.QUOTE, i);
		}
		public TerminalNode OPENBRACKET(int i) {
			return getToken(DimensParser.OPENBRACKET, i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimensListener ) ((DimensListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimensListener ) ((DimensListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); match(OPENBRACKET);
			setState(26); match(T__3);
			setState(27); match(T__2);
			setState(28); match(EQUALS);
			setState(29); match(QUOTE);
			setState(30); match(NAME);
			setState(31); match(QUOTE);
			setState(32); match(CLOSEBRACKET);
			setState(33); match(QUOTE);
			setState(34); match(SIZE);
			setState(35); match(T__0);
			setState(36); match(OPENBRACKET);
			setState(37); match(SLASH);
			setState(38); match(T__3);
			setState(39); match(CLOSEBRACKET);
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

	public static class OpenContext extends ParserRuleContext {
		public TerminalNode OPENBRACKET() { return getToken(DimensParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(DimensParser.CLOSEBRACKET, 0); }
		public OpenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimensListener ) ((DimensListener)listener).enterOpen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimensListener ) ((DimensListener)listener).exitOpen(this);
		}
	}

	public final OpenContext open() throws RecognitionException {
		OpenContext _localctx = new OpenContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_open);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); match(OPENBRACKET);
			setState(42); match(T__1);
			setState(43); match(CLOSEBRACKET);
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

	public static class CloseContext extends ParserRuleContext {
		public TerminalNode OPENBRACKET() { return getToken(DimensParser.OPENBRACKET, 0); }
		public TerminalNode SLASH() { return getToken(DimensParser.SLASH, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(DimensParser.CLOSEBRACKET, 0); }
		public CloseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimensListener ) ((DimensListener)listener).enterClose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimensListener ) ((DimensListener)listener).exitClose(this);
		}
	}

	public final CloseContext close() throws RecognitionException {
		CloseContext _localctx = new CloseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_close);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); match(OPENBRACKET);
			setState(46); match(SLASH);
			setState(47); match(T__1);
			setState(48); match(CLOSEBRACKET);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20\65\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\3\3\3\3\3\5\3\23\n\3\7\3\25"+
		"\n\3\f\3\16\3\30\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\2\2\7"+
		"\2\4\6\b\n\2\2\61\2\f\3\2\2\2\4\17\3\2\2\2\6\33\3\2\2\2\b+\3\2\2\2\n/"+
		"\3\2\2\2\f\r\5\4\3\2\r\16\7\2\2\3\16\3\3\2\2\2\17\26\5\b\5\2\20\22\7\17"+
		"\2\2\21\23\5\6\4\2\22\21\3\2\2\2\22\23\3\2\2\2\23\25\3\2\2\2\24\20\3\2"+
		"\2\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\31\3\2\2\2\30\26\3\2"+
		"\2\2\31\32\5\n\6\2\32\5\3\2\2\2\33\34\7\13\2\2\34\35\7\3\2\2\35\36\7\4"+
		"\2\2\36\37\7\t\2\2\37 \7\n\2\2 !\7\b\2\2!\"\7\n\2\2\"#\7\f\2\2#$\7\n\2"+
		"\2$%\7\7\2\2%&\7\6\2\2&\'\7\13\2\2\'(\7\r\2\2()\7\3\2\2)*\7\f\2\2*\7\3"+
		"\2\2\2+,\7\13\2\2,-\7\5\2\2-.\7\f\2\2.\t\3\2\2\2/\60\7\13\2\2\60\61\7"+
		"\r\2\2\61\62\7\5\2\2\62\63\7\f\2\2\63\13\3\2\2\2\4\22\26";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}