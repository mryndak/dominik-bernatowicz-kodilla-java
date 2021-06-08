package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Calculator {

    @Autowired
    private Display display;

    public double add(double a, double b){
        display.display(a + b);
        return display.getVal();
    }

    public double sub(double a, double b){
        display.display(a - b);
        return display.getVal();
    }

    public double mul(double a, double b){
        display.display(a * b);
        return display.getVal();
    }

    public double div(double a, double b){
        display.display(a / b);
        return display.getVal();
    }
}
