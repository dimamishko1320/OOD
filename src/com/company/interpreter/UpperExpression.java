package com.company.interpreter;

public class UpperExpression implements Expression {
    private String s;
    public UpperExpression(String s) {
        this.s = s;
    }

    public String interpret(Contex context) {
        return context.getUpperCase(s);
    }
}
