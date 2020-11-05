package com.company.builder;

public enum Size{
    CM25,
    CM33,
    CM40;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
