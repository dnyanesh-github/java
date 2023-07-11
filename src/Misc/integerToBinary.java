package Misc;

import java.util.Scanner;
public class integerToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first binary number: ");
        String binNum = input.next();
        int num = Integer.parseInt(binNum, 2);
        System.out.println("The integer of the binary number " + binNum + " is: " + num );
    }
}
