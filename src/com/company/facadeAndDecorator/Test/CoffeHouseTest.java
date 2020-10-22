package com.company.facadeAndDecorator.Test;

import com.company.facadeAndDecorator.*;
import org.junit.Test;

public class CoffeHouseTest {


    //Допустим, что пользователь заказывает кофе в кофейне через терминал.
    //Ему не нужно выбирать ингридиенты из которых будет вариться кофе
    //Ему только требуется выбрать название кофе, и заказ на его приготовление будет отправлен.
    @Test
    public void facadPattern() {
        CoffeHouse coffeHouse = new CoffeHouse();
        coffeHouse.makeCoffe("latte");
        coffeHouse.makeCoffe("espresso");
        coffeHouse.makeCoffe("americano");

        try {
            coffeHouse.makeCoffe("cacao");
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }


    //Этот механизм будет использоваться когда мы будем отправлять заказ на приготовление через кассу.
    //Человек будет говорить какой кофе он хочет, и какую добавку он желает
    //Бариста будет знать, какой кофе именно ему потребуется сделать, и что туда положить.
    @Test
    public void DecoratorPattern() {
        Coffe coffe = new Latte();

        coffe = new RegularExtra("cinnamon", 10, coffe);
        System.out.println(coffe.getName()+" cost:"+coffe.getPrice());
        //При попытке добавить бесплатную добавку за деньги, цена меняться не будет
        coffe = new NoCostExtra("Sugar", 2, coffe);
        System.out.println(coffe.getName()+" cost:"+coffe.getPrice());

        }
    }
