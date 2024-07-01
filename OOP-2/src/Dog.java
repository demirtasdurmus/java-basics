public class Dog extends Animal {
  private String earShape;
  private String tailShate;

  public Dog() {
    super("Mutt", "large", 200);
  }

  public Dog(String type, double weight) {
    this(type, weight, "Perky", "Curled");
  }

  public Dog(String type, double weight, String earShape, String tailShate) {
    super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
    this.earShape = earShape;
    this.tailShate = tailShate;
  }

  @Override
  public String toString() {
    return "Dog [earShape=" + earShape + ", tailShate=" + tailShate + ", toString()=" + super.toString() + "]";
  }

  public void makeNoise() {
    // overrides the parent class
    if (type == "Wolf") {
      System.out.println("Ow wooooo! ");
    }
    bark();
    System.out.println();
  }

  @Override
  public void move(String speed) {
    super.move(speed);
    if (speed == "slow") {
      bark();
    } else {
      run();
    }
    // added this to move to the next line
    System.out.println();
  }

  private void bark() {
    System.out.println("Dog barking");
  }

  private void run() {
    System.out.println("Dog running");
  }
}
