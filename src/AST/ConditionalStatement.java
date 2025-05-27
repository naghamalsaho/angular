package AST;

import java.util.List;

public class ConditionalStatement {
    private Expression condition;
    private List<Statement> ifStatements;
    private List<Statement> elseStatements;

    public ConditionalStatement() {
    }

    public Expression getCondition() {
        return this.condition;
    }

    public void setCondition(Expression var1) {
        this.condition = var1;
    }

    public List<Statement> getIfStatements() {
        return this.ifStatements;
    }

    public void setIfStatements(List<Statement> var1) {
        this.ifStatements = var1;
    }

    public List<Statement> getElseStatements() {
        return this.elseStatements;
    }

    public void setElseStatements(List<Statement> var1) {
        this.elseStatements = var1;
    }

    public String toString() {
        return "\nConditionalStatement {\ncondition=" + this.condition + "\n, ifStatements=" + this.ifStatements + "\n, elseStatements=" + this.elseStatements + "}";
    }
}
