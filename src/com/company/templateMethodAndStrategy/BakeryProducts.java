package com.company.templateMethodAndStrategy;

import java.util.List;

public abstract class BakeryProducts {

    CookingStrategy cookingStrategy;
    protected String name;
    protected double mass;
    protected List<String> ingredients;


    public BakeryProducts(String name, List<String> ingredients){
        this.ingredients=ingredients;
        this.name=name;
    }

    public abstract void filling();
    public abstract void makeTheDough();
    public abstract void serveBakedGoods();

    public void cook(){
        filling();
        makeTheDough();
        cookingStrategy.sendToPrepare();
        serveBakedGoods();

    }
}
