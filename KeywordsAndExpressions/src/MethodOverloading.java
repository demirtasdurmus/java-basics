public class MethodOverloading {
  public static void main(String[] args) {
    System.out.println(convertToCentimeters(5.8));

    System.out.println(convertToCentimeters(2.2, 5.8));
  }

  public static double convertToCentimeters(double inches) {
    return inches * 2.54;
  }

  public static double convertToCentimeters(double feet, double inches) {
    return feet + inches * 2.54;
  }
}
