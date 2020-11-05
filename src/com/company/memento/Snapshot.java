package com.company.memento;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.HashMap;
import java.util.Map;

public class Snapshot {
    private Order order;
    private Map<Integer, String> products;

    public Snapshot(Order order, Map<Integer, String> products){
        this.order=order;
        this.products=new HashMap<>(products);
    }

    public void restore(){
        order.setProducts(products);
    }


}
