public class App {
    public static void main(String[] args) throws Exception {
        printInfo("Hello World");

        printInfo("");
    }

    public static void printInfo(String string) {
        if (string.isEmpty()) {
            System.out.println("Empty");
            return;
        }

        int length = string.length();
        System.out.printf("Length = %d %n", length);
        System.out.printf("First char = %c %n", string.charAt(0));

        System.out.printf("Last char = %c %n", string.charAt(length - 1));

        /**
         * OTHER METHODS
         * indexOf
         * lastIndexOf
         * contains
         * startsWith
         * endsWith
         * equals
         * contentEquals
         * substring
         * join - joins number of strings (delimiter, elements)
         * concat
         * replace
         * replaceAll
         * replaceFirst
         * repeat
         * indent
         */
    }
}

/**
 * String methods
 * Inspection, Equality and Manipulation methods
 */