public class ForStatement {
  public static void main(String[] args) {
    System.out.println("This is the for statement");

    forLoop();
  }

  public static void forLoop() {
    for (double rate = 2.0; rate < 5.0; rate++) {
      if (rate > 3.0) {
        break;
      }

      double interestAmount = calculateInterest(10000, rate);
      System.out.println(interestAmount);
    }
  }

  public static double calculateInterest(double amount, double rate) {
    return (amount * (rate / 100));
  }

}
