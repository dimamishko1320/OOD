package com.company.mediatorAndObserver;

public abstract class Person {
    protected ChatRoom chatRoom;

    public Person(ChatRoom chatRoom){
        this.chatRoom=chatRoom;
    }

    public void send(String message){
        chatRoom.send(message, this);
    }

    public abstract void notify(String message);

}
