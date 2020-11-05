package com.company.adapter;

public class RemoteController implements TV {
    private boolean status;
    private int channel;
    private Human human;

    public RemoteController(Human human){
        this.human=human;
    }


    @Override
    public void turnOnTheTV() {
        status=true;
        System.out.println("Телефизор включен");
    }

    @Override
    public void changeTVChannel(int channel) {
        if(status==true){
            this.channel=channel;
            System.out.println("Вы включили "+channel+" канал");
        }
    }

    @Override
    public void turnOffTheTV() {
        status=false;
        System.out.println("Телевизор выключен");
    }
}
