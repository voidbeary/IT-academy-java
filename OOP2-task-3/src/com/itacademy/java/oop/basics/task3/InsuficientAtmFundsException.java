package com.itacademy.java.oop.basics.task3;

public class InsuficientAtmFundsException extends RuntimeException {

    public InsuficientAtmFundsException() {
    }

    public InsuficientAtmFundsException(String message) {
        super(message);
    }

}
