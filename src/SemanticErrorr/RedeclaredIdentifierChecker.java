package SemanticErrorr;

import AST.SymbolTable;

public class RedeclaredIdentifierChecker {

    private final SymbolTable symbolTable;

    public RedeclaredIdentifierChecker(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    // أضفنا fileName و lineNumber للمعاملات
    public void check(String name, String type, String fileName, int lineNumber) {
        // دالة add الآن تأخذ (name, type, fileName, lineNumber)
        if (!symbolTable.add(name, type, fileName, lineNumber)) {
            // في حال فشلت add (أي تم إعادة تعريف)، فإن SymbolTable نفسها
            // قد سجّلت الخطأ بالفعل داخل add.
            // لذلك إذا أردنا استدعاء reportError يدويًّا، يمكننا فعل ذلك هنا،
            // لكن في حالتنا تكفي أن خطأْ "Redeclaration" قد سُجل.
        }
    }
}
