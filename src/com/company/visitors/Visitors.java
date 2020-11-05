package com.company.visitors;

public interface Visitors {
    void visit(Car car);
    void visit(Engine engine);
    void visit(Transmission transmission);
}
