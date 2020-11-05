package com.company.memento;



import java.util.Map;

public class Order {
    private int cost;
    private Map<Integer, String> products;


    public Order(Map<Integer, String> products){
        this.products=products;
        for(Map.Entry<Integer, String> elem: products.entrySet()){
            cost+=elem.getKey();
        }
    }


    public void addProduct(int cost, String name){
        products.put(cost, name);
        this.cost+=cost;
    }

    public void printProducts() {
        for(Map.Entry<Integer, String> elem: products.entrySet()){
            System.out.println(elem);
        }
    }

    public void setProducts(Map<Integer, String> products) {
        cost=0;
        this.products = products;
        for(Map.Entry<Integer, String> elem: products.entrySet()){
            cost+=elem.getKey();
        }
    }

    public Map<Integer, String> getProducts() {
        return products;
    }

    public int getCost(){
        return cost;
    }

    public Snapshot createSnapshot(){
        return new Snapshot(this, products);
    }
}
