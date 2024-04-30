package com.example.labtestb1;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreenTest {

    @Test
    public void showcolor() {
        Green g = new Green();
        assertEquals("Green", g.showcolor());
    }
}