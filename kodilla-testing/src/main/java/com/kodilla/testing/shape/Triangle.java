package com.kodilla.testing.shape;

public class Triangle  implements Shape {

    double a;
    double h;
    int field;

    @Override
    public String getShapeName() {
        return  "Triangle";
    }

    @Override
    public void getField() {
        System.out.println(field);
    }

    public void setField(double a, double h) {
        this.a = a;
        this.h = h;
    }
}
