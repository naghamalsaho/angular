package AST;

import java.util.List;

public class ArrayNode {
    private List<JsonObject> jsonObjects;
    private ThisAccess thisAccess;

    public ArrayNode(List<JsonObject> var1) {
        this.jsonObjects = var1;
    }

    public ArrayNode(ThisAccess var1) {
        this.thisAccess = var1;
    }

    public List<JsonObject> getJsonObjects() {
        return this.jsonObjects;
    }

    public void setJsonObjects(List<JsonObject> var1) {
        this.jsonObjects = var1;
    }

    public ThisAccess getThisAccess() {
        return this.thisAccess;
    }

    public void setThisAccess(ThisAccess var1) {
        this.thisAccess = var1;
    }

    public String toString() {
        return this.jsonObjects != null ? "ArrayNode{jsonObjects=" + this.jsonObjects + "}" : "\nArrayNode{\nthisAccess=" + this.thisAccess + "}";
    }
}
