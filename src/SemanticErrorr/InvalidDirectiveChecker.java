package SemanticErrorr;

import AST.SymbolTable;

import java.util.List;

public class InvalidDirectiveChecker {

    private static final List<String> allowedDirectives = List.of("ngIf", "ngFor", "ngSwitch");
    private final SymbolTable symbolTable;

    public InvalidDirectiveChecker(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public void check(String directiveName, String fileName, int lineNumber) {
        if (!allowedDirectives.contains(directiveName)) {
            symbolTable.reportError(
                    "Invalid Directive",                                 //
                    " '*" + directiveName + "'  not supported.",        //
                    fileName,                                            //
                    lineNumber                                           //
            );
        }
    }
}
