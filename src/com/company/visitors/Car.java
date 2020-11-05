package com.company.visitors;

public class Car implements CarStruct{
    CarStruct[] carsStruct;

    public Car(){
        carsStruct = new CarStruct[]{new Engine(), new Transmission()};
    }

    @Override
    public void accept(Visitors visitors) {
        for (int i = 0; i < carsStruct.length; i++) {
            carsStruct[i].accept(visitors);
        }
        visitors.visit(this);
    }


    public void startEngine() {
        System.out.println("Двигатель запущен");
    }
    public void stopEngine() {
        System.out.println("Двигатель заглушен");
    }
}
