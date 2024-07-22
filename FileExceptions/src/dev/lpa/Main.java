package dev.lpa;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    /**
     * Getting the cwd
     */
    System.out.println("CWD: " + new File("").getAbsolutePath());

    /**
     * Getting the root path
     */
    for (File f : File.listRoots()) {
      System.out.println("Root is: " + f);
    }

    /**
     * Reading a file and handling exceptions
     */
    String filename = "files/test.csv";

    // testFile(filename);

    File file = new File(filename);

    if (!file.exists()) {
      System.out.println("File does not exist so I am going away and exiting");
      return;
    }

    System.out.println("I am good to go");
  }

  public static void testFile(String filename) {
    Path path = Paths.get(filename);

    try {
      List<String> lines = Files.readAllLines(path);
      System.out.println(lines.toString());
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      System.out.println("Maybe I'd log sth either way...");
    }
    System.out.println("File exists and able to use as a resource");
  }

  public static void testFile2(String filename) {
    try (FileReader reader = new FileReader(filename)) {
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      System.out.println("Maybe I'd log sth either way...");
    }
    System.out.println("File exists and able to use as a resource");
  }
}
