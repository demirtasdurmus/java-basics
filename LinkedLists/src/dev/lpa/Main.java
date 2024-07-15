package dev.lpa;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
  public static void main(String[] args) {
    // LinkedList<String> placesToVisit = new LinkedList<>();
    var placesToVisit = new LinkedList<String>();

    placesToVisit.add("Sydnay");
    placesToVisit.add(0, "Canberra");
    System.out.println(placesToVisit);

    addMoreElements(placesToVisit);
    System.out.println(placesToVisit);

    // removeElements(placesToVisit);
    // System.out.println(placesToVisit);

    // gettingElements(placesToVisit);

    // printInererary(placesToVisit);
    // printInererary2(placesToVisit);
    // printInererary3(placesToVisit);

    testIterator(placesToVisit);
  }

  public static void addMoreElements(LinkedList<String> list) {
    list.addFirst("Darwin");
    list.addLast("Hobart");

    // Queue Methods
    list.offer("Melbourne");
    list.offerFirst("Brisbane");
    list.offerLast("Toowoomba");

    // Stack Methods
    list.push("Alice Springs");
  }

  public static void removeElements(LinkedList<String> list) {
    list.remove(4);
    list.remove("Brisbane");

    String s1 = list.remove(); // Removes the first element without any args
    System.out.println("The removed element is: " + s1);

    String s2 = list.removeFirst(); // Removes the first element without any args
    System.out.println("The removed element is: " + s2);

    String s3 = list.removeLast(); // Removes the last element without any args
    System.out.println("The removed element is: " + s3);

    // Queue/Deque poll methods
    String p1 = list.poll(); // removes the first element
    System.out.println(p1 + ", was removed");

    String p2 = list.pollFirst(); // removes the first element
    System.out.println(p2 + ", was removed");

    String p3 = list.pollLast(); // removes the last element
    System.out.println(p3 + ", was removed");

    // repopulate the list
    list.push("Sydney");
    list.push("Melbourne");
    list.push("Canberra");

    String p4 = list.pop();
    System.out.println(p4 + " was removed");
  }

  public static void gettingElements(LinkedList<String> list) {
    System.out.println("Retrieved element: " + list.get(5));

    System.out.println("First Element: " + list.getFirst());
    System.out.println("Last Element: " + list.getLast());
    System.out.println("Darwin is at position: " + list.indexOf("Darwin"));
    System.out.println("Melbourne is at position: " + list.lastIndexOf("Melbourne"));

    // Queue Retrieval Method
    System.out.println("Element from element " + list.element());

    // Stack Methods
    System.out.println("Element from peek(): " + list.peek());
    System.out.println("Element from peekFirst(): " + list.peekFirst());
    System.out.println("Element from peekLast(): " + list.peekLast());
  }

  // by using traditional for loop
  public static void printInererary(LinkedList<String> list) {
    System.out.println("Trip starts at: " + list.getFirst());
    for (int i = 1; i < list.size(); i++) {
      System.out.println("--> From: " + list.get(i - 1) + " to " + list.get(i));
    }
    System.out.println("Trip ends at: " + list.getLast());
  }

  // by using forEach loop
  public static void printInererary2(LinkedList<String> list) {
    System.out.println("Trip starts at: " + list.getFirst());
    String previousTown = list.getFirst();
    for (String town : list) {
      System.out.println("--> From: " + previousTown + " to " + town);
      previousTown = town;
    }

    System.out.println("Trip ends at: " + list.getLast());
  }

  // by using list iterators
  public static void printInererary3(LinkedList<String> list) {
    System.out.println("Trip starts at: " + list.getFirst());
    String previousTown = list.getFirst();

    ListIterator<String> iterator = list.listIterator(1);
    while (iterator.hasNext()) {
      var town = iterator.next();
      System.out.println("--> From: " + previousTown + " to " + town);
      previousTown = town;
    }

    System.out.println("Trip ends at: " + list.getLast());
  }

  public static void testIterator(LinkedList<String> list) {
    var iterator = list.listIterator();
    while (iterator.hasNext()) {
      // System.out.println(iterator.next());
      if (iterator.next().equals("Brisbane")) {
        // list.remove(); // will not work as we are iterating over the iterator
        iterator.remove(); // will work
        iterator.add("Lake Wivenhoe");
      }
    }

    while (iterator.hasNext()) {
      // will never work as hasNext is false from this point on.
      // (iterator.hasPreviouse()) will work
    }

    System.out.println(list);
  }
}
