package AST;

public class Row {
    private String type;
    private String leftColumn;
    private String rightColumn;

    public Row() {
    }

    public String getType() {
        return this.type;
    }

    public void setType(String var1) {
        this.type = var1;
    }

    public String getLeftColumn() {
        return this.leftColumn;
    }

    public void setLeftColumn(String var1) {
        this.leftColumn = var1;
    }

    public String getRightColumn() {
        return this.rightColumn;
    }

    public void setRightColumn(String var1) {
        this.rightColumn = var1;
    }
}
