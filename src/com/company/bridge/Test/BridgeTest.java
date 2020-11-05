package com.company.bridge.Test;

import com.company.bridge.*;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BridgeTest {

    /*
    Мы делаем заказ в кафе.
    У нас есть абстрактный класс Order, который описывает заказ, и абстрактный класс полезной еды.
    И у нас есть реализация - это классы напитков.
    Мост разделяет абстракцию и реализацию
     */

    @Test
    public void test() {
        List<Order> order = new ArrayList();
        order.add(new HealthFood(new MilkShake()));
        order.add(new HealthFood(new OrangeJuice()));
        order.add(new HealthFood(new GreenTea()));
        for(Order elem: order){
            elem.make();
        }

    }
}