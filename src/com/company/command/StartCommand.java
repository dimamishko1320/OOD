package com.company.command;

public class StartCommand implements Command {
    private final Car car;

    public StartCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.startCar();
    }
}
