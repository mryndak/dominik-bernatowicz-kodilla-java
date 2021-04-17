package com.kodilla.testing.shape;

public class Triangle  implements Shape {

    double a;
    double h;
    double field;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public String getShapeName() {
        return  "Triangle";
    }

    @Override
    public void getField() {
        field = (a / 2) * h;
        System.out.println(field);
    }
}
