package com.example.labtestb1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

    @Test
    public void area() {
        Square s = new Square(4);
        assertEquals(4*4,s.area(),0.0);
    }

    @Test
    public void perimeter() {
        Square s = new Square(4);
        assertEquals(4*4,s.perimeter(),0.0);
    }
}