package coding_challenges.section10;
import java.util.Scanner;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class guessOneToHundred {
    public static void main(String[] args) {
        System.out.println("\n### Guess My Number Game ###\n");

        System.out.println("--- Rules ---");
        System.out.println("Think of a number from 1 to 100 and I'll try to guess it.");
        System.out.println("Enter \"higher\" if my guess is too low.");
        System.out.println("Enter \"lower\" if my guess is too high.");
        System.out.println("Enter \"correct\" if I get it right.");

        Scanner scanner = new Scanner(System.in);
        String input;

        int min = 1;
        int max = 100;
        int guessNumber = 50;

        label:
        while (true) {

            System.out.println("\nI guess " + guessNumber + ".");
            System.out.print("Your response: ");
            input = scanner.next();

            switch (input) {
                case "higher":
                    min = guessNumber + 1;
                    break;
                case "lower":
                    max = guessNumber - 1;
                    break;
                case "correct":
                    System.out.println("\n" + guessNumber + ", eh? I knew I'd get it eventually.");
                    break label;
            }
            guessNumber = (min+max)/2;
            // This if statement checks to see if it's still possible to win
            // Example: The program guesses 28, you enter "higher", then the program guesses 29, you enter "lower"
            if (min == max + 1) {
                System.out.println("\nThat's not possible. Let's try again.");
                min = 1;
                max = 100;
                guessNumber = 50;
            }
        }
    }
}
