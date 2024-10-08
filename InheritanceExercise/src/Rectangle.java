public class Rectangle {
  private double width;
  private double length;

  public Rectangle() {
  }

  public Rectangle(double width, double length) {
    this.length = length < 0 ? 0 : length;
    this.width = width < 0 ? 0 : width;
  }

  public double getWidth() {
    return width;
  }

  public double getLength() {
    return length;
  }

  public double getArea() {
    return width * length;
  }
}

class Cuboid extends Rectangle {
  private double height;

  public Cuboid(double width, double length, double height) {
    super(width, length);
    this.height = height < 0 ? 0 : height;
  }

  public double getHeight() {
    return height;
  }

  public double getVolume() {
    return getArea() * height;
  }
}
