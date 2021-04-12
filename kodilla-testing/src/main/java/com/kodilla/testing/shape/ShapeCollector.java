package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> figureList = new ArrayList<>();

    public void addFigure(Shape shape){

        figureList.add(shape);
    }

    public boolean removeFigure(Shape shape){

        boolean result = false;
        if (figureList.contains(shape)) {
            figureList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n){

        if (n >= 0 && n < figureList.size()) {
            return figureList.get(n);
        }
        return null;
    }

    public String showFigures(){

        String result = "";
        for (int i = 0;i < figureList.size(); i++) {

            if (figureList.size() != 1) {

                result += ", " + figureList.get(i).getShapeName();
            }
            else {

                result = figureList.get(i).getShapeName();
            }
        }
        return result;
    }
}
