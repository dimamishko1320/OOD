package com.company.сhainOfResponsibility;

public class Sberbank extends Account {

    public Sberbank(int balance){
        this.balance=balance;
    }

    @Override
    public String getName() {
        return "Sberbank";
    }
}
