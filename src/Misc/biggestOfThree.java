package Misc;

import java.util.Scanner;

public class biggestOfThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please Enter the First Number: ");
        int num1 = keyboard.nextInt();
        System.out.print("Please Enter the second Number: ");
        int num2 = keyboard.nextInt();
        System.out.print("Please enter the third number: ");
        int num3 = keyboard.nextInt();
        System.out.println("Biggest Number: " + biggestNumber(num1, num2, num3));
    }

    public static int biggestNumber(int num1, int num2, int num3) {
        if (num1 > num3 && num1 > num2) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }
}

