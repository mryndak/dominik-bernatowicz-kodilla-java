package com.kodilla.testing.shape;


public class Circle implements Shape {

    int field;

    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public int getField(int field) {

        return field;
    }
}
