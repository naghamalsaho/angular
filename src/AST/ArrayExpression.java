package AST;

import java.util.List;

public class ArrayExpression {
    private List<Object> values;

    public ArrayExpression(List<Object> var1) {
        this.values = var1;
    }

    public List<Object> getValues() {
        return this.values;
    }

    public void setValues(List<Object> var1) {
        this.values = var1;
    }

    public String toString() {
        return "\nArrayExpression { values=" + this.values + "\n }";
    }
}
