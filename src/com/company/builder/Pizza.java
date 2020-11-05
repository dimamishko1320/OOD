package com.company.builder;

import java.util.ArrayList;
import java.util.List;

public final class Pizza {
    private final String name;
    private final Size size;
    private final Dough dough;
    private final String sauce;
    private final List<String> ingridients;



    public Pizza(PizzaBuilder pizzaBuilder) {
        this.name = pizzaBuilder.name;
        this.size = pizzaBuilder.size;
        this.dough = pizzaBuilder.dough;
        this.sauce = pizzaBuilder.sauce;
        this.ingridients = pizzaBuilder.ingridients;
    }


    public static class PizzaBuilder {
        private final String name;
        private Size size;
        private Dough dough;
        private String sauce;
        private List<String> ingridients;


        public PizzaBuilder(String name) {
            this.name = name;
        }

        public PizzaBuilder setSize(Size size) {
            this.size = size;
            return this;
        }

        public PizzaBuilder setDough(Dough dough) {
            this.dough = dough;
            return this;
        }

        public PizzaBuilder addSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public PizzaBuilder withIngridients(String ... ingridients) {
            this.ingridients=new ArrayList<>();
            for(String name: ingridients){
                this.ingridients.add(name);
            }
            return this;
        }

        public Pizza cook(){
            System.out.println(name+"\n dm: ["+size.toString()+"], dought: ["+dough.toString()+"], with ["+sauce+" sauce]"+", with "+ingridients.toString());
            return new Pizza(this);
        }
    }


}
