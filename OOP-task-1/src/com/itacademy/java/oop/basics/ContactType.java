package com.itacademy.java.oop.basics;

public enum ContactType {
    FULL_TIME("Full-time"),
    PART_TIME("Part-time");


    public final String contractType;

    ContactType(String contractType) {
        this.contractType = contractType;
    }
}

