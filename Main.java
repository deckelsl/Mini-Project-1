import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Random r = new Random();

    System.out.println("Welcolme to the guessing game!");
    System.out.println("Please enter any positive whole number:");
    int userNum = s.nextInt();
    int randomNum = r.nextInt(userNum + 1);
    System.out.println("A random number to guess has been generated");

    playGame(userNum, randomNum);
  }

  public static void playGame(int upperBound, int winnerNum) {
    System.out.println("Please guess a number between 1 and " + upperBound);
    Scanner ss = new Scanner(System.in);
    int guessOne = ss.nextInt();
    int guessNum = 0;
    guessNum++;

    while (guessOne != winnerNum) {
      if (guessOne > winnerNum) {
        System.out.println("Guess lower!");
      }
      else if (guessOne < winnerNum) {
        System.out.println("Guess higher!");
      }
      System.out.println("Enter Your New Guess:");
      guessOne =ss.nextInt();
      guessNum++;
    }
    System.out.println("Great, you win! It took you " + guessNum + " tries.");
  }
}