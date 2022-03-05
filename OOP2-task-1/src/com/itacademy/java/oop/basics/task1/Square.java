package com.itacademy.java.oop.basics.task1;

public class Square extends Shape {
    private final double fieldSide = 10;

    @Override
    double calculateArea() {
        double area = fieldSide * fieldSide;
        return area;
    }

    @Override
    double calculatePerimeter() {
        double perimeter = fieldSide * 4;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Square{" +
                "fieldSide=" + fieldSide +
                '}';
    }
}
