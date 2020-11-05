package com.company.mediatorAndObserver;

public class ConcretePerson2 extends Person {

    public ConcretePerson2(ChatRoom chatRoom) {
        super(chatRoom);
    }

    @Override
    public void notify(String message) {
        System.out.println("Person2 get message: "+message);
    }

}
