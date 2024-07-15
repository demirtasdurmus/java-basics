package dev.lpa;

import java.util.Random;

public class Main {
  public static void main(String[] args) {
    DayOfTheWeek weekDay = DayOfTheWeek.TUESDAY;
    System.out.println(weekDay);

    for (int i = 0; i < 10; i++) {
      weekDay = getRandomDay();
      // System.out.printf("Name: %s, Ordinal value: %d%n", weekDay.name(),
      // weekDay.ordinal());

      // if (weekDay == DayOfTheWeek.FRIDAY) {
      // System.out.println("Thank God, It is Friday");
      // }

      switchDayOfTheWeek(weekDay);
    }

    System.out.println("-".repeat(30));

    for (Topping topping : Topping.values()) {
      System.out.println(topping.name() + " : " + topping.getPrice());
    }
  }

  public static DayOfTheWeek getRandomDay() {
    int randomInteger = new Random().nextInt(7);
    var allDays = DayOfTheWeek.values();

    return allDays[randomInteger];
  }

  public static void switchDayOfTheWeek(DayOfTheWeek weekDay) {
    int weekDayInteger = weekDay.ordinal() + 1;
    switch (weekDay) {
      case WEDNESDAY -> System.out.println("Wednesday is Day " + weekDayInteger);
      case SATURDAY -> System.out.println("Saturday is Day " + weekDayInteger);
      default -> System.out.println(
          weekDay.name().charAt(0) + weekDay.name().substring(1).toLowerCase() + " is Day " + weekDayInteger);
    }
  }
}
