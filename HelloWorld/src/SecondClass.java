public class SecondClass {
  public static void main(String[] args) {
    System.out.println("Hello, Durmus!");

    boolean isAlien = true;

    if (isAlien == false) {
      System.out.println("It is not an alien");
      System.out.println("And I am scared of aliens");
    }

    int topScore = 82;
    if (topScore != 100) {
      System.out.println("You got the high score");
    }

    int secondTopScore = 81;

    if ((topScore > secondTopScore) && (topScore < 100)) {
      System.out.println("Greater than top score and less than 100");
    }

    if (topScore > 90 || secondTopScore <= 90) {
      System.out.println("Either or both of the conditions are true");
    }

    int newValue = 50;
    if (newValue == 50) {
      System.out.println("mathced");
    }

    boolean isCar = false;
    if (!isCar) {
      System.out.println("This is a car");
    }

    String makeOfCar = "Volkswagen";
    boolean isDomestic = makeOfCar == "Volkswagen" ? true : false;

    if (isDomestic) {
      System.out.println("This car is domestic to our country");
    }

    // challenge
    double firstOne = 20.00d;
    double secondOne = 80.00d;
    double totalSum = (firstOne + secondOne) * 100.00d;
    double remainder = totalSum % 40.00d;
    boolean hasZeroRemainder = remainder == 0.00 ? true : false;
    System.out.println(hasZeroRemainder);

    if (!hasZeroRemainder) {
      System.out.println("got some remainder");
    }
  }
}
