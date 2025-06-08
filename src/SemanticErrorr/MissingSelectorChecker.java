package SemanticErrorr;

import AST.SymbolTable;

public class MissingSelectorChecker {

    private final SymbolTable symbolTable;

    public MissingSelectorChecker(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }


    public void check(String selector, String fileName, int lineNumber) {
        if (selector == null || selector.isEmpty()) {
            symbolTable.reportError(
                    "Missing Selector",                                //
                    "   the component does not contain a property 'selector'.",           //
                    fileName,
                    lineNumber                                         //
            );
        }
    }
}
