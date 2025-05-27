package SemanticErrorr;

import AST.SymbolTable;

public class MissingSelectorChecker {

    private final SymbolTable symbolTable;

    public MissingSelectorChecker(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    // أضفنا fileName و lineNumber للمعاملات
    public void check(String selector, String fileName, int lineNumber) {
        if (selector == null || selector.isEmpty()) {
            symbolTable.reportError(
                    "Missing Selector",                                // نوع الخطأ
                    "المكون لا يحتوي على خاصية 'selector'.",           // رسالة الخطأ
                    fileName,                                          // اسم الملف
                    lineNumber                                         // رقم السطر
            );
        }
    }
}
