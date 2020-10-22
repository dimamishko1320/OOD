package com.company.templateMethodAndStrategy;

import java.util.List;

public class Pie extends BakeryProducts {
    public Pie(String name, List<String> ingredients) {
        super(name,  ingredients);
        this.cookingStrategy= new BakeInTheOvenStrategy();
    }

    @Override
    public void filling() {
        StringBuilder nameAllIngridients = new StringBuilder();
        for(String elem: ingredients){
            nameAllIngridients.append(elem+", ");
            mass=+40;
        }
        nameAllIngridients.deleteCharAt(nameAllIngridients.length()-2);
        name=name+" with "+nameAllIngridients;
    }

    @Override
    public void makeTheDough() {
        mass=mass+80;
    }

    @Override
    public void serveBakedGoods() {
        System.out.println("Pie: "+name+" is cooked");
    }
}
