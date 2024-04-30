package com.example.labtestb1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

    @Test
    public void area() {
        Triangle t = new Triangle(3,3,3);
        assertEquals(3.897114317029974, t.area(),0.0);
    }

    @Test
    public void perimeter() {
        Triangle t = new Triangle(3,3,3);
        assertEquals(3+3+3, t.perimeter(),0.0);
    }
}