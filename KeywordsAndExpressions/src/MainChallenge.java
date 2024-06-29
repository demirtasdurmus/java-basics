public class MainChallenge {
  public static void main(String[] args) {
    boolean gameOver = true;
    int score = 5000;
    int levelCompleted = 5;
    int bonus = 100;

    int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
    System.out.println(highScore);

    System.out.println(calculateScore(true, 1000, 10, 250));

  }

  public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    int finalScore = score;

    if (gameOver) {
      finalScore += (levelCompleted + bonus);
      finalScore += 1000;
    }

    return finalScore;
  }
}
