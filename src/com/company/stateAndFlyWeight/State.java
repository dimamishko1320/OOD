package com.company.stateAndFlyWeight;

public abstract class State {
    protected  int maxTemp;
    protected int minTemp;
    protected  int weight;



    public abstract String getName();
    public abstract void freeze(StateContext context);
    public abstract void heat(StateContext context);
    public abstract int getMaxTemp();
    public abstract int getMinTemp();
    //public abstract void print();
    public void print() {
        System.out.println("State: "+getName()+", weight="+weight+", min temp = "+minTemp+", max temp = "+maxTemp);
    }

}
