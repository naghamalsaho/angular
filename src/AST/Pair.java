package AST;

public class Pair {
    private String key;
    private String value;

    public Pair(String var1, String var2) {
        this.key = var1;
        this.value = var2;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String var1) {
        this.key = var1;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String var1) {
        this.value = var1;
    }

    public String toString() {
        return "\nPair{\nkey='" + this.key + "', value='" + this.value + "'}";
    }
}
