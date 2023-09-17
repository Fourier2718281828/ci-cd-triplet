package org.example;

import java.util.Objects;

public class Point {
    private final int x, y;

    public static int someField;


    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int get_x() {
        return this.x;
    }

    public int get_y() {
        return this.y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}