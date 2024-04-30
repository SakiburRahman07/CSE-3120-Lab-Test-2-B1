package com.example.labtestb1;

public class Square extends shape{
    public double side_length;
    public Square(double side_length) {
        super("Square");
        this.side_length=side_length;
    }

    @Override
    public double area() {
        return side_length*side_length;
    }

    @Override
    public double perimeter() {
        return 4*side_length;
    }
}
