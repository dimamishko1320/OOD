package com.company.bridge;

public class GreenTea implements Drinks {


    @Override
    public void fill() {
        System.out.println("Green tea is ready");
    }
}
