package SemanticErrorr;

import AST.SymbolTable;
public class UndeclaredVariableChecker {
    private final SymbolTable symbolTable;

    public UndeclaredVariableChecker(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }


    public void check(String identifier, String fileName, int lineNumber) {
        if (!symbolTable.contains(identifier)) {
            symbolTable.reportError(
                    "Undeclared Variable",
                    "variable '" + identifier + "'  unknown.",
                    fileName,
                    lineNumber
            );
        }
    }
}