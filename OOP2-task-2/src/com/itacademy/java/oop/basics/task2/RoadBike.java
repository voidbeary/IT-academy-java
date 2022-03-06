package com.itacademy.java.oop.basics.task2;

public class RoadBike implements Bicycle {
    private int gear = 5;
    int speed = 50;
    int brakeValue = 5;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void changeGear(int newGear) {
        if (!(newGear == 1 || newGear == -1 || newGear == 2 || newGear == -2)) {
            throw new RuntimeException("Road bikes gear can only be increased or decreased by only 1,2,-1or -2");
        } else if (gear + newGear > 10 || gear + newGear < 0) {
            throw new RuntimeException("road bikes gear is either over the max 10 or below 0");
        }
        this.gear = this.gear + newGear;
        System.out.println("Current road bike gear after change is " + gear);

    }

    @Override
    public void speedUp(int increment) {
        if (increment < 0) {
            throw new RuntimeException("Road bikes increment value can't be negative number. Please use positive numbers");
        } else if (increment + speed > 50) {
            int highestIncrement = 50 - speed;
            throw new RuntimeException("Road bikes speed is too high. Highest possible increment is " + highestIncrement);
        }
        this.speed = this.speed + increment;
        System.out.println("Current road bike speed after speed up is " + speed);


    }

    @Override
    public void applyBrakes() {
        if (speed - brakeValue < 0) {
            throw new RuntimeException("Road bike can't have negative speed");
        } else if (brakeValue < 0) {
            throw new RuntimeException("Road bikes brakes can only be applied using positive values. Please use positive values");
        }
        this.speed = this.speed - brakeValue;
        System.out.println("Current road bike speed after brakes is " + speed);
    }
}
