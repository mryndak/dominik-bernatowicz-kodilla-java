package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    String taskName;
    String color;
    String whatToPaint;
    boolean done;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("What to paint:  -   color:");
        System.out.println(whatToPaint + "        -       " + color);

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
        return whatToPaint + " - " + color;
    }

}

