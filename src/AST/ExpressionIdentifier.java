package AST;

public class ExpressionIdentifier extends Expression {
    private String identifier;

    public ExpressionIdentifier(String var1) {
        this.identifier = var1;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public void setIdentifier(String var1) {
        this.identifier = var1;
    }

    public String toString() {
        return "\nExpressionIdentifier { identifier='" + this.identifier + "'\n }";
    }
}
