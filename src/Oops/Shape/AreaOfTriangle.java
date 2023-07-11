package Oops.Shape;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(6,5);
        Triangle t2 = new Triangle(7.5,8);
        System.out.println("T1 Height: " + t1.getHeight() );
        System.out.println("T1 Base: " + t1.getBase());
        System.out.println("T2 Height: " + t2.getHeight());
        System.out.println("T2 Base: " + t2.getBase());
    }
}
