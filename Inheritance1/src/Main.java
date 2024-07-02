public class Main {
    public static void main(String[] args) {
        // ! instantiating the class
        // ! feeding the constructor
        // ! overloading
        Car car = new Car();

        // Car car = new Car("Bob");

        // ! using getters
        System.out.println("Car's make is: " + car.getMake());

        // ! using setters
        car.setMake("Porsche");
        System.out.println("Car's make is: " + car.getMake());

        // ! Call the public method of an instance
        car.describeCar();

        LPAStudent student = new LPAStudent("id", "name", "dateOfBirth", "classList");

        System.out.println(student);
    }
}
