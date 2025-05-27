package AST;

public class VariableName {
    private String name;

    public VariableName(String var1) {
        this.name = var1;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String var1) {
        this.name = var1;
    }

    public String toString() {
        return "\nVariableName{\nname='" + this.name + "'}";
    }
}
