// Generated from c:\Users\adm\Documents\TC\Proyectos\Compilador2021\Compilador2021\src\main\java\Compilador2021\id.g4 by ANTLR 4.8

    package Compilador2021;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class idLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, ENTERO=2, WS=3, OTRO=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "ID", "ENTERO", "WS", "OTRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ID", "ENTERO", "WS", "OTRO"
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


	public idLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "id.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\6*\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\4\3\4\5\4\26"+
		"\n\4\3\4\3\4\3\4\7\4\33\n\4\f\4\16\4\36\13\4\3\5\6\5!\n\5\r\5\16\5\"\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\2\2\b\3\2\5\2\7\3\t\4\13\5\r\6\3\2\5\4\2C\\c|\3"+
		"\2\62;\4\2\13\f\"\"\2,\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\3\17\3\2\2\2\5\21\3\2\2\2\7\25\3\2\2\2\t \3\2\2\2\13$\3\2\2\2\r(\3"+
		"\2\2\2\17\20\t\2\2\2\20\4\3\2\2\2\21\22\t\3\2\2\22\6\3\2\2\2\23\26\5\3"+
		"\2\2\24\26\7a\2\2\25\23\3\2\2\2\25\24\3\2\2\2\26\34\3\2\2\2\27\33\5\3"+
		"\2\2\30\33\5\5\3\2\31\33\7a\2\2\32\27\3\2\2\2\32\30\3\2\2\2\32\31\3\2"+
		"\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\b\3\2\2\2\36\34\3\2"+
		"\2\2\37!\5\5\3\2 \37\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\n\3\2\2"+
		"\2$%\t\4\2\2%&\3\2\2\2&\'\b\6\2\2\'\f\3\2\2\2()\13\2\2\2)\16\3\2\2\2\7"+
		"\2\25\32\34\"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}