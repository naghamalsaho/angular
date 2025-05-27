package AST;

import java.util.List;

public class ComponentConfig {
    private String selector;
    private boolean standalone;
    private List<String> imports;
    private List<HtmlElement> template;
    private List<ClassDeclaration> classDeclarations; // ✅ جديد

    public ComponentConfig() {
    }

    public String getSelector() {
        return selector;
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    public boolean isStandalone() {
        return standalone;
    }

    public void setStandalone(boolean standalone) {
        this.standalone = standalone;
    }

    public List<String> getImports() {
        return imports;
    }

    public void setImports(List<String> imports) {
        this.imports = imports;
    }

    public List<HtmlElement> getTemplate() {
        return template;
    }

    public void setTemplate(List<HtmlElement> template) {
        this.template = template;
    }

    public List<ClassDeclaration> getClassDeclarations() {
        return classDeclarations;
    }

    public void setClassDeclarations(List<ClassDeclaration> classDeclarations) {
        this.classDeclarations = classDeclarations;
    }

    @Override
    public String toString() {
        return "\nComponentConfig {" +
                "\nselector='" + selector + '\'' +
                "\n, standalone=" + standalone +
                "\n, imports=" + imports +
                "\n, template=" + template +
                "\n, classDeclarations=" + classDeclarations +
                "\n}";
    }
}
