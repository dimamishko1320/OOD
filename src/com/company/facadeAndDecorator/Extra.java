package com.company.facadeAndDecorator;

public abstract class Extra implements Coffe {
    protected Coffe coffe;
    protected String label;
    protected int price;

    public Extra(String label, int price, Coffe coffe){
        this.coffe=coffe;
        this.label=label;
        this.price=price;
    }

    public abstract int getPrice();

    public String getLabel() {
        return coffe.getName() + " with " + this.label;
    }
}
