package com.company.facadeAndDecorator;

public class Latte implements Coffe {
    private int waterML;
    private int milkML;
    private int coffeML;
    private int price;

    public Latte() {
        Espresso espresso = new Espresso();
        coffeML=espresso.getCoffeML();
        waterML=espresso.getWaterML();
        milkML=(waterML+coffeML)/2;
        this.price = 100;
    }


    public void makeLatte(){
        System.out.println("Ваш латте готов");
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return "Latte";
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
