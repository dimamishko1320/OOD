package com.company.builder.Test;

import com.company.builder.Dough;
import com.company.builder.Pizza;
import com.company.builder.Size;
import org.junit.Test;

import java.util.ArrayList;


public class PizzaTest {
    @Test
    public void test(){
        Pizza pizza1 = new Pizza.PizzaBuilder("Margarita")
                .addSauce("cheese")
                .setDough(Dough.THIN)
                .setSize(Size.CM25)
                .withIngridients("mozzarella", "parmesan", "tomatoes")
                .cook();

        Pizza pizza2 = new Pizza.PizzaBuilder("Pepperoni")
                .addSauce("tomato")
                .setDough(Dough.THICK)
                .setSize(Size.CM40)
                .withIngridients("mozzarella", "peperoni", "Bell pepper")
                .cook();


    }

}