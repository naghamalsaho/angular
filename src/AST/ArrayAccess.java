package AST;

public  class ArrayAccess {
    private String identifier;
    private Expression index;

    public  ArrayAccess() {
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public void setIdentifier(String var1) {
        this.identifier = var1;
    }

    public Expression getIndex() {
        return this.index;
    }

    public void setIndex(Expression var1) {
        this.index = var1;
    }

    public String toString() {
        return " \n ArrayAccess { \nidentifier='" + this.identifier + "' \n, index=" + this.index + "\n}";
    }
}
