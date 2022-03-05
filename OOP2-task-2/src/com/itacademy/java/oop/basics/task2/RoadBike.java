package com.itacademy.java.oop.basics.task2;

public class RoadBike implements Bicycle {
    int gear = 5;
    int speed = 50;
    int brakeValue = 5;

    @Override
    public void changeGear(int newGear) {
        if (!(newGear == 1 || newGear == -1 || newGear == 2 || newGear == -2)) {
            throw new RuntimeException("Gear can only be increased or decreased by only 1,2,-1or -2");
        } else if (gear + newGear > 10 || gear + newGear < 0) {
            throw new RuntimeException("Gear is either over the max 10 or below 0");
        }
        this.gear = this.gear + newGear;
    }

    @Override
    public void speedUp(int increment) {
        if (increment < 0) {
            throw new RuntimeException("Increment value can't be negative number. Please use positive numbers");
        } else if (increment + speed > 50) {
            int highestIncrement = 50 - speed;
            throw new RuntimeException("Speed is too high. Highest possible increment is " + highestIncrement);
        }
        this.speed = this.speed + increment;
    }

    @Override
    public void applyBrakes() {
        if (speed - brakeValue < 0) {
            throw new RuntimeException("Road bike can't have negative speed");
        } else if (brakeValue < 0) {
            throw new RuntimeException("Brakes can only be applied using positive values. Please use positive values");
        }
        this.speed = this.speed - brakeValue;
    }
}
