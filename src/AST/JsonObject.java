package AST;

import java.util.List;

public class JsonObject {
    private List<Pair> pairs;

    public JsonObject(List<Pair> var1) {
        this.pairs = var1;
    }

    public List<Pair> getPairs() {
        return this.pairs;
    }

    public void setPairs(List<Pair> var1) {
        this.pairs = var1;
    }

    public String toString() {
        return "\nJsonObject{\n pairs=" + this.pairs + "\n}";
    }
}
