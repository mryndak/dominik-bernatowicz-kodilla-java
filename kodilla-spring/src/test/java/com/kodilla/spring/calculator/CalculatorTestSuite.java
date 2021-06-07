package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations(){
        //Given
        double a = 1.2;
        double b = 2;

        //When
        calculator.add(a, b);
        calculator.sub(a, b);
        calculator.mul(a, b);
        calculator.div(a, b);

        //Then
    }
}
