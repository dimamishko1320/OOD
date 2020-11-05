package com.company.visitors;

public class Engine implements CarStruct {
    private boolean state;

    public Engine(){
        state=false;
    }

    public void start(){
        state=true;
    }

    public void stop(){
        state=false;
    }

    @Override
    public void accept(Visitors visitors) {
        visitors.visit(this);
    }

}
