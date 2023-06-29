import java.util.Scanner;

public class sumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        float num1 = userInput.nextFloat();
        System.out.print("Please enter the second number: ");
        float num2 = userInput.nextFloat();
        float sum = num1 + num2;
        System.out.print("The sum of " + num1 + " and " + num2 + " would be: " + sum);
    }
}
