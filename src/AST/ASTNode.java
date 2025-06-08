package AST;

public abstract class ASTNode {
    protected int lineNumber;

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    // Optional: لتسهيل الطباعة أو التصحيح
    public abstract String toString();
}
