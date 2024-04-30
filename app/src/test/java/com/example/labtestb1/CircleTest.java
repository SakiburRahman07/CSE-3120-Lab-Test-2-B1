package com.example.labtestb1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {

    @Test
    public void area() {
        Circle c = new Circle(5);
        assertEquals(78.53999999999999, c.area(),0.0);
    }

    @Test
    public void perimeter() {
        Circle c = new Circle(5);
        assertEquals(3.1416*2*5, c.perimeter(),0.0);
    }
}