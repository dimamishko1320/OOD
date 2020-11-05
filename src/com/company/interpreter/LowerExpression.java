package com.company.interpreter;

public class LowerExpression implements Expression {
    private String s;
    public LowerExpression(String s) {
        this.s = s;
    }
    public String interpret(Contex context) {
        return context.getLowerCase(s);
    }
}
