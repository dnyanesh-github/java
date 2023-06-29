package coding_challenges.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class findArrayMean {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int[] intArray;
        intArray = new int[1];
        int index = 0;
        String userResponse;

        do {
            System.out.print("Please enter the number: ");
            int num = stdIn.nextInt();
            intArray[index] = num;
            index++;
            System.out.print("Do you want to add one more number(yes/no)?: ");
            userResponse = stdIn.next();
            if (userResponse.equals("yes")) {
                intArray = expand_array(intArray);
            }
        } while(userResponse.equals("yes"));
        System.out.println("\nThe array contains these values: " + Arrays.toString(intArray));
        System.out.println("The mean of the array is: " + find_mean(intArray));
    }

    public static int[] expand_array (int[] arrayIn){
        arrayIn = Arrays.copyOf(arrayIn, arrayIn.length+1);
        return arrayIn;
    }

    public static double find_mean(int[] arrayIn) {
        int sum = 0;
        for (int j : arrayIn) {
            sum = sum + j;
        }
        return (double)sum/arrayIn.length;
    }
}
