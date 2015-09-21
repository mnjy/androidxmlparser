// Generated from src\styles\Styles.g4 by ANTLR 4.4

package styles;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StylesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, SIZE=13, NAME=14, STYLE_NAME=15, EQUALS=16, 
		QUOTE=17, OPENBRACKET=18, CLOSEBRACKET=19, COLON=20, SLASH=21, ATSIGN=22, 
		COMMENT=23, NEWLINE=24, WS=25;
	public static final String[] tokenNames = {
		"<INVALID>", "'dimen'", "'name'", "'resources'", "'fonts'", "'color'", 
		"'textColor'", "'textSize'", "'fontPath'", "'item'", "'style'", "'parent'", 
		"'android'", "SIZE", "NAME", "STYLE_NAME", "'='", "'\"'", "'<'", "'>'", 
		"':'", "'/'", "'@'", "COMMENT", "NEWLINE", "WS"
	};
	public static final int
		RULE_root = 0, RULE_file = 1, RULE_style_def = 2, RULE_start_style_phrase = 3, 
		RULE_font_phrase = 4, RULE_color_phrase = 5, RULE_dimen_phrase = 6, RULE_ignore_phrase = 7, 
		RULE_end_style_phrase = 8, RULE_open = 9, RULE_close = 10, RULE_name_info = 11, 
		RULE_parent_info = 12;
	public static final String[] ruleNames = {
		"root", "file", "style_def", "start_style_phrase", "font_phrase", "color_phrase", 
		"dimen_phrase", "ignore_phrase", "end_style_phrase", "open", "close", 
		"name_info", "parent_info"
	};

	@Override
	public String getGrammarFileName() { return "Styles.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StylesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(StylesParser.EOF, 0); }
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StylesListener ) ((StylesListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StylesListener ) ((StylesListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); file();
			setState(27); match(EOF);
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
		public List<Style_defContext> style_def() {
			return getRuleContexts(Style_defContext.class);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(StylesParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(StylesParser.NEWLINE, i);
		}
		public OpenContext open() {
			return getRuleContext(OpenContext.class,0);
		}
		public CloseContext close() {
			return getRuleContext(CloseContext.class,0);
		}
		public Style_defContext style_def(int i) {
			return getRuleContext(Style_defContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StylesListener ) ((StylesListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StylesListener ) ((StylesListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_file);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(29); open();
			setState(34);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(32);
					switch (_input.LA(1)) {
					case NEWLINE:
						{
						setState(30); match(NEWLINE);
						}
						break;
					case OPENBRACKET:
						{
						setState(31); style_def();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(36);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(37); close();
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

	public static class Style_defContext extends ParserRuleContext {
		public Color_phraseContext color_phrase(int i) {
			return getRuleContext(Color_phraseContext.class,i);
		}
		public List<Color_phraseContext> color_phrase() {
			return getRuleContexts(Color_phraseContext.class);
		}
		public List<Ignore_phraseContext> ignore_phrase() {
			return getRuleContexts(Ignore_phraseContext.class);
		}
		public Start_style_phraseContext start_style_phrase() {
			return getRuleContext(Start_style_phraseContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(StylesParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(StylesParser.NEWLINE, i);
		}
		public List<Dimen_phraseContext> dimen_phrase() {
			return getRuleContexts(Dimen_phraseContext.class);
		}
		public Dimen_phraseContext dimen_phrase(int i) {
			return getRuleContext(Dimen_phraseContext.class,i);
		}
		public End_style_phraseContext end_style_phrase() {
			return getRuleContext(End_style_phraseContext.class,0);
		}
		public Font_phraseContext font_phrase(int i) {
			return getRuleContext(Font_phraseContext.class,i);
		}
		public List<Font_phraseContext> font_phrase() {
			return getRuleContexts(Font_phraseContext.class);
		}
		public Ignore_phraseContext ignore_phrase(int i) {
			return getRuleContext(Ignore_phraseContext.class,i);
		}
		public Style_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StylesListener ) ((StylesListener)listener).enterStyle_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StylesListener ) ((StylesListener)listener).exitStyle_def(this);
		}
	}

	public final Style_defContext style_def() throws RecognitionException {
		Style_defContext _localctx = new Style_defContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_style_def);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(39); start_style_phrase();
			setState(41);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(40); match(NEWLINE);
				}
				break;
			}
			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(48);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(43); font_phrase();
						}
						break;
					case 2:
						{
						setState(44); color_phrase();
						}
						break;
					case 3:
						{
						setState(45); dimen_phrase();
						}
						break;
					case 4:
						{
						setState(46); ignore_phrase();
						}
						break;
					case 5:
						{
						setState(47); match(NEWLINE);
						}
						break;
					}
					} 
				}
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(54);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(53); match(NEWLINE);
				}
			}

			setState(56); end_style_phrase();
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

	public static class Start_style_phraseContext extends ParserRuleContext {
		public Name_infoContext name_info() {
			return getRuleContext(Name_infoContext.class,0);
		}
		public TerminalNode OPENBRACKET() { return getToken(StylesParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(StylesParser.CLOSEBRACKET, 0); }
		public Parent_infoContext parent_info() {
			return getRuleContext(Parent_infoContext.class,0);
		}
		public Start_style_phraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_style_phrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StylesListener ) ((StylesListener)listener).enterStart_style_phrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StylesListener ) ((StylesListener)listener).exitStart_style_phrase(this);
		}
	}

	public final Start_style_phraseContext start_style_phrase() throws RecognitionException {
		Start_style_phraseContext _localctx = new Start_style_phraseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_start_style_phrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); match(OPENBRACKET);
			setState(59); match(T__2);
			setState(60); name_info();
			setState(62);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(61); parent_info();
				}
			}

			setState(64); match(CLOSEBRACKET);
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

	public static class Font_phraseContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(StylesParser.EQUALS, 0); }
		public TerminalNode CLOSEBRACKET(int i) {
			return getToken(StylesParser.CLOSEBRACKET, i);
		}
		public List<TerminalNode> OPENBRACKET() { return getTokens(StylesParser.OPENBRACKET); }
		public TerminalNode NAME() { return getToken(StylesParser.NAME, 0); }
		public List<TerminalNode> SLASH() { return getTokens(StylesParser.SLASH); }
		public TerminalNode COLON() { return getToken(StylesParser.COLON, 0); }
		public TerminalNode QUOTE() { return getToken(StylesParser.QUOTE, 0); }
		public TerminalNode SLASH(int i) {
			return getToken(StylesParser.SLASH, i);
		}
		public List<TerminalNode> CLOSEBRACKET() { return getTokens(StylesParser.CLOSEBRACKET); }
		public TerminalNode OPENBRACKET(int i) {
			return getToken(StylesParser.OPENBRACKET, i);
		}
		public Font_phraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_font_phrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StylesListener ) ((StylesListener)listener).enterFont_phrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StylesListener ) ((StylesListener)listener).exitFont_phrase(this);
		}
	}

	public final Font_phraseContext font_phrase() throws RecognitionException {
		Font_phraseContext _localctx = new Font_phraseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_font_phrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); match(OPENBRACKET);
			setState(67); match(T__3);
			setState(68); match(T__10);
			setState(69); match(EQUALS);
			setState(70); match(QUOTE);
			setState(71); match(T__0);
			setState(72); match(COLON);
			setState(73); match(T__4);
			setState(74); match(CLOSEBRACKET);
			setState(75); match(T__8);
			setState(76); match(SLASH);
			setState(77); match(NAME);
			setState(78); match(OPENBRACKET);
			setState(79); match(SLASH);
			setState(80); match(T__3);
			setState(81); match(CLOSEBRACKET);
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

	public static class Color_phraseContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(StylesParser.EQUALS, 0); }
		public TerminalNode CLOSEBRACKET(int i) {
			return getToken(StylesParser.CLOSEBRACKET, i);
		}
		public List<TerminalNode> OPENBRACKET() { return getTokens(StylesParser.OPENBRACKET); }
		public TerminalNode ATSIGN() { return getToken(StylesParser.ATSIGN, 0); }
		public TerminalNode NAME() { return getToken(StylesParser.NAME, 0); }
		public List<TerminalNode> SLASH() { return getTokens(StylesParser.SLASH); }
		public TerminalNode COLON() { return getToken(StylesParser.COLON, 0); }
		public TerminalNode QUOTE() { return getToken(StylesParser.QUOTE, 0); }
		public TerminalNode SLASH(int i) {
			return getToken(StylesParser.SLASH, i);
		}
		public List<TerminalNode> CLOSEBRACKET() { return getTokens(StylesParser.CLOSEBRACKET); }
		public TerminalNode OPENBRACKET(int i) {
			return getToken(StylesParser.OPENBRACKET, i);
		}
		public Color_phraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color_phrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StylesListener ) ((StylesListener)listener).enterColor_phrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StylesListener ) ((StylesListener)listener).exitColor_phrase(this);
		}
	}

	public final Color_phraseContext color_phrase() throws RecognitionException {
		Color_phraseContext _localctx = new Color_phraseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_color_phrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); match(OPENBRACKET);
			setState(84); match(T__3);
			setState(85); match(T__10);
			setState(86); match(EQUALS);
			setState(87); match(QUOTE);
			setState(88); match(T__0);
			setState(89); match(COLON);
			setState(90); match(T__6);
			setState(91); match(CLOSEBRACKET);
			setState(92); match(ATSIGN);
			setState(93); match(T__7);
			setState(94); match(SLASH);
			setState(95); match(NAME);
			setState(96); match(OPENBRACKET);
			setState(97); match(SLASH);
			setState(98); match(T__3);
			setState(99); match(CLOSEBRACKET);
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

	public static class Dimen_phraseContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(StylesParser.EQUALS, 0); }
		public TerminalNode CLOSEBRACKET(int i) {
			return getToken(StylesParser.CLOSEBRACKET, i);
		}
		public List<TerminalNode> OPENBRACKET() { return getTokens(StylesParser.OPENBRACKET); }
		public TerminalNode ATSIGN() { return getToken(StylesParser.ATSIGN, 0); }
		public TerminalNode NAME() { return getToken(StylesParser.NAME, 0); }
		public List<TerminalNode> SLASH() { return getTokens(StylesParser.SLASH); }
		public TerminalNode COLON() { return getToken(StylesParser.COLON, 0); }
		public TerminalNode QUOTE() { return getToken(StylesParser.QUOTE, 0); }
		public TerminalNode SLASH(int i) {
			return getToken(StylesParser.SLASH, i);
		}
		public List<TerminalNode> CLOSEBRACKET() { return getTokens(StylesParser.CLOSEBRACKET); }
		public TerminalNode OPENBRACKET(int i) {
			return getToken(StylesParser.OPENBRACKET, i);
		}
		public Dimen_phraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimen_phrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StylesListener ) ((StylesListener)listener).enterDimen_phrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StylesListener ) ((StylesListener)listener).exitDimen_phrase(this);
		}
	}

	public final Dimen_phraseContext dimen_phrase() throws RecognitionException {
		Dimen_phraseContext _localctx = new Dimen_phraseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dimen_phrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); match(OPENBRACKET);
			setState(102); match(T__3);
			setState(103); match(T__10);
			setState(104); match(EQUALS);
			setState(105); match(QUOTE);
			setState(106); match(T__0);
			setState(107); match(COLON);
			setState(108); match(T__5);
			setState(109); match(CLOSEBRACKET);
			setState(110); match(ATSIGN);
			setState(111); match(T__11);
			setState(112); match(SLASH);
			setState(113); match(NAME);
			setState(114); match(OPENBRACKET);
			setState(115); match(SLASH);
			setState(116); match(T__3);
			setState(117); match(CLOSEBRACKET);
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

	public static class Ignore_phraseContext extends ParserRuleContext {
		public TerminalNode NAME(int i) {
			return getToken(StylesParser.NAME, i);
		}
		public TerminalNode EQUALS() { return getToken(StylesParser.EQUALS, 0); }
		public TerminalNode CLOSEBRACKET(int i) {
			return getToken(StylesParser.CLOSEBRACKET, i);
		}
		public List<TerminalNode> OPENBRACKET() { return getTokens(StylesParser.OPENBRACKET); }
		public List<TerminalNode> NAME() { return getTokens(StylesParser.NAME); }
		public TerminalNode SLASH() { return getToken(StylesParser.SLASH, 0); }
		public TerminalNode COLON() { return getToken(StylesParser.COLON, 0); }
		public TerminalNode QUOTE() { return getToken(StylesParser.QUOTE, 0); }
		public List<TerminalNode> CLOSEBRACKET() { return getTokens(StylesParser.CLOSEBRACKET); }
		public TerminalNode OPENBRACKET(int i) {
			return getToken(StylesParser.OPENBRACKET, i);
		}
		public Ignore_phraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignore_phrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StylesListener ) ((StylesListener)listener).enterIgnore_phrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StylesListener ) ((StylesListener)listener).exitIgnore_phrase(this);
		}
	}

	public final Ignore_phraseContext ignore_phrase() throws RecognitionException {
		Ignore_phraseContext _localctx = new Ignore_phraseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ignore_phrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); match(OPENBRACKET);
			setState(120); match(T__3);
			setState(121); match(T__10);
			setState(122); match(EQUALS);
			setState(123); match(QUOTE);
			setState(124); match(T__0);
			setState(125); match(COLON);
			setState(126); match(NAME);
			setState(127); match(CLOSEBRACKET);
			setState(128); match(NAME);
			setState(129); match(OPENBRACKET);
			setState(130); match(SLASH);
			setState(131); match(T__3);
			setState(132); match(CLOSEBRACKET);
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

	public static class End_style_phraseContext extends ParserRuleContext {
		public TerminalNode OPENBRACKET() { return getToken(StylesParser.OPENBRACKET, 0); }
		public TerminalNode SLASH() { return getToken(StylesParser.SLASH, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(StylesParser.CLOSEBRACKET, 0); }
		public End_style_phraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_style_phrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StylesListener ) ((StylesListener)listener).enterEnd_style_phrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StylesListener ) ((StylesListener)listener).exitEnd_style_phrase(this);
		}
	}

	public final End_style_phraseContext end_style_phrase() throws RecognitionException {
		End_style_phraseContext _localctx = new End_style_phraseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_end_style_phrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); match(OPENBRACKET);
			setState(135); match(SLASH);
			setState(136); match(T__2);
			setState(137); match(CLOSEBRACKET);
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
		public TerminalNode OPENBRACKET() { return getToken(StylesParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(StylesParser.CLOSEBRACKET, 0); }
		public OpenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StylesListener ) ((StylesListener)listener).enterOpen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StylesListener ) ((StylesListener)listener).exitOpen(this);
		}
	}

	public final OpenContext open() throws RecognitionException {
		OpenContext _localctx = new OpenContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_open);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); match(OPENBRACKET);
			setState(140); match(T__9);
			setState(141); match(CLOSEBRACKET);
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
		public TerminalNode OPENBRACKET() { return getToken(StylesParser.OPENBRACKET, 0); }
		public TerminalNode SLASH() { return getToken(StylesParser.SLASH, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(StylesParser.CLOSEBRACKET, 0); }
		public CloseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StylesListener ) ((StylesListener)listener).enterClose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StylesListener ) ((StylesListener)listener).exitClose(this);
		}
	}

	public final CloseContext close() throws RecognitionException {
		CloseContext _localctx = new CloseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_close);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); match(OPENBRACKET);
			setState(144); match(SLASH);
			setState(145); match(T__9);
			setState(146); match(CLOSEBRACKET);
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

	public static class Name_infoContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(StylesParser.EQUALS, 0); }
		public TerminalNode STYLE_NAME() { return getToken(StylesParser.STYLE_NAME, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(StylesParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(StylesParser.QUOTE, i);
		}
		public Name_infoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StylesListener ) ((StylesListener)listener).enterName_info(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StylesListener ) ((StylesListener)listener).exitName_info(this);
		}
	}

	public final Name_infoContext name_info() throws RecognitionException {
		Name_infoContext _localctx = new Name_infoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_name_info);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(T__10);
			setState(149); match(EQUALS);
			setState(150); match(QUOTE);
			setState(151); match(STYLE_NAME);
			setState(152); match(QUOTE);
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

	public static class Parent_infoContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(StylesParser.EQUALS, 0); }
		public TerminalNode STYLE_NAME() { return getToken(StylesParser.STYLE_NAME, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(StylesParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(StylesParser.QUOTE, i);
		}
		public Parent_infoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parent_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StylesListener ) ((StylesListener)listener).enterParent_info(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StylesListener ) ((StylesListener)listener).exitParent_info(this);
		}
	}

	public final Parent_infoContext parent_info() throws RecognitionException {
		Parent_infoContext _localctx = new Parent_infoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parent_info);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); match(T__1);
			setState(155); match(EQUALS);
			setState(156); match(QUOTE);
			setState(157); match(STYLE_NAME);
			setState(158); match(QUOTE);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\33\u00a3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\3\3\7\3#\n\3\f\3\16"+
		"\3&\13\3\3\3\3\3\3\4\3\4\5\4,\n\4\3\4\3\4\3\4\3\4\3\4\7\4\63\n\4\f\4\16"+
		"\4\66\13\4\3\4\5\49\n\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5A\n\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\2\2\u009f\2\34\3\2\2\2\4\37\3\2\2\2\6)\3\2\2\2\b<\3\2\2\2\nD\3"+
		"\2\2\2\fU\3\2\2\2\16g\3\2\2\2\20y\3\2\2\2\22\u0088\3\2\2\2\24\u008d\3"+
		"\2\2\2\26\u0091\3\2\2\2\30\u0096\3\2\2\2\32\u009c\3\2\2\2\34\35\5\4\3"+
		"\2\35\36\7\2\2\3\36\3\3\2\2\2\37$\5\24\13\2 #\7\32\2\2!#\5\6\4\2\" \3"+
		"\2\2\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2"+
		"\'(\5\26\f\2(\5\3\2\2\2)+\5\b\5\2*,\7\32\2\2+*\3\2\2\2+,\3\2\2\2,\64\3"+
		"\2\2\2-\63\5\n\6\2.\63\5\f\7\2/\63\5\16\b\2\60\63\5\20\t\2\61\63\7\32"+
		"\2\2\62-\3\2\2\2\62.\3\2\2\2\62/\3\2\2\2\62\60\3\2\2\2\62\61\3\2\2\2\63"+
		"\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\679"+
		"\7\32\2\28\67\3\2\2\289\3\2\2\29:\3\2\2\2:;\5\22\n\2;\7\3\2\2\2<=\7\24"+
		"\2\2=>\7\f\2\2>@\5\30\r\2?A\5\32\16\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC"+
		"\7\25\2\2C\t\3\2\2\2DE\7\24\2\2EF\7\13\2\2FG\7\4\2\2GH\7\22\2\2HI\7\23"+
		"\2\2IJ\7\16\2\2JK\7\26\2\2KL\7\n\2\2LM\7\25\2\2MN\7\6\2\2NO\7\27\2\2O"+
		"P\7\20\2\2PQ\7\24\2\2QR\7\27\2\2RS\7\13\2\2ST\7\25\2\2T\13\3\2\2\2UV\7"+
		"\24\2\2VW\7\13\2\2WX\7\4\2\2XY\7\22\2\2YZ\7\23\2\2Z[\7\16\2\2[\\\7\26"+
		"\2\2\\]\7\b\2\2]^\7\25\2\2^_\7\30\2\2_`\7\7\2\2`a\7\27\2\2ab\7\20\2\2"+
		"bc\7\24\2\2cd\7\27\2\2de\7\13\2\2ef\7\25\2\2f\r\3\2\2\2gh\7\24\2\2hi\7"+
		"\13\2\2ij\7\4\2\2jk\7\22\2\2kl\7\23\2\2lm\7\16\2\2mn\7\26\2\2no\7\t\2"+
		"\2op\7\25\2\2pq\7\30\2\2qr\7\3\2\2rs\7\27\2\2st\7\20\2\2tu\7\24\2\2uv"+
		"\7\27\2\2vw\7\13\2\2wx\7\25\2\2x\17\3\2\2\2yz\7\24\2\2z{\7\13\2\2{|\7"+
		"\4\2\2|}\7\22\2\2}~\7\23\2\2~\177\7\16\2\2\177\u0080\7\26\2\2\u0080\u0081"+
		"\7\20\2\2\u0081\u0082\7\25\2\2\u0082\u0083\7\20\2\2\u0083\u0084\7\24\2"+
		"\2\u0084\u0085\7\27\2\2\u0085\u0086\7\13\2\2\u0086\u0087\7\25\2\2\u0087"+
		"\21\3\2\2\2\u0088\u0089\7\24\2\2\u0089\u008a\7\27\2\2\u008a\u008b\7\f"+
		"\2\2\u008b\u008c\7\25\2\2\u008c\23\3\2\2\2\u008d\u008e\7\24\2\2\u008e"+
		"\u008f\7\5\2\2\u008f\u0090\7\25\2\2\u0090\25\3\2\2\2\u0091\u0092\7\24"+
		"\2\2\u0092\u0093\7\27\2\2\u0093\u0094\7\5\2\2\u0094\u0095\7\25\2\2\u0095"+
		"\27\3\2\2\2\u0096\u0097\7\4\2\2\u0097\u0098\7\22\2\2\u0098\u0099\7\23"+
		"\2\2\u0099\u009a\7\21\2\2\u009a\u009b\7\23\2\2\u009b\31\3\2\2\2\u009c"+
		"\u009d\7\r\2\2\u009d\u009e\7\22\2\2\u009e\u009f\7\23\2\2\u009f\u00a0\7"+
		"\21\2\2\u00a0\u00a1\7\23\2\2\u00a1\33\3\2\2\2\t\"$+\62\648@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}