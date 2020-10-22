package com.company.facadeAndDecorator;

public class RegularExtra extends Extra {
    //Добавка двойной порции чего-то в кофе
    public RegularExtra(String label, int price, Coffe coffe) {
        super(label, price, coffe);
    }

    @Override
    public int getPrice() {
        return this.price + coffe.getPrice();
    }

    @Override
    public String getName() {
        return coffe.getName() + " with " + this.label;
    }
}
