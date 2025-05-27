package AST;

public class ThisAccess {
    private String identifier;
    private Value index;
    private String operation; // مثال: ++، +=، = ...

    public ThisAccess() {}

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Value getIndex() {
        return index;
    }

    public void setIndex(Value index) {
        this.index = index;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "ThisAccess{" +
                "identifier='" + identifier + '\'' +
                ", index=" + index +
                ", operation='" + operation + '\'' +
                '}';
    }
}
