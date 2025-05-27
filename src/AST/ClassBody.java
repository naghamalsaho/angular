package AST;

import java.util.List;

public class ClassBody {
    private List<Object> bodyElements;

    public ClassBody(List<Object> var1) {
        this.bodyElements = var1;
    }

    public List<Object> getBodyElements() {
        return this.bodyElements;
    }

    public void setBodyElements(List<Object> var1) {
        this.bodyElements = var1;
    }

    public String toString() {
        return "\nClassBody { \n bodyElements=" + this.bodyElements + "\n}";
    }
}
