package AST;

public class Value {
    private String stringLiteral;
    private String backtickString;
    private Boolean booleanLiteral;
    private Double numberLiteral;
    private String identifier;
    private ThisAccess thisAccess;

    public Value(String var1) {
        this.stringLiteral = var1;
    }

    public Value(Boolean var1) {
        this.booleanLiteral = var1;
    }

    public Value(Double var1) {
        this.numberLiteral = var1;
    }

    public Value(String var1, boolean var2) {
        if (var2) {
            this.identifier = var1;
        }

    }

    public Value(ThisAccess var1) {
        this.thisAccess = var1;
    }

    public Value(String var1, int var2) {
        this.backtickString = var1;
    }

    public String getStringLiteral() {
        return this.stringLiteral;
    }

    public String getBacktickString() {
        return this.backtickString;
    }

    public Boolean getBooleanLiteral() {
        return this.booleanLiteral;
    }

    public Double getNumberLiteral() {
        return this.numberLiteral;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public ThisAccess getThisAccess() {
        return this.thisAccess;
    }

    public String toString() {
        if (this.stringLiteral != null) {
            return "\nValue{stringLiteral='" + this.stringLiteral + "'}";
        } else if (this.backtickString != null) {
            return "\nValue{backtickString=`" + this.backtickString + "`}";
        } else if (this.booleanLiteral != null) {
            return "\nValue{booleanLiteral=" + this.booleanLiteral + "}";
        } else if (this.numberLiteral != null) {
            return "\nValue{numberLiteral=" + this.numberLiteral + "}";
        } else if (this.identifier != null) {
            return "\nValue{identifier='" + this.identifier + "'}";
        } else {
            return this.thisAccess != null ? "\nValue{thisAccess=" + this.thisAccess + "}" : "\nValue{null}";
        }
    }
}
