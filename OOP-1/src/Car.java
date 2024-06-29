public class Car {
  private String owner;
  private String make = "Tesla";
  private String model = "Model X";
  private String color = "Gray";
  private int doors = 2;
  private boolean convertable = true;

  // ! Constructors
  // overloading the constructor
  public Car() {
    // ! this call references to the the constructor just below
    this("John");
  }

  public Car(String owner) {
    this.owner = owner;
  }

  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public String getColor() {
    return color;
  }

  public int getDoors() {
    return doors;
  }

  public boolean isConvertable() {
    return convertable;
  }

  public void setMake(String make) {
    // add some validation
    if (make == null) {
      make = "Unknown";
    }

    String lowerCaseMake = make.toLowerCase();

    switch (lowerCaseMake) {
      case "holden":
      case "porsche":
      case "tesla":
        this.make = make;
        break;
      default:
        this.make = "Unsupported ";
    }
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setDoors(int doors) {
    this.doors = doors;
  }

  public void setConvertable(boolean convertable) {
    this.convertable = convertable;
  }

  // overridden method, created with intellisense
  @Override
  public String toString() {
    return "Car [owner=" + owner + ", make=" + make + ", model=" + model + ", color=" + color + ", doors=" + doors
        + ", convertable=" + convertable + "]";
  }

  public void describeCar() {
    System.out.println(doors + "-Door " +
        color + " " +
        make + " " +
        model + " " +
        (convertable ? "Convertible" : "") +
        "is owned by " + owner);
  }
}
