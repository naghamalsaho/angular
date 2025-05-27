package AST;

public class Statement {
    private Object statementContent;

    public Statement() {
    }

    public Object getStatementContent() {
        return this.statementContent;
    }

    public void setStatementContent(Object var1) {
        this.statementContent = var1;
    }

    public String toString() {
        return "\nStatement {\nstatementContent=" + this.statementContent + "}";
    }
}
