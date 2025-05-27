package AST;

public class FieldDeclaration {
    private String variableName;
    private ArrayExpression arrayExpression;

    public FieldDeclaration(String var1, ArrayExpression var2) {
        this.variableName = var1;
        this.arrayExpression = var2;
    }

    public String getVariableName() {
        return this.variableName;
    }

    public void setVariableName(String var1) {
        this.variableName = var1;
    }

    public ArrayExpression getArrayExpression() {
        return this.arrayExpression;
    }

    public void setArrayExpression(ArrayExpression var1) {
        this.arrayExpression = var1;
    }

    public String toString() {
        return "\nFieldDeclaration { \nvariableName='" + this.variableName + "'\n, arrayExpression=" + this.arrayExpression + "\n }";
    }
}
