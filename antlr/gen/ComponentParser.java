// Generated from C:/Users/Lenovo/IdeaProjects/untitled6/src/Antlr/ComponentParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ComponentParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, FROM=2, EXPORT=3, AT_COMPONENT=4, SELECTOR_KEYWORD=5, STANDALONE=6, 
		IMPORTS=7, TEMPLATE=8, CLASS=9, STYLES=10, FUNCTION=11, STRING_TYPE=12, 
		NUMBER_TYPE=13, ANY_TYPE=14, BOOLEAN_LITERAL=15, NUMBER_LITERAL=16, STRING_LITERAL=17, 
		COMMA=18, COLON=19, DOT=20, SEMICOLON=21, EQUAL=22, THIS=23, LEFT_CURLY=24, 
		RIGHT_CURLY=25, LEFT_PAREN=26, RIGHT_PAREN=27, LEFT_BRACKET=28, RIGHT_BRACKET=29, 
		LESS_THAN=30, GREAND_THAN=31, WS=32, IDENTIFIER=33, HHTML_COMMENT=34, 
		SPACE=35, SRC_ATTRIBUTE=36, HTML_TAG_OPEN_DIV=37, HTML_TAG_CLOSE_DIV=38, 
		HTML_TAG_OPEN_H2=39, HTML_TAG_CLOSE_H2=40, HTML_TAG_OPEN_IMG=41, HTML_TAG_CLOSE_IMG=42, 
		HTML_TAG_OPEN_P=43, HTML_TAG_CLOSE_P=44, HTML_TAG_OPEN_BUTTON=45, HTML_TAG_CLOSE_BUTTON=46, 
		HTML_TAG_OPEN_SPAN=47, HTML_TAG_CLOSE_SPAN=48, CUSTOM_DIRECTIVE=49, EVENT_BINDING=50, 
		ALT_ATTRIBUTE=51, HTML_TAG_OPEN=52, HTML_TAG_CLOSE=53, HTML_SELF_CLOSING_TAG=54, 
		DYNAMIC_CONTENT=55, PLUS=56, MINUS=57, MULTIPLY=58, DIV=59, MODULUS=60, 
		ATTRIBUTE_NAME=61, ATTRIBUTE_VALUE=62, STYLE_ATTRIBUTE=63, HTML_ATTRIBUTE=64, 
		BACKTICK=65, DYNAMIC_ATTRIBUTE=66, BACKTICK_STRING=67, PLUS_ASSIGN=68, 
		MINUS_ASSIGN=69, HTML_TAG_SELF_CLOSING=70;
	public static final int
		RULE_component = 0, RULE_importStatements = 1, RULE_importStatement = 2, 
		RULE_componentConfig = 3, RULE_classDeclaration = 4, RULE_classBody = 5, 
		RULE_assignment = 6, RULE_expression = 7, RULE_primaryExpression = 8, 
		RULE_arrayAccess = 9, RULE_literal = 10, RULE_fieldDeclaration = 11, RULE_variableDeclaration = 12, 
		RULE_methodDeclaration = 13, RULE_parameterList = 14, RULE_parameter = 15, 
		RULE_type = 16, RULE_block = 17, RULE_value = 18, RULE_parameters = 19, 
		RULE_variableName = 20, RULE_methodName = 21, RULE_className = 22, RULE_array = 23, 
		RULE_jsonObject = 24, RULE_pair = 25, RULE_statement = 26, RULE_thisAccess = 27, 
		RULE_componentHTMLContent = 28, RULE_htmlElement = 29, RULE_openTagElement = 30, 
		RULE_divElement = 31, RULE_h2Element = 32, RULE_imgElement = 33, RULE_pElement = 34, 
		RULE_genericElement = 35, RULE_buttonElement = 36, RULE_spanElement = 37, 
		RULE_dynamicAttribute = 38, RULE_htmlAttribute = 39, RULE_dynamicContent = 40, 
		RULE_htmlContent = 41, RULE_htmlAttributes = 42, RULE_customDirective = 43, 
		RULE_eventBinding = 44;
	private static String[] makeRuleNames() {
		return new String[] {
			"component", "importStatements", "importStatement", "componentConfig", 
			"classDeclaration", "classBody", "assignment", "expression", "primaryExpression", 
			"arrayAccess", "literal", "fieldDeclaration", "variableDeclaration", 
			"methodDeclaration", "parameterList", "parameter", "type", "block", "value", 
			"parameters", "variableName", "methodName", "className", "array", "jsonObject", 
			"pair", "statement", "thisAccess", "componentHTMLContent", "htmlElement", 
			"openTagElement", "divElement", "h2Element", "imgElement", "pElement", 
			"genericElement", "buttonElement", "spanElement", "dynamicAttribute", 
			"htmlAttribute", "dynamicContent", "htmlContent", "htmlAttributes", "customDirective", 
			"eventBinding"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'from'", "'export'", "'@Component'", "'selector'", 
			"'standalone'", "'imports'", "'template'", "'class'", "'styles'", "'function'", 
			"'string'", "'number'", "'any'", null, null, null, "','", "':'", "'.'", 
			"';'", "'='", "'this'", "'{'", "'}'", "'('", "')'", "'['", "']'", "'<'", 
			"'>'", null, null, null, null, null, null, "'</div>'", "'<h2>'", "'</h2>'", 
			"'<img'", "'/>'", "'<p>'", "'</p>'", null, "'</button>'", null, "'</span>'", 
			null, null, null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", 
			"'%'", null, null, null, null, "'`'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "FROM", "EXPORT", "AT_COMPONENT", "SELECTOR_KEYWORD", 
			"STANDALONE", "IMPORTS", "TEMPLATE", "CLASS", "STYLES", "FUNCTION", "STRING_TYPE", 
			"NUMBER_TYPE", "ANY_TYPE", "BOOLEAN_LITERAL", "NUMBER_LITERAL", "STRING_LITERAL", 
			"COMMA", "COLON", "DOT", "SEMICOLON", "EQUAL", "THIS", "LEFT_CURLY", 
			"RIGHT_CURLY", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACKET", "RIGHT_BRACKET", 
			"LESS_THAN", "GREAND_THAN", "WS", "IDENTIFIER", "HHTML_COMMENT", "SPACE", 
			"SRC_ATTRIBUTE", "HTML_TAG_OPEN_DIV", "HTML_TAG_CLOSE_DIV", "HTML_TAG_OPEN_H2", 
			"HTML_TAG_CLOSE_H2", "HTML_TAG_OPEN_IMG", "HTML_TAG_CLOSE_IMG", "HTML_TAG_OPEN_P", 
			"HTML_TAG_CLOSE_P", "HTML_TAG_OPEN_BUTTON", "HTML_TAG_CLOSE_BUTTON", 
			"HTML_TAG_OPEN_SPAN", "HTML_TAG_CLOSE_SPAN", "CUSTOM_DIRECTIVE", "EVENT_BINDING", 
			"ALT_ATTRIBUTE", "HTML_TAG_OPEN", "HTML_TAG_CLOSE", "HTML_SELF_CLOSING_TAG", 
			"DYNAMIC_CONTENT", "PLUS", "MINUS", "MULTIPLY", "DIV", "MODULUS", "ATTRIBUTE_NAME", 
			"ATTRIBUTE_VALUE", "STYLE_ATTRIBUTE", "HTML_ATTRIBUTE", "BACKTICK", "DYNAMIC_ATTRIBUTE", 
			"BACKTICK_STRING", "PLUS_ASSIGN", "MINUS_ASSIGN", "HTML_TAG_SELF_CLOSING"
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
	public String getGrammarFileName() { return "ComponentParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ComponentParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentContext extends ParserRuleContext {
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
	 
		public ComponentContext() { }
		public void copyFrom(ComponentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDefinitionContext extends ComponentContext {
		public TerminalNode AT_COMPONENT() { return getToken(ComponentParser.AT_COMPONENT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(ComponentParser.LEFT_PAREN, 0); }
		public ComponentConfigContext componentConfig() {
			return getRuleContext(ComponentConfigContext.class,0);
		}
		public ImportStatementsContext importStatements() {
			return getRuleContext(ImportStatementsContext.class,0);
		}
		public ComponentDefinitionContext(ComponentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterComponentDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitComponentDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitComponentDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_component);
		int _la;
		try {
			_localctx = new ComponentDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPORT) {
				{
				setState(90);
				importStatements();
				}
			}

			setState(93);
			match(AT_COMPONENT);
			setState(94);
			match(LEFT_PAREN);
			setState(95);
			componentConfig();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementsContext extends ParserRuleContext {
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(ComponentParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ComponentParser.SEMICOLON, i);
		}
		public ImportStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterImportStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitImportStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitImportStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementsContext importStatements() throws RecognitionException {
		ImportStatementsContext _localctx = new ImportStatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97);
				importStatement();
				setState(98);
				match(SEMICOLON);
				}
				}
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IMPORT );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ComponentParser.IMPORT, 0); }
		public TerminalNode LEFT_CURLY() { return getToken(ComponentParser.LEFT_CURLY, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ComponentParser.IDENTIFIER, 0); }
		public TerminalNode RIGHT_CURLY() { return getToken(ComponentParser.RIGHT_CURLY, 0); }
		public TerminalNode FROM() { return getToken(ComponentParser.FROM, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ComponentParser.STRING_LITERAL, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(IMPORT);
			setState(105);
			match(LEFT_CURLY);
			setState(106);
			match(IDENTIFIER);
			setState(107);
			match(RIGHT_CURLY);
			setState(108);
			match(FROM);
			setState(109);
			match(STRING_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentConfigContext extends ParserRuleContext {
		public ComponentConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentConfig; }
	 
		public ComponentConfigContext() { }
		public void copyFrom(ComponentConfigContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentConfiggContext extends ComponentConfigContext {
		public TerminalNode LEFT_CURLY() { return getToken(ComponentParser.LEFT_CURLY, 0); }
		public TerminalNode SELECTOR_KEYWORD() { return getToken(ComponentParser.SELECTOR_KEYWORD, 0); }
		public List<TerminalNode> COLON() { return getTokens(ComponentParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ComponentParser.COLON, i);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(ComponentParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(ComponentParser.STRING_LITERAL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ComponentParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ComponentParser.COMMA, i);
		}
		public TerminalNode STANDALONE() { return getToken(ComponentParser.STANDALONE, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(ComponentParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode IMPORTS() { return getToken(ComponentParser.IMPORTS, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(ComponentParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(ComponentParser.RIGHT_BRACKET, 0); }
		public TerminalNode TEMPLATE() { return getToken(ComponentParser.TEMPLATE, 0); }
		public List<TerminalNode> BACKTICK() { return getTokens(ComponentParser.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(ComponentParser.BACKTICK, i);
		}
		public TerminalNode RIGHT_CURLY() { return getToken(ComponentParser.RIGHT_CURLY, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(ComponentParser.RIGHT_PAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ComponentParser.IDENTIFIER, 0); }
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public ComponentConfiggContext(ComponentConfigContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterComponentConfigg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitComponentConfigg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitComponentConfigg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentConfigContext componentConfig() throws RecognitionException {
		ComponentConfigContext _localctx = new ComponentConfigContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_componentConfig);
		int _la;
		try {
			_localctx = new ComponentConfiggContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(LEFT_CURLY);
			setState(112);
			match(SELECTOR_KEYWORD);
			setState(113);
			match(COLON);
			setState(114);
			match(STRING_LITERAL);
			setState(115);
			match(COMMA);
			setState(116);
			match(STANDALONE);
			setState(117);
			match(COLON);
			setState(118);
			match(BOOLEAN_LITERAL);
			setState(119);
			match(COMMA);
			setState(120);
			match(IMPORTS);
			setState(121);
			match(COLON);
			setState(122);
			match(LEFT_BRACKET);
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				{
				setState(123);
				match(STRING_LITERAL);
				}
				break;
			case IDENTIFIER:
				{
				setState(124);
				match(IDENTIFIER);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(125);
					match(COMMA);
					setState(126);
					match(STRING_LITERAL);
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RIGHT_BRACKET:
				break;
			default:
				break;
			}
			setState(134);
			match(RIGHT_BRACKET);
			setState(135);
			match(COMMA);
			setState(136);
			match(TEMPLATE);
			setState(137);
			match(COLON);
			setState(138);
			match(BACKTICK);
			setState(140); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(139);
				htmlElement();
				}
				}
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 8590230869L) != 0) );
			setState(144);
			match(BACKTICK);
			setState(145);
			match(COMMA);
			setState(146);
			match(RIGHT_CURLY);
			setState(147);
			match(RIGHT_PAREN);
			setState(149); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(148);
				classDeclaration();
				}
				}
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==EXPORT );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
	 
		public ClassDeclarationContext() { }
		public void copyFrom(ClassDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclContext extends ClassDeclarationContext {
		public TerminalNode EXPORT() { return getToken(ComponentParser.EXPORT, 0); }
		public TerminalNode CLASS() { return getToken(ComponentParser.CLASS, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode LEFT_CURLY() { return getToken(ComponentParser.LEFT_CURLY, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode RIGHT_CURLY() { return getToken(ComponentParser.RIGHT_CURLY, 0); }
		public ClassDeclContext(ClassDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitClassDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitClassDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classDeclaration);
		try {
			_localctx = new ClassDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(EXPORT);
			setState(154);
			match(CLASS);
			setState(155);
			className();
			setState(156);
			match(LEFT_CURLY);
			setState(157);
			classBody();
			setState(158);
			match(RIGHT_CURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
	 
		public ClassBodyContext() { }
		public void copyFrom(ClassBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyyContext extends ClassBodyContext {
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public ClassBodyyContext(ClassBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterClassBodyy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitClassBodyy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitClassBodyy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classBody);
		int _la;
		try {
			_localctx = new ClassBodyyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==THIS || _la==IDENTIFIER) {
				{
				setState(163);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(160);
					fieldDeclaration();
					}
					break;
				case 2:
					{
					setState(161);
					methodDeclaration();
					}
					break;
				case 3:
					{
					setState(162);
					assignment();
					}
					break;
				}
				}
				setState(167);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisAssignmentContext extends AssignmentContext {
		public TerminalNode THIS() { return getToken(ComponentParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(ComponentParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ComponentParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(ComponentParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ComponentParser.SEMICOLON, 0); }
		public ThisAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterThisAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitThisAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitThisAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarAssignmentContext extends AssignmentContext {
		public TerminalNode IDENTIFIER() { return getToken(ComponentParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(ComponentParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ComponentParser.SEMICOLON, 0); }
		public VarAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterVarAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitVarAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitVarAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				_localctx = new ThisAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(THIS);
				setState(169);
				match(DOT);
				setState(170);
				match(IDENTIFIER);
				setState(171);
				match(EQUAL);
				setState(172);
				expression();
				setState(173);
				match(SEMICOLON);
				}
				break;
			case IDENTIFIER:
				_localctx = new VarAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(IDENTIFIER);
				setState(176);
				match(EQUAL);
				setState(177);
				expression();
				setState(178);
				match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExprContext extends ExpressionContext {
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(ComponentParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ComponentParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(ComponentParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(ComponentParser.MINUS, i);
		}
		public BinaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitBinaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		int _la;
		try {
			_localctx = new BinaryExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			primaryExpression();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(183);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(184);
				primaryExpression();
				}
				}
				setState(189);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExprContext extends PrimaryExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(ComponentParser.IDENTIFIER, 0); }
		public IdentifierExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterIdentifierExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitIdentifierExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitIdentifierExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessExprContext extends PrimaryExpressionContext {
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public ArrayAccessExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterArrayAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitArrayAccessExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitArrayAccessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExprContext extends PrimaryExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExprContext extends PrimaryExpressionContext {
		public TerminalNode LEFT_PAREN() { return getToken(ComponentParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(ComponentParser.RIGHT_PAREN, 0); }
		public ParenExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_primaryExpression);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new IdentifierExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new LiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				literal();
				}
				break;
			case 3:
				_localctx = new ArrayAccessExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				arrayAccess();
				}
				break;
			case 4:
				_localctx = new ParenExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				match(LEFT_PAREN);
				setState(194);
				expression();
				setState(195);
				match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessContext extends ParserRuleContext {
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
	 
		public ArrayAccessContext() { }
		public void copyFrom(ArrayAccessContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccesssContext extends ArrayAccessContext {
		public TerminalNode IDENTIFIER() { return getToken(ComponentParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(ComponentParser.LEFT_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(ComponentParser.RIGHT_BRACKET, 0); }
		public ArrayAccesssContext(ArrayAccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterArrayAccesss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitArrayAccesss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitArrayAccesss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arrayAccess);
		try {
			_localctx = new ArrayAccesssContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(IDENTIFIER);
			setState(200);
			match(LEFT_BRACKET);
			setState(201);
			expression();
			setState(202);
			match(RIGHT_BRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends LiteralContext {
		public TerminalNode STRING_LITERAL() { return getToken(ComponentParser.STRING_LITERAL, 0); }
		public StringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralContext extends LiteralContext {
		public TerminalNode BOOLEAN_LITERAL() { return getToken(ComponentParser.BOOLEAN_LITERAL, 0); }
		public BooleanLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberLiteralContext extends LiteralContext {
		public TerminalNode NUMBER_LITERAL() { return getToken(ComponentParser.NUMBER_LITERAL, 0); }
		public NumberLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_literal);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(STRING_LITERAL);
				}
				break;
			case NUMBER_LITERAL:
				_localctx = new NumberLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(NUMBER_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				match(BOOLEAN_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FieldDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
	 
		public FieldDeclarationContext() { }
		public void copyFrom(FieldDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FieldDeclContext extends FieldDeclarationContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(ComponentParser.EQUAL, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ComponentParser.SEMICOLON, 0); }
		public FieldDeclContext(FieldDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitFieldDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitFieldDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fieldDeclaration);
		try {
			_localctx = new FieldDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			variableName();
			setState(210);
			match(EQUAL);
			setState(211);
			array();
			setState(212);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	 
		public VariableDeclarationContext() { }
		public void copyFrom(VariableDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends VariableDeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(ComponentParser.EQUAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ComponentParser.SEMICOLON, 0); }
		public VarDeclContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDeclaration);
		try {
			_localctx = new VarDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			type();
			setState(215);
			variableName();
			setState(216);
			match(EQUAL);
			setState(217);
			value();
			setState(218);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
	 
		public MethodDeclarationContext() { }
		public void copyFrom(MethodDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclContext extends MethodDeclarationContext {
		public TerminalNode IDENTIFIER() { return getToken(ComponentParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(ComponentParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(ComponentParser.RIGHT_PAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public MethodDeclContext(MethodDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_methodDeclaration);
		int _la;
		try {
			_localctx = new MethodDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(IDENTIFIER);
			setState(221);
			match(LEFT_PAREN);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(222);
				parameterList();
				}
			}

			setState(225);
			match(RIGHT_PAREN);
			setState(226);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ComponentParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ComponentParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			parameter();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(229);
				match(COMMA);
				setState(230);
				parameter();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ComponentParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(ComponentParser.COLON, 0); }
		public TerminalNode ANY_TYPE() { return getToken(ComponentParser.ANY_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(ComponentParser.STRING_TYPE, 0); }
		public TerminalNode NUMBER_TYPE() { return getToken(ComponentParser.NUMBER_TYPE, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parameter);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(IDENTIFIER);
				setState(237);
				match(COLON);
				setState(238);
				match(ANY_TYPE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(IDENTIFIER);
				setState(240);
				match(COLON);
				setState(241);
				match(STRING_TYPE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				match(IDENTIFIER);
				setState(243);
				match(COLON);
				setState(244);
				match(NUMBER_TYPE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ANY_TYPE() { return getToken(ComponentParser.ANY_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(ComponentParser.STRING_TYPE, 0); }
		public TerminalNode NUMBER_TYPE() { return getToken(ComponentParser.NUMBER_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28672L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LEFT_CURLY() { return getToken(ComponentParser.LEFT_CURLY, 0); }
		public TerminalNode RIGHT_CURLY() { return getToken(ComponentParser.RIGHT_CURLY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(LEFT_CURLY);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & 4503599627632903L) != 0)) {
				{
				{
				setState(250);
				statement();
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
			match(RIGHT_CURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(ComponentParser.STRING_LITERAL, 0); }
		public TerminalNode BACKTICK_STRING() { return getToken(ComponentParser.BACKTICK_STRING, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(ComponentParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode NUMBER_LITERAL() { return getToken(ComponentParser.NUMBER_LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ComponentParser.IDENTIFIER, 0); }
		public ThisAccessContext thisAccess() {
			return getRuleContext(ThisAccessContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_value);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(STRING_LITERAL);
				}
				break;
			case BACKTICK_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(BACKTICK_STRING);
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				match(BOOLEAN_LITERAL);
				}
				break;
			case NUMBER_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
				match(NUMBER_LITERAL);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(262);
				match(IDENTIFIER);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 6);
				{
				setState(263);
				thisAccess();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ComponentParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ComponentParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28672L) != 0)) {
				{
				setState(266);
				type();
				setState(267);
				variableName();
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(268);
					match(COMMA);
					setState(269);
					type();
					setState(270);
					variableName();
					}
					}
					setState(276);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ComponentParser.IDENTIFIER, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ComponentParser.IDENTIFIER, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ComponentParser.IDENTIFIER, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(ComponentParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(ComponentParser.RIGHT_BRACKET, 0); }
		public List<JsonObjectContext> jsonObject() {
			return getRuleContexts(JsonObjectContext.class);
		}
		public JsonObjectContext jsonObject(int i) {
			return getRuleContext(JsonObjectContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ComponentParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ComponentParser.COMMA, i);
		}
		public ThisAccessContext thisAccess() {
			return getRuleContext(ThisAccessContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_array);
		int _la;
		try {
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				match(LEFT_BRACKET);
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_CURLY) {
					{
					setState(286);
					jsonObject();
					setState(291);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(287);
						match(COMMA);
						setState(288);
						jsonObject();
						}
						}
						setState(293);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(296);
				match(RIGHT_BRACKET);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				thisAccess();
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsonObjectContext extends ParserRuleContext {
		public TerminalNode LEFT_CURLY() { return getToken(ComponentParser.LEFT_CURLY, 0); }
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public TerminalNode RIGHT_CURLY() { return getToken(ComponentParser.RIGHT_CURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ComponentParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ComponentParser.COMMA, i);
		}
		public JsonObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterJsonObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitJsonObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitJsonObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonObjectContext jsonObject() throws RecognitionException {
		JsonObjectContext _localctx = new JsonObjectContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_jsonObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(LEFT_CURLY);
			setState(301);
			pair();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(302);
				match(COMMA);
				setState(303);
				pair();
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
			match(RIGHT_CURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PairContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ComponentParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode STRING_LITERAL(int i) { return getToken(ComponentParser.STRING_LITERAL, 0); }
		public TerminalNode IDENTIFIER(int i) { return getToken(ComponentParser.IDENTIFIER, 0); }
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_pair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_la = _input.LA(1);
			if ( !(_la==STRING_LITERAL || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(312);
			match(COLON);
			setState(313);
			value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ComponentParser.SEMICOLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ComponentParser.IDENTIFIER, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_statement);
		try {
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				assignment();
				setState(316);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(318);
					value();
					}
					break;
				case 2:
					{
					setState(319);
					match(IDENTIFIER);
					}
					break;
				}
				setState(322);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				assignment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ThisAccessContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(ComponentParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(ComponentParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ComponentParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(ComponentParser.LEFT_BRACKET, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(ComponentParser.RIGHT_BRACKET, 0); }
		public List<TerminalNode> PLUS() { return getTokens(ComponentParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ComponentParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(ComponentParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(ComponentParser.MINUS, i);
		}
		public TerminalNode PLUS_ASSIGN() { return getToken(ComponentParser.PLUS_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MINUS_ASSIGN() { return getToken(ComponentParser.MINUS_ASSIGN, 0); }
		public TerminalNode EQUAL() { return getToken(ComponentParser.EQUAL, 0); }
		public ThisAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterThisAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitThisAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitThisAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisAccessContext thisAccess() throws RecognitionException {
		ThisAccessContext _localctx = new ThisAccessContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_thisAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(THIS);
			setState(327);
			match(DOT);
			setState(328);
			match(IDENTIFIER);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_BRACKET) {
				{
				setState(329);
				match(LEFT_BRACKET);
				setState(330);
				value();
				setState(331);
				match(RIGHT_BRACKET);
				}
			}

			setState(345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				{
				setState(335);
				match(PLUS);
				setState(336);
				match(PLUS);
				}
				break;
			case MINUS:
				{
				setState(337);
				match(MINUS);
				setState(338);
				match(MINUS);
				}
				break;
			case PLUS_ASSIGN:
				{
				setState(339);
				match(PLUS_ASSIGN);
				setState(340);
				expression();
				}
				break;
			case MINUS_ASSIGN:
				{
				setState(341);
				match(MINUS_ASSIGN);
				setState(342);
				expression();
				}
				break;
			case EQUAL:
				{
				setState(343);
				match(EQUAL);
				setState(344);
				expression();
				}
				break;
			case COMMA:
			case SEMICOLON:
			case RIGHT_CURLY:
			case RIGHT_BRACKET:
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentHTMLContentContext extends ParserRuleContext {
		public ComponentHTMLContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentHTMLContent; }
	 
		public ComponentHTMLContentContext() { }
		public void copyFrom(ComponentHTMLContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentHTMLGroupContext extends ComponentHTMLContentContext {
		public HtmlElementContext htmlElement;
		public List<HtmlElementContext> elements = new ArrayList<HtmlElementContext>();
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public ComponentHTMLGroupContext(ComponentHTMLContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterComponentHTMLGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitComponentHTMLGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitComponentHTMLGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentHTMLContentContext componentHTMLContent() throws RecognitionException {
		ComponentHTMLContentContext _localctx = new ComponentHTMLContentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_componentHTMLContent);
		int _la;
		try {
			_localctx = new ComponentHTMLGroupContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(348); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(347);
				((ComponentHTMLGroupContext)_localctx).htmlElement = htmlElement();
				((ComponentHTMLGroupContext)_localctx).elements.add(((ComponentHTMLGroupContext)_localctx).htmlElement);
				}
				}
				setState(350); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 8590230869L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
	 
		public HtmlElementContext() { }
		public void copyFrom(HtmlElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivContext extends HtmlElementContext {
		public DivElementContext divElement() {
			return getRuleContext(DivElementContext.class,0);
		}
		public DivContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PContext extends HtmlElementContext {
		public PElementContext pElement() {
			return getRuleContext(PElementContext.class,0);
		}
		public PContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitP(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImgContext extends HtmlElementContext {
		public ImgElementContext imgElement() {
			return getRuleContext(ImgElementContext.class,0);
		}
		public ImgContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterImg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitImg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitImg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ButtonContext extends HtmlElementContext {
		public ButtonElementContext buttonElement() {
			return getRuleContext(ButtonElementContext.class,0);
		}
		public ButtonContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterButton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitButton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitButton(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GenericContext extends HtmlElementContext {
		public GenericElementContext genericElement() {
			return getRuleContext(GenericElementContext.class,0);
		}
		public GenericContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterGeneric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitGeneric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitGeneric(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class H2Context extends HtmlElementContext {
		public H2ElementContext h2Element() {
			return getRuleContext(H2ElementContext.class,0);
		}
		public H2Context(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterH2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitH2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitH2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DynamicHtmlContentContext extends HtmlElementContext {
		public TerminalNode DYNAMIC_CONTENT() { return getToken(ComponentParser.DYNAMIC_CONTENT, 0); }
		public DynamicHtmlContentContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterDynamicHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitDynamicHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitDynamicHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpenTagContext extends HtmlElementContext {
		public OpenTagElementContext openTagElement() {
			return getRuleContext(OpenTagElementContext.class,0);
		}
		public OpenTagContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterOpenTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitOpenTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitOpenTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingTagContext extends HtmlElementContext {
		public TerminalNode HTML_TAG_SELF_CLOSING() { return getToken(ComponentParser.HTML_TAG_SELF_CLOSING, 0); }
		public SelfClosingTagContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterSelfClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitSelfClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitSelfClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SpanContext extends HtmlElementContext {
		public SpanElementContext spanElement() {
			return getRuleContext(SpanElementContext.class,0);
		}
		public SpanContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterSpan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitSpan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitSpan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_htmlElement);
		try {
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new OpenTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				openTagElement();
				}
				break;
			case 2:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				divElement();
				}
				break;
			case 3:
				_localctx = new H2Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(354);
				h2Element();
				}
				break;
			case 4:
				_localctx = new ImgContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(355);
				imgElement();
				}
				break;
			case 5:
				_localctx = new PContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(356);
				pElement();
				}
				break;
			case 6:
				_localctx = new GenericContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(357);
				genericElement();
				}
				break;
			case 7:
				_localctx = new SelfClosingTagContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(358);
				match(HTML_TAG_SELF_CLOSING);
				}
				break;
			case 8:
				_localctx = new DynamicHtmlContentContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(359);
				match(DYNAMIC_CONTENT);
				}
				break;
			case 9:
				_localctx = new ButtonContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(360);
				buttonElement();
				}
				break;
			case 10:
				_localctx = new SpanContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(361);
				spanElement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpenTagElementContext extends ParserRuleContext {
		public TerminalNode HTML_TAG_OPEN() { return getToken(ComponentParser.HTML_TAG_OPEN, 0); }
		public TerminalNode HTML_TAG_CLOSE() { return getToken(ComponentParser.HTML_TAG_CLOSE, 0); }
		public ComponentHTMLContentContext componentHTMLContent() {
			return getRuleContext(ComponentHTMLContentContext.class,0);
		}
		public OpenTagElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openTagElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterOpenTagElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitOpenTagElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitOpenTagElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenTagElementContext openTagElement() throws RecognitionException {
		OpenTagElementContext _localctx = new OpenTagElementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_openTagElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(HTML_TAG_OPEN);
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 8590230869L) != 0)) {
				{
				setState(365);
				componentHTMLContent();
				}
			}

			setState(368);
			match(HTML_TAG_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DivElementContext extends ParserRuleContext {
		public TerminalNode HTML_TAG_OPEN_DIV() { return getToken(ComponentParser.HTML_TAG_OPEN_DIV, 0); }
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TerminalNode HTML_TAG_CLOSE_DIV() { return getToken(ComponentParser.HTML_TAG_CLOSE_DIV, 0); }
		public List<HtmlAttributesContext> htmlAttributes() {
			return getRuleContexts(HtmlAttributesContext.class);
		}
		public HtmlAttributesContext htmlAttributes(int i) {
			return getRuleContext(HtmlAttributesContext.class,i);
		}
		public DivElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterDivElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitDivElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitDivElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivElementContext divElement() throws RecognitionException {
		DivElementContext _localctx = new DivElementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_divElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(HTML_TAG_OPEN_DIV);
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & 1103840150529L) != 0)) {
				{
				{
				setState(371);
				htmlAttributes();
				}
				}
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(377);
			htmlContent();
			setState(378);
			match(HTML_TAG_CLOSE_DIV);
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

	@SuppressWarnings("CheckReturnValue")
	public static class H2ElementContext extends ParserRuleContext {
		public TerminalNode HTML_TAG_OPEN_H2() { return getToken(ComponentParser.HTML_TAG_OPEN_H2, 0); }
		public DynamicContentContext dynamicContent() {
			return getRuleContext(DynamicContentContext.class,0);
		}
		public TerminalNode HTML_TAG_CLOSE_H2() { return getToken(ComponentParser.HTML_TAG_CLOSE_H2, 0); }
		public H2ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h2Element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterH2Element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitH2Element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitH2Element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final H2ElementContext h2Element() throws RecognitionException {
		H2ElementContext _localctx = new H2ElementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_h2Element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(HTML_TAG_OPEN_H2);
			setState(381);
			dynamicContent();
			setState(382);
			match(HTML_TAG_CLOSE_H2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImgElementContext extends ParserRuleContext {
		public TerminalNode HTML_TAG_OPEN_IMG() { return getToken(ComponentParser.HTML_TAG_OPEN_IMG, 0); }
		public TerminalNode HTML_TAG_CLOSE_IMG() { return getToken(ComponentParser.HTML_TAG_CLOSE_IMG, 0); }
		public List<HtmlAttributesContext> htmlAttributes() {
			return getRuleContexts(HtmlAttributesContext.class);
		}
		public HtmlAttributesContext htmlAttributes(int i) {
			return getRuleContext(HtmlAttributesContext.class,i);
		}
		public List<DynamicAttributeContext> dynamicAttribute() {
			return getRuleContexts(DynamicAttributeContext.class);
		}
		public DynamicAttributeContext dynamicAttribute(int i) {
			return getRuleContext(DynamicAttributeContext.class,i);
		}
		public ImgElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imgElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterImgElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitImgElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitImgElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImgElementContext imgElement() throws RecognitionException {
		ImgElementContext _localctx = new ImgElementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_imgElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(HTML_TAG_OPEN_IMG);
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & 1103840150533L) != 0)) {
				{
				setState(387);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LEFT_PAREN:
				case SRC_ATTRIBUTE:
				case ALT_ATTRIBUTE:
				case MULTIPLY:
				case DYNAMIC_ATTRIBUTE:
					{
					setState(385);
					htmlAttributes();
					}
					break;
				case LEFT_BRACKET:
					{
					setState(386);
					dynamicAttribute();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(392);
			match(HTML_TAG_CLOSE_IMG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PElementContext extends ParserRuleContext {
		public TerminalNode HTML_TAG_OPEN_P() { return getToken(ComponentParser.HTML_TAG_OPEN_P, 0); }
		public TerminalNode HTML_TAG_CLOSE_P() { return getToken(ComponentParser.HTML_TAG_CLOSE_P, 0); }
		public List<TerminalNode> DYNAMIC_CONTENT() { return getTokens(ComponentParser.DYNAMIC_CONTENT); }
		public TerminalNode DYNAMIC_CONTENT(int i) {
			return getToken(ComponentParser.DYNAMIC_CONTENT, i);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(ComponentParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(ComponentParser.STRING_LITERAL, i);
		}
		public PElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterPElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitPElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitPElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PElementContext pElement() throws RecognitionException {
		PElementContext _localctx = new PElementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_pElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(HTML_TAG_OPEN_P);
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING_LITERAL || _la==DYNAMIC_CONTENT) {
				{
				{
				setState(395);
				_la = _input.LA(1);
				if ( !(_la==STRING_LITERAL || _la==DYNAMIC_CONTENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(401);
			match(HTML_TAG_CLOSE_P);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GenericElementContext extends ParserRuleContext {
		public TerminalNode HTML_TAG_OPEN() { return getToken(ComponentParser.HTML_TAG_OPEN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ComponentParser.IDENTIFIER, 0); }
		public TerminalNode HTML_TAG_CLOSE() { return getToken(ComponentParser.HTML_TAG_CLOSE, 0); }
		public List<HtmlAttributesContext> htmlAttributes() {
			return getRuleContexts(HtmlAttributesContext.class);
		}
		public HtmlAttributesContext htmlAttributes(int i) {
			return getRuleContext(HtmlAttributesContext.class,i);
		}
		public GenericElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterGenericElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitGenericElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitGenericElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericElementContext genericElement() throws RecognitionException {
		GenericElementContext _localctx = new GenericElementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_genericElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(HTML_TAG_OPEN);
			setState(404);
			match(IDENTIFIER);
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & 1103840150529L) != 0)) {
				{
				{
				setState(405);
				htmlAttributes();
				}
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(411);
			match(HTML_TAG_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ButtonElementContext extends ParserRuleContext {
		public TerminalNode HTML_TAG_OPEN_BUTTON() { return getToken(ComponentParser.HTML_TAG_OPEN_BUTTON, 0); }
		public TerminalNode HTML_TAG_CLOSE_BUTTON() { return getToken(ComponentParser.HTML_TAG_CLOSE_BUTTON, 0); }
		public List<TerminalNode> CUSTOM_DIRECTIVE() { return getTokens(ComponentParser.CUSTOM_DIRECTIVE); }
		public TerminalNode CUSTOM_DIRECTIVE(int i) {
			return getToken(ComponentParser.CUSTOM_DIRECTIVE, i);
		}
		public List<TerminalNode> EVENT_BINDING() { return getTokens(ComponentParser.EVENT_BINDING); }
		public TerminalNode EVENT_BINDING(int i) {
			return getToken(ComponentParser.EVENT_BINDING, i);
		}
		public List<TerminalNode> DYNAMIC_CONTENT() { return getTokens(ComponentParser.DYNAMIC_CONTENT); }
		public TerminalNode DYNAMIC_CONTENT(int i) {
			return getToken(ComponentParser.DYNAMIC_CONTENT, i);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(ComponentParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(ComponentParser.STRING_LITERAL, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ComponentParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ComponentParser.IDENTIFIER, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(ComponentParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(ComponentParser.MINUS, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(ComponentParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ComponentParser.PLUS, i);
		}
		public ButtonElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buttonElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterButtonElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitButtonElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitButtonElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonElementContext buttonElement() throws RecognitionException {
		ButtonElementContext _localctx = new ButtonElementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_buttonElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(HTML_TAG_OPEN_BUTTON);
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CUSTOM_DIRECTIVE || _la==EVENT_BINDING) {
				{
				{
				setState(414);
				_la = _input.LA(1);
				if ( !(_la==CUSTOM_DIRECTIVE || _la==EVENT_BINDING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 252201587722813440L) != 0)) {
				{
				{
				setState(420);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 252201587722813440L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(426);
			match(HTML_TAG_CLOSE_BUTTON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SpanElementContext extends ParserRuleContext {
		public TerminalNode HTML_TAG_OPEN_SPAN() { return getToken(ComponentParser.HTML_TAG_OPEN_SPAN, 0); }
		public TerminalNode HTML_TAG_CLOSE_SPAN() { return getToken(ComponentParser.HTML_TAG_CLOSE_SPAN, 0); }
		public List<TerminalNode> CUSTOM_DIRECTIVE() { return getTokens(ComponentParser.CUSTOM_DIRECTIVE); }
		public TerminalNode CUSTOM_DIRECTIVE(int i) {
			return getToken(ComponentParser.CUSTOM_DIRECTIVE, i);
		}
		public List<TerminalNode> EVENT_BINDING() { return getTokens(ComponentParser.EVENT_BINDING); }
		public TerminalNode EVENT_BINDING(int i) {
			return getToken(ComponentParser.EVENT_BINDING, i);
		}
		public List<TerminalNode> DYNAMIC_CONTENT() { return getTokens(ComponentParser.DYNAMIC_CONTENT); }
		public TerminalNode DYNAMIC_CONTENT(int i) {
			return getToken(ComponentParser.DYNAMIC_CONTENT, i);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(ComponentParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(ComponentParser.STRING_LITERAL, i);
		}
		public SpanElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spanElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterSpanElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitSpanElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitSpanElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpanElementContext spanElement() throws RecognitionException {
		SpanElementContext _localctx = new SpanElementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_spanElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(HTML_TAG_OPEN_SPAN);
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CUSTOM_DIRECTIVE || _la==EVENT_BINDING) {
				{
				{
				setState(429);
				_la = _input.LA(1);
				if ( !(_la==CUSTOM_DIRECTIVE || _la==EVENT_BINDING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING_LITERAL || _la==DYNAMIC_CONTENT) {
				{
				{
				setState(435);
				_la = _input.LA(1);
				if ( !(_la==STRING_LITERAL || _la==DYNAMIC_CONTENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(441);
			match(HTML_TAG_CLOSE_SPAN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DynamicAttributeContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(ComponentParser.LEFT_BRACKET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ComponentParser.IDENTIFIER, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(ComponentParser.RIGHT_BRACKET, 0); }
		public TerminalNode EQUAL() { return getToken(ComponentParser.EQUAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ComponentParser.STRING_LITERAL, 0); }
		public DynamicAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamicAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterDynamicAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitDynamicAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitDynamicAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DynamicAttributeContext dynamicAttribute() throws RecognitionException {
		DynamicAttributeContext _localctx = new DynamicAttributeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_dynamicAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(LEFT_BRACKET);
			setState(444);
			match(IDENTIFIER);
			setState(445);
			match(RIGHT_BRACKET);
			setState(446);
			match(EQUAL);
			setState(447);
			match(STRING_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeContext extends ParserRuleContext {
		public TerminalNode DYNAMIC_ATTRIBUTE() { return getToken(ComponentParser.DYNAMIC_ATTRIBUTE, 0); }
		public TerminalNode ATTRIBUTE_NAME() { return getToken(ComponentParser.ATTRIBUTE_NAME, 0); }
		public TerminalNode EQUAL() { return getToken(ComponentParser.EQUAL, 0); }
		public TerminalNode ATTRIBUTE_VALUE() { return getToken(ComponentParser.ATTRIBUTE_VALUE, 0); }
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_htmlAttribute);
		try {
			setState(453);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DYNAMIC_ATTRIBUTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				match(DYNAMIC_ATTRIBUTE);
				}
				break;
			case ATTRIBUTE_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				match(ATTRIBUTE_NAME);
				setState(451);
				match(EQUAL);
				setState(452);
				match(ATTRIBUTE_VALUE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DynamicContentContext extends ParserRuleContext {
		public TerminalNode DYNAMIC_CONTENT() { return getToken(ComponentParser.DYNAMIC_CONTENT, 0); }
		public List<TerminalNode> PLUS() { return getTokens(ComponentParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ComponentParser.PLUS, i);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(ComponentParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(ComponentParser.STRING_LITERAL, i);
		}
		public DynamicContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamicContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterDynamicContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitDynamicContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitDynamicContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DynamicContentContext dynamicContent() throws RecognitionException {
		DynamicContentContext _localctx = new DynamicContentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_dynamicContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(DYNAMIC_CONTENT);
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(456);
				match(PLUS);
				setState(457);
				match(STRING_LITERAL);
				}
				}
				setState(462);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentContext extends ParserRuleContext {
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<TerminalNode> DYNAMIC_CONTENT() { return getTokens(ComponentParser.DYNAMIC_CONTENT); }
		public TerminalNode DYNAMIC_CONTENT(int i) {
			return getToken(ComponentParser.DYNAMIC_CONTENT, i);
		}
		public List<TerminalNode> CUSTOM_DIRECTIVE() { return getTokens(ComponentParser.CUSTOM_DIRECTIVE); }
		public TerminalNode CUSTOM_DIRECTIVE(int i) {
			return getToken(ComponentParser.CUSTOM_DIRECTIVE, i);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(ComponentParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(ComponentParser.STRING_LITERAL, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ComponentParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ComponentParser.IDENTIFIER, i);
		}
		public List<TerminalNode> EVENT_BINDING() { return getTokens(ComponentParser.EVENT_BINDING); }
		public TerminalNode EVENT_BINDING(int i) {
			return getToken(ComponentParser.EVENT_BINDING, i);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_htmlContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & 9007522808659969L) != 0)) {
				{
				setState(469);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(463);
					htmlElement();
					}
					break;
				case 2:
					{
					setState(464);
					match(DYNAMIC_CONTENT);
					}
					break;
				case 3:
					{
					setState(465);
					match(CUSTOM_DIRECTIVE);
					}
					break;
				case 4:
					{
					setState(466);
					match(STRING_LITERAL);
					}
					break;
				case 5:
					{
					setState(467);
					match(IDENTIFIER);
					}
					break;
				case 6:
					{
					setState(468);
					match(EVENT_BINDING);
					}
					break;
				}
				}
				setState(473);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributesContext extends ParserRuleContext {
		public TerminalNode SRC_ATTRIBUTE() { return getToken(ComponentParser.SRC_ATTRIBUTE, 0); }
		public TerminalNode ALT_ATTRIBUTE() { return getToken(ComponentParser.ALT_ATTRIBUTE, 0); }
		public TerminalNode DYNAMIC_ATTRIBUTE() { return getToken(ComponentParser.DYNAMIC_ATTRIBUTE, 0); }
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
		public CustomDirectiveContext customDirective() {
			return getRuleContext(CustomDirectiveContext.class,0);
		}
		public HtmlAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterHtmlAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitHtmlAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitHtmlAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributesContext htmlAttributes() throws RecognitionException {
		HtmlAttributesContext _localctx = new HtmlAttributesContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_htmlAttributes);
		try {
			setState(479);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SRC_ATTRIBUTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				match(SRC_ATTRIBUTE);
				}
				break;
			case ALT_ATTRIBUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(475);
				match(ALT_ATTRIBUTE);
				}
				break;
			case DYNAMIC_ATTRIBUTE:
				enterOuterAlt(_localctx, 3);
				{
				setState(476);
				match(DYNAMIC_ATTRIBUTE);
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(477);
				eventBinding();
				}
				break;
			case MULTIPLY:
				enterOuterAlt(_localctx, 5);
				{
				setState(478);
				customDirective();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CustomDirectiveContext extends ParserRuleContext {
		public TerminalNode MULTIPLY() { return getToken(ComponentParser.MULTIPLY, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ComponentParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(ComponentParser.EQUAL, 0); }
		public TerminalNode ATTRIBUTE_VALUE() { return getToken(ComponentParser.ATTRIBUTE_VALUE, 0); }
		public CustomDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterCustomDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitCustomDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitCustomDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CustomDirectiveContext customDirective() throws RecognitionException {
		CustomDirectiveContext _localctx = new CustomDirectiveContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_customDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(MULTIPLY);
			setState(482);
			match(IDENTIFIER);
			setState(483);
			match(EQUAL);
			setState(484);
			match(ATTRIBUTE_VALUE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EventBindingContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(ComponentParser.LEFT_PAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ComponentParser.IDENTIFIER, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(ComponentParser.RIGHT_PAREN, 0); }
		public TerminalNode EQUAL() { return getToken(ComponentParser.EQUAL, 0); }
		public TerminalNode ATTRIBUTE_VALUE() { return getToken(ComponentParser.ATTRIBUTE_VALUE, 0); }
		public EventBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).enterEventBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComponentParserListener ) ((ComponentParserListener)listener).exitEventBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComponentParserVisitor ) return ((ComponentParserVisitor<? extends T>)visitor).visitEventBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventBindingContext eventBinding() throws RecognitionException {
		EventBindingContext _localctx = new EventBindingContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_eventBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(LEFT_PAREN);
			setState(487);
			match(IDENTIFIER);
			setState(488);
			match(RIGHT_PAREN);
			setState(489);
			match(EQUAL);
			setState(490);
			match(ATTRIBUTE_VALUE);
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
		"\u0004\u0001F\u01ed\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0001"+
		"\u0000\u0003\u0000\\\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001e\b\u0001\u000b"+
		"\u0001\f\u0001f\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003\u0080\b\u0003\n\u0003\f\u0003\u0083\t\u0003\u0003\u0003"+
		"\u0085\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0004\u0003\u008d\b\u0003\u000b\u0003\f\u0003\u008e\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u0096"+
		"\b\u0003\u000b\u0003\f\u0003\u0097\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u00a4\b\u0005\n\u0005\f\u0005\u00a7\t\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00b5\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00ba"+
		"\b\u0007\n\u0007\f\u0007\u00bd\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u00c6\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0003\n\u00d0\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003\r\u00e0\b\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00e8\b\u000e"+
		"\n\u000e\f\u000e\u00eb\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00f6\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u00fc\b\u0011\n\u0011\f\u0011\u00ff\t\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u0109\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u0111\b\u0013\n\u0013\f\u0013\u0114"+
		"\t\u0013\u0003\u0013\u0116\b\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u0122\b\u0017\n\u0017\f\u0017\u0125\t\u0017\u0003"+
		"\u0017\u0127\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u012b\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0131\b\u0018"+
		"\n\u0018\f\u0018\u0134\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u0141\b\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u0145\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u014e\b\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u015a\b\u001b\u0001\u001c\u0004"+
		"\u001c\u015d\b\u001c\u000b\u001c\f\u001c\u015e\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u016b\b\u001d\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u016f\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u0175\b\u001f\n\u001f\f\u001f\u0178\t\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0005"+
		"!\u0184\b!\n!\f!\u0187\t!\u0001!\u0001!\u0001\"\u0001\"\u0005\"\u018d"+
		"\b\"\n\"\f\"\u0190\t\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0005#\u0197"+
		"\b#\n#\f#\u019a\t#\u0001#\u0001#\u0001$\u0001$\u0005$\u01a0\b$\n$\f$\u01a3"+
		"\t$\u0001$\u0005$\u01a6\b$\n$\f$\u01a9\t$\u0001$\u0001$\u0001%\u0001%"+
		"\u0005%\u01af\b%\n%\f%\u01b2\t%\u0001%\u0005%\u01b5\b%\n%\f%\u01b8\t%"+
		"\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0003\'\u01c6\b\'\u0001(\u0001(\u0001(\u0005(\u01cb"+
		"\b(\n(\f(\u01ce\t(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u01d6"+
		"\b)\n)\f)\u01d9\t)\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u01e0\b*"+
		"\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0000\u0000-\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVX\u0000\u0006\u0001\u000089\u0001\u0000\f\u000e\u0002\u0000\u0011\u0011"+
		"!!\u0002\u0000\u0011\u001177\u0001\u000012\u0003\u0000\u0011\u0011!!7"+
		"9\u0209\u0000[\u0001\u0000\u0000\u0000\u0002d\u0001\u0000\u0000\u0000"+
		"\u0004h\u0001\u0000\u0000\u0000\u0006o\u0001\u0000\u0000\u0000\b\u0099"+
		"\u0001\u0000\u0000\u0000\n\u00a5\u0001\u0000\u0000\u0000\f\u00b4\u0001"+
		"\u0000\u0000\u0000\u000e\u00b6\u0001\u0000\u0000\u0000\u0010\u00c5\u0001"+
		"\u0000\u0000\u0000\u0012\u00c7\u0001\u0000\u0000\u0000\u0014\u00cf\u0001"+
		"\u0000\u0000\u0000\u0016\u00d1\u0001\u0000\u0000\u0000\u0018\u00d6\u0001"+
		"\u0000\u0000\u0000\u001a\u00dc\u0001\u0000\u0000\u0000\u001c\u00e4\u0001"+
		"\u0000\u0000\u0000\u001e\u00f5\u0001\u0000\u0000\u0000 \u00f7\u0001\u0000"+
		"\u0000\u0000\"\u00f9\u0001\u0000\u0000\u0000$\u0108\u0001\u0000\u0000"+
		"\u0000&\u0115\u0001\u0000\u0000\u0000(\u0117\u0001\u0000\u0000\u0000*"+
		"\u0119\u0001\u0000\u0000\u0000,\u011b\u0001\u0000\u0000\u0000.\u012a\u0001"+
		"\u0000\u0000\u00000\u012c\u0001\u0000\u0000\u00002\u0137\u0001\u0000\u0000"+
		"\u00004\u0144\u0001\u0000\u0000\u00006\u0146\u0001\u0000\u0000\u00008"+
		"\u015c\u0001\u0000\u0000\u0000:\u016a\u0001\u0000\u0000\u0000<\u016c\u0001"+
		"\u0000\u0000\u0000>\u0172\u0001\u0000\u0000\u0000@\u017c\u0001\u0000\u0000"+
		"\u0000B\u0180\u0001\u0000\u0000\u0000D\u018a\u0001\u0000\u0000\u0000F"+
		"\u0193\u0001\u0000\u0000\u0000H\u019d\u0001\u0000\u0000\u0000J\u01ac\u0001"+
		"\u0000\u0000\u0000L\u01bb\u0001\u0000\u0000\u0000N\u01c5\u0001\u0000\u0000"+
		"\u0000P\u01c7\u0001\u0000\u0000\u0000R\u01d7\u0001\u0000\u0000\u0000T"+
		"\u01df\u0001\u0000\u0000\u0000V\u01e1\u0001\u0000\u0000\u0000X\u01e6\u0001"+
		"\u0000\u0000\u0000Z\\\u0003\u0002\u0001\u0000[Z\u0001\u0000\u0000\u0000"+
		"[\\\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0005\u0004\u0000"+
		"\u0000^_\u0005\u001a\u0000\u0000_`\u0003\u0006\u0003\u0000`\u0001\u0001"+
		"\u0000\u0000\u0000ab\u0003\u0004\u0002\u0000bc\u0005\u0015\u0000\u0000"+
		"ce\u0001\u0000\u0000\u0000da\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\u0003\u0001"+
		"\u0000\u0000\u0000hi\u0005\u0001\u0000\u0000ij\u0005\u0018\u0000\u0000"+
		"jk\u0005!\u0000\u0000kl\u0005\u0019\u0000\u0000lm\u0005\u0002\u0000\u0000"+
		"mn\u0005\u0011\u0000\u0000n\u0005\u0001\u0000\u0000\u0000op\u0005\u0018"+
		"\u0000\u0000pq\u0005\u0005\u0000\u0000qr\u0005\u0013\u0000\u0000rs\u0005"+
		"\u0011\u0000\u0000st\u0005\u0012\u0000\u0000tu\u0005\u0006\u0000\u0000"+
		"uv\u0005\u0013\u0000\u0000vw\u0005\u000f\u0000\u0000wx\u0005\u0012\u0000"+
		"\u0000xy\u0005\u0007\u0000\u0000yz\u0005\u0013\u0000\u0000z\u0084\u0005"+
		"\u001c\u0000\u0000{\u0085\u0005\u0011\u0000\u0000|\u0081\u0005!\u0000"+
		"\u0000}~\u0005\u0012\u0000\u0000~\u0080\u0005\u0011\u0000\u0000\u007f"+
		"}\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0085"+
		"\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084{\u0001"+
		"\u0000\u0000\u0000\u0084|\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u001d"+
		"\u0000\u0000\u0087\u0088\u0005\u0012\u0000\u0000\u0088\u0089\u0005\b\u0000"+
		"\u0000\u0089\u008a\u0005\u0013\u0000\u0000\u008a\u008c\u0005A\u0000\u0000"+
		"\u008b\u008d\u0003:\u001d\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0005A\u0000\u0000\u0091\u0092\u0005\u0012\u0000\u0000\u0092\u0093"+
		"\u0005\u0019\u0000\u0000\u0093\u0095\u0005\u001b\u0000\u0000\u0094\u0096"+
		"\u0003\b\u0004\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001"+
		"\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001"+
		"\u0000\u0000\u0000\u0098\u0007\u0001\u0000\u0000\u0000\u0099\u009a\u0005"+
		"\u0003\u0000\u0000\u009a\u009b\u0005\t\u0000\u0000\u009b\u009c\u0003,"+
		"\u0016\u0000\u009c\u009d\u0005\u0018\u0000\u0000\u009d\u009e\u0003\n\u0005"+
		"\u0000\u009e\u009f\u0005\u0019\u0000\u0000\u009f\t\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a4\u0003\u0016\u000b\u0000\u00a1\u00a4\u0003\u001a\r\u0000\u00a2"+
		"\u00a4\u0003\f\u0006\u0000\u00a3\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a6\u000b\u0001\u0000\u0000\u0000\u00a7\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0017\u0000\u0000\u00a9\u00aa"+
		"\u0005\u0014\u0000\u0000\u00aa\u00ab\u0005!\u0000\u0000\u00ab\u00ac\u0005"+
		"\u0016\u0000\u0000\u00ac\u00ad\u0003\u000e\u0007\u0000\u00ad\u00ae\u0005"+
		"\u0015\u0000\u0000\u00ae\u00b5\u0001\u0000\u0000\u0000\u00af\u00b0\u0005"+
		"!\u0000\u0000\u00b0\u00b1\u0005\u0016\u0000\u0000\u00b1\u00b2\u0003\u000e"+
		"\u0007\u0000\u00b2\u00b3\u0005\u0015\u0000\u0000\u00b3\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b4\u00a8\u0001\u0000\u0000\u0000\u00b4\u00af\u0001\u0000"+
		"\u0000\u0000\u00b5\r\u0001\u0000\u0000\u0000\u00b6\u00bb\u0003\u0010\b"+
		"\u0000\u00b7\u00b8\u0007\u0000\u0000\u0000\u00b8\u00ba\u0003\u0010\b\u0000"+
		"\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bc\u000f\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000"+
		"\u00be\u00c6\u0005!\u0000\u0000\u00bf\u00c6\u0003\u0014\n\u0000\u00c0"+
		"\u00c6\u0003\u0012\t\u0000\u00c1\u00c2\u0005\u001a\u0000\u0000\u00c2\u00c3"+
		"\u0003\u000e\u0007\u0000\u00c3\u00c4\u0005\u001b\u0000\u0000\u00c4\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c5\u00be\u0001\u0000\u0000\u0000\u00c5\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c0\u0001\u0000\u0000\u0000\u00c5\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c6\u0011\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0005!\u0000\u0000\u00c8\u00c9\u0005\u001c\u0000\u0000\u00c9\u00ca\u0003"+
		"\u000e\u0007\u0000\u00ca\u00cb\u0005\u001d\u0000\u0000\u00cb\u0013\u0001"+
		"\u0000\u0000\u0000\u00cc\u00d0\u0005\u0011\u0000\u0000\u00cd\u00d0\u0005"+
		"\u0010\u0000\u0000\u00ce\u00d0\u0005\u000f\u0000\u0000\u00cf\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d0\u0015\u0001\u0000\u0000\u0000\u00d1\u00d2\u0003"+
		"(\u0014\u0000\u00d2\u00d3\u0005\u0016\u0000\u0000\u00d3\u00d4\u0003.\u0017"+
		"\u0000\u00d4\u00d5\u0005\u0015\u0000\u0000\u00d5\u0017\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d7\u0003 \u0010\u0000\u00d7\u00d8\u0003(\u0014\u0000\u00d8"+
		"\u00d9\u0005\u0016\u0000\u0000\u00d9\u00da\u0003$\u0012\u0000\u00da\u00db"+
		"\u0005\u0015\u0000\u0000\u00db\u0019\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0005!\u0000\u0000\u00dd\u00df\u0005\u001a\u0000\u0000\u00de\u00e0\u0003"+
		"\u001c\u000e\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00df\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005"+
		"\u001b\u0000\u0000\u00e2\u00e3\u0003\"\u0011\u0000\u00e3\u001b\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e9\u0003\u001e\u000f\u0000\u00e5\u00e6\u0005\u0012"+
		"\u0000\u0000\u00e6\u00e8\u0003\u001e\u000f\u0000\u00e7\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e8\u00eb\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u001d\u0001\u0000"+
		"\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005!\u0000"+
		"\u0000\u00ed\u00ee\u0005\u0013\u0000\u0000\u00ee\u00f6\u0005\u000e\u0000"+
		"\u0000\u00ef\u00f0\u0005!\u0000\u0000\u00f0\u00f1\u0005\u0013\u0000\u0000"+
		"\u00f1\u00f6\u0005\f\u0000\u0000\u00f2\u00f3\u0005!\u0000\u0000\u00f3"+
		"\u00f4\u0005\u0013\u0000\u0000\u00f4\u00f6\u0005\r\u0000\u0000\u00f5\u00ec"+
		"\u0001\u0000\u0000\u0000\u00f5\u00ef\u0001\u0000\u0000\u0000\u00f5\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f6\u001f\u0001\u0000\u0000\u0000\u00f7\u00f8"+
		"\u0007\u0001\u0000\u0000\u00f8!\u0001\u0000\u0000\u0000\u00f9\u00fd\u0005"+
		"\u0018\u0000\u0000\u00fa\u00fc\u00034\u001a\u0000\u00fb\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fc\u00ff\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u0100\u0001\u0000"+
		"\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u0100\u0101\u0005\u0019"+
		"\u0000\u0000\u0101#\u0001\u0000\u0000\u0000\u0102\u0109\u0005\u0011\u0000"+
		"\u0000\u0103\u0109\u0005C\u0000\u0000\u0104\u0109\u0005\u000f\u0000\u0000"+
		"\u0105\u0109\u0005\u0010\u0000\u0000\u0106\u0109\u0005!\u0000\u0000\u0107"+
		"\u0109\u00036\u001b\u0000\u0108\u0102\u0001\u0000\u0000\u0000\u0108\u0103"+
		"\u0001\u0000\u0000\u0000\u0108\u0104\u0001\u0000\u0000\u0000\u0108\u0105"+
		"\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0107"+
		"\u0001\u0000\u0000\u0000\u0109%\u0001\u0000\u0000\u0000\u010a\u010b\u0003"+
		" \u0010\u0000\u010b\u0112\u0003(\u0014\u0000\u010c\u010d\u0005\u0012\u0000"+
		"\u0000\u010d\u010e\u0003 \u0010\u0000\u010e\u010f\u0003(\u0014\u0000\u010f"+
		"\u0111\u0001\u0000\u0000\u0000\u0110\u010c\u0001\u0000\u0000\u0000\u0111"+
		"\u0114\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112"+
		"\u0113\u0001\u0000\u0000\u0000\u0113\u0116\u0001\u0000\u0000\u0000\u0114"+
		"\u0112\u0001\u0000\u0000\u0000\u0115\u010a\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0001\u0000\u0000\u0000\u0116\'\u0001\u0000\u0000\u0000\u0117\u0118"+
		"\u0005!\u0000\u0000\u0118)\u0001\u0000\u0000\u0000\u0119\u011a\u0005!"+
		"\u0000\u0000\u011a+\u0001\u0000\u0000\u0000\u011b\u011c\u0005!\u0000\u0000"+
		"\u011c-\u0001\u0000\u0000\u0000\u011d\u0126\u0005\u001c\u0000\u0000\u011e"+
		"\u0123\u00030\u0018\u0000\u011f\u0120\u0005\u0012\u0000\u0000\u0120\u0122"+
		"\u00030\u0018\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0122\u0125\u0001"+
		"\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001"+
		"\u0000\u0000\u0000\u0124\u0127\u0001\u0000\u0000\u0000\u0125\u0123\u0001"+
		"\u0000\u0000\u0000\u0126\u011e\u0001\u0000\u0000\u0000\u0126\u0127\u0001"+
		"\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012b\u0005"+
		"\u001d\u0000\u0000\u0129\u012b\u00036\u001b\u0000\u012a\u011d\u0001\u0000"+
		"\u0000\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012b/\u0001\u0000\u0000"+
		"\u0000\u012c\u012d\u0005\u0018\u0000\u0000\u012d\u0132\u00032\u0019\u0000"+
		"\u012e\u012f\u0005\u0012\u0000\u0000\u012f\u0131\u00032\u0019\u0000\u0130"+
		"\u012e\u0001\u0000\u0000\u0000\u0131\u0134\u0001\u0000\u0000\u0000\u0132"+
		"\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133"+
		"\u0135\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135"+
		"\u0136\u0005\u0019\u0000\u0000\u01361\u0001\u0000\u0000\u0000\u0137\u0138"+
		"\u0007\u0002\u0000\u0000\u0138\u0139\u0005\u0013\u0000\u0000\u0139\u013a"+
		"\u0003$\u0012\u0000\u013a3\u0001\u0000\u0000\u0000\u013b\u013c\u0003\f"+
		"\u0006\u0000\u013c\u013d\u0005\u0015\u0000\u0000\u013d\u0145\u0001\u0000"+
		"\u0000\u0000\u013e\u0141\u0003$\u0012\u0000\u013f\u0141\u0005!\u0000\u0000"+
		"\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u013f\u0001\u0000\u0000\u0000"+
		"\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0145\u0005\u0015\u0000\u0000"+
		"\u0143\u0145\u0003\f\u0006\u0000\u0144\u013b\u0001\u0000\u0000\u0000\u0144"+
		"\u0140\u0001\u0000\u0000\u0000\u0144\u0143\u0001\u0000\u0000\u0000\u0145"+
		"5\u0001\u0000\u0000\u0000\u0146\u0147\u0005\u0017\u0000\u0000\u0147\u0148"+
		"\u0005\u0014\u0000\u0000\u0148\u014d\u0005!\u0000\u0000\u0149\u014a\u0005"+
		"\u001c\u0000\u0000\u014a\u014b\u0003$\u0012\u0000\u014b\u014c\u0005\u001d"+
		"\u0000\u0000\u014c\u014e\u0001\u0000\u0000\u0000\u014d\u0149\u0001\u0000"+
		"\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u0159\u0001\u0000"+
		"\u0000\u0000\u014f\u0150\u00058\u0000\u0000\u0150\u015a\u00058\u0000\u0000"+
		"\u0151\u0152\u00059\u0000\u0000\u0152\u015a\u00059\u0000\u0000\u0153\u0154"+
		"\u0005D\u0000\u0000\u0154\u015a\u0003\u000e\u0007\u0000\u0155\u0156\u0005"+
		"E\u0000\u0000\u0156\u015a\u0003\u000e\u0007\u0000\u0157\u0158\u0005\u0016"+
		"\u0000\u0000\u0158\u015a\u0003\u000e\u0007\u0000\u0159\u014f\u0001\u0000"+
		"\u0000\u0000\u0159\u0151\u0001\u0000\u0000\u0000\u0159\u0153\u0001\u0000"+
		"\u0000\u0000\u0159\u0155\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000"+
		"\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a7\u0001\u0000\u0000"+
		"\u0000\u015b\u015d\u0003:\u001d\u0000\u015c\u015b\u0001\u0000\u0000\u0000"+
		"\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000"+
		"\u015e\u015f\u0001\u0000\u0000\u0000\u015f9\u0001\u0000\u0000\u0000\u0160"+
		"\u016b\u0003<\u001e\u0000\u0161\u016b\u0003>\u001f\u0000\u0162\u016b\u0003"+
		"@ \u0000\u0163\u016b\u0003B!\u0000\u0164\u016b\u0003D\"\u0000\u0165\u016b"+
		"\u0003F#\u0000\u0166\u016b\u0005F\u0000\u0000\u0167\u016b\u00057\u0000"+
		"\u0000\u0168\u016b\u0003H$\u0000\u0169\u016b\u0003J%\u0000\u016a\u0160"+
		"\u0001\u0000\u0000\u0000\u016a\u0161\u0001\u0000\u0000\u0000\u016a\u0162"+
		"\u0001\u0000\u0000\u0000\u016a\u0163\u0001\u0000\u0000\u0000\u016a\u0164"+
		"\u0001\u0000\u0000\u0000\u016a\u0165\u0001\u0000\u0000\u0000\u016a\u0166"+
		"\u0001\u0000\u0000\u0000\u016a\u0167\u0001\u0000\u0000\u0000\u016a\u0168"+
		"\u0001\u0000\u0000\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016b;\u0001"+
		"\u0000\u0000\u0000\u016c\u016e\u00054\u0000\u0000\u016d\u016f\u00038\u001c"+
		"\u0000\u016e\u016d\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000"+
		"\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0171\u00055\u0000\u0000"+
		"\u0171=\u0001\u0000\u0000\u0000\u0172\u0176\u0005%\u0000\u0000\u0173\u0175"+
		"\u0003T*\u0000\u0174\u0173\u0001\u0000\u0000\u0000\u0175\u0178\u0001\u0000"+
		"\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000"+
		"\u0000\u0000\u0177\u0179\u0001\u0000\u0000\u0000\u0178\u0176\u0001\u0000"+
		"\u0000\u0000\u0179\u017a\u0003R)\u0000\u017a\u017b\u0005&\u0000\u0000"+
		"\u017b?\u0001\u0000\u0000\u0000\u017c\u017d\u0005\'\u0000\u0000\u017d"+
		"\u017e\u0003P(\u0000\u017e\u017f\u0005(\u0000\u0000\u017fA\u0001\u0000"+
		"\u0000\u0000\u0180\u0185\u0005)\u0000\u0000\u0181\u0184\u0003T*\u0000"+
		"\u0182\u0184\u0003L&\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0183\u0182"+
		"\u0001\u0000\u0000\u0000\u0184\u0187\u0001\u0000\u0000\u0000\u0185\u0183"+
		"\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0188"+
		"\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0188\u0189"+
		"\u0005*\u0000\u0000\u0189C\u0001\u0000\u0000\u0000\u018a\u018e\u0005+"+
		"\u0000\u0000\u018b\u018d\u0007\u0003\u0000\u0000\u018c\u018b\u0001\u0000"+
		"\u0000\u0000\u018d\u0190\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000"+
		"\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0191\u0001\u0000"+
		"\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0191\u0192\u0005,\u0000"+
		"\u0000\u0192E\u0001\u0000\u0000\u0000\u0193\u0194\u00054\u0000\u0000\u0194"+
		"\u0198\u0005!\u0000\u0000\u0195\u0197\u0003T*\u0000\u0196\u0195\u0001"+
		"\u0000\u0000\u0000\u0197\u019a\u0001\u0000\u0000\u0000\u0198\u0196\u0001"+
		"\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019b\u0001"+
		"\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019b\u019c\u0005"+
		"5\u0000\u0000\u019cG\u0001\u0000\u0000\u0000\u019d\u01a1\u0005-\u0000"+
		"\u0000\u019e\u01a0\u0007\u0004\u0000\u0000\u019f\u019e\u0001\u0000\u0000"+
		"\u0000\u01a0\u01a3\u0001\u0000\u0000\u0000\u01a1\u019f\u0001\u0000\u0000"+
		"\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a7\u0001\u0000\u0000"+
		"\u0000\u01a3\u01a1\u0001\u0000\u0000\u0000\u01a4\u01a6\u0007\u0005\u0000"+
		"\u0000\u01a5\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a9\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000"+
		"\u0000\u01a8\u01aa\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000"+
		"\u0000\u01aa\u01ab\u0005.\u0000\u0000\u01abI\u0001\u0000\u0000\u0000\u01ac"+
		"\u01b0\u0005/\u0000\u0000\u01ad\u01af\u0007\u0004\u0000\u0000\u01ae\u01ad"+
		"\u0001\u0000\u0000\u0000\u01af\u01b2\u0001\u0000\u0000\u0000\u01b0\u01ae"+
		"\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1\u01b6"+
		"\u0001\u0000\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b3\u01b5"+
		"\u0007\u0003\u0000\u0000\u01b4\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b8"+
		"\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b7"+
		"\u0001\u0000\u0000\u0000\u01b7\u01b9\u0001\u0000\u0000\u0000\u01b8\u01b6"+
		"\u0001\u0000\u0000\u0000\u01b9\u01ba\u00050\u0000\u0000\u01baK\u0001\u0000"+
		"\u0000\u0000\u01bb\u01bc\u0005\u001c\u0000\u0000\u01bc\u01bd\u0005!\u0000"+
		"\u0000\u01bd\u01be\u0005\u001d\u0000\u0000\u01be\u01bf\u0005\u0016\u0000"+
		"\u0000\u01bf\u01c0\u0005\u0011\u0000\u0000\u01c0M\u0001\u0000\u0000\u0000"+
		"\u01c1\u01c6\u0005B\u0000\u0000\u01c2\u01c3\u0005=\u0000\u0000\u01c3\u01c4"+
		"\u0005\u0016\u0000\u0000\u01c4\u01c6\u0005>\u0000\u0000\u01c5\u01c1\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c2\u0001\u0000\u0000\u0000\u01c6O\u0001\u0000"+
		"\u0000\u0000\u01c7\u01cc\u00057\u0000\u0000\u01c8\u01c9\u00058\u0000\u0000"+
		"\u01c9\u01cb\u0005\u0011\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000"+
		"\u01cb\u01ce\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000\u0000\u0000"+
		"\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cdQ\u0001\u0000\u0000\u0000\u01ce"+
		"\u01cc\u0001\u0000\u0000\u0000\u01cf\u01d6\u0003:\u001d\u0000\u01d0\u01d6"+
		"\u00057\u0000\u0000\u01d1\u01d6\u00051\u0000\u0000\u01d2\u01d6\u0005\u0011"+
		"\u0000\u0000\u01d3\u01d6\u0005!\u0000\u0000\u01d4\u01d6\u00052\u0000\u0000"+
		"\u01d5\u01cf\u0001\u0000\u0000\u0000\u01d5\u01d0\u0001\u0000\u0000\u0000"+
		"\u01d5\u01d1\u0001\u0000\u0000\u0000\u01d5\u01d2\u0001\u0000\u0000\u0000"+
		"\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000"+
		"\u01d6\u01d9\u0001\u0000\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000"+
		"\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8S\u0001\u0000\u0000\u0000\u01d9"+
		"\u01d7\u0001\u0000\u0000\u0000\u01da\u01e0\u0005$\u0000\u0000\u01db\u01e0"+
		"\u00053\u0000\u0000\u01dc\u01e0\u0005B\u0000\u0000\u01dd\u01e0\u0003X"+
		",\u0000\u01de\u01e0\u0003V+\u0000\u01df\u01da\u0001\u0000\u0000\u0000"+
		"\u01df\u01db\u0001\u0000\u0000\u0000\u01df\u01dc\u0001\u0000\u0000\u0000"+
		"\u01df\u01dd\u0001\u0000\u0000\u0000\u01df\u01de\u0001\u0000\u0000\u0000"+
		"\u01e0U\u0001\u0000\u0000\u0000\u01e1\u01e2\u0005:\u0000\u0000\u01e2\u01e3"+
		"\u0005!\u0000\u0000\u01e3\u01e4\u0005\u0016\u0000\u0000\u01e4\u01e5\u0005"+
		">\u0000\u0000\u01e5W\u0001\u0000\u0000\u0000\u01e6\u01e7\u0005\u001a\u0000"+
		"\u0000\u01e7\u01e8\u0005!\u0000\u0000\u01e8\u01e9\u0005\u001b\u0000\u0000"+
		"\u01e9\u01ea\u0005\u0016\u0000\u0000\u01ea\u01eb\u0005>\u0000\u0000\u01eb"+
		"Y\u0001\u0000\u0000\u0000,[f\u0081\u0084\u008e\u0097\u00a3\u00a5\u00b4"+
		"\u00bb\u00c5\u00cf\u00df\u00e9\u00f5\u00fd\u0108\u0112\u0115\u0123\u0126"+
		"\u012a\u0132\u0140\u0144\u014d\u0159\u015e\u016a\u016e\u0176\u0183\u0185"+
		"\u018e\u0198\u01a1\u01a7\u01b0\u01b6\u01c5\u01cc\u01d5\u01d7\u01df";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}