package com.itacademy.java.oop.basics.task2;

public class Speedometer {

    public static Bike chooseWinner(Bicycle mountainBike, Bicycle roadBike) {
        return chooseWinner(mountainBike.getSpeed(), roadBike.getSpeed());
    }

    public static Bike chooseWinner(int mountainBikeSpeed, int roadBikeSpeed) {
        if (mountainBikeSpeed == roadBikeSpeed) {
            return null;
        } else if (mountainBikeSpeed > roadBikeSpeed) {
            return Bike.MOUNTAIN;
        }
        return Bike.ROAD;
    }
}
