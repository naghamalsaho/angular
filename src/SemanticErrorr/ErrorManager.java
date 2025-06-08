package SemanticErrorr;

import java.util.ArrayList;
import java.util.List;

public class ErrorManager {
    private static final List<SemanticException> errors = new ArrayList<>();


    public static void logError(SemanticException e) {
        errors.add(e);
    }

    public static boolean hasErrors() {
        return !errors.isEmpty();
    }

    public static List<SemanticException> getErrors() {
        return errors;
    }

    public static void clearErrors() {
        errors.clear();
    }
}
