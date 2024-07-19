package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

class PlainOld {
  private static int last_id = 1;

  private int id;

  public PlainOld() {
    id = PlainOld.last_id++;
    System.out.println(id);
  }

  public int getId() {
    return id;
  }

}

public class Main {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>(List.of("Anna", "Bob", "Chuck", "Dave"));

    addSection("Lambda Expression");
    list.forEach(s -> System.out.println(s));

    addSection("Method Reference");
    list.forEach(System.out::println);

    addSection("Lambda Expression");
    calculator((a, b) -> a + b, 10, 25);

    addSection("Method Reference");
    calculator(Integer::sum, 10, 25);
    calculator(Double::sum, 10.25, 25.25);

    /**
     * The following two will not print anything
     * We can think of them callback funtions passed and will
     * be executed when needed
     * to execute them look at the following opearation and syntax
     */
    addSection("Functional Interface");
    Supplier<PlainOld> reference1 = () -> new PlainOld();

    addSection("Method Reference");
    Supplier<PlainOld> reference2 = PlainOld::new;

    addSection("Execution");
    // To execute functional interface and method reference
    PlainOld newPojo1 = reference1.get();
    PlainOld newPojo2 = reference2.get();

    addSection("Getting Array");
    PlainOld[] pojo1 = seedArr(PlainOld::new, 10);
  }

  private static <T> void calculator(BinaryOperator<T> function, T value1, T value2) {
    T result = function.apply(value1, value2);
    System.out.println("The result of the operation: " + result);
  }

  private static void addSection(String title) {
    System.out.println("-".repeat(5) + " " + title + " " + "-".repeat(5));
  }

  private static PlainOld[] seedArr(Supplier<PlainOld> reference, int count) {
    PlainOld[] arr = new PlainOld[count];
    Arrays.setAll(arr, i -> reference.get());
    return arr;
  }
}
