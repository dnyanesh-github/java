import java.util.Scanner;

public class printMultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number for which you want the multiplication table: ");
        int num1 = input.nextInt();
        for (int i=1; i<=10; i++) {
            System.out.println(num1 + " X " + i + " = " + num1*i);
        }
    }
}
