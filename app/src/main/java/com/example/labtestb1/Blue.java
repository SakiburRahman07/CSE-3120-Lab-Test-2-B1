package com.example.labtestb1;

public class Blue extends Color{

    public Blue() {
        super("Blue");
    }

    @Override
    public String showcolor() {
        return this.name;
    }
}
