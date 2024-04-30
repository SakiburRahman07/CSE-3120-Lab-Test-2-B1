package com.example.labtestb1;

public abstract class shape {
    public String name;
    public shape(String name)
    {
        this.name=name;

    }
    public abstract double area();
    public abstract double perimeter();

}
