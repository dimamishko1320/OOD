package com.company.abstractFactoryAndSingleton;

public class ToyotaTransmission implements Transmission {

    @Override
    public void create() {
        System.out.println("Transmission has been created for Toyota!");
    }
}
