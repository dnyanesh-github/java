package Oops;

import java.util.Date;

public class pens {
    String color;
    String type;
    String brand;
    boolean refillable;
    Date date;

    public void info() {
        System.out.println("The pen is of " + this.color + " color.");
        System.out.println("The pen is made by " + this.brand + ".");
        System.out.println("This is a " + this.type + " pen.");
        if (this.refillable) {
            System.out.println("The pen is refillable.");
        }
        else {
            System.out.println("The pen is not refillable.");
        }
    }

    public static void main(String[] args) {
        pens myPen = new pens();
        myPen.color = "black";
        myPen.type = "gel";
        myPen.brand = "Reynolds";
        myPen.refillable = false;

        myPen.info();
    }
}
