package Visitor;

import AST.*;
import gen.ComponentLexer;
import gen.ComponentParser;
import gen. ComponentParserBaseVisitor;

import SemanticErrorr.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public  class BaseVisitor extends ComponentParserBaseVisitor<Object>  {
  /*  private String currentFileName;
    private final SymbolTable symbolTable;
    private final UndeclaredVariableChecker undeclaredChecker;
    private final RedeclaredIdentifierChecker redeclaredChecker;
    private final UnknownMethodCallChecker methodChecker;
    private final InvalidDirectiveChecker directiveChecker;
    private final MissingSelectorChecker selectorChecker;
    private  final InvalidNestingChecker nestingChecker;
    Set<String> checkedVariables = new HashSet<>();
*/
  private String currentFileName;
  private final SymbolTable selectorTable;
    private final SymbolTable nestingTable;
    private final SymbolTable undeclaredVarTable;
    private final SymbolTable redeclaredTable;
    private final SymbolTable unknownMethodTable;
   // private final SymbolTable unknownPropertyTable;
    private final SymbolTable invalidDirectiveTable;
    // إذا أضفت Checkers جدد، أنشئ هنا جدولاً موازياً

    // 👇 Checkers التي تستخدم كل واحدٍ جدولَه الخاص
    private final MissingSelectorChecker selectorChecker;
    private final InvalidNestingChecker nestingChecker;
    private final UndeclaredVariableChecker undeclaredChecker;
    private final RedeclaredIdentifierChecker redeclaredChecker;
    private final UnknownMethodCallChecker methodChecker;
    //private final UnknownPropertyChecker propertyChecker;
    private final InvalidDirectiveChecker directiveChecker;
    // وهكذا لأي Checker جديد

    // للحفاظ على المتغيرات التي فحصناها داخل ngFor أو غيره
    private final Set<String> checkedVariables = new HashSet<>();

    public BaseVisitor(  String currentFileName,
                         SymbolTable selectorTable,
                         SymbolTable nestingTable,
                         SymbolTable undeclaredVarTable,
                         SymbolTable redeclaredTable,
                         SymbolTable unknownMethodTable,
                         SymbolTable unknownPropertyTable,
                         SymbolTable invalidDirectiveTable) {

        this.currentFileName = currentFileName;

        // ربط كل جدول برمزي بالفاحص المناسب
        this.selectorTable        = selectorTable;
        this.nestingTable         = nestingTable;
        this.undeclaredVarTable   = undeclaredVarTable;
        this.redeclaredTable      = redeclaredTable;
        this.unknownMethodTable   = unknownMethodTable;
      //  this.unknownPropertyTable = unknownPropertyTable;
        this.invalidDirectiveTable = invalidDirectiveTable;

        // إنشاء المثيلات فعليًّا
        this.selectorChecker     = new MissingSelectorChecker(selectorTable);
        this.nestingChecker      = new InvalidNestingChecker(nestingTable);
        this.undeclaredChecker   = new UndeclaredVariableChecker(undeclaredVarTable);
        this.redeclaredChecker   = new RedeclaredIdentifierChecker(redeclaredTable);
        this.methodChecker       = new UnknownMethodCallChecker(unknownMethodTable);
        //this.propertyChecker     = new UnknownPropertyChecker(unknownPropertyTable,  Map.of());
        this.directiveChecker    = new InvalidDirectiveChecker(invalidDirectiveTable);
       /* this.symbolTable = symbolTable;
        this.currentFileName = currentFileName;
        this.nestingChecker=new InvalidNestingChecker(symbolTable);
        this.undeclaredChecker = new UndeclaredVariableChecker(symbolTable);
        this.redeclaredChecker = new RedeclaredIdentifierChecker(symbolTable);
        this.methodChecker = new UnknownMethodCallChecker(symbolTable);
        this.directiveChecker = new InvalidDirectiveChecker(symbolTable);
        this.selectorChecker = new MissingSelectorChecker(symbolTable);

        */

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







//    public SymbolTable getSymbolTable() {
//        return symbolTable;
//    }

    @Override
    public ComponentConfig visitComponentConfigg(ComponentParser.ComponentConfiggContext ctx) {
        ComponentConfig config = new ComponentConfig();
        int lineNumber = ctx.getStart().getLine();
        // ١) selector
        if (ctx.STRING_LITERAL().size() > 0) {
            String rawSelector = ctx.STRING_LITERAL(0).getText();
            String selector = stripQuotes(rawSelector);
            config.setSelector(selector);
            selectorChecker.check(selector,  currentFileName, lineNumber);
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
      Token startToken = ctx.getStart();
      int type = startToken.getType();
      int lineNumber = startToken.getLine();

      switch (type) {
          // حالات src="..." أو alt="..."
          case ComponentLexer.SRC_ATTRIBUTE:
          case ComponentLexer.ALT_ATTRIBUTE:
              // مثال: src="image.png" أو alt="نص بديل"
              String[] parts = text.split("=", 2);
              if (parts.length == 2) {
                  attribute.setName(parts[0]);
                  attribute.setValue(stripQuotes(parts[1]));
              }
              break;

          case ComponentLexer.DYNAMIC_ATTRIBUTE:
              // صيغ مثل: [src]="imageNotDeclared"
              // أو أي سمة ديناميكية أخرى
              int eqIndexDyn = text.indexOf('=');
              if (eqIndexDyn != -1) {
                  // الجزء قبل '=' يحتوي على "[src]" مثلاً
                  String bracketPart = text.substring(0, eqIndexDyn).trim();   // "[src]"
                  // الجزء بعد '=' هو قيمة نصية مثل "\"imageNotDeclared\""
                  String valuePart = text.substring(eqIndexDyn + 1).trim();     // "\"imageNotDeclared\""

                  // استخراج اسم السمة من داخل القوسين المربّعين: "[src]" → "src"
                  String name = bracketPart.replaceAll("^\\[|\\]$", "");
                  // إزالة علامات الاقتباس المفردة أو المزدوجة من القيمة
                  String value = stripQuotes(valuePart);

                  // إذا كانت القيمة تمثل IDENTIFIER صالح (مثل "imageNotDeclared")
                  if (value.matches("[a-zA-Z_$][a-zA-Z0-9_$]*")) {
                      // نتحقّق إن لم يكن هذا المتغيّر مُعرّفًا في جدول الرموز
                      undeclaredChecker.check(value, currentFileName, lineNumber);
                      undeclaredVarTable.add(value, "hhh",currentFileName, lineNumber);
                  }

                  attribute.setName(name);
                  attribute.setValue(value);
              } else {
                  // إذا لم يُوجَد '=' لسبب غير متوقَّع
                  attribute.setName(text);
                  attribute.setValue(null);
              }
              break;

          case ComponentLexer.EVENT_BINDING:
              // صيغ مثل: (click)="selectProduct(product)"
              int eqIndexEvt = text.indexOf('=');
              if (eqIndexEvt != -1) {
                  String evName  = text.substring(0, eqIndexEvt).trim();   // "(click)"
                  String evValue = text.substring(eqIndexEvt + 1).trim(); // "\"selectProduct(product)\""
                  attribute.setName(evName);
                  attribute.setValue(stripQuotes(evValue));
                  // **اختياري**: إذا أردت التحقّق من المتغير داخل selectProduct(product)
                  // يمكنك استخراج الكلمة داخل القوسين وفحصها هنا أيضًا:
                  // String inside = stripQuotes(evValue); // "selectProduct(product)"
                  // String[] partsEvt = inside.split("[()]+");
                  // if (partsEvt.length >= 2) {
                  //     String arg = partsEvt[1].split("[^a-zA-Z0-9_$]")[0]; // "product"
                  //     undeclaredChecker.check(arg, currentFileName, lineNumber);
                  // }
              } else {
                  attribute.setName(text);
                  attribute.setValue(null);
              }
              break;

          case ComponentLexer.CUSTOM_DIRECTIVE:
              // صيغ مثل: *ngFor="let product of products" أو *ngMagic="let item of products"
              int eqIndexDir = text.indexOf('=');
              if (eqIndexDir != -1) {
                  String dName  = text.substring(0, eqIndexDir).trim();   // "*ngFor" أو "*ngMagic"
                  String dValue = text.substring(eqIndexDir + 1).trim(); // "\"let product of products\""
                  String inner  = stripQuotes(dValue);                    // "let product of products"

                  // تحليل مبسّط: نفترض الصيغة "let X of Y"
                  String[] partsDir = inner.replaceAll("\\s+", " ").split(" ");
                  if (partsDir.length == 4 && "let".equals(partsDir[0]) && "of".equals(partsDir[2])) {
                      String loopVar    = partsDir[1]; // "product" أو "item"
                      String collection = partsDir[3]; // "products"

                      // 1) نتأكد من أن "products" مسجل كـ Field أو LocalVar مسبقًا
                      undeclaredChecker.check(collection, currentFileName, lineNumber);

                      // 2) نضيف المتغير المؤقت (loopVar) إلى جدول الرموز كـ TemplateVar
                      redeclaredTable.add(loopVar, "TemplateVar", currentFileName, lineNumber);
                  }

                  attribute.setName(dName);
                  attribute.setValue(inner);
              } else {
                  attribute.setName(text);
                  attribute.setValue(null);
              }
              break;

          default:
              // إذا صادفنا أي توكن غير متوقع
              System.err.println("نوع توكن غير معروف في visitHtmlAttributes: " + text);
              return null;
      }

      return attribute;
  }
    @Override
    public HtmlElement visitButton(ComponentParser.ButtonContext ctx) {
        // 1) ننشئ عنصر مثل HtmlElement (قد يكون ButtonElement إذا تفضّل)
        ButtonElement element = new ButtonElement(); // أو: HtmlElement element = new HtmlElement("button");

        // 2) نأخذ السياق الفعليّ buttonElement من الـ ButtonContext
        ComponentParser.ButtonElementContext btnCtx = ctx.buttonElement();
        int lineNumber = btnCtx.getStart().getLine();

        // 3) نجلب كل السمات htmlAttribute* من btnCtx (مع الانتباه إلى القوسين)
        //    هذا يعيد List<HtmlAttributeContext>
        for (ComponentParser.HtmlAttributeContext attrCtx : btnCtx.htmlAttribute()) {
            HtmlAttribute attr = visitHtmlAttribute(attrCtx);
            if (attr != null) {
                element.getAttributes().add(attr);
            }
        }

        // 4) نعالج أيّ عناصر داخل الزر (htmlElement*) إذا وُجدت
        for (ComponentParser.HtmlElementContext childHtml : btnCtx.htmlElement()) {
            HtmlElement childEl = visitHtmlElement(childHtml);
            if (childEl != null) {
                element.addChild(childEl);
                nestingChecker.check(element, childEl, currentFileName, lineNumber);
            }
        }

        return element;
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
        redeclaredTable.add(varName , "TemplateVar", currentFileName, lineNumber);
      //  undeclaredChecker.check(varName , currentFileName, ctx.getStart().getLine());
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
       // redeclaredChecker.check(methodName, "Method", currentFileName, lineNumber);
        // أضف الميثود إلى جدول الرموز
      //  symbolTable.add(methodName, "Method", currentFileName, lineNumber);
        // ✅ التحقق من إعادة تعريف الدالة
        Set<String> localParams = new HashSet<>();
        List<Parameter> parameters = new ArrayList<>();
        if (ctx.parameterList() != null) {
            for (ComponentParser.ParameterContext paramCtx : ctx.parameterList().parameter()) {
                String paramName = paramCtx.IDENTIFIER().getText();
                int paramLine    = paramCtx.getStart().getLine();

                // 1) نفحص تكرار المعامل داخل نفس الدالة فقط:
                if (localParams.contains(paramName)) {
                    redeclaredTable.reportError(
                            "Redeclaration",
                            "Parameter '" + paramName + "' is already defined in this method.",
                            currentFileName,
                            paramLine
                    );
                } else {
                    localParams.add(paramName);
                    // 2) إذا أردت إضافة اسم المعامل إلى جدول الرموز العام:
                    //    يُمكنك استخدام هذه السطرَين، أو تعليقه إذا لا تريد أن تطبع اسم المعامل في جدول عام:
                    // symbolTable.add(paramName, "Parameter", currentFileName, paramLine);
                }
                Parameter param = (Parameter) visit(paramCtx);
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
        // 1) استخراج المفتاح (key) إما STRING_LITERAL أو IDENTIFIER
        String key;
        if (ctx.STRING_LITERAL(0) != null) {
            key = ctx.STRING_LITERAL(0).getText().replaceAll("^\"|\"$", "");
        } else if (ctx.IDENTIFIER(0) != null) {
            key = ctx.IDENTIFIER(0).getText();
        } else {
            return null;
        }

        // 2) استخراج القيمة (value) والتحقق من هوية الـ IDENTIFIER
        String value = null;
        if (ctx.value() != null) {
            ComponentParser.ValueContext vctx = ctx.value();

            if (vctx.STRING_LITERAL() != null) {
                value = vctx.STRING_LITERAL().getText().replaceAll("^\"|\"$", "");
            } else if (vctx.NUMBER_LITERAL() != null) {
                value = vctx.NUMBER_LITERAL().getText();
            } else if (vctx.BOOLEAN_LITERAL() != null) {
                value = vctx.BOOLEAN_LITERAL().getText();
            } else if (vctx.IDENTIFIER() != null) {
                // 2a) هنا الجانب الأيمن هو IDENTIFIER، مثل "hhh"
                value = vctx.IDENTIFIER().getText();

                // 2b) نجري Check على هذا المتغير
                undeclaredChecker.check(
                        value,
                        currentFileName,
                        vctx.getStart().getLine()
                );
            } else {
                // حالة thisAccess أو حالات أخرى
                value = vctx.getText();
            }
        } else {
            // 3) إن لم تنطبق vctx، ننظر إلى ctx.STRING_LITERAL(1) أو ctx.IDENTIFIER(1)
            if (ctx.STRING_LITERAL(1) != null) {
                value = ctx.STRING_LITERAL(1).getText().replaceAll("^\"|\"$", "");
            } else if (ctx.IDENTIFIER(1) != null) {
                value = ctx.IDENTIFIER(1).getText();
                undeclaredChecker.check(
                        value,
                        currentFileName,
                        ctx.getStart().getLine()
                );
            } else {
                return null;
            }
        }

        // 4) إرجاع زوج المفتاح والقيمة كبنية AST (Pair)
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
        else if (ctx instanceof ComponentParser.ButtonContext) {
            // 🟢 مهمّ جداً: نمرّر ctx نفسه، وهو ButtonContext
            return visitButton((ComponentParser.ButtonContext) ctx);
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
        HtmlElement element = new HtmlElement("h2");

        // 1) احصل على H2ElementContext من داخل H2Context
        ComponentParser.H2ElementContext h2El = ctx.h2Element();

        // 2) إذا وُجد dynamicContent داخل الـ h2Element
        if (h2El.dynamicContent() != null) {
            // النص الخام مثل "{{ unknownTitle }}"
            String raw = h2El.dynamicContent().getText();

            // إزالة الأقواس {{ }}
            String innerExpr = raw.replaceAll("\\{\\{|\\}\\}", "").trim();

            // نفترض أن التعبير على شكل varName أو varName.otherProp
            String varName = innerExpr.split("\\.")[0];

            // 3) استدعاء الـ undeclaredChecker مع اسم الملف ورقم السطر
            undeclaredChecker.check(varName, currentFileName, ctx.getStart().getLine());

            // 4) خزّن المحتوى النصي داخل العنصر إذا رغبت
            element.setContent(raw);
        }

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

            // 4a) اسم السمة (مثلاً "src")
            String name = dynAttrCtx.IDENTIFIER().getText();

            // 4b) قيمة السمة الخام (مثلاً "'imageNotDeclared'")
            String rawValue = dynAttrCtx.STRING_LITERAL().getText();

            // إزالة علامات الاقتباس المحيطة
            String value = rawValue.replaceAll("^\"|\"$", "").replaceAll("^'|'$", "");

            // 4c) تحقق من أن القيمة هي IDENTIFIER (مثل imageNotDeclared) وليس نص ثابت
            if (value.matches("[a-zA-Z_$][a-zA-Z0-9_$]*")) {
                // نمرّر اسم الملف ورقم السطر للشيك
                undeclaredChecker.check(value, currentFileName, dynAttrCtx.getStart().getLine());
            }

            // 4d) نستكمل بناء HtmlAttribute
            a.setName(name);
            a.setValue(value);
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
public HtmlAttribute visitHtmlAttribute(ComponentParser.HtmlAttributeContext ctx) {
    HtmlAttribute attribute = new HtmlAttribute();
    int lineNumber = ctx.getStart().getLine();

    // 1) CUSTOM_DIRECTIVE: مثل "*ngFor=\"let x of items\""
    if (ctx.CUSTOM_DIRECTIVE() != null) {
        String raw = ctx.CUSTOM_DIRECTIVE().getText();      // "*ngFor=\"let x of items\""
        int eqIdx = raw.indexOf('=');
        String dirName    = raw.substring(1, eqIdx).trim(); // "ngFor"
        String rawContent = raw.substring(eqIdx + 1).trim(); // "\"let x of items\""
        String inner      = stripQuotes(rawContent);         // "let x of items"

        attribute.setName("*" + dirName);
        attribute.setValue(inner);

        // إذا كنت تريد التحقّق الدلالي:
        String[] parts = inner.replaceAll("\\s+", " ").split(" ");
        if (parts.length == 4 && "let".equals(parts[0]) && "of".equals(parts[2])) {
            undeclaredChecker.check(parts[3], currentFileName, lineNumber);        // "items"
            undeclaredVarTable.add(parts[1], "TemplateVar", currentFileName, lineNumber); // "x"
        }
    }
    // 2) EVENT_BINDING: مثل "(click)=\"buyProduct(product)\"" أو "(dblclick)=\"foo(x,y)\""
    else if (ctx.EVENT_BINDING() != null) {
        String raw = ctx.EVENT_BINDING().getText();         // "(click)=\"buyProduct(product)\""
        int eqIdx = raw.indexOf('=');
        String evNameRaw  = raw.substring(0, eqIdx).trim();   // "(click)"
        String evValueRaw = raw.substring(eqIdx + 1).trim();  // "\"buyProduct(product)\""
        String evValue    = stripQuotes(evValueRaw);          // "buyProduct(product)"

        attribute.setName(evNameRaw);
        attribute.setValue(evValue);

        // تحليــل الدالة والمعاملات داخل قيمة الـeventBinding
        int parenOpen  = evValue.indexOf('(');
        int parenClose = evValue.lastIndexOf(')');
        if (parenOpen != -1 && parenClose > parenOpen) {
            String methodName = evValue.substring(0, parenOpen).trim();        // "buyProduct"
            String argsList   = evValue.substring(parenOpen + 1, parenClose).trim(); // "product"

            methodChecker.check(methodName, currentFileName, lineNumber);
            if (!argsList.isEmpty()) {
                for (String rawArg : argsList.split(",")) {
                    String arg = rawArg.trim(); // مثال: "product"
                    if (!arg.isEmpty()) {
                        undeclaredChecker.check(arg, currentFileName, lineNumber);
                    }
                }
            }
        }
    }
    // 3) DYNAMIC_ATTRIBUTE: مثل "[src]=\"imageNotDeclared\""
    else if (ctx.DYNAMIC_ATTRIBUTE() != null) {
        String raw = ctx.DYNAMIC_ATTRIBUTE().getText();    // "[src]=\"imageNotDeclared\""
        int eqIdx = raw.indexOf('=');
        String propName  = raw.substring(1, eqIdx - 1).trim();  // "src"
        String rawValue  = raw.substring(eqIdx + 1).trim();    // "\"imageNotDeclared\""
        String propValue = stripQuotes(rawValue);               // "imageNotDeclared"

        attribute.setName(propName);
        attribute.setValue(propValue);

        undeclaredChecker.check(propValue, currentFileName, lineNumber);
    }
    // 4) ATTRIBUTE_NAME '=' ATTRIBUTE_VALUE: مثل name="value"
    else if (ctx.ATTRIBUTE_NAME() != null && ctx.ATTRIBUTE_VALUE() != null) {
        attribute.setName(ctx.ATTRIBUTE_NAME().getText());       // مثال: name
        attribute.setValue(stripQuotes(ctx.ATTRIBUTE_VALUE().getText())); // "value"
    }

    return attribute;
}



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
                undeclaredChecker.check(part, currentFileName, ctx.getStart().getLine());
            }
        }

        return visitDynamicContent(ctx);
    }


    @Override
    public ClassDeclaration visitClassDecl(ComponentParser.ClassDeclContext ctx) {
        ClassDeclaration classDecl = new ClassDeclaration();

        String className = ctx.className().getText();
        int lineNumber = ctx.getStart().getLine();


        // 1) تأكد من أن AppComponent لم يكرّر اسمه
        redeclaredChecker.check(className, "Class", currentFileName, lineNumber);
        //symbolTable.add(className, "Class", currentFileName, lineNumber);

        classDecl.setClassName(className);

        // 2) فحص أسماء الميثودات في هذا الكلاس وإضافتها مرة واحدة:
        Set<String> methodNames = new HashSet<>();
        for (ParseTree child : ctx.classBody().children) {
            if (child instanceof ComponentParser.MethodDeclContext methodCtx) {
                String methodName = methodCtx.IDENTIFIER().getText();
                int methodLine = methodCtx.getStart().getLine();

                if (methodNames.contains(methodName)) {
                    // لو ظهر هذا الاسم مرتين داخل نفس الكلاس:
                    unknownMethodTable.reportError(
                            "Redeclaration",
                            "Method '" + methodName + "' is already defined in this class.",
                            currentFileName,
                            methodLine
                    );
                } else {
                    methodNames.add(methodName);
                    // نضيف اسمه مرة واحدة فقط:
                    redeclaredChecker.check(methodName, "Method", currentFileName, methodLine);
                  //  symbolTable.add(methodName, "Method", currentFileName, methodLine);
                }
            }
        }

        // 3) زيارة باقي أعضاء الكلاس (fields و assignments) دون إعادة فحص أسماء الميثودات:
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
        redeclaredTable.add(varName, "Field", currentFileName, lineNumber);
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

