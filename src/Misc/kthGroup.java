package Misc;

import java.util.Scanner;

public class kthGroup {
    public static void main(String[] args) {
        int[] myArray = { 3,7,2,8,12,16,31,20,16,19,21,23,24,11,16,19,22,26,29,31 };
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int k = keyboard.nextInt();
        int[] tempArray;
        tempArray = new int[25];
        for(int i=0; i<myArray.length; i++) {
            if(myArray[i] % 2 == 0 ) {
                tempArray[i] = myArray[i];
            }
        }
    }
}
