public class SmartKitchen {
  private CoffeeMaker brewMaster;
  private Refrigerator iceBox;
  private DishWasher dishwasher;

  public SmartKitchen() {
    brewMaster = new CoffeeMaker();
    iceBox = new Refrigerator();
    dishwasher = new DishWasher();
  }

  public CoffeeMaker getBrewMaster() {
    return brewMaster;
  }

  public Refrigerator getIceBox() {
    return iceBox;
  }

  public DishWasher getDishwasher() {
    return dishwasher;
  }

  public void setKithcenState(boolean coffeFlag, boolean fridgeFlag, boolean dishWasherFlag) {
    brewMaster.setHasWorkToDo(coffeFlag);
    dishwasher.setHasWorkToDo(dishWasherFlag);
    iceBox.setHasWorkToDo(fridgeFlag);
  }

  public void doKitchenWork() {
    brewMaster.brewCoffee();
    iceBox.orderFood();
    dishwasher.doDishes();
  }
}

class CoffeeMaker {
  private boolean hasWorkToDo;

  public void setHasWorkToDo(boolean hasWorkToDo) {
    this.hasWorkToDo = hasWorkToDo;
  }

  public void brewCoffee() {
    if (hasWorkToDo) {
      System.out.println("Brewing Coffee");
      hasWorkToDo = false;
    }
  }
}

class Refrigerator {
  private boolean hasWorkToDo;

  public void setHasWorkToDo(boolean hasWorkToDo) {
    this.hasWorkToDo = hasWorkToDo;
  }

  public void orderFood() {
    if (hasWorkToDo) {
      System.out.println("Ordering Food");
      hasWorkToDo = false;
    }
  }
}

class DishWasher {
  private boolean hasWorkToDo;

  public void setHasWorkToDo(boolean hasWorkToDo) {
    this.hasWorkToDo = hasWorkToDo;
  }

  public void doDishes() {
    if (hasWorkToDo) {
      System.out.println("Doing Dishes");
      hasWorkToDo = false;
    }
  }
}
