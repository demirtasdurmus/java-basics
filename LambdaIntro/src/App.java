public class App {

    record Person(String firstName, String lastName) {

        @Override
        public String toString() {
            return "Person []";
        }

    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
