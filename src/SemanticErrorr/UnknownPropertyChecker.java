package SemanticErrorr;

import AST.SymbolTable;

import java.util.Map;
import java.util.Set;

public class UnknownPropertyChecker {

    private final SymbolTable symbolTable;
    private final Map<String, Set<String>> knownProperties;

    public UnknownPropertyChecker(SymbolTable symbolTable, Map<String, Set<String>> knownProperties) {
        this.symbolTable = symbolTable;
        this.knownProperties = knownProperties;
    }

    // أضفنا fileName و lineNumber للمعاملات
    public void check(String objectName, String propertyName, String fileName, int lineNumber) {
        if (!knownProperties.containsKey(objectName)) {
            symbolTable.reportError(
                    "Unknown Object",                                // نوع الخطأ
                    "الكائن '" + objectName + "' غير معروف.",        // رسالة الخطأ
                    fileName,                                         // اسم الملف
                    lineNumber                                        // رقم السطر
            );
        } else {
            Set<String> props = knownProperties.get(objectName);
            if (!props.contains(propertyName)) {
                symbolTable.reportError(
                        "Unknown Property",                                                 // نوع الخطأ
                        "الخاصية '" + propertyName + "' غير موجودة في الكائن '" + objectName + "'.",  // رسالة الخطأ
                        fileName,                                                           // اسم الملف
                        lineNumber                                                          // رقم السطر
                );
            }
        }
    }
}
