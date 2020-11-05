package com.company.сomposite;

public class Triangle implements Figure {
    @Override
    public void draw(String color) {
        System.out.println("A "+color+" triangle was drawn");
    }
}
