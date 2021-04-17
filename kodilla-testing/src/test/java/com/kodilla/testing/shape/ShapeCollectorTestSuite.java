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
            Circle circle1 = new Circle(12);
            shapeCollector.addFigure(circle1);

            int result = shapeCollector.figureList.size();

            Assertions.assertEquals(1, result);
            System.out.println("Expected size of the list : 1");
            System.out.println("Actual size of the list: " + result);

        }

        @Test
        void testRemoveFigure() {

            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle1 = new Circle(12);
            shapeCollector.addFigure(circle1);

            int result = shapeCollector.figureList.size();

            Assertions.assertEquals(1, result);
            System.out.println("Expected size of the list : 1");
            System.out.println("Actual size of the list: " + result);
        }
    }

    @Nested
    @DisplayName("Search and display")
    class DownloadFigure {

        @Test
        void testGetFigure() {

            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle1 = new Circle(12);
            shapeCollector.addFigure(circle1);

            Shape result = shapeCollector.figureList.get(0);

            Assertions.assertEquals(circle1, result);
            System.out.println("Expected name of the shape: " + circle1.getShapeName());
            System.out.println("Actual name of the shape: " + result.getShapeName());
        }

        @Test
        void testShowFigures() {

            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle1 = new Circle(12);
            shapeCollector.addFigure(circle1);

            String result = shapeCollector.showFigures();

            Assertions.assertEquals(circle1.getShapeName(), result);
            System.out.println("Expected names in the shapes list: " + circle1.getShapeName());
            System.out.println("Actual names in the shapes list: " + result);
        }
    }
}
