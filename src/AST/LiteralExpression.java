package AST;

public class LiteralExpression extends Expression {
    private Object value;

    public LiteralExpression(Object var1) {
        this.value = var1;
    }

    public Object getValue() {
        return this.value;
    }

    public void setValue(Object var1) {
        this.value = var1;
    }

    public String toString() {
        return "\nLiteralExpression { value=" + this.value + " \n}";
    }
}
