package coding_challenges.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arbitraryArrayOfTenElements {
    public static void main(String[] args) {
        Scanner uIn = new Scanner(System.in);
        int[] arbitraryArray = new int[10];

        for(int i=0; i<10; i++) {
            System.out.print("Integer number: ");
            arbitraryArray[i] = uIn.nextInt();
        }

        System.out.println(Arrays.toString(arbitraryArray));
    }
}
