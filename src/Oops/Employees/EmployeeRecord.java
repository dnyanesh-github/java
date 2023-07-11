package Oops.Employees;

import java.util.Scanner;
import java.util.Date;

public class EmployeeRecord {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Employee employee1 = new Employee();
        System.out.print("Name of the employee: ");
        employee1.name = keyboard.nextLine();
        System.out.print("Employee ID: ");
        employee1.id = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Designation: ");
        employee1.designation = keyboard.nextLine();
        System.out.print("Email Address: ");
        employee1.emailId = keyboard.nextLine();
        System.out.print("Date of Birth: ");
        employee1.dob = keyboard.nextLine();
        System.out.print("Department: ");
        employee1.department = keyboard.nextLine();
        System.out.print("Phone Number: ");
        employee1.phoneNumber = keyboard.nextLine();
        System.out.print("City: ");
        employee1.city = keyboard.nextLine();
        System.out.print("Office Location: ");
        employee1.office = keyboard.nextLine();

        System.out.println("\n\n_________________________________");
        employee1.printEmployeeInfo();

    }
}
