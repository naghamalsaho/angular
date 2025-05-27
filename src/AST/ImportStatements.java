package AST;

import java.util.List;

public class ImportStatements {
    private List<ImportStatement> importStatementList;

    public ImportStatements() {
    }

    public List<ImportStatement> getImportStatementList() {
        return this.importStatementList;
    }

    public void setImportStatementList(List<ImportStatement> var1) {
        this.importStatementList = var1;
    }

    public String toString() {
        return " \nImportStatements {\nimportStatementList=" + this.importStatementList + "\n}";
    }
}
