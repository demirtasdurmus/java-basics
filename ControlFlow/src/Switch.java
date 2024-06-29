public class Switch {
    public static void main(String[] args) {
        int value = 4;

        // ! Legacy syntax
        // ! Cannot be used with long, double, boolean or their wrappers
        switch (value) {
            case 1:
                System.out.println(value);
                break;
            case 2:
                System.out.println(value);
                break;
            case 3:
            case 4:
                System.out.println("Either 3 or 4: " + value);
                break;
            default:
                System.out.println("Default case: " + value);
                break;
        }

        // ! New syntax
        switch (value) {
            case 1 -> System.out.println(value);
            case 2 -> System.out.println(value);
            default -> System.out.println("Default " + value);
        }

        System.out.println("Quarter is: " + getQuarter("january"));
    }

    public static String getQuarter(String month) {
        // ! We can assing the new switch syntax to a local variable
        String quarter = switch (month) {
            case "january", "february", "march" -> "1st";
            case "april", "may", "june" -> "2st";
            case "july", "august", "september" -> "3st";
            case "october", "november", "december" -> "4st";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
        System.out.println(quarter);
        // return quarter;

        // ! Alternatively
        return switch (month) {
            case "january", "february", "march" -> "1st";
            case "april", "may", "june" -> "2st";
            case "july", "august", "september" -> "3st";
            case "october", "november", "december" -> "4st";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
}
