package com.itacademy.java.oop.basics.task2;

public class BicycleApplication {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike();

        try {
            mountainBike.applyBrakes();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            throw e;
        }

        System.out.println("Current mountain bike speed after brakes is " + mountainBike.speed);


        try {
            mountainBike.speedUp(20);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            throw e;
        }

        System.out.println("Current mountain bike speed after speed up is " + mountainBike.speed);

        try {
            mountainBike.changeGear(1);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            throw e;
        }
        System.out.println("Current mountain bike gear after change is " + mountainBike.gear);


    }
}
