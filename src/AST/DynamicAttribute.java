package AST;

public class DynamicAttribute {
    private String identifier;
    private String value;

    public DynamicAttribute(String var1, String var2) {
        this.identifier = var1;
        this.value = var2;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public void setIdentifier(String var1) {
        this.identifier = var1;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String var1) {
        this.value = var1;
    }

    public String toString() {
        return "\nDynamicAttribute{\nidentifier='" + this.identifier + "', \nvalue='" + this.value + "'}";
    }
}
