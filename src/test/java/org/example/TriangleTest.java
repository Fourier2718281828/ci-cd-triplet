package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void validationTest() {
        Point a = new Point(1,2);
        Point b = new Point(1,2);
        Point c = new Point(1,2);

        Point aC = new Point(12,23);
        Point bC = new Point(11,24);
        Point cC = new Point(51,25);

        try {
            Triangle triangle = new Triangle(a, b, c);
            fail();
        } catch(Exception ignored) {
        }

        try {
            Triangle correctTriangle = new Triangle(aC, bC, cC);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }
}