package SemanticErrorr;

import AST.SymbolTable;
public class UndeclaredVariableChecker {
    private final SymbolTable symbolTable;

    public UndeclaredVariableChecker(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    // أضفنا fileName و lineNumber للمعاملات
    public void check(String identifier, String fileName, int lineNumber) {
        if (!symbolTable.contains(identifier)) {
            symbolTable.reportError(
                    "Undeclared Variable",                             // نوع الخطأ
                    "المتغير '" + identifier + "' غير معرف.",           // رسالة الخطأ
                    fileName,                                           // اسم الملف
                    lineNumber                                          // رقم السطر
            );
        }
    }
}