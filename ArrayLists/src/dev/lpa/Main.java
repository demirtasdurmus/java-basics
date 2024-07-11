package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

record GroceryItem(String name, String type, int count) {
  public GroceryItem(String name) {
    this(name, "DAIRY", 1);
  }
}

public class Main {
  public static void main(String[] args) {
    /**
     * Normal Array
     */
    GroceryItem[] groceryArray = new GroceryItem[3];
    groceryArray[0] = new GroceryItem("milk");
    groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
    groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
    System.out.println(Arrays.toString(groceryArray));

    /**
     * ArrayList
     */
    ArrayList<GroceryItem> groceryArrayList = new ArrayList<>();
    groceryArrayList.add(new GroceryItem("butter"));
    groceryArrayList.add(new GroceryItem("yogurt", "PRODUCE", 6));
    groceryArrayList.add(new GroceryItem("oranges", "PRODUCE", 5));
    groceryArrayList.add(1, new GroceryItem("apple"));
    groceryArrayList.set(2, new GroceryItem("juice"));
    groceryArrayList.remove(2);
    System.out.println(groceryArrayList);

    /**
     * Lists
     * immutable
     */

    String[] items = { "apples", "bananas", "milk", "eggs" };

    List<String> list = List.of(items);
    System.out.println(list);
    System.out.println(list.getClass().getName());
    // list.add("sth"); // wont work

    /**
     * Another way to create an arrayList and addAll
     */
    ArrayList<String> anotherList = new ArrayList<>(
        List.of("pickles", "mustard", "cheese"));
    System.out.println(anotherList);
    anotherList.addAll(anotherList);
    System.out.println(anotherList);

    /**
     * Some methods
     */
    System.out.println(anotherList.get(2));

    if (anotherList.contains("mustard")) {
      System.out.println("Includes mustard");
    }

    System.out.println(anotherList.indexOf("pickles"));
    anotherList.remove("pickles");

    anotherList.removeAll(List.of("cheese", "mustard")); // or retain all which clears all elements except passed
    System.out.println(anotherList);

    anotherList.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));
    System.out.println(anotherList);
    anotherList.sort(Comparator.naturalOrder());
    System.out.println(anotherList); // strings will be sorted alphabetically
    anotherList.sort(Comparator.reverseOrder());
    System.out.println(anotherList); // strings will be sorted alphabetically

    /**
     * Converting an ArrayList to an Array or vice versa
     */
    var groceryArray2 = anotherList.toArray(new String[anotherList.size()]);
    System.out.println(Arrays.toString(groceryArray2));
    var originalList = Arrays.asList(groceryArray2);
    System.out.println(originalList);
  }
}
