package com.company.adapter.Test;

import com.company.adapter.Human;
import com.company.adapter.RemoteController;
import com.company.adapter.TV;

import static org.junit.Assert.*;

public class Test {



    /*
        В данной программе есть две стороны - телевизор и человек.
        Допустим человек не может взаимодействовать с тв напрямую.
        И в данной ситуации появляется пуль, который является адаптером, связующим между 2 сторонами.
     */
    @org.junit.Test
    public void watchTV() {
        TV tv = new RemoteController(new Human());
        tv.turnOnTheTV();
        tv.changeTVChannel(23);
        tv.turnOffTheTV();
    }
}