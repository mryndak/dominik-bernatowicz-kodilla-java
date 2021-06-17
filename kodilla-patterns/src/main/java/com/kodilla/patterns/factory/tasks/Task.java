package com.kodilla.patterns.factory.tasks;

public interface Task {
    void executeTask();
    String getTaskName();
    public void setExcuted(boolean done);
    boolean isTaskExcuted();
    String getMoreInfrmacion();


}
