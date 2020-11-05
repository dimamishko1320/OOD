package com.company.command.Test;

import com.company.command.*;
import org.junit.Test;

public class CommandTest {


    /*
    Эта программа является краткой реализацией ключей с дистанционным доступом для машины.
    У ключей задано две команда - запустить машины и заглушить.
    При выборе первой команде - машина заводится.
    При выборе второй - глушится.
    Все это реализовано на основе паттерна Команда.
    В нашем случае объект ключ заклюает в себя два действия,
    которые он может осуществлять.
     */
    @Test
    public void test() {
        Car car = new Car();
        Command start = new StartCommand(car);
        Command stop = new StopCommand(car);

        Key key = new Key();
        key.saveCommand("start", start);
        key.saveCommand("stop", stop);

        key.execute("start");
        key.execute("stop");
    }
}