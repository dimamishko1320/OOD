package com.company.stateAndFlyWeight;

public class LiquidState extends State {

    public LiquidState(){
        weight=1000;
        maxTemp=99;
        minTemp=0;
    }

    @Override
    public String getName() {
        return "liquid";
    }

    @Override
    public void freeze(StateContext context) {
        context.setState(new SolidState());
    }

    @Override
    public void heat(StateContext context) {
        context.setState(new GaseousState());
    }

    @Override
    public int getMaxTemp() {
        return 99;
    }

    @Override
    public int getMinTemp() {
        return 0;
    }
}
