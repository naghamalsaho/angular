package AST;

public class HtmlAttribute {
    private String name;
    private String value;

    public HtmlAttribute() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String var1) {
        this.name = var1;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String var1) {
        this.value = var1;
    }

    public String toString() {
        return "\nHtmlAttribute{\nname='" + this.name + "'\n, value='" + this.value + "'}";
    }
}
