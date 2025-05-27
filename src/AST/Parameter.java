package AST;

public class Parameter {
    private String name;
    private Type type;

    public Parameter() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String var1) {
        this.name = var1;
    }

    public Type getType() {
        return this.type;
    }

    public void setType(Type var1) {
        this.type = var1;
    }

    public String toString() {
        return "\nParameter {\nname='" + this.name + "'\n, type=" + this.type + "}";
    }
}
