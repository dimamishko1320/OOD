package com.company.сomposite.Test;

import com.company.сomposite.*;


public class Test {



    /*
    У нас есть 3 типа фигур, которые выполняют одно и то же действие
    Они могут быть нарисованы определенным цветом.
    Для упрощения программы мы используем паттерн компоновщик, и объеденяем все эти фигуры
    в классе Drawing. Теперь для того, чтобы нарисовать фигуры нам нужно лишь добавить фигуры в хранилище
    Drawing, а затем нарисовать, выбрав для них всех единный цвет.
     */
    @org.junit.Test
    public void draw() {
        Figure cirlce = new Circle();
        Figure square = new Square();
        Figure triangle = new Triangle();
        Drawing drawing = new Drawing();

        drawing.add(cirlce);
        drawing.add(square);
        drawing.draw("green");
        System.out.println("-----------------");
        drawing.add(triangle);
        drawing.draw("black");
        System.out.println("-----------------");
        drawing.clear();
        drawing.add(cirlce);
        drawing.draw("yellow");

    }
}