public class App {
    public static void main(String[] args) throws Exception {
        Player durmus = new Player("Durmus");
        System.out.println("Initial health: " + durmus.healthRemaining());

        // ! We cannot change health by any means from outside

        Printer printer = new Printer(10, false);
        printer.printPages(10);
        System.out.println("Pages printed: " + printer.getPagesPrinted());
    }
}

/**
 * Another advantage of encapsulation
 * If we want to update a field name inside a class
 * We will just need to update it inside the class
 * As its fields are not exposed to the outside world
 * To access and set these fields we should use constructors, getters and
 * setters
 */
