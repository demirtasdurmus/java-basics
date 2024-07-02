public class App {
    public static void main(String[] args) throws Exception {
        String bulletIt = "String list: \n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point";
        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List:
                    \u2022 First Point
                        \u2022 Sub Point
                """;
        System.out.println(textBlock);

        int age = 35;
        int yearOfBirth = 2025 - age;
        System.out.printf("Your age birtdate is %d, age is %d\n", yearOfBirth, age);

        String formattedString = String.format("Your age is: %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);
    }
}
