import java.util.Random;
import java.util.*;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//creating a scanner class to get an inputs
        Random random = new Random();
         //intializations
        int lb = 1;//intialize lowerbond as 1
        int ub = 100;//intialize upperbond as 100 
        int NumOfAttempts = 10;//intialize numberofattempt as 10
        int score = 0;//intialize score as 0

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            int TargetNum = random.nextInt(ub - lb + 1) + lb;//applying the formula
            int guess;
            boolean guessedCorrect = false;

            System.out.println("I have selected a number between " + lb + " and " + ub + ". Guess it!");

            for (int attempts = 1; attempts <= NumOfAttempts; attempts++) {
                System.out.print("Attempt " + attempts + ": Enter your guess: ");
                guess = sc.nextInt();

                if (guess == TargetNum) {
                    System.out.println("Congratulations! You guessed the correct number!");
                    guessedCorrect = true;
                    score += NumOfAttempts - attempts + 1;
                    break;
                } else if (guess < TargetNum) {
                    System.out.println("Too low. Try again.");//if the guessed number is lower this statement will be executed
                } else {
                    System.out.println("Too high. Try again.");//if the guessed number is higher this statement will be executed
                }
            }

            if (!guessedCorrect) {
                System.out.println("Sorry, you've run out of attempts. The correct number was: " + TargetNum);
            }

            System.out.print("Do you want to play again? (yes/no): ");
        } while (sc.next().equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing! Your total score is: " + score);

        sc.close();
    }
}
//if we want to continue the game have to press yes
//if we have guessed wrong number the command of "Sorry you've have run out of attempts will be executed and corrected number will be displayed."