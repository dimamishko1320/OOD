package com.company.abstractFactoryAndSingleton;

public class MazdaFactory implements MainFactory{
    //реализация паттерна Singleton
    //допустим, что у нас может быть только один конкретный завод по производству запчастей для мазды
    private static MazdaFactory instance;

    private MazdaFactory(){}

    public static MazdaFactory getInstance(){
        if(instance == null){
            instance = new MazdaFactory();
        }
        return instance;
    }

    @Override
    public Engine createEngine() {
        return new MazdaEngine();
    }

    @Override
    public Transmission createTranmission() {
        return new MazdaTransmission();
    }
}
