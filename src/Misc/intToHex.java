package Misc;

import java.util.Scanner;

public class intToHex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the hex number: ");
        String hexNum = in.next();
        int decNum = Integer.parseInt(hexNum, 16);
        System.out.println("Decimal value of " + hexNum + " is: " + decNum);
    }
}
