package SemanticErrorr;

import AST.HtmlElement;
import AST.SymbolTable;

public class InvalidNestingChecker {

    private final SymbolTable symbolTable;

    public InvalidNestingChecker(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public void check(HtmlElement parent, HtmlElement child, String fileName, int lineNumber) {

        if ("button".equalsIgnoreCase(parent.getTagName()) &&
                "div".equalsIgnoreCase(child.getTagName())) {

            symbolTable.reportError(
                    "Invalid Component Nesting",
                    "  cannot be includeded <div> inside <button>.",                  //
                    fileName,                                               //
                    lineNumber                                              //
            );
        }


    }
}
