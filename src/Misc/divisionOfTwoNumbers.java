package Misc;

import java.util.Scanner;
public class divisionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int num1 = userInput.nextInt();
        System.out.print("Please enter the second number: ");
        int num2 = userInput.nextInt();
        float result = (float) num1 / num2;
        System.out.println("Dividing " + num1 + " by " + num2 + " yields: " + result );
    }
}