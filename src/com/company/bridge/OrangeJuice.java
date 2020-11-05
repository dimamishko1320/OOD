package com.company.bridge;

public class OrangeJuice implements Drinks {
    @Override
    public void fill() {
        System.out.println("Orange juice is ready");
    }
}
