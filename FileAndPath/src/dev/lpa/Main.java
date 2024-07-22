package dev.lpa;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
  public static void main(String[] args) {
    useFile("test.txt");
    usePath("path.txt");
  }

  private static void useFile(String filename) {
    File file = new File(filename);
    boolean fileExists = file.exists();

    System.out.printf("File '%s' %s%n", filename, fileExists ? "exists." : "not exists");

    if (fileExists) {
      System.out.println("Deleting");
      fileExists = !file.delete();
    }

    if (!fileExists) {
      try {
        System.out.println("Creating new one");
        file.createNewFile();
      } catch (IOException e) {
        e.printStackTrace();
      }

      if (file.canWrite()) {
        System.out.println("Would write to file here");
      }
    }
  }

  private static void usePath(String filename) {
    Path path = Path.of(filename);
    boolean fileExists = Files.exists(path);

    System.out.printf("File '%s' %s%n", filename, fileExists ? "exists." : "not exists");

    if (fileExists) {
      System.out.println("Deleting");
      try {
        Files.delete(path);
      } catch (IOException e) {
        e.printStackTrace();
      }
      fileExists = false;
    }

    if (!fileExists) {
      try {
        System.out.println("Creating new one");
        Files.createFile(path);
        if (Files.isWritable(path)) {
          Files.writeString(path, """
                Here is some data,
                For my file,
                just to prove,
                using the Files class and path are better
              """);
        }

        System.out.println("And of course, I can read it as well:");
        System.out.println("-".repeat(10));
        Files.readAllLines(path).forEach(System.out::println);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
