package com.company.bridge;

public abstract class Order {
    Drinks drinks;

    public Order(Drinks drinks){
        this.drinks = drinks;
    }

    public void make(){
        drinks.fill();
    }
}
