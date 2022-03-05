package com.itacademy.java.oop.basics.task2;

public class BicycleApplication {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike();
        int mountainBikeSpeed;
        try {
            mountainBikeSpeed = mountainBike.applyBrakes();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            throw e;
        }

        System.out.println("Mountain bike speed " + mountainBikeSpeed);
    }
}
