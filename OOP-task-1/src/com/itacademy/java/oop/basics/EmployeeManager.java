package com.itacademy.java.oop.basics;

import java.time.LocalDate;

public class EmployeeManager {
    public static void main(String[] args) {
        Employee employee = new Employee("Bob", "Smith", ContactType.FULL_TIME, LocalDate.now(), 1, "developer");
        System.out.println(employee);
        System.out.println();
    }
}
