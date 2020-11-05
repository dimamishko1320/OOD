package com.company.mediatorAndObserver;

public class ConcretePerson1 extends Person {


    public ConcretePerson1(ChatRoom chatRoom) {
        super(chatRoom);
    }


    @Override
    public void notify(String message) {
        System.out.println("Person1 get message: "+message);
    }

}
