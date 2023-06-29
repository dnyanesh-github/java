package coding_challenges.loops;

import java.util.Scanner;

public class validateUserPassword {
    public static void main(String[] args) {
        String userPassword;
        Scanner userInput = new Scanner(System.in);
        do {
            System.out.print("Please enter your password: ");
             userPassword = userInput.next();
        } while(!userPassword.equals("shark50"));
        System.out.println("Access Approved!");
        userInput.close();
    }
}
