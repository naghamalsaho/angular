package AST;

import SemanticErrorr.ErrorManager;
import SemanticErrorr.SemanticErrorg;

import java.util.*;

public class SymbolTable {
    private final Map<String, String> symbols = new HashMap<>();
    private final Set<String> reportedRedeclarations = new HashSet<>();

    public boolean add(String name, String type, String fileName, int lineNumber) {
        if (symbols.containsKey(name)) {
            String errorKey = "Redeclaration:" + name;
            if (!reportedRedeclarations.contains(errorKey)) {
                ErrorManager.logError(new SemanticErrorg(
                        "Redeclaration",
                        "identifier '" + name + "'  predefined.",
                        fileName,
                        lineNumber
                ));
                reportedRedeclarations.add(errorKey);
            }
            return false;
        }
        symbols.put(name, type);
        return true;
    }

    public boolean contains(String name) {
        return symbols.containsKey(name);
    }

    public String getType(String name) {
        return symbols.get(name);
    }

    public void reportError(String type, String message, String fileName, int lineNumber) {
        ErrorManager.logError(new SemanticErrorg(
                type,
                message,
                fileName,
                lineNumber
        ));
    }

    public void print() {
        if (symbols.isEmpty()) {
            System.out.println("📦 the symboltable is empty.");
            return;
        }


        List<String> names = new ArrayList<>(symbols.keySet());
        Collections.sort(names);
        List<String> types = new ArrayList<>();
        for (String name : names) {
            types.add(symbols.get(name));
        }


        int maxNameLen = "Identifier".length();
        int maxTypeLen = "Type".length();
        for (String name : names) {
            maxNameLen = Math.max(maxNameLen, name.length());
        }
        for (String type : types) {
            maxTypeLen = Math.max(maxTypeLen, type.length());
        }

        String horizontalBorder = "+"
                + "-".repeat(maxNameLen + 2) + "+"
                + "-".repeat(maxTypeLen + 2) + "+";

        System.out.println("📦  symboltable:");
        System.out.println(horizontalBorder);
        System.out.printf("| %-" + maxNameLen + "s | %-" + maxTypeLen + "s |%n", "Identifier", "Type");
        System.out.println(horizontalBorder);


        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            String type = types.get(i);
            System.out.printf("| %-" + maxNameLen + "s | %-" + maxTypeLen + "s |%n", name, type);
        }


        System.out.println(horizontalBorder);
    }
}

