package section11;

import java.util.Scanner;

public class simpleGuestList {
    static String[] guests = new String[10];
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Want to load the test data?: ");
        if ( keyboard.next().equalsIgnoreCase("yes")) {
            insertTestNames();
        }
        do {
            displayGuests();
            displayMenu();
            int userSelection = getOption();

            if (userSelection == 1) {
                addGuests();
            }
            else if (userSelection == 2) {
                deleteGuest();
            }
            else if (userSelection == 3) {
                System.out.println("Exiting...");
                break;
            }
        } while (true);
    }

    static void displayGuests() {
        System.out.println("________________________________");
        System.out.println(" - Guests - ");
        boolean isListEmpty = true;
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null) {
                System.out.println((i + 1) + ". " + guests[i]);
                isListEmpty = false;
            }
        }
        if (isListEmpty) {
            System.out.println("\nGuest list is empty.");
        }
        System.out.println();
    }

    static void displayMenu() {
        System.out.println("________________________________");
        System.out.println("- Menu - ");
        System.out.println("1 - Add guest");
        System.out.println("2 - Remove Guest");
        System.out.println("3 - Exit");
    }

    static int getOption() {
        System.out.print("Option: ");
        int option = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println();
        return option;
    }

    static void addGuests() {
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                System.out.print("Guest name please: ");
                guests[i] = keyboard.nextLine();
                break;
            }
        }
    }

    static void deleteGuest() {
        System.out.print("Enter guest number please: ");
        int guestNumber = keyboard.nextInt();
        if(guestNumber <= guests.length && guestNumber > 0) {
            guests[guestNumber - 1] = null;
        }
        else {
            System.out.println("Error: There is no guest with that number");
        }

        String[] tempArray = new String[guests.length];
        int ti = 0;
        for (String guest : guests) {
            if (guest != null) {
                tempArray[ti] = guest;
                ti++;
            }
        }
        guests = tempArray;
    }

    static void insertTestNames() {
        guests[0] = "Dnyanesh";
        guests[1] = "Vedant";
        guests[2] = "Shraddha";
        guests[3] = "Aastha";
        guests[4] = "Prabhakar";
    }
}