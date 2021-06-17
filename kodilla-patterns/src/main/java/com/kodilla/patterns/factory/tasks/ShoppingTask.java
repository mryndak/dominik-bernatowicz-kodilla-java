package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    String taskName;
    String whatToBuy;
    double quantity;
    boolean done;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("What to buy: - Ile:");
        System.out.println(whatToBuy + "        -       " + quantity);
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
        return whatToBuy + " - " + quantity;
    }

}
