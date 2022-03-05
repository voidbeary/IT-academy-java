package com.itacademy.java.oop.basics.task2;

public class BicycleApplication {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike();
        RoadBike roadBike = new RoadBike();

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

        try {
            roadBike.applyBrakes();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            throw e;
        }
        System.out.println("Current road bike speed after brakes is " + roadBike.speed);
        try {
            roadBike.speedUp(5);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            throw e;
        }
        System.out.println("Current road bike speed after speed up is " + roadBike.speed);

        try {
            roadBike.changeGear(1);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            throw e;
        }
        System.out.println("Current road bike gear after change is " + roadBike.gear);

        Bike winner = Speedometer.chooseWinner(mountainBike, roadBike);
        System.out.println("The winner is " + winner);
    }
}
