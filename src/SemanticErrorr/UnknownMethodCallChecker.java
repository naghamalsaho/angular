package SemanticErrorr;

import AST.SymbolTable;

public class UnknownMethodCallChecker {

    private final SymbolTable symbolTable;

    public UnknownMethodCallChecker(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public void check(String methodName, String fileName, int lineNumber) {
        if (!symbolTable.contains(methodName)
                || !"Method".equals(symbolTable.getType(methodName))) {
            symbolTable.reportError(
                    "Unknown Method",
                    "method '" + methodName + "'  unknown.",
                    fileName,
                    lineNumber
            );
        }
    }
}
