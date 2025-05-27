package AST;

import java.util.ArrayList;
import java.util.List;

public class HtmlAttributes {
    private List<HtmlAttribute> children = new ArrayList();
    private String type;
    private String value;

    public HtmlAttributes() {
    }

    public List<HtmlAttribute> getChildren() {
        return this.children;
    }

    public void setChildren(List<HtmlAttribute> var1) {
        this.children = var1;
    }

    public void addChild(HtmlAttribute var1) {
        this.children.add(var1);
    }

    public void setType(String var1) {
        this.type = var1;
    }

    public String getType() {
        return this.type;
    }

    public void setValue(String var1) {
        this.value = var1;
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        return "HtmlAttribute{type='" + this.type + "', value='" + this.value + "'}";
    }
}
