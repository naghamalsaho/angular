package SemanticErrorr;

import AST.SymbolTable;

public class RedeclaredIdentifierChecker {

    private final SymbolTable symbolTable;

    public RedeclaredIdentifierChecker(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }


    public void check(String name, String type, String fileName, int lineNumber) {

        if (!symbolTable.add(name, type, fileName, lineNumber)) {

        }
    }
}
