package com.horstmann.part4.ex7;

public enum Colors {
    BLACK("black"),
    RED("red"),
    BLUE("blue"),
    GREEN("green"),
    CYAN("cyan"),
    MAGENTA("magenta"),
    YELLOW("yellow"),
    WHITE("white");

    private String color;

    Colors(String color) {

        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public Colors getRed() {
        return RED;
    }

    public Colors getGreen() {
        return GREEN;
    }

    public Colors getBlue() {
        return BLUE;
    }
}
