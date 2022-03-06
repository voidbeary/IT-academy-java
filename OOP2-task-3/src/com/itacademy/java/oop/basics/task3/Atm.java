package com.itacademy.java.oop.basics.task3;

public interface Atm {
    public void withdraw(CreditCard card, double amount);

    public void withdraw(DebitCard card, double amount);
}
