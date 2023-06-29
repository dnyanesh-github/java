package coding_challenges.if_else;

import java.util.Scanner;

public class rollercoasterHeightCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your height in centimetres: ");
        int userHeight = input.nextInt();

        if ( userHeight < 130 ) {
            System.out.println("Sorry. your height is not safe for the roller coaster ride.");
        }
        else if ( userHeight > 220 ) {
            System.out.println("Sorry. your height is not safe for the roller coaster ride.");
        }
        else {
            System.out.println("Congratulations! You are good to go.");
        }
    }
}
