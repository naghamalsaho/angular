package AST;

import java.util.List;

public class MethodCall {
    private String methodName;
    private List<Expression> arguments;

    public MethodCall() {
    }

    public String getMethodName() {
        return this.methodName;
    }

    public void setMethodName(String var1) {
        this.methodName = var1;
    }

    public List<Expression> getArguments() {
        return this.arguments;
    }

    public void setArguments(List<Expression> var1) {
        this.arguments = var1;
    }

    public String toString() {
        return "\nMethodCall {\nmethodName='" + this.methodName + "'\n, arguments=" + this.arguments + "}";
    }
}
