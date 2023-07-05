package coding_challenges.loops;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class numberGuessingGame {
    public static void main(String[] args) {
        System.out.println("Guess the number");
        Scanner uIn = new Scanner(System.in);
        int counter = 0;

        int randomNumber = ThreadLocalRandom.current().nextInt(1,101);
        System.out.println(randomNumber);
        int userInput;
        do {
            System.out.print("Please guess a number between 1 and 100: ");
            userInput = uIn.nextInt();
            counter++;
            if ( userInput < randomNumber ) {
                System.out.println("Higher");
            }
            else if ( userInput > randomNumber ) {
                System.out.println("Lower");
            }
            else {
                System.out.println("Congratulations! You got it.");
                System.out.println("The correct number was " + randomNumber);
                System.out.println("It took you " + counter + " guesses to get it right!");
            }
        } while(userInput != randomNumber);
    }
}