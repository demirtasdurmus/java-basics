public class App {
    public static void main(String... args) throws Exception {
        System.out.println("Hello, World!");

        String[] splitStrings = "Hello World Again".split(" ");
        printText(splitStrings);

        System.out.println("-".repeat(20));
        printText("Hello");

        String[] sArray = { "first", "second", "third" };
        System.out.println(String.join(",", sArray));
    }

    private static void printText(String... textList) {
        for (String string : textList) {
            System.out.println(string);
        }
    }
}
