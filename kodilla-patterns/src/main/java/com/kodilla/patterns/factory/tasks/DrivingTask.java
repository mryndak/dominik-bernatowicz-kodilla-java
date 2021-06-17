package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    String taskName;
    String where;
    String using;
    boolean done;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("Were to drive:  -   using:");
        System.out.println(where + "        -       " + using);

    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    public void setExcuted(boolean done) {
        this.done = done;
    }

    @Override
    public boolean isTaskExcuted() {
        return done;
    }

    @Override
    public String getMoreInfrmacion() {
        return where + " - " + using;
    }

}
