package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    TaskFactory factory = new TaskFactory();

    @Test
    void testDoneTask() {
        //Given

        //When
        Task shoppingTask = factory.finalTask(TaskFactory.SHOPPINGTASK, true);
        Task paintingTask = factory.finalTask(TaskFactory.PAINTINGTASK, true);
        Task drivingTask = factory.finalTask(TaskFactory.DRIVINGTASK, true);
        //Then
        assertEquals("Shopping task done", shoppingTask.getTaskName());
        assertEquals("komputer - 1.0", shoppingTask.getMoreInfrmacion());
        assertTrue(shoppingTask.isTaskExcuted());
        assertEquals("Painting Task done", paintingTask.getTaskName());
        assertEquals("krajobraz - losowy", paintingTask.getMoreInfrmacion());
        assertTrue(paintingTask.isTaskExcuted());
        assertEquals("Driving taks done", drivingTask.getTaskName());
        assertEquals("Gdańsk - car", drivingTask.getMoreInfrmacion());
        assertTrue(drivingTask.isTaskExcuted());
    }

    @Test
    void testWanNotCompleted() {
        //Given

        //When
        Task shoppingTask = factory.finalTask(TaskFactory.SHOPPINGTASK, false);
        Task paintingTask = factory.finalTask(TaskFactory.PAINTINGTASK, false);
        Task drivingTask = factory.finalTask(TaskFactory.DRIVINGTASK, false);
        //Then
        assertEquals("Shopping wasn't completed", shoppingTask.getTaskName());
        assertEquals("laptop - 3.0", shoppingTask.getMoreInfrmacion());
        assertFalse(shoppingTask.isTaskExcuted());
        assertEquals("Painting task wasn't completed", paintingTask.getTaskName());
        assertEquals("słońce - czerwony", paintingTask.getMoreInfrmacion());
        assertFalse(paintingTask.isTaskExcuted());
        assertEquals("Driving task wasn't completed", drivingTask.getTaskName());
        assertEquals("Wrocław - car", drivingTask.getMoreInfrmacion());
        assertFalse(drivingTask.isTaskExcuted());
    }
}
