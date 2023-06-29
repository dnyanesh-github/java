package binary_operations;

import java.util.Scanner;

public class addTwoBinaryNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first binary number: ");
        String binNum1 = input.next();
        System.out.print("Please enter the second binary number: ");
        String binNum2 = input.next();
        int num1 = Integer.parseInt(binNum1, 2);
        int num2 = Integer.parseInt(binNum2, 2);
        int sum = num1 + num2;
        System.out.println("The sum of "+ binNum1 + " and " + binNum2 + " would be: " + Integer.toBinaryString(sum));
    }
}
