package AST;

public class VariableDeclaration {
    private String type;
    private String variableName;
    private String value;

    public VariableDeclaration(String var1, String var2, String var3) {
        this.type = var1;
        this.variableName = var2;
        this.value = var3;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String var1) {
        this.type = var1;
    }

    public String getVariableName() {
        return this.variableName;
    }

    public void setVariableName(String var1) {
        this.variableName = var1;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String var1) {
        this.value = var1;
    }

    public String toString() {
        return "\nVariableDeclaration{\ntype='" + this.type + "'\n, variableName='" + this.variableName + "'\n, value='" + this.value + "'}";
    }
}
