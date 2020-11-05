package com.company.stateAndFlyWeight.Test;

import com.company.stateAndFlyWeight.FlyWeightFactory;
import com.company.stateAndFlyWeight.State;
import com.company.stateAndFlyWeight.StateContext;
import org.junit.Test;


public class StateTest {


    /*
    Программа, которая демонстрирует изменение состояний тела.
    Изначально мы создаем тело, в  твердом состоянии.
    Потом мы пытаемся его нагревать, и оно переходит сначало в жидкое состояние,
    потом в газообразное.
    Далее при попытке охладить газ, мы вернемся к жидкости, а после и к твердому
    состоянию.
     */

    @Test
    public void state() {
        StateContext context = new StateContext();
        context.heat();
        System.out.println("-------------");
        context.heat();
        System.out.println("-------------");
        context.heat();
        System.out.println("-------------");
        context.freeze();
        System.out.println("-------------");
        context.freeze();
        System.out.println("-------------");
        context.freeze();
    }


    /*
    У нас состояния тела имеют общую сущность - они все имеют вес,
    максимальную температуру и минимальную. Для уменьшения затрат,
    при работе с состояниями тела, мы использовади паттерн легковес.
    Теперь у каждого состояния есть свой код, и благодаря классу
    flyWeightFactory, по этому коду мы можем вызвать конкретное состояние.
     */
        @Test
        public void flyWeight () {
            FlyWeightFactory factory = new FlyWeightFactory();
            int[] statesCodes = {1, 2, 3};
            for (int nextCode : statesCodes) {
                State state = factory.getState(nextCode);
                state.print();
            }

        }
    }