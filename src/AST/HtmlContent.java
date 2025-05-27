package AST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HtmlContent {
    private List<Object> content = new ArrayList();

    public HtmlContent() {
    }

    public List<Object> getContent() {
        return this.content;
    }

    public void addContent(Object var1) {
        this.content.add(var1);
    }

    public String toString() {
        StringBuilder var1 = new StringBuilder();
        var1.append("HtmlContent {\n");
        Iterator var2 = this.content.iterator();

        while(var2.hasNext()) {
            Object var3 = var2.next();
            var1.append("  ").append(var3.toString()).append("\n");
        }

        var1.append("\n}");
        return var1.toString();
    }
}
