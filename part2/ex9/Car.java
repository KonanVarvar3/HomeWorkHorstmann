package com.horstmann.part2.ex9;


//the class is immutable so that classes can not extend this class,
//thereby can not changing fields and methods of base class
public final class Car {
    private double distance;
    private double gas;
    private double efficiency;

    public Car(double efficiency, double gas) {
        this.gas = gas;
        this.efficiency = efficiency;
        System.out.println("fuel efficiency = " +
                efficiency + " (miles/gallons)");
    }

    public Car() {
        efficiency = 20;
        System.out.println("fuel efficiency =" +
                efficiency + " (miles/gallons)");
    }

    public double drive(double miles, double numOfGallons) {
        gas += numOfGallons;
        double length = efficiency * gas;

        if (length <= miles) {
            gas -= length / efficiency;
        } else {
            length = miles;
            gas -= miles / efficiency;
        }
        distance += length;

        return distance;
    }

    public double getDistance() {
        return distance;
    }

    public double getGas() {
        return gas;
    }
}
