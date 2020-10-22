package com.company.templateMethodAndStrategy;

public class FryInAFryingPan implements CookingStrategy {
    @Override
    public void sendToPrepare() {
        System.out.println("We send the baked goods to be fried in a frying pan");
    }
}
