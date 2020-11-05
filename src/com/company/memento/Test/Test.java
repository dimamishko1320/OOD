package com.company.memento.Test;

import com.company.memento.Order;
import com.company.memento.Snapshot;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class Test {

    /*
    У нас есть корзина продуктов. В любой момент мы можем сохранить её состояние,
    и продолжить добавлять/удалять продукты. В любой момент мы сможем вернуться к сохраненному
    состоянию и корзина примит прежней вид.
     */
    @org.junit.Test
    public void test() {
        Map<Integer, String> products = new HashMap<>();

        Order order = new Order(products);
        order.addProduct(60, "Milk");
        order.addProduct(35, "Bread");
        order.addProduct(16, "Potato");
        order.printProducts();
        Snapshot snapshot = order.createSnapshot();
        System.out.println("---------------------");
        order.addProduct(100, "apple");
        order.printProducts();
        System.out.println("---------------------");
        System.out.println("Cost before:= "+order.getCost());
        snapshot.restore();
        System.out.println("Cost after:= "+order.getCost());
        System.out.println("Order after restore");
        order.printProducts();




    }
}