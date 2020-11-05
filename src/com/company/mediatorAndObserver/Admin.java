package com.company.mediatorAndObserver;

public class Admin implements ChatObserver{
    private ConcreteChatRoom chatRoom;

    public Admin(ConcreteChatRoom concreteChatRoom){
        this.chatRoom=concreteChatRoom;
    }

    @Override
    public void update() {
        chatRoom.getDialog();
    }
}
