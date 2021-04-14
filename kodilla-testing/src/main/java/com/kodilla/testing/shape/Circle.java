package com.kodilla.testing.shape;

public class Circle implements Shape {

    double r;
    double pi = 3.14;
    double field;

    @Override
    public String getShapeName() {
        return  "Circle";
    }

    @Override
    public void getField() {
        field = pi * r * r;
        System.out.println(field);
    }

    public void setField(double r) {
        this.r = r;
    }
}
