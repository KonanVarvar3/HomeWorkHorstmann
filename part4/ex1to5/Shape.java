package com.horstmann.part4.ex1to5;

public abstract class Shape implements Cloneable {

    private Point point;

    public Shape(Point point) {
        this.point = point;
    }

    public void moveBy(double dx, double dy) {

        point.setX(point.getX() + dx);
        point.setY(point.getY() + dy);
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public abstract Point getCenter();

    public Shape clone() throws CloneNotSupportedException {

        Shape shape = (Shape) super.clone();
        shape.point = (Point) point.clone();

        return shape;
    }
}
