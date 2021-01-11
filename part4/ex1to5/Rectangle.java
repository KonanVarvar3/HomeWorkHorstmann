package com.horstmann.part4.ex1to5;

public class Rectangle extends Shape implements Cloneable {

    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {

        Point pointCenter = getPoint();

        pointCenter.setX(pointCenter.getX() + width);
        pointCenter.setY(pointCenter.getY() + height);

        return pointCenter;
    }

    public Rectangle clone() throws CloneNotSupportedException {

        return (Rectangle) super.clone();
    }
}
