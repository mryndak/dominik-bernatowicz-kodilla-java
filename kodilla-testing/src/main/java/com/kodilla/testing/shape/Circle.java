package com.kodilla.testing.shape;

public class Circle implements Shape {

    double r;
    double pi = 3.14;
    double field;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return  "Circle";
    }

    @Override
    public void getField() {
        field = pi * r * r;
        System.out.println(field);
    }
}
