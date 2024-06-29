public class WhileAndDoWhile {
  public static void main(String[] args) {
    System.out.println("I will run while and do while loops");

    // whileLoop();
    // doWhileLoop();
    // outputEvenNumbers();
    classes();
  }

  public static void whileLoop() {
    int condition = 5;
    while (condition < 50) {
      condition++;
    }

    System.out.println(condition + "exiting");

  }

  public static void doWhileLoop() {
    int j = 1;
    boolean isReady = false;

    do {
      if (j > 5) {
        break;
      }

      System.out.println(j);
      j++;
      isReady = j > 0;
    } while (isReady);
  }

  public static boolean isEvenNumber(int number) {
    if (number % 2 == 0) {
      return true;
    }

    return false;
  }

  public static void outputEvenNumbers() {
    int start = 5;

    while (start <= 20) {
      if (isEvenNumber(start)) {
        System.out.println(start);
      }

      start++;
    }
  }

  public static void classes() {
    String s = new String("This is a string");
    System.out.println(s.toUpperCase());
  }
}
