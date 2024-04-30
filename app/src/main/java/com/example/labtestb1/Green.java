package com.example.labtestb1;

public class Green extends Color{
    public Green() {
        super("Green");
    }

    @Override
    public String showcolor() {
        return this.name;
    }
}
