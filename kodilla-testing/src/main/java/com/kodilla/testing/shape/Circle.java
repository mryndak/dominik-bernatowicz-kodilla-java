package com.kodilla.testing.shape;


public class Circle implements Shape {

    int field;

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public int getField(int field) {

        return field;
    }
}
