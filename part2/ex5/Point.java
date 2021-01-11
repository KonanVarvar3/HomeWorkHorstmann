package com.horstmann.part2.ex5;

public final class Point {

    private float x;
    private float y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public Point translate(float x, float y) {
        Point p = this;
        p.x += x;
        p.y += y;
        return p;
    }

    public Point scale(float value) {
        Point p = this;
        p.x *= value;
        p.y *= value;
        return p;
    }
}
