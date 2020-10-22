package com.company.facadeAndDecorator;

public class Espresso implements Coffe {
    private int waterML;
    private int coffeML;
    private int price;


    public Espresso(){
        this.price=50;
        waterML=30;
        boilWater();
        coffeML=10;
    }

    public void makeEspresso(){

        System.out.println("Ваш эспрессо готов");
    }

    void boilWater(){
    }

    public int getWaterML() {
        return waterML;
    }

    public int getCoffeML() {
        return coffeML;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return "Espresso";
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
