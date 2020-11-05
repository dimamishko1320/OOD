package com.company.сomposite;

public class Square implements Figure {
    @Override
    public void draw(String color) {
        System.out.println("A "+color+" square was drawn");
    }
}
