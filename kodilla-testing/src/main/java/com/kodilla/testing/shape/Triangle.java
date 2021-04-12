package com.kodilla.testing.shape;

public class Triangle  implements Shape {

    int field;

    @Override
    public String getShapeName() {

        return "Triangle";
    }

    @Override
    public int getField(int field) {

        return field;
    }
}
