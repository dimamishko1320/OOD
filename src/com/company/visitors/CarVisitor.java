package com.company.visitors;

public class CarVisitor implements Visitors{


    public void visit(Car car) {
        print("Scanning car....");
        print("The car is normal");
    }
    public void visit(Engine engine) {
        print("Scanning engine....");
        print("The engine is normal");
    }
    public void visit(Transmission transmission) {
        print("Scanning transmission....");
        print("The transmission is normal");
    }
    private void print(String string) {
        System.out.println(string);
    }

}
