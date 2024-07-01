public class App extends Object {
    public static void main(String[] args) {
        Student max = new Student("Max", 21);

        System.out.println(max.toString());
    }

}

class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        // return "Student [name=" + name + ", age=" + age + "]";
        return name + " is " + age;
    }

    // ! no value doing this as it is the default behaviour
    // @Override
    // public String toString() {
    // return super.toString();
    // }

}
