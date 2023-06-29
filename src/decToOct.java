import java.util.Scanner;

public class decToOct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        String decNum = in.next();
        int octNum = Integer.parseInt(decNum, 8);
        System.out.println("Decimal " + decNum + ": " + "Octal: " + octNum);
    }
}
