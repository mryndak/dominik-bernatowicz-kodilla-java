package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void openSettingsFile() {
        logger = logger.LOGG;
        logger.log("loglog");
    }

    @Test
    void testGetLastLog() {
        //Given
        //When
        String logName = logger.getLastLog();
        System.out.println("Opened: " + logName);
        //Then
        assertEquals("loglog", logName);
    }
}
