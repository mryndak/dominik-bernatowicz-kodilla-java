package com.kodilla.testing.shape;

public class Square  implements Shape {

    int field;

    @Override
    public String getShapeName() {

        return "Squere";
    }

    @Override
    public int getField(int field) {

        return field;
    }
}
