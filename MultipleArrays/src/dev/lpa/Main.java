package dev.lpa;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[][] array2 = new int[4][4];

    // this will just print the ref of inner arrays
    System.out.println(Arrays.toString(array2) + array2.length);

    // this loop will print inner arrays as a string
    for (int[] outer : array2) {
      System.out.println(Arrays.toString(outer));
    }

    // this nested loop will print all of the elements as a string
    for (int i = 0; i < array2.length; i++) {
      int[] innerArray = array2[i];
      for (int j = 0; j < innerArray.length; j++) {
        System.out.print(array2[i][j] + " ");
      }
      System.out.println(); // to add a one blank line
    }

    // this will print all as string
    System.out.println(Arrays.deepToString(array2));

    // multi dimensionals
    Object[] anyArray = new Object[3];
    System.out.println(Arrays.toString(anyArray));

    anyArray[0] = new String[] { "a", "b", "c" };
    System.out.println(Arrays.deepToString(anyArray));

    anyArray[1] = new String[][] {
        { "1", "2" },
        { "3", "4", "5" },
        { "6", "7", "8", "9" }
    };
    System.out.println(Arrays.deepToString(anyArray));

    anyArray[2] = new int[2][2][2];
    System.out.println(Arrays.deepToString(anyArray));
  }
}
