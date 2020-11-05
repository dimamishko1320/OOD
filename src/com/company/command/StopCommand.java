package com.company.command;

public class StopCommand implements Command {
    private final Car car;

    public StopCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.stopCar();
    }

}
