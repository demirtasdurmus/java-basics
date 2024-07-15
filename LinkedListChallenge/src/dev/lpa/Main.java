package dev.lpa;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String town, int distance) {
  @Override
  public String toString() {
    return String.format("%s (%d)", town, distance);
  }
}

public class Main {
  public static void main(String[] args) {
    LinkedList<Place> places = new LinkedList<>();

    Place adelaide = new Place("Adelaide", 1374);
    addPlace(places, adelaide);
    addPlace(places, new Place("Brisbane", 917));
    addPlace(places, new Place("Perth", 3923));
    addPlace(places, new Place("Alice Springs", 2771));
    addPlace(places, new Place("Darwin", 3972));
    addPlace(places, new Place("Melbourne", 877));

    addPlace(places, new Place("Sydney", 0));

    // System.out.println("Places" + places);

    var iterator = places.listIterator();
    Scanner scanner = new Scanner(System.in);
    boolean quitLoop = false;
    boolean forward = true;

    printMenu();

    while (!quitLoop) {
      if (!iterator.hasPrevious()) {
        System.out.println("Originating: " + iterator.next());
        forward = true;
      }

      if (!iterator.hasNext()) {
        System.out.println("Final: " + iterator.previous());
        forward = false;
      }

      System.out.println("Enter value: ");
      String menuItem = scanner.nextLine().toUpperCase().substring(0, 1);

      switch (menuItem) {
        case "F":
          System.out.println("User wants to go forward");
          if (!forward) {
            forward = true; // Reversing the direction
            if (iterator.hasNext()) {
              iterator.next(); // Adjust position forward
            }
          }

          if (iterator.hasNext()) {
            System.out.println(iterator.next());
          }
          break;
        case "B":
          System.out.println("User wants to go backwards");
          if (forward) {
            forward = false; // Reversing the direction
            if (iterator.hasPrevious()) {
              iterator.previous(); // Adjust position backwards
            }
          }

          if (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
          }
          break;
        case "L":
          System.out.println(places);
          break;
        case "M":
          printMenu();
          break;
        default:
          quitLoop = true;
          break;
      }
    }

    scanner.close();

  }

  private static void addPlace(LinkedList<Place> list, Place place) {
    if (list.contains(place)) {
      System.out.println("Duplicate");
      return;
    }

    for (Place p : list) {
      if (p.town().equalsIgnoreCase(place.town())) {
        System.out.println("Duplicate");
        return;
      }
    }

    int matchedIndex = 0;
    for (Place listPlace : list) {
      if (place.distance() < listPlace.distance()) {
        list.add(matchedIndex, place);
        return;
      }
      matchedIndex++;
    }

    list.add(place);
  }

  private static void printMenu() {
    System.out.println("""
        Available actions (select word or letter):
        (F)orward
        (B)ackwards
        (L)ist Places
        (M)enu
        (Q)uit
        """);
  }
}
