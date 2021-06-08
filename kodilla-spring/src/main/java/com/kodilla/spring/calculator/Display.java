package com.kodilla.spring.calculator;

import org.springframework.stereotype.Service;

@Service
public class Display {

    private double val;

    public void display(double val) {
        this.val = val;
        System.out.println("wynik= " + val);
    }

    public double getVal() {
        return val;
    }
}
