package com.company.templateMethodAndStrategy;

public class BakeInTheOvenStrategy implements CookingStrategy {
    @Override
    public void sendToPrepare() {
        System.out.println("We send it to the oven with a temperature of 100 degrees");
    }
}
