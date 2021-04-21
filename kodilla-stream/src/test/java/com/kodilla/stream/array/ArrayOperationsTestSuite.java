package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = {2, 3, 5, 7,4};

        //When
        double result = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(4.2, result);
    }
}
