package com.company.visitors;

public class Transmission implements CarStruct {
    @Override
    public void accept(Visitors visitors) {
        visitors.visit(this);
    }

}
