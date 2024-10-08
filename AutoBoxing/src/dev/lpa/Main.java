package dev.lpa;

public class Main {
  public static void main(String[] args) {
    Integer boxedInt = Integer.valueOf(15); // preferred but unnecessary
    Integer deprecatedBoxing = new Integer(15); // deprecated since JDK 9
    int unboxedInt = boxedInt.intValue(); // unnecessary

    // Automatic
    Integer autoBoxed = 15;
    int autoUnboxed = autoBoxed;
    System.out.println(autoBoxed.getClass().getName());
    // System.out.println(autoUnboxed.getClass()); // primitive types do not have
    // methods
  }
}
