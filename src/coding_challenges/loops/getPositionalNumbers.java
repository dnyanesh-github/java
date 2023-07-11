package coding_challenges.loops;

import java.util.Scanner;

public class getPositionalNumbers {
    public static void main(String[] args) {
        int number = 45678;
        for( int i=10000; i >= 1; i=(i/10) ) {
            System.out.printf("Number at %dth position is: %d \n", i, number/i );
            number = number % i;
        }
    }
}
