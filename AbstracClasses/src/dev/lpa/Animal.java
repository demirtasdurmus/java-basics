package dev.lpa;

abstract class Mammal extends Animal {

  public Mammal(String type, String size, double weight) {
    super(type, size, weight);
  }

  // This is more flexible, may or may not implement some or all methods of its
  // parent class
  @Override
  public void move(String speed) {
    System.out.println(getExplicitType() + " ");
    System.out.println(speed.equals("slow") ? "walks" : "runs");
  }

  public abstract void shedHair();

}

public abstract class Animal {
  protected String type;

  private String size;

  private double weight;

  public Animal(String type, String size, double weight) {
    this.type = type;
    this.size = size;
    this.weight = weight;
  }

  public abstract void move(String speed); // cant use private with abstract

  public abstract void makeNoise(); // we cant add a method body

  // final means it cant be overridden
  public final String getExplicitType() { // concrete method for an abstract class
    return getClass().getSimpleName() + " (" + type + ")";
  }
}
