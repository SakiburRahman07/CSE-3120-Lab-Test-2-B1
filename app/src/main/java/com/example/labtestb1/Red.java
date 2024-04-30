package com.example.labtestb1;

public class Red extends Color{
    public Red() {
        super("Red");
    }

    @Override
    public String showcolor() {
        return this.name;
    }
}
