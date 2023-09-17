package org.example;

public class Triangle {
    private final Point a, b, c;

    public Triangle (Point a, Point b, Point c) throws Exception {
        this.a = a;
        this.b = b;
        this.c = c;
        if (not_validate())
            throw new Exception("fuck you one more time");
    }

    private boolean not_validate() {
        return  this.a.equals(this.b) ||
                this.a.equals(this.c) ||
                this.c.equals((this.b));
    }

}
