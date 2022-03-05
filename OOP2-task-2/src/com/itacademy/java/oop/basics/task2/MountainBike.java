package com.itacademy.java.oop.basics.task2;

public class MountainBike implements Bicycle {
    int gear;
    int speed = 80;
    int brakeValue = 11;

    @Override
    public void changeGear(int newGear) {

    }

    @Override
    public void speedUp(int increment) {

    }

    @Override
    public int applyBrakes() {
        if (brakeValue < 0) {
            throw new RuntimeException("Value can't be negative number. Please use positive numbers");
        } else if (brakeValue > 10) {
            throw new RuntimeException("Value is too high. Highest possible value to use to brake a mountain bike is 10");
        }
        int cuttentSpeed = speed - brakeValue;
        return cuttentSpeed;
    }

    @Override
    public String toString() {
        return "MountainBike{" +
                "gear=" + gear +
                ", speed=" + speed +
                ", brakeValue=" + brakeValue +
                '}';
    }
}
