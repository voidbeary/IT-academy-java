package com.itacademy.java.oop.basics.task2;

public class BicycleApplication {
    public static void main(String[] args) {
        Bicycle mountainBike = new MountainBike();
        Bicycle roadBike = new RoadBike();

        try {
            mountainBike.applyBrakes();
            mountainBike.speedUp(20);
            mountainBike.changeGear(1);
            roadBike.applyBrakes();
            roadBike.speedUp(5);
            roadBike.changeGear(1);
            
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            throw e;
        }

        Bike winner = Speedometer.chooseWinner(mountainBike, roadBike);
        System.out.println("The winner is " + winner);
    }
}
