package AST;

public class Assignment {
    private boolean isThis;
    private String identifier;
    private Expression expression;

    public Assignment() {
    }

    public boolean isThis() {
        return this.isThis;
    }

    public void setThis(boolean var1) {
        this.isThis = var1;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public void setIdentifier(String var1) {
        this.identifier = var1;
    }

    public Expression getExpression() {
        return this.expression;
    }

    public void setExpression(Expression var1) {
        this.expression = var1;
    }

    public String toString() {
        return "\nAssignment {\nisThis=" + this.isThis + "\n, identifier='" + this.identifier + "'\n, expression=" + this.expression + "}";
    }
}
