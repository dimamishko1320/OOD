package com.company.facadeAndDecorator;

public class NoCostExtra extends Extra {
    //Добавка в кофе без цены(цена не будет меняться)
    public NoCostExtra(String label, int price, Coffe coffe) {
        super(label, price, coffe);
    }

    @Override
    public int getPrice() {
        return coffe.getPrice();
    }

    @Override
    public String getName() {
        return coffe.getName() + " with " + this.label;
    }


}
