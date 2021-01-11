package com.horstmann.part4.ex6;

import java.util.Objects;

public class DiscountedItem {
    private String description;
    private double price;
    private double discount;

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || !(o instanceof DiscountedItem)) {
            return false;
        }
        DiscountedItem that = (DiscountedItem) o;

        return Double.compare(that.price, price) == 0 &&
                Double.compare(that.discount, discount) == 0 &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, price, discount);
    }
}
