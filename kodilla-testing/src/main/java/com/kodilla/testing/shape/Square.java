package com.kodilla.testing.shape;

public class Square  implements Shape {

    double a;
    double field;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return  "Square";
    }

    @Override
    public double getField() {
        return field = a * a;
    }
}
