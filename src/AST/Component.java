package AST;

public class Component extends HtmlElement {
    private ImportStatements importStatements;
    private ComponentConfig componentConfig;

    public Component() {
    }

    public ImportStatements getImportStatements() {
        return this.importStatements;
    }

    public void setImportStatements(ImportStatements var1) {
        this.importStatements = var1;
    }

    public ComponentConfig getComponentConfig() {
        return this.componentConfig;
    }

    public void setComponentConfig(ComponentConfig var1) {
        this.componentConfig = var1;
    }

    public String toString() {
        return "\nComponent {\nimportStatements=" + this.importStatements + "\n, componentConfig=" + this.componentConfig + "}";
    }
}
