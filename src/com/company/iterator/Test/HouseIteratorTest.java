package com.company.iterator.Test;

import com.company.iterator.*;
import org.junit.Test;

import java.util.Iterator;


public class HouseIteratorTest {

    /*
    Допустим у нас идет проверка некой базы данных домов,
    которые находятся в процессе строительства.
    Благодаря данному итератору, мы сможем выяснить на какой стадии
    находится дом.
     */

    @Test
    public void hasNext() {
        House.Wall wall = new House.Wall();
        House.Roof roof = new House.Roof();
        House.Windows windows = new House.Windows();
        House.Foundation foundation = new House.Foundation();
        House house = new House(roof,windows, wall, foundation);

        Iterator it = house.iterator();

        while (it.hasNext()) {
            System.out.println("The house has "+it.next().toString());
        }


    }
}