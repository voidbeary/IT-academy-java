package com.itacademy.java.oop.basics.task1;

public class ShapeApplication {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();

        double squareArea = square.calculateArea();
        double squarePerimeter = square.calculatePerimeter();

        double circleArea = circle.calculateArea();
        double circlePerimeter = circle.calculatePerimeter();

        System.out.println("Square area is " + squareArea);
        System.out.println("Circle area is " + circleArea);
        System.out.println("Square perimeter is " + squarePerimeter);
        System.out.println("Circle perimeter is " + circlePerimeter);
    }
}
