package com.kodilla.testing.shape;

public class Square  implements Shape {

    double a;
    double field;

    @Override
    public String getShapeName() {
        return  "Square";
    }

    @Override
    public void getField() {
        field = a * a;
        System.out.println(field);
    }

    public void setField(int a) {
        this.a = a;
    }
}
