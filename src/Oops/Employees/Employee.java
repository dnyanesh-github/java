package Oops.Employees;

import java.util.Date;
import java.util.Scanner;

public class Employee {
    Scanner keyboard = new Scanner(System.in);
    String name;
    String dob;
    int id;
    String designation;
    String department;
    String emailId;
    String phoneNumber;
    String city;
    String office;

    public void printEmployeeInfo() {
        System.out.println("Employee Name: " + this.name );
        System.out.println("Date of Birth: " + this.dob );
        System.out.println("Employee ID: " + this.id);
        System.out.println("Designation: " + this.designation);
        System.out.println("Department: " + this.department);
        System.out.println("Email ID: " + this.emailId);
        System.out.println("Phone Number: " + this.phoneNumber);
        System.out.println("City: " + this.city);
        System.out.println("Office location: " + this.office);
    }

    public void changeEmployeeDesignation () {
        System.out.println("Current Designation: " + this.designation);
        System.out.print("New Designation: ");
        this.designation = keyboard.nextLine();
        System.out.println("Designation set to: " + this.designation);
    }

}
