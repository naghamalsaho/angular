package AST;

import java.util.List;

public class HtmlDocument {
    private List<HtmlElement> elements;

    public HtmlDocument() {
    }

    public List<HtmlElement> getElements() {
        return this.elements;
    }

    public void setElements(List<HtmlElement> var1) {
        this.elements = var1;
    }

    public String toString() {
        return "\nHtmlDocument{\nelements=" + this.elements + "}";
    }
}
