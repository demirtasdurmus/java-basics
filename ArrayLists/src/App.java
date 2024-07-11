import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class App {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        ArrayList<String> groceries = new ArrayList<>();

        boolean flag = true;
        int input = Integer.parseInt(scanner.nextLine());
        while (flag) {
            printActions();
            switch (input) {
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }

        scanner.close();
    }

    private static void addItems(ArrayList<String> groceries) {
        System.out.println("Add item(s) [separate by comma]: ");
        String[] items = scanner.nextLine().split(",");
        // groceries.addAll(List.of(items));

        // check for duplicates
        for (String i : items) {
            String trimmed = i.trim();
            if (groceries.indexOf(trimmed) < 0) {
                groceries.add(trimmed);
            }
        }
    }

    private static void removeItems(ArrayList<String> groceries) {
        System.out.println("Add item(s) [separate by comma]: ");
        String[] items = scanner.nextLine().split(",");

        // check for duplicates
        for (String i : items) {
            String trimmed = i.trim();
            groceries.remove(trimmed);

        }
    }

    private static void printActions() {
        String textBlock = """
                Available actions:

                0 - to shutdown

                1 - to add item(s) to list (comma delimited list)

                2 - to remove any items (comma delimited list)

                Enter a number for which action you want to do:""";
        System.out.println(textBlock + " ");
    }
}
