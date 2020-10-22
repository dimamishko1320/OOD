package com.company.facadeAndDecorator;


public class CoffeHouse {


    public void makeCoffe(String nameOfCoffe){
        switch (nameOfCoffe) {
            case  ("latte"):
               Latte latte = new Latte();
               latte.makeLatte();
                break;
            case ("espresso"):
                Espresso espresso = new Espresso();
                espresso.makeEspresso();
                break;
            case ("americano"):
                Americano americano = new Americano();
                americano.makeAmericano();
                break;
            default:
                throw new IllegalArgumentException("Неизвестный кофе");
        }
    }


}
