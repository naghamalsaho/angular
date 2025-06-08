package AST;

import java.util.ArrayList;
import java.util.List;

public class HtmlElement  extends ASTNode{
    private String tagName;
    private List<HtmlAttribute> attributes;
    private List<HtmlElement> children;
    private String content;

    public HtmlElement() {
        this.attributes = new ArrayList<>();
        this.children   = new ArrayList<>();
        this.content    = null;
    }

    public HtmlElement(String tagName) {
        this();  // يستدعي الكونستركتور الافتراضي لتهيئة القوائم
        this.tagName = tagName;
    }

    // getters & setters
    public String getTagName() {
        return this.tagName;
    }

    public void setTagName(String var1) {
        this.tagName = var1;
    }

    public List<HtmlAttribute> getAttributes() {
        return this.attributes;
    }

    public void setAttributes(List<HtmlAttribute> var1) {
        this.attributes = var1;
    }

    public List<HtmlElement> getChildren() {
        return this.children;
    }

    public void setChildren(List<HtmlElement> var1) {
        this.children = var1;
    }

    public void addChild(HtmlElement child) {
        this.children.add(child);
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String var1) {
        this.content = var1;
    }

    @Override
    public String toString() {
        return "\nHtmlElement{" +
                "\ntagName='" + this.tagName + '\'' +
                "\n, attributes=" + this.attributes +
                "\n, children=" + this.children +
                "\n, content='" + this.content + '\'' +
                '}';
    }
}
