package com.company.interpreter.Test;

import com.company.interpreter.Contex;
import com.company.interpreter.Expression;
import com.company.interpreter.LowerExpression;
import com.company.interpreter.UpperExpression;


public class Test {


    /*
    Простыми словами - данная программа позволяет переводить текст из нижнего регистра
    в верхний и наоборот. Все это реализоано с помощью патерна интепретатор.
    В качестве интерпретатора используется интерфейс Epression.
    Две реализации интерфейс - LowerExpression и UpperExpression представляют нетерминальные объекты.
    Они реализуют операции перевода текста в нижний и верхний регистр соотвественно.
    Класс Context определяет методы для установки значений переменных и для получения их значений.
     */
    @org.junit.Test
    public void interpret() {
        String str = "text for check";
        Contex context = new Contex();
        Expression loverExpression = new LowerExpression(str);
        str = loverExpression.interpret(context);
        System.out.println(str);
        Expression upperExpression = new UpperExpression(str);
        str = upperExpression.interpret(context);
        System.out.println(str);
    }
}