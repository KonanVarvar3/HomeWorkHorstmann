package com.horstmann.part4.ex1to5;

public class Circle extends Shape implements Cloneable {

    private double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return getPoint();
    }

    public Circle clone() throws CloneNotSupportedException {

        return (Circle) super.clone();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + "x = " + getPoint().getX() + "y = " + getPoint().getY() + '}';
    }
}
