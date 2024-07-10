package dev.lpa;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    /**
     * these two has two references, but points the same array
     * when we change the first element of the latter
     * the original array will be updated, too.
     */

    int[] myIntArray = new int[5];
    int[] anotherArray = myIntArray;

    System.out.println("Initially " + Arrays.toString(myIntArray));
    System.out.println("Initially " + Arrays.toString(anotherArray));

    anotherArray[0] = 1;

    System.out.println("After changing the latter " + Arrays.toString(myIntArray));
    System.out.println("After changing the latter " + Arrays.toString(anotherArray));
  }
}
