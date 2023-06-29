package coding_challenges;

import java.util.Scanner;

public class divideRestaurantBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the total bill: ");
        double totalBill = input.nextDouble();

        System.out.print("Please enter the number of people: ");
        int numberOfPeople = input.nextInt();

        System.out.printf("Everyone would pay %.2f towards the bill", totalBill/numberOfPeople);
    }
}
