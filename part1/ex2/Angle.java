package com.horstmann.part1.ex2;

public class Angle {
    //Ex2
    public int normalizationAngle(int angle) {

        if (angle > 359) {
            angle = angle % 359;
        } else if (angle < -359) {
            angle = angle % 359;
            angle = 359 + angle;
        } else if (angle > -359 && angle < 0) {
            angle = 359 + angle;
        }
        return angle;
    }

    public int normalizationAngleFloorMod(int angle) {

        if (angle > 359) {
            angle = Math.floorMod(angle, 359);
        } else if (angle < -359) {
            angle = Math.floorMod(angle, 359);
        } else if (angle > -359 && angle < 0) {
            angle = 359 + angle;
        }
        return angle;
    }
}
