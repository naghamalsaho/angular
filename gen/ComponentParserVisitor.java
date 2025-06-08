// Generated from C:/Users/Lenovo/IdeaProjects/angular/src/Antlr/ComponentParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ComponentParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ComponentParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code ComponentDefinition}
	 * labeled alternative in {@link ComponentParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDefinition(ComponentParser.ComponentDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComponentParser#importStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatements(ComponentParser.ImportStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComponentParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(ComponentParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComponentConfigg}
	 * labeled alternative in {@link ComponentParser#componentConfig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentConfigg(ComponentParser.ComponentConfiggContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDecl}
	 * labeled alternative in {@link ComponentParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(ComponentParser.ClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassBodyy}
	 * labeled alternative in {@link ComponentParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyy(ComponentParser.ClassBodyyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisAssignment}
	 * labeled alternative in {@link ComponentParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisAssignment(ComponentParser.ThisAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarAssignment}
	 * labeled alternative in {@link ComponentParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssignment(ComponentParser.VarAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link ComponentParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr(ComponentParser.BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link ComponentParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpr(ComponentParser.IdentifierExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link ComponentParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpr(ComponentParser.LiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAccessExpr}
	 * labeled alternative in {@link ComponentParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessExpr(ComponentParser.ArrayAccessExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link ComponentParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(ComponentParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAccesss}
	 * labeled alternative in {@link ComponentParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccesss(ComponentParser.ArrayAccesssContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link ComponentParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(ComponentParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link ComponentParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(ComponentParser.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link ComponentParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(ComponentParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldDecl}
	 * labeled alternative in {@link ComponentParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDecl(ComponentParser.FieldDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDecl}
	 * labeled alternative in {@link ComponentParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(ComponentParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodDecl}
	 * labeled alternative in {@link ComponentParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(ComponentParser.MethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComponentParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(ComponentParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComponentParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(ComponentParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComponentParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ComponentParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComponentParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ComponentParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComponentParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(ComponentParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComponentParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(ComponentParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComponentParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(ComponentParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComponentParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(ComponentParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComponentParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(ComponentParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComponentParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(ComponentParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComponentParser#jsonObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonObject(ComponentParser.JsonObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComponentParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(ComponentParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComponentParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ComponentParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComponentParser#thisAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisAccess(ComponentParser.ThisAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComponentHTMLGroup}
	 * labeled alternative in {@link ComponentParser#componentHTMLContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentHTMLGroup(ComponentParser.ComponentHTMLGroupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpenTag}
	 * labeled alternative in {@link ComponentParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenTag(ComponentParser.OpenTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link ComponentParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(ComponentParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code H2}
	 * labeled alternative in {@link ComponentParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH2(ComponentParser.H2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Img}
	 * labeled alternative in {@link ComponentParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImg(ComponentParser.ImgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code P}
	 * labeled alternative in {@link ComponentParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP(ComponentParser.PContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Generic}
	 * labeled alternative in {@link ComponentParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric(ComponentParser.GenericContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelfClosingTag}
	 * labeled alternative in {@link ComponentParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTag(ComponentParser.SelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DynamicHtmlContent}
	 * labeled alternative in {@link ComponentParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamicHtmlContent(ComponentParser.DynamicHtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Button}
	 * labeled alternative in {@link ComponentParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButton(ComponentParser.ButtonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Span}
	 * labeled alternative in {@link ComponentParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpan(ComponentParser.SpanContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComponentParser#openTagElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenTagElement(ComponentParser.OpenTagElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComponentParser#divElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivElement(ComponentParser.DivElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComponentParser#h2Element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH2Element(ComponentParser.H2ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComponentParser#imgElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImgElement(ComponentParser.ImgElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComponentParser#pElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPElement(ComponentParser.PElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComponentParser#genericElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericElement(ComponentParser.GenericElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComponentParser#buttonElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonElement(ComponentParser.ButtonElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComponentParser#spanElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpanElement(ComponentParser.SpanElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComponentParser#dynamicAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamicAttribute(ComponentParser.DynamicAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComponentParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(ComponentParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComponentParser#dynamicContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamicContent(ComponentParser.DynamicContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComponentParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(ComponentParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComponentParser#htmlAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttributes(ComponentParser.HtmlAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComponentParser#customDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomDirective(ComponentParser.CustomDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComponentParser#eventBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventBinding(ComponentParser.EventBindingContext ctx);
}