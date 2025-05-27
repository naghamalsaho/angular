package AST;

import java.util.List;

public class OpenTagElement extends HtmlElement {
    public OpenTagElement(List<HtmlElement> children) {
        setTagName("generic");
        setChildren(children);
    }

    public OpenTagElement() {
        setTagName("generic");
    }
}
