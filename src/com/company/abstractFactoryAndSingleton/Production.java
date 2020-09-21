package com.company.abstractFactoryAndSingleton;


public final class Production {
    private Engine engine;
    private Transmission transmission;

    Production(MainFactory factory) {
        engine = factory.createEngine();
        transmission = factory.createTranmission();
    }



    public void create() {
        engine.create();
        transmission.create();
    }


    public static Production configProd(String model) throws Exception {
        Production production;
        MainFactory factory;
        if(model.equalsIgnoreCase("mazda")){
            factory = MazdaFactory.getInstance();
            production = new Production(factory);
        }else if(model.equalsIgnoreCase("toyota")){
            factory= ToyotaFactory.getInstance();
            production=new Production(factory);
        }else throw new Exception("Uncorrect model auto");
        return production;
    }
}
