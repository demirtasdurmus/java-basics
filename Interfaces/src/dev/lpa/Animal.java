package dev.lpa;

enum FlightStages implements Trackable {
  GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

  @Override
  public void track() {
    if (this != GROUNDED) {
      System.out.println("monitoring" + this);
    }
  }
}

record DragonFly(String name, String type) implements FligtEnabled {

  @Override
  public void takeOff() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'takeOff'");
  }

  @Override
  public void land() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'land'");
  }

  @Override
  public void fly() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'fly'");
  }

}

class Satellite implements OrbitEarth {

  // static methods, by default public but we can make it private
  static void log(String description) {
    var today = new java.util.Date();
    System.out.println(today + " : " + description);
  }

  @Override
  public void takeOff() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'takeOff'");
  }

  @Override
  public void land() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'land'");
  }

  @Override
  public void fly() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'fly'");
  }

  @Override
  public void achieveOrbit() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'achieveOrbit'");
  }
}

interface OrbitEarth extends FligtEnabled {
  void achieveOrbit();
}

interface FligtEnabled {

  double MILES_TO_KM = 1.60934;
  // final double MILES_TO_KM = 1.60934;
  // public final double MILES_TO_KM = 1.60934;
  // public static final double MILES_TO_KM = 1.60934 // All of the four give the
  // same result on an interface
  double KM_TO_MILES = 0.621371; // these are by default public and final

  /**
   * These three declarations result in the same manner
   */
  public abstract void takeOff(); // cant use protected here

  abstract void land();

  void fly();

  // default methods
  default FlightStages transition(FlightStages stage) {
    System.out.println("transition not implemented on: " + this.getClass().getName());
    return null;
  }
}

interface Trackable {
  void track();
}

public abstract class Animal {

  public abstract void move();
}
