package AST;

import SemanticErrorr.ErrorManager;
import SemanticErrorr.SemanticErrorg;

import java.util.*;

public class SymbolTable {
    private final Map<String, String> symbols = new HashMap<>();
    private final Set<String> reportedRedeclarations = new HashSet<>();

    public boolean add(String name, String type, String fileName, int lineNumber) {
        if (symbols.containsKey(name)) {
            String errorKey = "Redeclaration:" + name;
            if (!reportedRedeclarations.contains(errorKey)) {
                ErrorManager.logError(new SemanticErrorg(
                        "Redeclaration",
                        "المعرف '" + name + "' معرف مسبقًا.",
                        fileName,
                        lineNumber
                ));
                reportedRedeclarations.add(errorKey);
            }
            return false;
        }
        symbols.put(name, type);
        return true;
    }

    public boolean contains(String name) {
        return symbols.containsKey(name);
    }

    public String getType(String name) {
        return symbols.get(name);
    }

    public void reportError(String type, String message, String fileName, int lineNumber) {
        ErrorManager.logError(new SemanticErrorg(
                type,
                message,
                fileName,
                lineNumber
        ));
    }

    public void print() {
        System.out.println("📦 جدول الرموز:");
        symbols.forEach((k, v) -> System.out.println("🔹 " + k + " : " + v));
    }
}
