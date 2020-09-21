package com.company.abstractFactoryAndSingleton;

public class ToyotaEngine implements Engine {

    @Override
    public void create() {
        System.out.println("Engine has been created for Toyota!");
    }
}
