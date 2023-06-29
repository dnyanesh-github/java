package coding_challenges;

import java.util.Scanner;

public class userInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Age: ");
        int userAge = scanner.nextInt();

        System.out.print("Amount of money in your pocket: $");
        double userMoney = scanner.nextDouble();

        double moneyNeeded = Math.ceil(userMoney) - userMoney;
        System.out.println("Your name is " + firstName + " And your are " + userAge + " years old.");
        System.out.format("You have $%.2f on you and you need $%.2f.\n", userMoney, moneyNeeded);
        System.out.format("You have lived %d years. In another %d years you'll be %d years old.\n", userAge, userAge, 2*userAge);
        System.out.print("Your name contains " + firstName.length() + " characters.");
    }
}

/*
Scanner scanner = new Scanner(System.in);

System.out.print("First Name: ");
String firstName = scanner.next();

System.out.print("Age: ");
int age = scanner.nextInt();

System.out.print("Amount of money in your pocket: £");
double money = scanner.nextDouble();

System.out.println();

double moneyNeeded = Math.ceil(money) - money;

System.out.println("Your name is " + firstName + " and you are " + age + " years old.");
System.out.format("You have £%.2f on you and need £%.2f.", money, moneyNeeded);
 */