package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    int[] firstArray = getRandomArray(10);
    System.out.println(Arrays.toString(firstArray));

    // Sorting
    Arrays.sort(firstArray);
    System.out.println(Arrays.toString(firstArray));

    // Filling
    int[] secondArray = new int[10];
    System.out.println(Arrays.toString(secondArray));
    Arrays.fill(secondArray, 5);
    System.out.println(Arrays.toString(secondArray));

    // Copying, immutable, the original arrays remains as is
    // You can decrease/increase the length, it will work
    int[] thirdArray = Arrays.copyOf(secondArray, secondArray.length);
    System.out.println(Arrays.toString(thirdArray));

    /**
     * Binary Search
     * It works only in sorted arrays
     * Will return the index if there is match
     * Will return -1 in there is no match
     * Will throw error if multiple types exist
     */
    String[] sArray = { "Able", "Jane", "Mark", "Ralph", "David" };
    Arrays.sort(sArray);
    System.out.println(Arrays.toString(sArray));
    if (Arrays.binarySearch(sArray, "Mark") >= 0) {
      System.out.println("Found Mark in the list");
    }

    /**
     * Comparing Arrays
     * Will return true only if lengths, orders and values are equal
     */
    int[] s1 = { 1, 2, 3, 4, 5 };
    int[] s2 = { 1, 2, 3, 4, 5 };

    if (Arrays.equals(s1, s2)) {
      System.out.println("Arrays are equal");
    } else {
      System.out.println("Not Equal");
    }
  }

  private static int[] getRandomArray(int len) {
    Random random = new Random();
    int[] newInt = new int[len];

    for (int i = 0; i < newInt.length; i++) {
      newInt[i] = random.nextInt(100);
    }

    return newInt;
  }
}
