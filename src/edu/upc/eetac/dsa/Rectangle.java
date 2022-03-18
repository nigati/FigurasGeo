package edu.upc.eetac.dsa;

public class Rectangle extends Figura {
    private double c1;
    private double c2;

    public Rectangle (double l1, double l2) {
        this.c1 = l1;
        this.c2 = l2;
    }

    public double area() {
        return c1 * c2;
    }
}
