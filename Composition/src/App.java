public class App {
    public static void main(String[] args) throws Exception {
        SmartKitchen kithcen = new SmartKitchen();

        // kithcen.getDishwasher().setHasWorkToDo(true);
        // kithcen.getIceBox().setHasWorkToDo(true);
        // kithcen.getBrewMaster().setHasWorkToDo(true);

        // kithcen.getDishwasher().doDishes();
        // kithcen.getIceBox().orderFood();
        // kithcen.getBrewMaster().brewCoffee();

        kithcen.setKithcenState(true, false, true);
        kithcen.doKitchenWork();
    }
}
