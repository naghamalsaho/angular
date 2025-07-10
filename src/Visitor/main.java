package Visitor;

import AST.SymbolTable;
import SemanticErrorr.ErrorManager;
import SemanticErrorr.SemanticErrorg;
import gen.ComponentLexer;
import gen.ComponentParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

/*
public class main {
    public static void main(String[] args) {
        try {

            String filepath = "C:\\Users\\Lenovo\\IdeaProjects\\angular\\src\\TAST\\test3";

            String semanticErrorOutputPath = "C:\\Users\\Lenovo\\Desktop\\an.txt";


            CharStream cs = fromFileName(filepath);
            ComponentLexer lexer = new ComponentLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ComponentParser parser = new ComponentParser(tokens);

            parser.removeErrorListeners();

            ParseTree tree = parser.component();


            SymbolTable symbolTable = new SymbolTable();
            BaseVisitor visitor = new BaseVisitor(symbolTable, filepath);
            Object result = visitor.visit(tree);

            // 6) طباعة شجرة الـAST على الشاشة
            System.out.println("نتيجة الـ AST من visit():");
            System.out.println(result);

            symbolTable.print();


            @SuppressWarnings("unchecked")
            List<SemanticErrorg> semErrors = (List<SemanticErrorg>)(List<?>) ErrorManager.getErrors();
            if (!semErrors.isEmpty()) {
                System.out.println("🛑console):");
                for (SemanticErrorg err : semErrors) {
                    System.out.println(err.toString());
                }
            } else {
                System.out.println("✅  .");
            }

            // 9) كتابة الأخطاء الدلالية فقط إلى ملف خارجي
            Files.createDirectories(Paths.get(semanticErrorOutputPath).getParent());
            try (PrintWriter out = new PrintWriter(new FileWriter(semanticErrorOutputPath))) {
                if (!semErrors.isEmpty()) {
                    out.println("🛑 أخطاء دلالية:");
                    for (SemanticErrorg err : semErrors) {
                        out.println(err.toString());
                    }
                } else {
                    out.println("✅ لا توجد أخطاء دلالية.");
                }
            }


            System.out.println(": " + semanticErrorOutputPath);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}*/


public class main {
    public static void main(String[] args) {
        try {

            String filepath = "C:\\Users\\Lenovo\\IdeaProjects\\angular\\src\\TAST\\test3";

            String semanticErrorOutputPath = "C:\\Users\\Lenovo\\Desktop\\an.txt";

            CharStream cs = fromFileName(filepath);
            ComponentLexer lexer = new ComponentLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ComponentParser parser = new ComponentParser(tokens);

            parser.removeErrorListeners();

            ParseTree tree = parser.component();

            SymbolTable selectorTable       = new SymbolTable();
            SymbolTable nestingTable        = new SymbolTable();
            SymbolTable undeclaredVarTable  = new SymbolTable();
            SymbolTable redeclaredTable     = new SymbolTable();
            SymbolTable unknownMethodTable  = new SymbolTable();
            SymbolTable unknownPropertyTable= new SymbolTable();
            SymbolTable invalidDirectiveTable = new SymbolTable();
            SymbolTable  missingComponentConfigTable =new SymbolTable();
            BaseVisitor visitor = new BaseVisitor(
                    filepath,
                    selectorTable,
                    nestingTable,
                    undeclaredVarTable,
                    redeclaredTable,
                    unknownMethodTable,
                    unknownPropertyTable,
                    invalidDirectiveTable,
                    missingComponentConfigTable

            );


            Object result = visitor.visit(tree);


            System.out.println(" AST  visit():");
            System.out.println(result);


            System.out.println("\n📦 symboltable MissingSelectorChecker:");
            selectorTable.print();

            System.out.println("\n📦 symboltable InvalidNestingChecker:");
            nestingTable.print();

            System.out.println("\n📦 symboltable UndeclaredVariableChecker:");
            undeclaredVarTable.print();

            System.out.println("\n📦 symboltable RedeclaredIdentifierChecker:");
            redeclaredTable.print();

            System.out.println("\n📦 symboltable UnknownMethodCallChecker:");
            unknownMethodTable.print();

            System.out.println("\n📦 symboltable UnknownPropertyChecker:");
            unknownPropertyTable.print();

            System.out.println("\n📦 symboltable InvalidDirectiveChecker:");
            invalidDirectiveTable.print();
            System.out.println("\n📦 symboltable MissingComponentConfigChecker:");
            missingComponentConfigTable.print();


            @SuppressWarnings("unchecked")
            List<SemanticErrorg> semErrors = (List<SemanticErrorg>)(List<?>) ErrorManager.getErrors();
            if (!semErrors.isEmpty()) {
                System.out.println("\n🛑 semantic errors (console):");
                for (SemanticErrorg err : semErrors) {
                    System.out.println(err.toString());
                }
            } else {
                System.out.println("\n✅ there are no semantic errors.");
            }

            Files.createDirectories(Paths.get(semanticErrorOutputPath).getParent());
            try (PrintWriter out = new PrintWriter(new FileWriter(semanticErrorOutputPath))) {
                if (!semErrors.isEmpty()) {
                    out.println("🛑 semantic errors:");
                    for (SemanticErrorg err : semErrors) {
                        out.println(err.toString());
                    }
                } else {
                    out.println("✅ there are no semantic errors.");
                }
            }

            System.out.println("semantic error report: " + semanticErrorOutputPath);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
