package com.company.abstractFactoryAndSingleton;

public class ToyotaFactory implements MainFactory {
    //Реализация паттерна Singleton
    //допустим, что у нас может быть только один конкретный завод по производству запчастей для тойоты
    private static ToyotaFactory instance;

    private ToyotaFactory(){}
    public static ToyotaFactory getInstance(){
        if(instance == null){
            instance = new ToyotaFactory();
        }
        return instance;
    }

    @Override
    public Engine createEngine() {
        return new ToyotaEngine();
    }

    @Override
    public Transmission createTranmission() {
        return new ToyotaTransmission();
    }
}
