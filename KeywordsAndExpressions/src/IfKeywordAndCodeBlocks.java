public class IfKeywordAndCodeBlocks {
  public static void main(String[] args) {
    boolean gameOver = true;
    int score = 5000;
    int levelCompleted = 5;
    int bonus = 100;

    if (gameOver) {
      System.out.println("Game is over");
    } else if (score == 5) {
      System.out.println("This is else if");
    } else {
      System.out.println(score + levelCompleted + bonus);
    }
  }
}
