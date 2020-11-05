package com.company.сhainOfResponsibility;

public class Visa extends Account {
    public Visa(int balance){
        this.balance=balance;
    }

    @Override
    public String getName() {
        return "Visa";
    }
}
