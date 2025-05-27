package AST;

public class ClassDeclaration extends HtmlElement {
    private String className;
    private ClassBody classBody;

    public ClassDeclaration() {
    }

    public String getClassName() {
        return this.className;
    }

    public void setClassName(String var1) {
        this.className = var1;
    }

    public ClassBody getClassBody() {
        return this.classBody;
    }

    public void setClassBody(ClassBody var1) {
        this.classBody = var1;
    }

    public String toString() {
        return "\nClassDeclaration {\nclassName='" + this.className + "'\n, classBody=" + this.classBody + "}";
    }
}
