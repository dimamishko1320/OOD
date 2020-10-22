package com.company.templateMethodAndStrategy;

import java.util.List;

public class Pizza extends BakeryProducts {
    public Pizza(String name, List<String> ingredients) {
        super(name, ingredients);
        this.cookingStrategy=new BakeInTheOvenStrategy();
    }

    @Override
    public void filling() {
        StringBuilder nameAllIngridients = new StringBuilder();
        for(String elem: ingredients){
            nameAllIngridients.append(elem+", ");
            mass=+50;
        }
        nameAllIngridients.deleteCharAt(nameAllIngridients.length()-1);
        name=name+" with "+nameAllIngridients;
    }

    @Override
    public void makeTheDough() {
        mass=mass+300;
    }

    @Override
    public void serveBakedGoods() {
        System.out.println("Pizza: "+name+" is cooked");
    }
}
