package AST;

public class ImportStatement {
    private String identifier;
    private String from;

    public ImportStatement() {
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public void setIdentifier(String var1) {
        this.identifier = var1;
    }

    public String getFrom() {
        return this.from;
    }

    public void setFrom(String var1) {
        this.from = var1;
    }

    public String toString() {
        return " \nImportStatement {\nidentifier='" + this.identifier + "'\n, from='" + this.from + "'\n }";
    }
}
