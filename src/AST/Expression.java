package AST;


public class Expression extends HtmlElement {
    private Object value;

    public Expression() {
    }

    public Object getValue() {
        return this.value;
    }

    public void setValue(Object var1) {
        this.value = var1;
    }

    public String toString() {
        return "\nExpression {\nvalue=" + this.value + "}";
    }
}
