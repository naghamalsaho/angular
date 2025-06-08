package SemanticErrorr;


public class SemanticErrorg extends SemanticException {
    private final String type;

    public SemanticErrorg(String type, String message, String fileName, int lineNumber) {
        super(message, fileName, lineNumber);
        this.type = type;
    }

    @Override
    public String toString() {

        return "❌ [" + type + "]  in file: " + getFileName() +
                " line: " + getLineNumber() + " - " + getMessage();
    }
}
