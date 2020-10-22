package com.company.facadeAndDecorator;

public class Americano implements Coffe {
    private int waterML;
    private int coffeML;
    private int price;

    public Americano(){
        price=120;
        Espresso espresso = new Espresso();
        this.coffeML=espresso.getCoffeML();
        this.waterML=espresso.getWaterML()*2;
    }

    public void makeAmericano(){

        System.out.println("Ваш Американо готов");
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return "Americano";
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
