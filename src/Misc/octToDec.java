package Misc;

import java.util.Scanner;

public class octToDec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the octal number: ");
        String inNum = in.next();
        int num = Integer.parseInt(inNum, 8);
        System.out.println("Decimal of " + inNum + ": " + num);
    }
}
