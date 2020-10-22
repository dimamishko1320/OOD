package com.company.templateMethodAndStrategy.Test;



import com.company.templateMethodAndStrategy.BakeryProducts;
import com.company.templateMethodAndStrategy.Pancakes;
import com.company.templateMethodAndStrategy.Pie;
import com.company.templateMethodAndStrategy.Pizza;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class templateMethodAndStrategyTest {

    @Test
    public void templateMethodAndStrategyTest() {
        BakeryProducts bakeryProducts1 = null;
        List<String> ingr1 = new ArrayList<>();
        ingr1.add("potato");
        ingr1.add("mushrooms");
        bakeryProducts1 = new Pie("Pie", ingr1);
        bakeryProducts1.cook();
        System.out.println("---------------------------------");

        BakeryProducts bakeryProducts2 = null;
        List<String> ingr2 = new ArrayList<>();
        ingr2.add("mozzarella");
        ingr2.add("tomatoes");
        ingr2.add("tomato sauce");
        bakeryProducts2 = new Pizza("Margarita", ingr2);
        bakeryProducts2.cook();
        System.out.println("---------------------------------");

        BakeryProducts bakeryProducts3 = null;
        List<String> ingr3 = new ArrayList<>();
        ingr3.add("meat");
        bakeryProducts3=new Pancakes("Pancake", ingr3);
        bakeryProducts3.cook();
        System.out.println("---------------------------------");

    }


}