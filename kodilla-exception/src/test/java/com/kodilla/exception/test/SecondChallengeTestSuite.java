package com.kodilla.exception.test;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondChallengeTestSuite {

    @Nested
    class exceptionByX {
        @Test
        void testExceptionByX1() {
            // given
            SecondChallenge secondChallenge = new SecondChallenge();

            // when & then
            assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.0, 5.0));
        }

        @Test
        void testExceptionByX2() {
            // given
            SecondChallenge secondChallenge = new SecondChallenge();

            // when & then
            assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.99, 5.0));
        }
    }

        @Test
        void testExceptionByY() {
            // given
            SecondChallenge secondChallenge = new SecondChallenge();

            // when & then
            assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.0, 1.5));
        }

        @Test
        void testExceptionByXAndY() {
            // given
            SecondChallenge secondChallenge = new SecondChallenge();

            // when & then
            assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.99, 1.5));
        }

    @Test
    void testWithoutExceptions () {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();

        // when & then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5,1.0));
    }
}
