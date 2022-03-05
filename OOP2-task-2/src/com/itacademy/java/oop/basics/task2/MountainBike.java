package com.itacademy.java.oop.basics.task2;

public class MountainBike implements Bicycle {
    int gear = 10;
    int speed = 50;
    int brakeValue = 8;


    @Override
    public void changeGear(int newGear) {
        if (!(newGear == 1 || newGear == -1)) {
            throw new RuntimeException("Gear can only be increased or decreased by only 1 or -1");
        } else if (gear + newGear > 20 || gear + newGear < 0) {
            throw new RuntimeException("Gear is either over the max 20 or below 0");
        }
        this.gear = this.gear + newGear;
    }

    @Override
    public void speedUp(int increment) {
        if (increment < 0) {
            throw new RuntimeException("Increment value can't be negative number. Please use positive numbers");
        } else if (increment + speed > 100) {
            int highestIncrement = 100 - speed;
            throw new RuntimeException("Speed is too high. Highest possible increment is " + highestIncrement);
        }
        this.speed = this.speed + increment;

    }

    @Override
    public void applyBrakes() {
        if (brakeValue < 0) {
            throw new RuntimeException("Brakes value can't be negative number. Please use positive numbers");
        } else if (brakeValue > 10) {
            throw new RuntimeException("Value is too high. Highest possible value to use to brake a mountain bike is 10");
        }
        this.speed = this.speed - brakeValue;
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
