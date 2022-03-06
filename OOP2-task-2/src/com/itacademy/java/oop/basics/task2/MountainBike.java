package com.itacademy.java.oop.basics.task2;

public class MountainBike implements Bicycle {
    int gear = 10;
    int speed = 50;
    int brakeValue = 8;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void changeGear(int newGear) {
        if (!(newGear == 1 || newGear == -1)) {
            throw new RuntimeException("Mountain bikes gear can only be increased or decreased by only 1 or -1");
        } else if (gear + newGear > 20 || gear + newGear < 0) {
            throw new RuntimeException("Mountain bikes gear is either over the max 20 or below 0");
        }
        this.gear = this.gear + newGear;
        System.out.println("Current mountain bike gear after change is " + gear);
    }

    @Override
    public void speedUp(int increment) {
        if (increment < 0) {
            throw new RuntimeException("Mountain bikes increment value can't be negative number. Please use positive numbers");
        } else if (increment + speed > 100) {
            int highestIncrement = 100 - speed;
            throw new RuntimeException("Mountain bikes speed is too high. Highest possible increment is " + highestIncrement);
        }
        this.speed = this.speed + increment;
        System.out.println("Current mountain bike speed after speed up is " + speed);
    }

    @Override
    public void applyBrakes() {
        if (brakeValue < 0) {
            throw new RuntimeException("Mountain bikes brakes value can't be negative number. Please use positive numbers");
        } else if (brakeValue > 10) {
            throw new RuntimeException("Mountain bikes brakes value is too high. Highest possible value is 10");
        }
        this.speed = this.speed - brakeValue;
        System.out.println("Current mountain bike speed after brakes is " + speed);
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
