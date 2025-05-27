package SemanticErrorr;

/**
 * تم توسيع هذا الصنف ليتلقّى:
 *   1. نوع الخطأ (type)
 *   2. رسالة الخطأ (message)
 *   3. اسم الملف (fileName)
 *   4. رقم السطر (lineNumber)
 */
public class SemanticErrorg extends SemanticException {
    private final String type;

    public SemanticErrorg(String type, String message, String fileName, int lineNumber) {
        super(message, fileName, lineNumber);
        this.type = type;
    }

    @Override
    public String toString() {
        // نستخدم الحقل 'type' بدل الاعتماد على اسم الصنف
        return "❌ [" + type + "] في الملف: " + getFileName() +
                " السطر: " + getLineNumber() + " - " + getMessage();
    }
}
