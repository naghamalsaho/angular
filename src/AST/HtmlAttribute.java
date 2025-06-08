package AST;

public class HtmlAttribute {
    private String name;
    private String value;

    // مُنشئ فارغ (قد تحتاجه إذا أردت إنشاء الكائن ثم تعيين الحقول لاحقاً)
    public HtmlAttribute() { }

    // مُنشئ يُعطي الاسم والقيمة مباشرة
    public HtmlAttribute(String name, String value) {
        this.name = name;
        this.value = value;
    }

    // Getter للاسم
    public String getName() {
        return name;
    }

    // Setter للاسم
    public void setName(String name) {
        this.name = name;
    }

    // Getter للقيمة
    public String getValue() {
        return value;
    }

    // Setter للقيمة
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return name + "=\"" + value + "\"";
    }
}