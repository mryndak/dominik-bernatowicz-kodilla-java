package com.kodilla.testing.shape;

public class Triangle  implements Shape {

    int field;

    @Override
    public String getShapeName() {
        return  "Triangle";
    }

    @Override
    public void getField() {
        System.out.println(field);
    }

    @Override
    public void setField(int field) {
        this.field = field;
    }
}
