package com.kodilla.testing.shape;

public class Square  implements Shape {

    int field;

    @Override
    public String getShapeName() {
        return  "Square";
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
