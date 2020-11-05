package com.company.mediatorAndObserver;

public class ConcreteChatRoom extends ChatRoom {
    private String lastMessage;
    private ConcretePerson1 person1;
    private ConcretePerson2 person2;
    private Admin admin;


   public void setPerson1(ConcretePerson1 person1){
        this.person1=person1;
    }

    public void setPerson2(ConcretePerson2 person2){
        this.person2=person2;
    }

    public void setAdmin(Admin admin){
        this.admin=admin;
    }


    public void getDialog(){
        System.out.println(lastMessage);
    }


    @Override
    public void send(String message, Person sender) {
        if (sender.equals(person1)) {
            lastMessage="person1:"+message;
            admin.update();
           person2.notify(message);
        } else {
            lastMessage="person2:"+message;
            admin.update();
           person1.notify(message);
        }
    }

}
