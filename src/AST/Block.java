package AST;

import java.util.List;

public class Block {
    private List<Statement> statements;

    public Block(List<Statement> var1) {
        this.statements = var1;
    }

    public List<Statement> getStatements() {
        return this.statements;
    }

    public void setStatements(List<Statement> var1) {
        this.statements = var1;
    }

    public String toString() {
        return "Block{statements=" + this.statements + "}";
    }
}
