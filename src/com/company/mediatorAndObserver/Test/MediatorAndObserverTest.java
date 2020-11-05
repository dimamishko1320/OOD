package com.company.mediatorAndObserver.Test;

import com.company.mediatorAndObserver.Admin;
import com.company.mediatorAndObserver.ConcreteChatRoom;
import com.company.mediatorAndObserver.ConcretePerson1;
import com.company.mediatorAndObserver.ConcretePerson2;
import org.junit.Test;

public class MediatorAndObserverTest {



    /*
        В данной программе реализован чат между 2 людьми.

       Mediator
        В роли посредника между двумя людьми выступает класс - чат,
        в котором люди обмениваются своими сообщениями.

       Observer
        В роли наблюдателя выступает админ, он может подключиться к чату
        и к нему будут поступать уведомление о новых сообщениях пользователей.
     */
    @Test
    public void test() {
        ConcreteChatRoom chat = new ConcreteChatRoom();
        ConcretePerson1 person1 = new ConcretePerson1(chat);
        ConcretePerson2 person2 = new ConcretePerson2(chat);
        Admin admin = new Admin(chat);
        chat.setPerson1(person1);
        chat.setPerson2(person2);
        chat.setAdmin(admin);

        person1.send("New message for person2");

        person2.send("Person1 response");

        System.out.println("---------------");

        admin.update();
    }
}