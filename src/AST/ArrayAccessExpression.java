package AST;

public class ArrayAccessExpression extends Expression {
    private String arrayName;
    private Expression indexExpression;

    public ArrayAccessExpression(String var1, Expression var2) {
        this.arrayName = var1;
        this.indexExpression = var2;
    }

    public String getArrayName() {
        return this.arrayName;
    }

    public void setArrayName(String var1) {
        this.arrayName = var1;
    }

    public Expression getIndexExpression() {
        return this.indexExpression;
    }

    public void setIndexExpression(Expression var1) {
        this.indexExpression = var1;
    }

    public String toString() {
        return " \n ArrayAccessExpression {  \n arrayName='" + this.arrayName + " \n', indexExpression=" + this.indexExpression + "\n }";
    }
}
