package coding_challenges.Arrays;

import java.util.Arrays;

public class populateArrayOneToTwenty {
    public static void main(String[] args) {
        int[] myArray = new int[20];
        for (int i=0; i<20; i++ ) {
            myArray[i] = i+1;
        }
        System.out.println(Arrays.toString(myArray));
        for(int i=myArray.length-1; i>=0; i--) {
            System.out.println(myArray[i]);
        }
    }
}
