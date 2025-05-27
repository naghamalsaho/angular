package AST;

import java.util.List;

public class ParameterList {
    private List<Parameter> parameters;

    public ParameterList(List<Parameter> var1) {
        this.parameters = var1;
    }

    public List<Parameter> getParameters() {
        return this.parameters;
    }

    public void setParameters(List<Parameter> var1) {
        this.parameters = var1;
    }

    public String toString() {
        return "ParameterList{parameters=" + this.parameters + "}";
    }
}
