package SemanticErrorr;

import AST.SymbolTable;
import AST.ComponentConfig;


public class MissingComponentConfigChecker {

    private final SymbolTable symbolTable;

    public MissingComponentConfigChecker(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    /**
     * @param config     كائن ComponentConfig إذا تم العثور عليه، أو null إذا لم يُكتب في الكود
     * @param fileName   اسم الملف الجاري فحصه (لإظهار موقع الخطأ)
     * @param lineNumber رقم السطر الذي ظهر فيه عنصر @Component
     */
    public void check(ComponentConfig config, String fileName, int lineNumber) {
        if (config == null) {
            symbolTable.reportError(
                    "Missing Component Config",
                    "the component does not contain a componentConfig block.",
                    fileName,
                    lineNumber
            );
        }
    }
}
