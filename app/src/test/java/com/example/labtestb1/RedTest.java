package com.example.labtestb1;

import static org.junit.Assert.*;

import org.junit.Test;

public class RedTest {

    @Test
    public void showcolor() {
        Red r = new Red();
        assertEquals("Red", r.showcolor());
    }
}