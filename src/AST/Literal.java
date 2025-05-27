package AST;

public class Literal extends HtmlElement {
    private Object value;

    public Literal() {
    }

    public Object getValue() {
        return this.value;
    }

    public void setValue(Object var1) {
        this.value = var1;
    }

    public String toString() {
        return " \nLiteral {\nvalue=" + this.value + "}";
    }
}
