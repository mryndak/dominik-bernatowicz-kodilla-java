package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result1 = calculator.add(10, 6);
        int result2 = calculator.subtract(11, 5);

        if (result1 == 16){
            System.out.println("test1 ok");
        }
        else{
            System.out.println("Error1");
        }

        if (result2 == 6){
            System.out.println("test2 ok");
        }
        else {
            System.out.println("Error2");
        }

    }
}