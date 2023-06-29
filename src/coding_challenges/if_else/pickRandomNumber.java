package coding_challenges.if_else;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class pickRandomNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Generate random number between 1 - 6(1 included and 6 excluded)
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);

        System.out.println("I am thinking of playing a guessing game.");
        System.out.println("You have to guess a number between 1 and 5.");
        System.out.print("Please enter your choice: ");
        int userInput = input.nextInt();

        if (userInput > 0 && userInput <= 5) {
            if (userInput == randomNumber) {
                System.out.println("Correct! Aren't you lucky.");
            }
            else {
                System.out.println("Hard luck! Try again.");
                System.out.print("Please guess the number again: ");
                userInput = input.nextInt();
                if ( userInput == randomNumber) {
                    System.out.println("Correct! You guessed it right this time.");
                }
                else if(userInput < 0 || userInput > 5 ) {
                    System.out.println("Looks like you entered an invalid number. Try again.");
                }
                else {
                    System.out.println("Hard luck. You guessed it wrong again.");
                }
            }
        }
        else {
            System.out.println("Looks like you entered an invalid number. Try again.");
        }
    }
}