package com.company.abstractFactoryAndSingleton;

public class MazdaEngine implements Engine {
    @Override
    public void create() {
        System.out.println("Engine has been created for Mazda!");
    }
}
