package com.kodilla.spring.calculator;

import org.springframework.stereotype.Service;

@Service
public class Display {

    public void display(double val) {
        System.out.println("wynik= " + val);
    }
}
