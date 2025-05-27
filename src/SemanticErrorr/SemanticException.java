package SemanticErrorr;
public class SemanticException extends Exception {
    private final String fileName;
    private final int lineNumber;

    public SemanticException(String message, String fileName, int lineNumber) {
        super(message);
        this.fileName = fileName;
        this.lineNumber = lineNumber;
    }

    public String getFileName() {
        return fileName;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    @Override
    public String toString() {
        return "❌ [" + getClass().getSimpleName() + "] في الملف: " + fileName + " السطر: " + lineNumber + " - " + getMessage();
    }
}

