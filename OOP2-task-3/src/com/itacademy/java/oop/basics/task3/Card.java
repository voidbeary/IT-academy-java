package com.itacademy.java.oop.basics.task3;

public abstract class Card {
    double balance = 100;
    String cardHolderName;
    String cardNumber;


    public void credit(double amount) {
        this.balance += amount;

    }

    public void debit(double amount) {
        if (amount > this.balance) {
            throw new NotEnoughBalanceException("Card does not have enough funds");
        }
        this.balance -= amount;
    }

}

