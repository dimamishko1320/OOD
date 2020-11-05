package com.company.bridge;

public class MilkShake implements Drinks {

    @Override
    public void fill() {
        System.out.println("A milkshake is ready");
    }
}
