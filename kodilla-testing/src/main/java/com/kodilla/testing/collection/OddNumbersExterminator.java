package com.kodilla.testing.collection;

import java.util.LinkedList;
import java.util.List;

public class OddNumbersExterminator {

    List<Integer> number = new LinkedList<>();

    public List<Integer> exterminate(List<Integer> numbers) {

        if (numbers.size() > 1) {
            for (int i = 0; i < numbers.size(); i++) {

                if ((numbers.get(i) % 2) != 0) {
                    numbers.remove(i);
                }
            }
            return numbers;
        }
        else {
            System.out.println("Error: EMPTY LIST");
            return numbers;
        }
    }
}
