package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test List: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test List: end");
    }

    @DisplayName("Checking empty lists")

    @Test
    void testOddNumbersExterminatorEmptyList() {

        OddNumbersExterminator oddNumExt = new OddNumbersExterminator();
        List<Integer> number = new LinkedList<>();
        List<Integer> expectedResult = new LinkedList<>();

        //When
        List<Integer> result = new LinkedList<>(oddNumExt.exterminate(number));

        //Than
        Assertions.assertEquals(expectedResult, result);
        System.out.println("Expected Result: " + expectedResult);
        System.out.println("Result: " + result);
    }

    @DisplayName("Checking normal lists")

    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumExt = new OddNumbersExterminator();
        List<Integer> number = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> expectedResult = new LinkedList<>(Arrays.asList(2, 4, 6));
//        number.add(1);
//        number.add(2);
//        number.add(3);
//        number.add(4);
//        number.add(5);

        //When
        List<Integer> result = new LinkedList<>(oddNumExt.exterminate(number));

        //Than
        Assertions.assertEquals(expectedResult, result);
        System.out.println("Expected Result: " + expectedResult);
        System.out.println("Result: " + result);
    }
}
