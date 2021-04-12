package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Adding and remooving")
    class FigureManagement {

        @Test
        void testAddFigure() {

            ShapeCollector shapeCollector = new ShapeCollector();

            Shape circle1 = new Circle();
            circle1.getField(12);
            shapeCollector.addFigure(circle1);

            Assertions.assertEquals(1, shapeCollector.figureList.size());
        }

        @Test
        void testRemoveFigure() {

            ShapeCollector shapeCollector = new ShapeCollector();

            Circle circle1 = new Circle();
            circle1.field = 12;
            shapeCollector.addFigure(circle1);

            boolean result = shapeCollector.removeFigure(circle1);

            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.figureList.size());
        }
    }

    @Nested
    @DisplayName("Search and display")
    class DownloadFigure {

        @Test
        void testGetFigure() {

            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle1 = new Circle();
            circle1.field = 12;
            shapeCollector.addFigure(circle1);

            Shape retrievedShape;
            retrievedShape = shapeCollector.figureList.get(0);

            Assertions.assertEquals(circle1, retrievedShape);
        }

        @Test
        void testShowFigures() {

            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle1 = new Circle();
            circle1.field = 12;
            shapeCollector.addFigure(circle1);

            String retrievedShape;
            retrievedShape = shapeCollector.showFigures();

            Assertions.assertEquals(circle1.getShapeName(), retrievedShape);
        }
    }
}
