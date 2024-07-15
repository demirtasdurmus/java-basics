package dev.lpa;

public class Main {
  public static void main(String[] args) {
    Bird bird = new Bird();

    Animal animal = bird;

    FligtEnabled flier = bird;

    Trackable tracked = bird;

    animal.move();
    // flier.move(); // wont compile
    // tracked.move(); // wont compile

    double kmsTraveled = 100;
    double milesTraveled = kmsTraveled * FligtEnabled.KM_TO_MILES;
    System.out.println(milesTraveled + "miles traveled");

    flier.takeOff();

    if (flier instanceof Trackable trackable) {
      trackable.track();
    }
  }
}
