package com.company.сhainOfResponsibility.Test;

import com.company.сhainOfResponsibility.Paypal;
import com.company.сhainOfResponsibility.Sberbank;
import com.company.сhainOfResponsibility.Visa;


public class Test {


    /*
    Допустим у нас есть мобильное приложение, которые отвечает
    за все наши средства, хранящиеся на разных счетах и в разных банках.
    Допустим мы хотим совершить покупку с помощью этого приложения, но мы не помним
    на каком счету сколько денег.
    Тогда паттерн цепочка обязаностей поможет нам это сделать.
    Мы выстраиваем цепочку из наших счетов, и при попытке оплатить какой-либо товар
    деньги на счетах будут проверяться по цепочке - если на первом счете не хватает денег, будет произведена
    попытка оплаты с 2-ого счета, если и на 2-ом нет достаточной суммы, то будет произведена попытка оплаты
    с 3-его счета. Если и на нем не хватает денег, то покупка не будет соверешена.
     */
    @org.junit.Test
    public void canPay() {
        Sberbank sberbank = new Sberbank(100);
        Paypal paypal = new Paypal(200);
        Visa visa = new Visa(300);
        sberbank.setNext(paypal);
        paypal.setNext(visa);
        sberbank.pay(70);
        System.out.println("--------------------------------------");
        sberbank.pay(130);
        System.out.println("--------------------------------------");
        sberbank.pay(294);
        System.out.println("--------------------------------------");
        sberbank.pay(500);
        System.out.println("--------------------------------------");
        System.out.println("Sberbank ="+sberbank.getBalance());
        System.out.println("Paypal ="+paypal.getBalance());
        System.out.println("Visa ="+visa.getBalance());
    }
}