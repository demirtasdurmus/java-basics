import java.util.Scanner;

public class ParsingData {
  public static void main(String[] args) {
    int currentYear = 2024;

    try {
      System.out.println(getInputFromConsole(currentYear));
      // System.out.println(getInputFromScanner(currentYear));
    } catch (Exception e) {
      System.err.println("En erro occured");
    }
  }

  public static void parseStrings() {
    String currentYear = "2024";
    String usersDateOfBirth = "1989";

    int currentYearInt = Integer.parseInt(currentYear);
    int usersDateOfBirthInt = Integer.parseInt(usersDateOfBirth);

    String age = Integer.toString(currentYearInt - usersDateOfBirthInt);

    System.out.println("age: " + age);
  }

  public static String getInputFromConsole(int currentYear) {

    String name = System.console().readLine("Hi, what is your name?");
    System.out.println("Hi my name is: " + name);

    String dateOfBirth = System.console().readLine("When were you born?");

    int age = currentYear - Integer.parseInt(dateOfBirth);

    return "You are " + age + " years old";
  }

  public static String getInputFromScanner(int currentYear) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Hi, what is your name?");
    String name = scanner.nextLine();

    System.out.println("Hi my name is: " + name);

    boolean isValidDob = false;
    int age = 0;
    do {
      System.out.println("When were you born?");
      String dateOfBirth = scanner.nextLine();

      if (checkData(currentYear, dateOfBirth)) {
        age = currentYear - Integer.parseInt(dateOfBirth);
        isValidDob = true;
      } else {
        System.out.println("Please enter a valid and logical date...");
      }
    } while (isValidDob == false);

    scanner.close();

    return "Your age is " + age + " years old.";
  }

  public static boolean checkData(int currentYear, String dateOfBirth) {
    int dob = 0;
    try {
      dob = Integer.parseInt(dateOfBirth);
    } catch (NumberFormatException badUserDate) {
      System.out.println("Bad user data, enter numeric values");
    }

    int minYear = currentYear - 150;

    if (dob < minYear || (dob > currentYear)) {
      return false;
    }

    return true;
  }
}
