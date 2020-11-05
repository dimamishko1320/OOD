package com.company.сomposite;

public class Circle implements Figure {
    @Override
    public void draw(String color) {
        System.out.println("A "+color+" circle was drawn");
    }
}
