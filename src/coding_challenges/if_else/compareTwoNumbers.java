package coding_challenges.if_else;

import java.util.Scanner;

public class compareTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int x = input.nextInt();

        System.out.print("Please enter the second number: ");
        int y = input.nextInt();

        if ( x > y ) {
            System.out.printf("%d is greater than %d\n", x, y);
            System.out.println("The difference between two numbers is: " + (x-y));
        }
        else if ( x < y ) {
            System.out.printf("%d is smaller than %d\n", x, y);
            System.out.println("The difference between two numbers is: " + (y-x));
        }
        else {
            System.out.println("Both the numbers are equal");
        }
    }
}
