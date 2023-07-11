package Misc;

import java.util.Scanner;

public class arithmeticOperations {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int num1 = userInput.nextInt();
        System.out.print("Please enter the second number: ");
        int num2 = userInput.nextInt();
        System.out.println("The product of " + num1 + " and " + num2 + " would be: " + num1*num2);
    }
}