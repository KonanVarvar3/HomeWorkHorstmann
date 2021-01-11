package com.horstmann.part4.ex1to5;

import java.util.Objects;

public class LabeledPoint extends Point {

    private String label;

    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void print() {
        System.out.println(x);
        System.out.println(y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        LabeledPoint that = (LabeledPoint) o;

        return Objects.equals(label, that.label);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();

        result = prime * result + ((label == null) ? 0 : label.hashCode());

        return result;
    }
}


























