package AST;

public class DynamicContent {
    private String content;

    public DynamicContent() {
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String var1) {
        this.content = var1;
    }

    public String toString() {
        return "\nDynamicContent{\ncontent='" + this.content + "'}";
    }
}
