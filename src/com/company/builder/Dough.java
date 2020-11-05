package com.company.builder;

public enum Dough {
    THIN,
    THICK;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
