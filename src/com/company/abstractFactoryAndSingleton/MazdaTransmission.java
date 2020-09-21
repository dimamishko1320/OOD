package com.company.abstractFactoryAndSingleton;

public class MazdaTransmission implements Transmission {

    @Override
    public void create() {
        System.out.println("Tranmission has been created for Mazda!");
    }
}
