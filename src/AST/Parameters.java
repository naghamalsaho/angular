package AST;

import java.util.Iterator;
import java.util.List;

public class Parameters {
    private List<Parameter> parameterList;

    public Parameters(List<Parameter> var1) {
        this.parameterList = var1;
    }

    public List<Parameter> getParameterList() {
        return this.parameterList;
    }

    public void setParameterList(List<Parameter> var1) {
        this.parameterList = var1;
    }

    public String toString() {
        StringBuilder var1 = new StringBuilder();
        System.out.println("Printing Parameters:");
        Iterator var2 = this.parameterList.iterator();

        while(var2.hasNext()) {
            Parameter var3 = (Parameter)var2.next();
            var1.append(var3.toString()).append(", ");
            System.out.println(var3);
        }

        if (var1.length() > 0) {
            var1.setLength(var1.length() - 2);
        }

        return var1.toString();
    }
}
