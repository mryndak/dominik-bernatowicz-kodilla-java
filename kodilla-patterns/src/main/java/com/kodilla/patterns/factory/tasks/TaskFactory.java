package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task finalTask(final String taskClass, final boolean done) {
        if (done) {
            switch (taskClass) {
                case SHOPPINGTASK:
                    ShoppingTask shoppingTask = new ShoppingTask("Shopping task done", "komputer", 1);
                    shoppingTask.setExcuted(done);
                    return shoppingTask;

                case PAINTINGTASK:
                    PaintingTask paintingTask = new PaintingTask("Painting Task done", "losowy", "krajobraz");
                    paintingTask.setExcuted(done);
                    return paintingTask;

                case DRIVINGTASK:
                    DrivingTask drivingTask = new DrivingTask("Driving taks done", "Gdańsk", "car");
                    drivingTask.setExcuted(done);
                    return drivingTask;

                default:
                    return null;
            }
        }
        else {
            switch (taskClass) {
                case SHOPPINGTASK:
                    ShoppingTask shoppingTask = new ShoppingTask("Shopping wasn't completed", "laptop", 3);
                    shoppingTask.setExcuted(done);
                    return shoppingTask;

                case PAINTINGTASK:
                    PaintingTask paintingTask = new PaintingTask("Painting task wasn't completed", "czerwony", "słońce");
                    paintingTask.setExcuted(done);
                    return paintingTask;

                case DRIVINGTASK:
                    DrivingTask drivingTask = new DrivingTask("Driving task wasn't completed", "Wrocław", "car");
                    drivingTask.setExcuted(done);
                    return drivingTask;

                default:
                    return null;
            }
        }
    }
}
