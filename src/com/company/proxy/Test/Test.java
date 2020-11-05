package com.company.proxy.Test;

import com.company.proxy.ClassSchedule;
import com.company.proxy.DisplaySchedule;

import static org.junit.Assert.*;

public class Test {


    /*
    В данной программе реализовано расписание пар,
    с помощью патерна заместитель.
    У нас расписание пар хранится в файлике, и для того
    чтобы каждый раз при обращении к расписанию(попытке его получить
    или попытке получить пару по её времени начала) нам не обращаться
    к файлику, мы создали класс ScheduleCopelsAtUniProxy, который хранит ссылку
    на наше расписание. И теперь при попытке обращения к расписанию мы вызываем копию нашего расписания
    если мы его уже вызывали ранее, или же обратимся к нему и сохраним ссылку на него.
    Это позволяет нам сильно оптимизироать нашу программу.
     */
    @org.junit.Test
    public void printTimetable() {
        DisplaySchedule displaySchedule = new DisplaySchedule();
        displaySchedule.printTimetable();
    }
}