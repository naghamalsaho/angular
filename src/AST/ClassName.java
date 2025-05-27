package AST;

public class ClassName {
    private String identifier;

    public ClassName(String var1) {
        this.identifier = var1;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public void setIdentifier(String var1) {
        this.identifier = var1;
    }

    public String toString() {
        return "\nClassName{\nidentifier='" + this.identifier + "'}";
    }
}
