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
            String filepath = "C:\\Users\\Lenovo\\IdeaProjects\\untitled6\\src\\TAST\\test3";

            // قراءة الملف وتحليله
            CharStream cs = fromFileName(filepath);
            ComponentLexer lexer = new ComponentLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ComponentParser parser = new ComponentParser(tokens);
            ParseTree tree = parser.component(); // يبدأ من القاعدة component

            // ✅ أنشئ جدول الرموز
            SymbolTable symbolTable = new SymbolTable();

            // ✅ أنشئ الزائر مع جدول الرموز
            BaseVisitor visitor = new BaseVisitor(symbolTable);

            // ✅ قم بالزيارة
            Object result = visitor.visit(tree);

            // ✅ عرض نتائج الـ AST
            System.out.println("نتيجة الـ AST من visit():");
            System.out.println(result);

            // ✅ عرض جدول الرموز
            symbolTable.print();

            // ✅ عرض الأخطاء الدلالية إن وُجدت
            symbolTable.printErrors();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
*/

public class main {
    public static void main(String[] args) {
        try {
            // 1) مسار ملف المصدر
            String filepath = "C:\\Users\\Lenovo\\IdeaProjects\\angular\\src\\TAST\\test3";

            // 2) مسار ملف الإخراج للأخطاء الدلالية
            String semanticErrorOutputPath = "C:\\Users\\Lenovo\\Desktop\\an.txt";

            // 3) إنشاء Lexer و TokenStream و Parser
            CharStream cs = fromFileName(filepath);
            ComponentLexer lexer = new ComponentLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ComponentParser parser = new ComponentParser(tokens);

            // لمنع عرض أي خطأ نحوي في الـ console
            parser.removeErrorListeners();

            // 4) بناء الـ Parse Tree
            ParseTree tree = parser.component();

            // 5) إنشاء جدول الرموز وتطبيق الزائر
            SymbolTable symbolTable = new SymbolTable();
            BaseVisitor visitor = new BaseVisitor(symbolTable, filepath);
            Object result = visitor.visit(tree);

            // 6) طباعة شجرة الـAST على الشاشة
            System.out.println("نتيجة الـ AST من visit():");
            System.out.println(result);

            // 7) طباعة جدول الرموز على الشاشة
            symbolTable.print();

            // 8) جمع الأخطاء الدلالية من ErrorManager وطباعة ملخص سريع
            @SuppressWarnings("unchecked")
            List<SemanticErrorg> semErrors = (List<SemanticErrorg>)(List<?>) ErrorManager.getErrors();
            if (!semErrors.isEmpty()) {
                System.out.println("🛑 أخطاء دلالية (ملخص سريع في الـconsole):");
                for (SemanticErrorg err : semErrors) {
                    System.out.println(err.toString());
                }
            } else {
                System.out.println("✅ لا توجد أخطاء دلالية.");
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

            // 10) إعلام المستخدم بمكان الملف
            System.out.println("تمّ إنشاء تقرير الأخطاء الدلالية في: " + semanticErrorOutputPath);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}