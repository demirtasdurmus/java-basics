package dev.lpa;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] intArray = new int[10];
    // intArray[0] = "1"; // compiler error
    intArray[5] = 50; // stores 50 as 5th index

    double[] doubleArray = new double[10];
    doubleArray[2] = 3.5;

    // ---------------- alternative initialization -------------------
    int[] firstTen = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    System.out.println("first= " + firstTen[0]);

    int length = firstTen.length;
    System.out.println("length of array = " + length);
    System.out.println("last = " + firstTen[length - 1]);

    int[] newArray;
    // newArray = {1,2,3}; // compiler error

    newArray = new int[] { 1, 2, 3 };

    for (int i = 0; i < newArray.length; i++) {
      System.out.print(newArray[i] + " ");
    }

    System.out.println();

    // Use a for loop to populate an uninitialized array
    int[] emptyArray;
    emptyArray = new int[5];
    for (int i = 0; i < emptyArray.length; i++) {
      emptyArray[i] = emptyArray.length - i;
    }

    for (int i : emptyArray) {
      System.err.print(i + " ");
    }

    System.out.println();

    // We cant print an array as is, need to override toString method
    System.out.println(Arrays.toString(emptyArray));

    // Object array
    Object[] objectArray = new Object[3];
    objectArray[0] = "Hello";
    objectArray[1] = new StringBuilder("World");
    objectArray[2] = emptyArray;
    // A way to create an array with different types
  }
}

/**
 * Array is not resizable
 * If we do not use array initializer statement
 * For primitive types, default is zero for int, double, short
 * For booleans, it is false
 * For any class, it is null
 */