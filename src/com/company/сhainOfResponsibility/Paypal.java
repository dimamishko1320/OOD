package com.company.сhainOfResponsibility;

public class Paypal extends Account {
    public Paypal(int balance){
        this.balance=balance;
    }

    @Override
    public String getName() {
        return "Paypal";
    }
}
