package com.company.visitors.Test;

import com.company.visitors.Car;
import com.company.visitors.CarStruct;
import com.company.visitors.CarVisitor;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarVisitorTest {

    /*
    Программа демонстрирует процесс работы компьютера, который
    подключается к машине для получения информации о её
    состоянии. Паттерн посетитель позволяет нам отправить своих
    "посетителей" в класс частей машины, которые вследствии и
    будут нам сообщать о состоянии машины.
     */
    @Test
    public void Test() {
        CarStruct comp = new Car();
        CarVisitor carVisitor = new CarVisitor();
        comp.accept(carVisitor);
    }
}