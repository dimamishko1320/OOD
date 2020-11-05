package com.company.сomposite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Figure {
    private List<Figure> figures = new ArrayList<Figure>();
    public void draw(String color) {
        for(Figure figure : figures) {
            figure.draw(color);
        }
    }
    public void add(Figure f){
        this.figures.add(f);
    }
    public void clear(){
        System.out.println();
        this.figures.clear();
    }


}
