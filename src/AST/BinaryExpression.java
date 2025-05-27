package AST;

public class BinaryExpression extends Expression {
    private Expression left;
    private String operator;
    private Expression right;

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "(" + left + " " + operator + " " + right + ")";
    }
}
