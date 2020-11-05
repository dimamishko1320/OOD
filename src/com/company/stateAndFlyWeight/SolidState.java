package com.company.stateAndFlyWeight;

public class SolidState extends State {

    public SolidState(){
        weight=917;
        maxTemp=-1;
        minTemp=-10000;
    }
    @Override
    public String getName() {
        return "solid";
    }

    @Override
    public void freeze(StateContext context) {
        System.out.println("Nothing happens");
    }

    @Override
    public void heat(StateContext context) {
        context.setState(new LiquidState());
    }

    @Override
    public int getMaxTemp() {
        return -1;
    }

    @Override
    public int getMinTemp() {
        return -10000;
    }
}
