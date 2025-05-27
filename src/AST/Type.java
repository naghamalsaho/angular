package AST;


public class Type {
    private String typeName;

    public Type(String var1) {
        this.typeName = var1;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public void setTypeName(String var1) {
        this.typeName = var1;
    }

    public String toString() {
        return "\nType{\ntypeName='" + this.typeName + "'}";
    }
}
