package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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

        System.out.println(oddNumExt.exterminate(number));
    }

    @DisplayName("Checking normal lists")

    @Test
    void testOddNumbersExterminatorNormalList() {

        OddNumbersExterminator oddNumExt = new OddNumbersExterminator();
        List<Integer> number = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
//        number.add(1);
//        number.add(2);
//        number.add(3);
//        number.add(4);
//        number.add(5);

        System.out.println(oddNumExt.exterminate(number));
    }
}
