import java.util.Scanner;
import java.util.Random;

public class NumGuessingGame {
    public static void main(String[] args) {
        Random ran = new Random(); // creating a ran object to generate random number.
        int numToGuess = ran.nextInt(100) + 1; // generating random number between 1 & 100
        int numOfTries = 2; // Providing number of tries i.e 2
        Scanner input = new Scanner(System.in);
        int guess; // storing user's guess
        boolean win = false; // to track whether the user has won.

        while (numOfTries > 0 && !win) { // for tries left until the user has won
            System.out.println("Guess a number between 1 and 100: ");
            guess = input.nextInt(); // storing user's guess
            numOfTries--; // Decrementing no. of tries

            if (guess == numToGuess) { // checking if the guess is correct
                win = true;
            } else if (guess < numToGuess) { // checking if guess is lower
                System.out.println("Your guess is lower");
            } else if (guess > numToGuess) { // checking if guess is higher
                System.out.println("Your guess is higher");
            }
        }

        if (win) { // checking if the user has won
            System.out.println("Congratulations! You win!");
        } else {
            System.out.println("Sorry, you're out of tries. The number was: " + numToGuess);
        }
    }
}
