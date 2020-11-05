package com.company.stateAndFlyWeight;

public class GaseousState extends State {


    public GaseousState(){
        maxTemp=10000;
        minTemp=100;
        weight=17;
    }

    @Override
    public String getName() {
        return "gaseous";
    }

    @Override
    public void freeze(StateContext context) {
        context.setState(new LiquidState());
    }

    @Override
    public void heat(StateContext context) {
        System.out.println("Nothing happens.");
    }

    @Override
    public int getMaxTemp() {
        return 10000;
    }

    @Override
    public int getMinTemp() {
        return 100;
    }

}
