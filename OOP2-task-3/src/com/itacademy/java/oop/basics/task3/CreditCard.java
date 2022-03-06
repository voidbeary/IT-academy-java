package com.itacademy.java.oop.basics.task3;

public class CreditCard extends Card {
    double interest = 1;
    double credit = 1000;

    @Override
    public void debit(double amount) {
        if (amount > this.balance + this.credit) {
            throw new NotEnoughtCreditException("Credit card does not have enough funds");
        }
        this.balance -= amount;
    }
}
