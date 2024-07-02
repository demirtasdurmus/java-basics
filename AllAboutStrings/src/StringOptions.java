public class StringOptions {
  public static void main(String[] args) {
    System.out.println("String Builder Class");

    String helloWorld = "hello" + " world";
    // ! need to assign a variable to take effect
    helloWorld.concat(" and  Goodbye");

    StringBuilder helloWorldBuilder = new StringBuilder("hello" + " world");
    helloWorldBuilder.append(" and Goodbye");

    printInfo(helloWorld);
    printInfo(helloWorldBuilder);

    StringBuilder emptyStart = new StringBuilder();
    emptyStart.append("a".repeat(17));

    StringBuilder emptyStart32 = new StringBuilder(32);
    emptyStart32.append("a".repeat(17));

    printInfo(emptyStart);
    printInfo(emptyStart32);
  }

  public static void printInfo(String string) {
    System.out.println("String = " + string);
    System.out.println("length = " + string.length());
  }

  public static void printInfo(StringBuilder builder) {
    System.out.println("Stringbuilder = " + builder);
    System.out.println("length = " + builder.length());
  }
}
