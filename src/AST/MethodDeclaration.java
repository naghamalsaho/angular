package AST;

import java.util.List;

public class MethodDeclaration {
    private String methodName;
    private List<Parameter> parameters;
    private List<Statement> statements;

    public MethodDeclaration(String var1, List<Parameter> var2, List<Statement> var3) {
        this.methodName = var1;
        this.parameters = var2;
        this.statements = var3;
    }

    public String getMethodName() {
        return this.methodName;
    }

    public void setMethodName(String var1) {
        this.methodName = var1;
    }

    public List<Parameter> getParameters() {
        return this.parameters;
    }

    public void setParameters(List<Parameter> var1) {
        this.parameters = var1;
    }

    public List<Statement> getStatements() {
        return this.statements;
    }

    public void setStatements(List<Statement> var1) {
        this.statements = var1;
    }

    public String toString() {
        return "\nMethodDeclaration {\n  methodName='" + this.methodName + "'\n  parameters=" + this.parameters + "\n  statements=" + this.statements + "\n}";
    }
}

