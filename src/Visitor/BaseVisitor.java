package Visitor;

import AST.*;
import gen.ComponentLexer;
import gen.ComponentParser;
import gen. ComponentParserBaseVisitor;

import SemanticErrorr.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public  class BaseVisitor extends ComponentParserBaseVisitor<Object>  {
    private String currentFileName;
    private final SymbolTable symbolTable;
    private final UndeclaredVariableChecker undeclaredChecker;
    private final RedeclaredIdentifierChecker redeclaredChecker;
    private final UnknownMethodCallChecker methodChecker;
    private final InvalidDirectiveChecker directiveChecker;
    private final MissingSelectorChecker selectorChecker;
    Set<String> checkedVariables = new HashSet<>();

    public BaseVisitor(SymbolTable symbolTable,String currentFileName) {
        this.symbolTable = symbolTable;
        this.currentFileName = currentFileName;
        this.undeclaredChecker = new UndeclaredVariableChecker(symbolTable);
        this.redeclaredChecker = new RedeclaredIdentifierChecker(symbolTable);
        this.methodChecker = new UnknownMethodCallChecker(symbolTable);
        this.directiveChecker = new InvalidDirectiveChecker(symbolTable);
        this.selectorChecker = new MissingSelectorChecker(symbolTable);
    }
    @Override
    public Object visitImportStatement(ComponentParser.ImportStatementContext ctx) {
        ImportStatement importStatement = new ImportStatement();
        importStatement.setIdentifier(ctx.IDENTIFIER().getText());
        importStatement.setFrom(ctx.STRING_LITERAL().getText());

        return importStatement;
    }

    @Override
    public List<HtmlElement> visitComponentHTMLGroup(ComponentParser.ComponentHTMLGroupContext ctx) {
        List<HtmlElement> list = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            if (child instanceof ComponentParser.HtmlElementContext) {
                list.add(visitHtmlElement((ComponentParser.HtmlElementContext) child));
            } else if (child instanceof ComponentParser.DynamicHtmlContentContext) {
                list.add(visitDynamicHtmlContent((ComponentParser.DynamicHtmlContentContext) child));
            } else if (child instanceof TerminalNode) {
                HtmlElement element = new HtmlElement();
                element.setTagName("text");
                element.setContent(child.getText());
                list.add(element);
            } else {
                System.out.println("Skipping child: " + child.getClass().getSimpleName() + " => " + child.getText());
            }
        }
        return list;
    }







    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    @Override
    public ComponentConfig visitComponentConfigg(ComponentParser.ComponentConfiggContext ctx) {
        ComponentConfig config = new ComponentConfig();

        // ١) selector
        if (ctx.STRING_LITERAL().size() > 0) {
            String rawSelector = ctx.STRING_LITERAL(0).getText();
            String selector = stripQuotes(rawSelector);
            config.setSelector(selector);

            // ✅ تحقق من وجود selector
       //     selectorChecker.check(selector);
        } else {
            // ⛔️ في حال لم يُوجد أصلًا
      //      selectorChecker.check(null);
        }

        // ٢) standalone
        if (ctx.BOOLEAN_LITERAL() != null) {
            config.setStandalone(Boolean.parseBoolean(ctx.BOOLEAN_LITERAL().getText()));
        }

        // ٣) imports
        List<String> imports = new ArrayList<>();
        for (int i = 1; i < ctx.STRING_LITERAL().size(); i++) {
            String rawImport = ctx.STRING_LITERAL(i).getText();
            imports.add(stripQuotes(rawImport));
        }
        config.setImports(imports);

        // ٤) TEMPLATE
        List<HtmlElement> htmlElements = new ArrayList<>();
        for (ComponentParser.HtmlElementContext elCtx : ctx.htmlElement()) {
            HtmlElement el = visitHtmlElement(elCtx);
            if (el != null) {
                htmlElements.add(el);
            }
        }
        config.setTemplate(htmlElements);

        // ٥) CLASS DECLS
        List<ClassDeclaration> classes = new ArrayList<>();
        for (ComponentParser.ClassDeclarationContext classCtx : ctx.classDeclaration()) {
            ClassDeclaration decl = (ClassDeclaration) visit(classCtx);
            if (decl != null) {
                classes.add(decl);
            }
        }
        config.setClassDeclarations(classes);

        return config;
    }




    @Override
    public ImportStatements visitImportStatements(ComponentParser.ImportStatementsContext ctx) {
        ImportStatements importStatements = new ImportStatements();

        List<ImportStatement> list = new ArrayList<>();

        for (ComponentParser.ImportStatementContext impCtx : ctx.importStatement()) {
            ImportStatement imp = (ImportStatement) visitImportStatement(impCtx);
            list.add(imp);
        }

        importStatements.setImportStatementList(list);

        return importStatements;
    }


    @Override
    public HtmlContent visitHtmlContent(ComponentParser.HtmlContentContext ctx) {
        HtmlContent htmlContent = new HtmlContent();

        // 1) أولاً: جميع العناصر htmlElement مباشرة
        for (ComponentParser.HtmlElementContext elCtx : ctx.htmlElement()) {
            HtmlElement el = visitHtmlElement(elCtx);
            if (el != null) {
                htmlContent.addContent(el);
            }
        }

        // 2) ثانيًا: جميع التعابير الديناميكيّة DYNAMIC_CONTENT (مثل {{ ... }})
        for (TerminalNode dynNode : ctx.DYNAMIC_CONTENT()) {
            HtmlElement dyn = new HtmlElement();
            dyn.setTagName("dynamic");
            dyn.setContent(dynNode.getText());
            htmlContent.addContent(dyn);
        }

        // 3) إضافي: إذا تريد جمع نصوص عاديّة (STRING_LITERAL أو IDENTIFIER)
        for (TerminalNode strNode : ctx.STRING_LITERAL()) {
            String text = strNode.getText().trim();
            if (!text.isEmpty()) {
                HtmlElement textNode = new HtmlElement();
                textNode.setTagName("text");
                textNode.setContent(text);
                htmlContent.addContent(textNode);
            }
        }
        for (TerminalNode idNode : ctx.IDENTIFIER()) {
            String text = idNode.getText().trim();
            if (!text.isEmpty()) {
                HtmlElement textNode = new HtmlElement();
                textNode.setTagName("text");
                textNode.setContent(text);
                htmlContent.addContent(textNode);
            }
        }

        // 4) لو تحتاج CUSTOM_DIRECTIVE أو EVENT_BINDING، مرّ عليها هنا بالمثل

        return htmlContent;
    }

/*
    @Override
    public HtmlAttribute visitCustomDirective(ComponentParser.CustomDirectiveContext ctx) {
        HtmlAttribute attribute = new HtmlAttribute();

        String directiveName = ctx.IDENTIFIER().getText();
        String value = stripQuotes(ctx.ATTRIBUTE_VALUE().getText());

        // ✅ تحقق من صلاحية التوجيه
        directiveChecker.check(directiveName);

        attribute.setName("*" + directiveName);
        attribute.setValue(value);

        return attribute;
    }
*/

  /*  @Override
    public HtmlAttribute visitEventBinding(ComponentParser.EventBindingContext ctx) {
        HtmlAttribute attribute = new HtmlAttribute();

        // ctx: (click)="doSomething()"
        String eventName = ctx.IDENTIFIER().getText();
        String value = stripQuotes(ctx.ATTRIBUTE_VALUE().getText());

        attribute.setName("(" + eventName + ")");
        attribute.setValue(value);

        return attribute;
    }


*/
    @Override
    public HtmlAttribute visitHtmlAttributes(ComponentParser.HtmlAttributesContext ctx) {
        HtmlAttribute attribute = new HtmlAttribute();

        String text = ctx.getText();
        Token startToken = ctx.getStart();  // يعطيك أول توكن
        int type = startToken.getType();

        switch (type) {
            case ComponentLexer.SRC_ATTRIBUTE:
            case ComponentLexer.ALT_ATTRIBUTE:
                String[] parts = text.split("=", 2);
                if (parts.length == 2) {
                    attribute.setName(parts[0]);
                    attribute.setValue(stripQuotes(parts[1]));
                }
                break;

            case ComponentLexer.DYNAMIC_ATTRIBUTE:
            case ComponentLexer.EVENT_BINDING:
            case ComponentLexer.CUSTOM_DIRECTIVE:
                // اعمل parsing يدوي حسب التنسيق
                int eqIndex = text.indexOf('=');
                if (eqIndex != -1) {
                    String name = text.substring(0, eqIndex).trim();
                    String value = stripQuotes(text.substring(eqIndex + 1).trim());
                    attribute.setName(name);
                    attribute.setValue(value);
                } else {
                    attribute.setName(text);
                    attribute.setValue(null);
                }
                break;

            default:
                System.err.println("نوع توكن غير معروف: " + text);
                break;
        }

        return attribute;
    }




    @Override
    public Object visitThisAccess(ComponentParser.ThisAccessContext ctx) {
        ThisAccess thisAccess = new ThisAccess();

        thisAccess.setIdentifier(ctx.IDENTIFIER().getText());

        if (ctx.value() != null) {
            Value index = (Value) visit(ctx.value());
            thisAccess.setIndex(index);
        }

        return thisAccess;
    }
    @Override
    public Assignment visitThisAssignment(ComponentParser.ThisAssignmentContext ctx) {
        Assignment asn = new Assignment();
        asn.setThis(true);
        String identifier = ctx.IDENTIFIER().getText();
        asn.setIdentifier(identifier);

        // ✅ تحقق 1: هل المتغير نفسه معرف؟
       // undeclaredChecker.check(identifier);  // مثال: total

        // ✅ تحليل التعبير
        Object exprObj = visit(ctx.expression());

        // ✅ تحقق 2: تحقق من جميع IDENTIFIER داخل التعبير (تحتاج زيارة تعبيرات فرعية)
        // لاحقًا يمكن تحسين هذا بإضافة visitExpression مع تتبع معرفات داخله.

        if (exprObj instanceof Expression) {
            asn.setExpression((Expression) exprObj);
        } else {
            Expression wrapper = new Expression();
            wrapper.setValue(exprObj);
            asn.setExpression(wrapper);
        }

        return asn;


}
    @Override
    public Assignment visitVarAssignment(ComponentParser.VarAssignmentContext ctx) {
        Assignment asn = new Assignment();
        String varName   = ctx.IDENTIFIER().getText();
        int lineNumber   = ctx.getStart().getLine();

        // أضف المتغيّر المحلي إلى جدول الرموز
        symbolTable.add(varName, "LocalVar", currentFileName, lineNumber);
        asn.setThis(false); // لأنه variable عادي
        asn.setIdentifier(ctx.IDENTIFIER().getText());

        Object exprObj = visit(ctx.expression());
        if (exprObj instanceof Expression) {
            asn.setExpression((Expression) exprObj);
        } else {
            Expression wrapper = new Expression();
            wrapper.setValue(exprObj);
            asn.setExpression(wrapper);
        }

        return asn;
    }

    @Override
    public Expression visitBinaryExpr(ComponentParser.BinaryExprContext ctx) {
        if (ctx.primaryExpression().size() == 1) {
            // مجرد تعبير واحد، رجّعه كما هو
            return (Expression) visit(ctx.primaryExpression(0));
        }

        // نبدأ بأول عنصر كـ left operand
        Expression left = (Expression) visit(ctx.primaryExpression(0));

        for (int i = 1; i < ctx.primaryExpression().size(); i++) {
            String operator = ctx.getChild(i * 2 - 1).getText(); // PLUS أو MINUS
            Expression right = (Expression) visit(ctx.primaryExpression(i));

            BinaryExpression bin = new BinaryExpression();
            bin.setLeft(left);
            bin.setOperator(operator);
            bin.setRight(right);

            left = bin; // صار الناتج الجديد هو left القادم
        }

        return left;
    }
    @Override
    public Expression visitIdentifierExpr(ComponentParser.IdentifierExprContext ctx) {
        String name = ctx.IDENTIFIER().getText();

        // ✅ التحقق الدلالي: هل هذا المعرف معرف في جدول الرموز؟
      //  undeclaredChecker.check(name);

        Expression expr = new Expression();
        expr.setValue(new ExpressionIdentifier(name));
        return expr;
    }


    @Override
    public Expression visitLiteralExpr(ComponentParser.LiteralExprContext ctx) {
        Expression expr = new Expression();
        expr.setValue(visit(ctx.literal()));
        return expr;
    }

    @Override
    public Expression visitArrayAccessExpr(ComponentParser.ArrayAccessExprContext ctx) {
        Expression expr = new Expression();
        expr.setValue(visit(ctx.arrayAccess()));
        return expr;
    }

    @Override
    public Expression visitParenExpr(ComponentParser.ParenExprContext ctx) {
        return (Expression) visit(ctx.expression());
    }






    @Override
    public Object visitMethodDecl(ComponentParser.MethodDeclContext ctx) {
        String methodName = ctx.IDENTIFIER().getText();
        int lineNumber    = ctx.getStart().getLine();

        // أضف الميثود إلى جدول الرموز
        symbolTable.add(methodName, "Method", currentFileName, lineNumber);
        // ✅ التحقق من إعادة تعريف الدالة
       // redeclaredChecker.check(methodName, "Method");
        List<Parameter> parameters = new ArrayList<>();
        if (ctx.parameterList() != null) {
            for (ComponentParser.ParameterContext paramCtx : ctx.parameterList().parameter()) {
                Parameter param = (Parameter) visit(paramCtx);
                String paramName = paramCtx.IDENTIFIER().getText();
                int paramLine    = paramCtx.getStart().getLine();
                symbolTable.add(paramName, "Parameter", currentFileName, paramLine);
                // ✅ التحقق من إعادة تعريف المعامل داخل نفس الميثود
         //       redeclaredChecker.check(param.getName(), "Parameter");

                parameters.add(param);
            }
        }
        List<Statement> statements = new ArrayList<>();
        for (ComponentParser.StatementContext stmtCtx : ctx.block().statement()) {
            Statement stmt = (Statement) visit(stmtCtx);
            statements.add(stmt);
        }


        return new MethodDeclaration(methodName, parameters, statements);
    }




    @Override
    public Object visitClassName(ComponentParser.ClassNameContext ctx) {

        ClassName className = new ClassName(ctx.IDENTIFIER().getText());
        System.out.println(className);
        return className;
    }


    @Override
    public Object visitStatement(ComponentParser.StatementContext ctx) {
        Statement statement = new Statement();

        if (ctx.assignment() != null) {
            Assignment assignment = (Assignment) visit(ctx.assignment());
            statement.setStatementContent(assignment);

        } else if (ctx.value() != null) {
            Object result = visit(ctx.value());

            if (result instanceof Value) {
                statement.setStatementContent((Value) result);

            } else if (result instanceof ThisAccess) {
                // ✅ لفّه داخل كائن Value قبل الإسناد
                statement.setStatementContent(new Value((ThisAccess) result));

            } else {
                // حالة احتياطية، مثلاً لو null أو نوع غير متوقع
                System.err.println("⚠️ نوع غير متوقع في value داخل statement: " + result);
            }

        } else if (ctx.IDENTIFIER() != null) {
            String identifier = ctx.IDENTIFIER().getText();
            statement.setStatementContent(identifier);
        }

        return statement;
    }







    @Override
    public Object visitPair(ComponentParser.PairContext ctx) {
        // المفتاح: إما STRING_LITERAL أو IDENTIFIER
        String key;
        if (ctx.STRING_LITERAL(0) != null) {
            key = ctx.STRING_LITERAL(0).getText().replaceAll("^\"|\"$", "");
        } else if (ctx.IDENTIFIER(0) != null) {
            key = ctx.IDENTIFIER(0).getText();
        } else {
            // لا مفتاح => تخطِّي
            return null;
        }

// القيمة: إما STRING_LITERAL أو visit(value) إذا أعمقت النحو
        String value;
        // هنا نستخدم ctx.value() بدل ctx.STRING_LITERAL(1)
        if (ctx.value() != null) {
            // لنفترض أن value هي STRING_LITERAL فقط
            ComponentParser.ValueContext vctx = ctx.value();
            if (vctx.STRING_LITERAL() != null) {
                value = vctx.STRING_LITERAL().getText().replaceAll("^\"|\"$", "");
            } else if (vctx.NUMBER_LITERAL() != null) {
                value = vctx.NUMBER_LITERAL().getText();
            } else if (vctx.BOOLEAN_LITERAL() != null) {
                value = vctx.BOOLEAN_LITERAL().getText();
            } else if (vctx.IDENTIFIER() != null) {
                value = vctx.IDENTIFIER().getText();
            } else {
                // حالياً ندعم هذه الأنواع فقط
                value = vctx.getText();
            }
        } else {
            // بدل الاعتماد على STRING_LITERAL(1)
            if (ctx.STRING_LITERAL(1) != null) {
                value = ctx.STRING_LITERAL(1).getText().replaceAll("^\"|\"$", "");
            } else if (ctx.IDENTIFIER(1) != null) {
                value = ctx.IDENTIFIER(1).getText();
            } else {
                return null;
            }
        }

        return new Pair(key, value);
    }



    @Override
    public Object visitJsonObject(ComponentParser.JsonObjectContext ctx) {
        List<Pair> pairs = new ArrayList<>();

        for (ComponentParser.PairContext pairCtx : ctx.pair()) {
            pairs.add((Pair) visit(pairCtx));
        }

        return new JsonObject(pairs);
    }


    @Override
    public Object visitArray(ComponentParser.ArrayContext ctx) {
        List<Object> values = new ArrayList<>();

        // الحالة الأولى: [ jsonObject, jsonObject, ... ]
        if (ctx.jsonObject() != null && !ctx.jsonObject().isEmpty()) {
            for (ComponentParser.JsonObjectContext jsonCtx : ctx.jsonObject()) {
                JsonObject jsonObject = (JsonObject) visit(jsonCtx);
                if (jsonObject != null) {
                    values.add(jsonObject);
                }
            }
        }

        // الحالة الثانية: this.someArray
        else if (ctx.thisAccess() != null) {
            ThisAccess thisAccess = (ThisAccess) visit(ctx.thisAccess());
            values.add(thisAccess);
        }

        return new ArrayExpression(values); // ✅ نرجّع ArrayExpression مو ArrayNode
    }



    @Override
    public Object visitMethodName(ComponentParser.MethodNameContext ctx) {
        return ctx.IDENTIFIER().getText();
    }

    @Override
    public Object visitVariableName(ComponentParser.VariableNameContext ctx) {

        String variableNameText = ctx.getText();


        VariableName variableName = new VariableName(variableNameText);

        return variableName;
    }


    @Override
    public Object visitParameters(ComponentParser.ParametersContext ctx) {
        List<Parameter> parameters = new ArrayList<>();


        for (int i = 0; i < ctx.getChildCount(); i++) {

            ComponentParser.ParameterContext paramCtx = (ComponentParser.ParameterContext) ctx.getChild(i);

            String typeName = paramCtx.getChild(0).getText();
            Type type = new Type(typeName);

            String variableNameText = paramCtx.getChild(1).getText();
            VariableName variableName = new VariableName(variableNameText);

            Parameter parameter = new Parameter();
            parameter.setName(variableName.getName());
            parameter.setType(type);


            parameters.add(parameter);
        }

        return new Parameters(parameters);
    }


    @Override
    public Object visitBlock(ComponentParser.BlockContext ctx) {
        List<Statement> statements = new ArrayList<>();
        for (ComponentParser.StatementContext stmtCtx : ctx.statement()) {
            Statement statement = (Statement) visit(stmtCtx);
            statements.add(statement);
        }
        return new Block(statements);
    }

    @Override
    public Object visitType(ComponentParser.TypeContext ctx) {
        String typeName = ctx.getText();
        return new Type(typeName);
    }


    @Override
    public Object visitParameterList(ComponentParser.ParameterListContext ctx) {
        List<Parameter> parameters = new ArrayList<>();
        for (ComponentParser.ParameterContext paramCtx : ctx.parameter()) {
            Parameter parameter = (Parameter) visit(paramCtx);
            parameters.add(parameter);
        }
        return new ParameterList(parameters);
    }




    @Override
    public Object visitVarDecl(ComponentParser.VarDeclContext ctx) {
        String type = ctx.type().getText();
        String variableName = ctx.variableName().getText();
        String value = ctx.value().getText();
        return new VariableDeclaration(type, variableName, value);
    }


    @Override
    public Literal visitStringLiteral(ComponentParser.StringLiteralContext ctx) {
        Literal literal = new Literal();
        literal.setValue(ctx.STRING_LITERAL().getText());
        return literal;
    }

    @Override
    public Literal visitNumberLiteral(ComponentParser.NumberLiteralContext ctx) {
        Literal literal = new Literal();
        literal.setValue(ctx.NUMBER_LITERAL().getText());
        return literal;
    }

    @Override
    public Literal visitBooleanLiteral(ComponentParser.BooleanLiteralContext ctx) {
        Literal literal = new Literal();
        literal.setValue(ctx.BOOLEAN_LITERAL().getText());
        return literal;
    }



    @Override
    public Object visitArrayAccesss(ComponentParser.ArrayAccesssContext ctx) {

        ArrayAccess arrayAccess = new ArrayAccess();


        arrayAccess.setIdentifier(ctx.IDENTIFIER().getText());


        Expression index = (Expression) visit(ctx.expression());
        arrayAccess.setIndex(index);

        return arrayAccess;
    }


    @Override
    public Object visitClassBodyy(ComponentParser.ClassBodyyContext ctx) {
        List<Object> bodyElements = new ArrayList<>();

        for (ComponentParser.FieldDeclarationContext fieldCtx : ctx.fieldDeclaration()) {
            bodyElements.add(visit(fieldCtx));
        }
        for (ComponentParser.MethodDeclarationContext methodCtx : ctx.methodDeclaration()) {
            bodyElements.add(visit(methodCtx));
        }
        for (ComponentParser.AssignmentContext assignmentCtx : ctx.assignment()) {
            bodyElements.add(visit(assignmentCtx));
        }

        return new ClassBody(bodyElements);
    }

    @Override
    public HtmlElement visitOpenTag(ComponentParser.OpenTagContext ctx) {
        OpenTagElement element = new OpenTagElement();

        // الوصول لمحتوى التاغ المفتوح
        ComponentParser.OpenTagElementContext openTagCtx = ctx.openTagElement();

        if (openTagCtx != null && openTagCtx.componentHTMLContent() != null) {
            ComponentParser.ComponentHTMLContentContext contentCtx = openTagCtx.componentHTMLContent();

            if (contentCtx instanceof ComponentParser.ComponentHTMLGroupContext) {
                ComponentParser.ComponentHTMLGroupContext groupCtx = (ComponentParser.ComponentHTMLGroupContext) contentCtx;

                List<HtmlElement> children = new ArrayList<>();
                for (ComponentParser.HtmlElementContext childCtx : groupCtx.elements) {
                    HtmlElement child = visitHtmlElement(childCtx);
                    if (child != null) {
                        children.add(child);
                    }
                }
                element.setChildren(children);
            }
        }

        return element;
    }


    public HtmlElement visitHtmlElement(ComponentParser.HtmlElementContext ctx) {
        if (ctx instanceof ComponentParser.OpenTagContext) {
            return visitOpenTag((ComponentParser.OpenTagContext) ctx);
        } else if (ctx instanceof ComponentParser.DivContext) {
            return visitDiv((ComponentParser.DivContext) ctx);
        } else if (ctx instanceof ComponentParser.H2Context) {
            return visitH2((ComponentParser.H2Context) ctx);
        } else if (ctx instanceof ComponentParser.ImgContext) {
            return visitImg((ComponentParser.ImgContext) ctx);
        } else if (ctx instanceof ComponentParser.PContext) {
            return visitP((ComponentParser.PContext) ctx);
        } else if (ctx instanceof ComponentParser.GenericContext) {
            return visitGeneric((ComponentParser.GenericContext) ctx);
        } else if (ctx instanceof ComponentParser.SelfClosingTagContext) {
            return visitSelfClosingTag((ComponentParser.SelfClosingTagContext) ctx);
        } else if (ctx instanceof ComponentParser.DynamicHtmlContentContext) {
            return visitDynamicHtmlContent((ComponentParser.DynamicHtmlContentContext) ctx);
        }
        //else if (ctx instanceof ComponentParser.ButtonContext) {
          //  return visitButton(((ComponentParser.ButtonContext) ctx).buttonElement());
        //} else if (ctx instanceof ComponentParser.SpanContext) {
        //    return visitSpan(((ComponentParser.SpanContext) ctx).spanElement());
        //}

        return null;
    }

    @Override
    public HtmlElement visitGeneric(ComponentParser.GenericContext ctx) {
        HtmlElement element = new HtmlElement();

        // استخراج اسم التاغ (IDENTIFIER هو الطفل رقم 1 عادةً)
        for (ParseTree child : ctx.children) {
            if (child instanceof TerminalNode) {
                TerminalNode node = (TerminalNode) child;
                if (node.getSymbol().getType() == ComponentParser.IDENTIFIER) {
                    element.setTagName(node.getText());

                    break;
                }
            }
        }

        // معالجة الخصائص والديركتيفات
        List<HtmlAttribute> attributes = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            if (child instanceof ComponentParser.HtmlAttributesContext) {
                HtmlAttribute attr = visitHtmlAttributes((ComponentParser.HtmlAttributesContext) child);
                if (attr != null) attributes.add(attr);
            } else if (child instanceof TerminalNode) {
                String token = child.getText();
                HtmlAttribute attr = new HtmlAttribute();
                if (token.startsWith("@")) {
                    attr.setName("directive");
                    attr.setValue(token);
                    attributes.add(attr);
                } else if (token.startsWith("(")) {
                    attr.setName("event");
                    attr.setValue(token);
                    attributes.add(attr);
                }
            }
        }

        element.setAttributes(attributes);
        return element;
    }



    @Override
    public HtmlElement visitDiv(ComponentParser.DivContext ctx) {
        HtmlElement element = new HtmlElement("div");
        ComponentParser.DivElementContext divCtx = ctx.divElement();
        List<HtmlAttribute> attrs = new ArrayList<>();

        // هنا نستعين برقم السطر من الـ context:
        int lineNumber = ctx.getStart().getLine();

        // نتفقد سمات الـ div بما فيها directives
        for (ComponentParser.HtmlAttributesContext attrCtx : divCtx.htmlAttributes()) {
            HtmlAttribute a = visitHtmlAttributes(attrCtx);
            if (a != null) {
                // مثال لكيف نتعامل مع directive من نوع *ngFor أو *ngMagic
                if (a.getName().startsWith("*")) {
                    String directiveName = a.getName().substring(1);
                    // هنا نمرر اسم الملف ورقم السطر إلى checker الخاص بالتوجيهات
                    directiveChecker.check(directiveName, currentFileName, lineNumber);

                    // نحلل باقي tokens داخل قيمة التوجيه
                    String value = a.getValue();
                    if (value != null) {
                        value = value.replaceAll("let", " let ")
                                .replaceAll("of", " of ");
                        value = value.trim().replaceAll("\\s+", " ");
                        String[] tokens = value.split(" ");
                        for (int i = 0; i < tokens.length; i++) {
                            if ("let".equals(tokens[i]) && i + 1 < tokens.length) {
                                String varName = tokens[i + 1];
                                // نتحقق رقم السطر ذاته لأن الخطأ سيكون في نفس الـ ctx
                                if (!checkedVariables.contains(varName)) {
                                    // هنا نمرر اسم الملف ورقم السطر لمفحص إعادة التعريف
                                    redeclaredChecker.check(varName, "Variable", currentFileName, lineNumber);
                                    checkedVariables.add(varName);
                                }
                            }
                            if ("of".equals(tokens[i]) && i + 1 < tokens.length) {
                                String collection = tokens[i + 1];
                                // هُنا نمرر أيضاً اسم الملف ورقم السطر لمفحص عدم التعريف
                                undeclaredChecker.check(collection, currentFileName, lineNumber);
                            }
                        }
                    }
                }
                attrs.add(a);
            }
        }

        element.setAttributes(attrs);

        // ثم نتابع زيارة المحتوى الداخلي
        if (divCtx.htmlContent() != null) {
            HtmlContent content = visitHtmlContent(divCtx.htmlContent());
            for (Object node : content.getContent()) {
                if (node instanceof HtmlElement) {
                    element.addChild((HtmlElement) node);
                } else if (node instanceof String) {
                    HtmlElement textNode = new HtmlElement("text");
                    textNode.setContent((String) node);
                    element.addChild(textNode);
                }
            }
        }

        return element;
    }


    @Override
    public HtmlElement visitH2(ComponentParser.H2Context ctx) {
        HtmlElement element = new HtmlElement();
        element.setTagName("h2");

        // ناخد كل النصّ مع الوسوم
        String full = ctx.getText();
        // نجيب المحتوى بين الوسوم
        int start = full.indexOf('>') + 1;
        int end   = full.lastIndexOf('<');
        String inner = (start >= 0 && end >= start) ? full.substring(start, end) : "";

        element.setContent(inner);
        return element;
    }







    @Override
    public HtmlElement visitImg(ComponentParser.ImgContext ctx) {
        // 1) نرسل إلى الكائن الحقيقي لـ ImgElementContext
        ComponentParser.ImgElementContext imgCtx = ctx.imgElement();

        // 2) ننشئ HtmlElement جديداً بتاغ "img"
        HtmlElement element = new HtmlElement("img");

        // 3) السمات العادية (htmlAttributes()) متوفرة في imgCtx
        List<HtmlAttribute> attrs = new ArrayList<>();
        for (ComponentParser.HtmlAttributesContext attrCtx : imgCtx.htmlAttributes()) {
            HtmlAttribute a = visitHtmlAttributes(attrCtx);
            if (a != null) {
                attrs.add(a);
            }
        }

        // 4) السمات الديناميكيّة (dynamicAttribute()) أيضاً في imgCtx
        for (ComponentParser.DynamicAttributeContext dynAttrCtx : imgCtx.dynamicAttribute()) {
            HtmlAttribute a = new HtmlAttribute();
            String name = dynAttrCtx.IDENTIFIER().getText();       // مثال: "src"
            String value = dynAttrCtx.STRING_LITERAL().getText();  // مثال: "'...'"
            // إزالة علامات الاقتباس المحيطة إذا رغبت:
            a.setName(name);
            a.setValue(value.replaceAll("^\"|\"$", "").replaceAll("^'|'$", ""));
            attrs.add(a);
        }

        element.setAttributes(attrs);

        // 5) العنصر <img> وسم ذاتيّ الإغلاق، فلا محتوى داخلي:
        return element;
    }


    @Override
    public HtmlElement visitP(ComponentParser.PContext ctx) {
        // PContext هنا هو البديل htmlElement#P، وبالتالي يحوي طفلاً واحداً: PElementContext
        ComponentParser.PElementContext pCtx = ctx.pElement();

        HtmlElement element = new HtmlElement("p");

        // نفترض أن PElementContext مُعرّف كالتالي:
        // pElement
        //   : HTML_TAG_OPEN_P (DYNAMIC_CONTENT | STRING_LITERAL)* HTML_TAG_CLOSE_P
        //   ;

        // الطفل رقم 0 هو "<p>"
        // الطفل الأخير رقم (childCount-1) هو "</p>"
        // ما بينهما (من 1 إلى childCount-2) هي DYNAMIC_CONTENT أو STRING_LITERAL

        int count = pCtx.getChildCount();
        for (int i = 1; i < count - 1; i++) {
            ParseTree child = pCtx.getChild(i);

            if (child instanceof TerminalNode) {
                TerminalNode tn = (TerminalNode) child;
                int type = tn.getSymbol().getType();
                String text = tn.getText().trim();

                if (type == ComponentParser.DYNAMIC_CONTENT) {
                    // مثال: "{{ selectedProduct.details + ' - تفاصيل المنتج' }}"
                    HtmlElement dynEl = new HtmlElement("dynamic");
                    dynEl.setContent(text);
                    String innerExpr = text.replaceAll("[{}]", "").trim();
                    String varName = innerExpr.split("\\.")[0];
                   // undeclaredChecker.check(varName);
                    element.addChild(dynEl);

                } else if (type == ComponentParser.STRING_LITERAL) {
                    // مثال: "'ثابت نصي'"
                    HtmlElement textNode = new HtmlElement("text");
                    textNode.setContent(text);
                    element.addChild(textNode);
                }
                // (يمكنك إضافة شرط آخر إذا أردت اقتناص IDENTIFIER داخل <p>)
            }
        }

        return element;
    }



    @Override
    public HtmlElement visitSelfClosingTag(ComponentParser.SelfClosingTagContext ctx) {
        HtmlElement element = new HtmlElement();
        element.setTagName("self-closing");
        return element;
    }

    @Override
    public HtmlElement visitDynamicHtmlContent(ComponentParser.DynamicHtmlContentContext ctx) {
        HtmlElement element = new HtmlElement();
        element.setTagName("dynamic");

        String raw = ctx.getText(); // مثل: "{{ selectedProduct.name }}"
        String inner = raw.substring(2, raw.length() - 2).trim(); // selectedProduct.name
        element.setContent(inner);

        return element;
    }
/*
    @Override
    public HtmlElement visitButton(ComponentParser.ButtonElementContext ctx) {
        HtmlElement element = new HtmlElement("button");

        // زيارة الـ CUSTOM_DIRECTIVE و EVENT_BINDING (اللي هي attributes)
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof ComponentParser.HtmlAttributesContext) {
                HtmlAttribute attr = visitHtmlAttributes((ComponentParser.HtmlAttributesContext) child);
                element.getAttributes().add(attr);
            }
            // ممكن تعالج DYNAMIC_CONTENT او STRING_LITERAL حسب الحاجة
            else if (child.getPayload() instanceof TerminalNode) {
                // لو تحب تضيف محتوى نصي داخل الزر
                String text = child.getText();
                if (!text.trim().isEmpty()) {
                    element.setContent(text.trim());
                }
            }
        }

        return element;
    }

    @Override
    public HtmlElement visitSpan(ComponentParser.SpanElementContext ctx) {
        HtmlElement element = new HtmlElement("span");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof ComponentParser.HtmlAttributesContext) {
                HtmlAttribute attr = visitHtmlAttributes((ComponentParser.HtmlAttributesContext) child);
                element.getAttributes().add(attr);
            } else if (child.getPayload() instanceof TerminalNode) {
                String text = child.getText();
                if (!text.trim().isEmpty()) {
                    element.setContent(text.trim());
                }
            }
        }

        return element;
    }
*/
@Override
    public Component visitComponentDefinition(ComponentParser.ComponentDefinitionContext ctx) {
        Component component = new Component();
        if (ctx.importStatements() != null) {
            ImportStatements importStatements = (ImportStatements) visit(ctx.importStatements());
            component.setImportStatements(importStatements);
        }

        ComponentConfig componentConfig = (ComponentConfig) visit(ctx.componentConfig());
        component.setComponentConfig(componentConfig);

        String compName = componentConfig.getSelector().replaceAll("^\"|\"$", "");

        // افتح سكوب جديد للمكون


       // visitChildren(ctx);


        return component;
    }
    @Override
    public Object visitDynamicContent(ComponentParser.DynamicContentContext ctx) {
        String content = ctx.getText(); // "{{ unknownTitle }}"

        // إزالة {{ و }}
        content = content.replaceAll("\\{\\{|\\}\\}", "").trim();

        // تقسيم المحتوى (لأنه ممكن يكون فيه أكثر من متغير أو تعبير)
        String[] parts = content.split("[^a-zA-Z0-9_]+"); // يقسم حسب الرموز

        for (String part : parts) {
            if (!part.isBlank() && Character.isLetter(part.charAt(0))) {
              //  undeclaredChecker.check(part); // تحقق من المتغير
            }
        }

        return visitDynamicContent(ctx);
    }


    @Override
    public ClassDeclaration visitClassDecl(ComponentParser.ClassDeclContext ctx) {
        ClassDeclaration classDecl = new ClassDeclaration();

        String className = ctx.className().getText();
        classDecl.setClassName(className);
        int lineNumber  = ctx.getStart().getLine();
        // ✅ التحقق من إعادة تعريف الكلاس
        //redeclaredChecker.check(className, "Class");

        symbolTable.add(className, "Class", currentFileName, lineNumber);

        classDecl.setClassName(className);

        ClassBody classBody = (ClassBody) visit(ctx.classBody());
        classDecl.setClassBody(classBody);



        return classDecl;
    }


    @Override
    public Object visitFieldDecl(ComponentParser.FieldDeclContext ctx) {
        String varName = ctx.variableName().getText();
        ArrayExpression arrayExpr = (ArrayExpression) visit(ctx.array());
        int lineNumber    = ctx.getStart().getLine();

        // أضف الحقل إلى جدول الرموز
        symbolTable.add(varName, "Field", currentFileName, lineNumber);
        // ✅ التحقق من إعادة تعريف الحقل
      //  redeclaredChecker.check(varName, "Field");

        return new FieldDeclaration(varName, arrayExpr);
    }







    @Override
    public Object visitParameter(ComponentParser.ParameterContext ctx) {
        String paramName = ctx.IDENTIFIER().getText();
        String typeName = ctx.getChild(2).getText();

        // ✅ التحقق من إعادة تعريف المعامل
       // redeclaredChecker.check(paramName, "Parameter");

        Type type = new Type(typeName);
        Parameter param = new Parameter();
        param.setName(paramName);
        param.setType(type);
        return param;
    }





    private String stripQuotes(String text) {
        if (text == null) return null;
        if ((text.startsWith("\"") && text.endsWith("\"")) || (text.startsWith("'") && text.endsWith("'"))) {
            return text.substring(1, text.length() - 1);
        }
        return text;
    }


}

