// Generated from C:/Users/Lenovo/IdeaProjects/angular/src/Antlr/ComponentParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ComponentParser}.
 */
public interface ComponentParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code ComponentDefinition}
	 * labeled alternative in {@link ComponentParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponentDefinition(ComponentParser.ComponentDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComponentDefinition}
	 * labeled alternative in {@link ComponentParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponentDefinition(ComponentParser.ComponentDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#importStatements}.
	 * @param ctx the parse tree
	 */
	void enterImportStatements(ComponentParser.ImportStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#importStatements}.
	 * @param ctx the parse tree
	 */
	void exitImportStatements(ComponentParser.ImportStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(ComponentParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(ComponentParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComponentConfigg}
	 * labeled alternative in {@link ComponentParser#componentConfig}.
	 * @param ctx the parse tree
	 */
	void enterComponentConfigg(ComponentParser.ComponentConfiggContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComponentConfigg}
	 * labeled alternative in {@link ComponentParser#componentConfig}.
	 * @param ctx the parse tree
	 */
	void exitComponentConfigg(ComponentParser.ComponentConfiggContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDecl}
	 * labeled alternative in {@link ComponentParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(ComponentParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDecl}
	 * labeled alternative in {@link ComponentParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(ComponentParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassBodyy}
	 * labeled alternative in {@link ComponentParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyy(ComponentParser.ClassBodyyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassBodyy}
	 * labeled alternative in {@link ComponentParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyy(ComponentParser.ClassBodyyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisAssignment}
	 * labeled alternative in {@link ComponentParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterThisAssignment(ComponentParser.ThisAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisAssignment}
	 * labeled alternative in {@link ComponentParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitThisAssignment(ComponentParser.ThisAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarAssignment}
	 * labeled alternative in {@link ComponentParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterVarAssignment(ComponentParser.VarAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarAssignment}
	 * labeled alternative in {@link ComponentParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitVarAssignment(ComponentParser.VarAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link ComponentParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr(ComponentParser.BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link ComponentParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr(ComponentParser.BinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link ComponentParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpr(ComponentParser.IdentifierExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link ComponentParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpr(ComponentParser.IdentifierExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link ComponentParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(ComponentParser.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link ComponentParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(ComponentParser.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAccessExpr}
	 * labeled alternative in {@link ComponentParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessExpr(ComponentParser.ArrayAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAccessExpr}
	 * labeled alternative in {@link ComponentParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessExpr(ComponentParser.ArrayAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link ComponentParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(ComponentParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link ComponentParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(ComponentParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAccesss}
	 * labeled alternative in {@link ComponentParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccesss(ComponentParser.ArrayAccesssContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAccesss}
	 * labeled alternative in {@link ComponentParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccesss(ComponentParser.ArrayAccesssContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link ComponentParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(ComponentParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link ComponentParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(ComponentParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link ComponentParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(ComponentParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link ComponentParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(ComponentParser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link ComponentParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(ComponentParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link ComponentParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(ComponentParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldDecl}
	 * labeled alternative in {@link ComponentParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDecl(ComponentParser.FieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldDecl}
	 * labeled alternative in {@link ComponentParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDecl(ComponentParser.FieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDecl}
	 * labeled alternative in {@link ComponentParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(ComponentParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDecl}
	 * labeled alternative in {@link ComponentParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(ComponentParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodDecl}
	 * labeled alternative in {@link ComponentParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(ComponentParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodDecl}
	 * labeled alternative in {@link ComponentParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(ComponentParser.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(ComponentParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(ComponentParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(ComponentParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(ComponentParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ComponentParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ComponentParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ComponentParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ComponentParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ComponentParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ComponentParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(ComponentParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(ComponentParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(ComponentParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(ComponentParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(ComponentParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(ComponentParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(ComponentParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(ComponentParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(ComponentParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(ComponentParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#jsonObject}.
	 * @param ctx the parse tree
	 */
	void enterJsonObject(ComponentParser.JsonObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#jsonObject}.
	 * @param ctx the parse tree
	 */
	void exitJsonObject(ComponentParser.JsonObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(ComponentParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(ComponentParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ComponentParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ComponentParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#thisAccess}.
	 * @param ctx the parse tree
	 */
	void enterThisAccess(ComponentParser.ThisAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#thisAccess}.
	 * @param ctx the parse tree
	 */
	void exitThisAccess(ComponentParser.ThisAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComponentHTMLGroup}
	 * labeled alternative in {@link ComponentParser#componentHTMLContent}.
	 * @param ctx the parse tree
	 */
	void enterComponentHTMLGroup(ComponentParser.ComponentHTMLGroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComponentHTMLGroup}
	 * labeled alternative in {@link ComponentParser#componentHTMLContent}.
	 * @param ctx the parse tree
	 */
	void exitComponentHTMLGroup(ComponentParser.ComponentHTMLGroupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpenTag}
	 * labeled alternative in {@link ComponentParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterOpenTag(ComponentParser.OpenTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpenTag}
	 * labeled alternative in {@link ComponentParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitOpenTag(ComponentParser.OpenTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Div}
	 * labeled alternative in {@link ComponentParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterDiv(ComponentParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link ComponentParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitDiv(ComponentParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code H2}
	 * labeled alternative in {@link ComponentParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterH2(ComponentParser.H2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code H2}
	 * labeled alternative in {@link ComponentParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitH2(ComponentParser.H2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Img}
	 * labeled alternative in {@link ComponentParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterImg(ComponentParser.ImgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Img}
	 * labeled alternative in {@link ComponentParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitImg(ComponentParser.ImgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code P}
	 * labeled alternative in {@link ComponentParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterP(ComponentParser.PContext ctx);
	/**
	 * Exit a parse tree produced by the {@code P}
	 * labeled alternative in {@link ComponentParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitP(ComponentParser.PContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Generic}
	 * labeled alternative in {@link ComponentParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterGeneric(ComponentParser.GenericContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Generic}
	 * labeled alternative in {@link ComponentParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitGeneric(ComponentParser.GenericContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelfClosingTag}
	 * labeled alternative in {@link ComponentParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingTag(ComponentParser.SelfClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelfClosingTag}
	 * labeled alternative in {@link ComponentParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingTag(ComponentParser.SelfClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DynamicHtmlContent}
	 * labeled alternative in {@link ComponentParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterDynamicHtmlContent(ComponentParser.DynamicHtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DynamicHtmlContent}
	 * labeled alternative in {@link ComponentParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitDynamicHtmlContent(ComponentParser.DynamicHtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Button}
	 * labeled alternative in {@link ComponentParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterButton(ComponentParser.ButtonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Button}
	 * labeled alternative in {@link ComponentParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitButton(ComponentParser.ButtonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Span}
	 * labeled alternative in {@link ComponentParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterSpan(ComponentParser.SpanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Span}
	 * labeled alternative in {@link ComponentParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitSpan(ComponentParser.SpanContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#openTagElement}.
	 * @param ctx the parse tree
	 */
	void enterOpenTagElement(ComponentParser.OpenTagElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#openTagElement}.
	 * @param ctx the parse tree
	 */
	void exitOpenTagElement(ComponentParser.OpenTagElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#divElement}.
	 * @param ctx the parse tree
	 */
	void enterDivElement(ComponentParser.DivElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#divElement}.
	 * @param ctx the parse tree
	 */
	void exitDivElement(ComponentParser.DivElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#h2Element}.
	 * @param ctx the parse tree
	 */
	void enterH2Element(ComponentParser.H2ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#h2Element}.
	 * @param ctx the parse tree
	 */
	void exitH2Element(ComponentParser.H2ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#imgElement}.
	 * @param ctx the parse tree
	 */
	void enterImgElement(ComponentParser.ImgElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#imgElement}.
	 * @param ctx the parse tree
	 */
	void exitImgElement(ComponentParser.ImgElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#pElement}.
	 * @param ctx the parse tree
	 */
	void enterPElement(ComponentParser.PElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#pElement}.
	 * @param ctx the parse tree
	 */
	void exitPElement(ComponentParser.PElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#genericElement}.
	 * @param ctx the parse tree
	 */
	void enterGenericElement(ComponentParser.GenericElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#genericElement}.
	 * @param ctx the parse tree
	 */
	void exitGenericElement(ComponentParser.GenericElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#buttonElement}.
	 * @param ctx the parse tree
	 */
	void enterButtonElement(ComponentParser.ButtonElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#buttonElement}.
	 * @param ctx the parse tree
	 */
	void exitButtonElement(ComponentParser.ButtonElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#spanElement}.
	 * @param ctx the parse tree
	 */
	void enterSpanElement(ComponentParser.SpanElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#spanElement}.
	 * @param ctx the parse tree
	 */
	void exitSpanElement(ComponentParser.SpanElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#dynamicAttribute}.
	 * @param ctx the parse tree
	 */
	void enterDynamicAttribute(ComponentParser.DynamicAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#dynamicAttribute}.
	 * @param ctx the parse tree
	 */
	void exitDynamicAttribute(ComponentParser.DynamicAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(ComponentParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(ComponentParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#dynamicContent}.
	 * @param ctx the parse tree
	 */
	void enterDynamicContent(ComponentParser.DynamicContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#dynamicContent}.
	 * @param ctx the parse tree
	 */
	void exitDynamicContent(ComponentParser.DynamicContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(ComponentParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(ComponentParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#htmlAttributes}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributes(ComponentParser.HtmlAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#htmlAttributes}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributes(ComponentParser.HtmlAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#customDirective}.
	 * @param ctx the parse tree
	 */
	void enterCustomDirective(ComponentParser.CustomDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#customDirective}.
	 * @param ctx the parse tree
	 */
	void exitCustomDirective(ComponentParser.CustomDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#eventBinding}.
	 * @param ctx the parse tree
	 */
	void enterEventBinding(ComponentParser.EventBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#eventBinding}.
	 * @param ctx the parse tree
	 */
	void exitEventBinding(ComponentParser.EventBindingContext ctx);
}