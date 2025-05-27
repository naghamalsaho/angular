package AST;

import java.util.List;

public class ComponentHTMLContent {
    private List<HtmlElement> htmlElements;

    public ComponentHTMLContent(List<HtmlElement> var1) {
        this.htmlElements = var1;
    }

    public List<HtmlElement> getHtmlElements() {
        return this.htmlElements;
    }

    public void setHtmlElements(List<HtmlElement> var1) {
        this.htmlElements = var1;
    }

    public String toString() {
        return "ComponentHTMLContent{htmlElements=" + this.htmlElements + "}";
    }
}
