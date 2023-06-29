package coding_challenges.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class outOfMemoryArray {
    public static void main(String[] args) {
        Scanner uIn = new Scanner(System.in);
        System.out.println("Five favorite foods");

        String[] foodArray = new String[3];
        for(int i=0; i<3; i++) {
            System.out.print("Food name: ");
            foodArray[i] = uIn.nextLine();
        }
        System.out.println("Sorry! Out of memory.");
        System.out.println("You have these items as of now: " + Arrays.toString(foodArray));
    }
}
