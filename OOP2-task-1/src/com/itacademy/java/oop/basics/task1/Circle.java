package com.itacademy.java.oop.basics.task1;

public class Circle extends Shape {
    private final double fieldRadius = 20;

    @Override
    double calculateArea() {
        double area = Math.PI * (fieldRadius * fieldRadius);
        return area;

    }

    @Override
    double calculatePerimeter() {
        double perimeter = 2 * Math.PI * fieldRadius;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "fieldRadius=" + fieldRadius +
                '}';
    }
}
