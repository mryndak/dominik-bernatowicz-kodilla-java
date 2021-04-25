package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(3.0, 1.6);
        } catch (Exception e) {
            System.out.println("Error: Wrong number!!");
        } finally {
            System.out.println("END");
        }
    }
}
