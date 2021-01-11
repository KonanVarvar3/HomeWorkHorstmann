package com.horstmann.part4.ex1to5;

public class Line extends Shape implements Cloneable {

    private Point to;

    public Line(Point from, Point to) {
        super(from);
        this.to = to;
    }

    @Override
    public Point getCenter() {

        double x = (to.getX() + getPoint().getX()) / 2;
        double y = (to.getY() + getPoint().getY()) / 2;

        return new Point(x, y);
    }

    public void setTo(Point to) {
        this.to = to;
    }

    public void setFrom(Point from) {
        setPoint(from);
    }

    @Override
    public String toString() {
        return "Line{" + "from X = " + getPoint().getX() + "from Y = " + getPoint().getY() +
                "to X = " + to.getX() + "to Y = " + to.getY() + '}';
    }

    public Line clone() throws CloneNotSupportedException {

        return (Line) super.clone();
    }
}
