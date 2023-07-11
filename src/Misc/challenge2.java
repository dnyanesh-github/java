package Misc;

import java.util.Scanner;

public class challenge2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = keyboard.nextInt();
        System.out.println("The outcome is: " + validateNumber(num));
    }

    public static boolean validateNumber(int num) {
        if ( num < 10 || num > 100 ) {
            return true;
        }
        else {
            return false;
        }
    }
}
