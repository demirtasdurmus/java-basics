package dev.lpa;

import java.util.function.Function;

public class Main {
  public static void main(String[] args) {
    String name = "Durmus";
    Function<String, String> uCase = String::toUpperCase;
    System.out.println(uCase.apply(name));

    Function<String, Integer> f = uCase
        .andThen(s -> s.concat("Demirtas"))
        .andThen(s -> s.split(" "))
        .andThen(s -> String.join(", ", s))
        .andThen(String::length);
    System.out.println(f.apply(name));
  }
}
