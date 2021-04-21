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
    public double getField() {
        return field = (a / 2) * h;
    }
}
