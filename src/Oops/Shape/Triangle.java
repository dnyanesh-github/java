package Oops.Shape;

public class Triangle extends Shapes {
    private double height = 1;
    private double base = 1;

    public Triangle (double h, double b) {
        setHeight(h);
        setBase(b);
    }

    public double getHeight() {
        return this.height;
    }

    public double getBase() {
        return this.base;
    }

    public void setHeight(double h) {
        if ( h > 0 ) {
            this.height = h;
        }
    }
    public void setBase(double b) {
        if ( b > 0 ) {
            this.base = b;
        }
    }
}