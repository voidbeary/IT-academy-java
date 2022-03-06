package com.itacademy.java.oop.basics.task3;

public class MyBankAtm implements Atm {
    double balance = 100000;

    @Override
    public void withdraw(CreditCard card, double amount) {
        if (balance < amount) {
            throw new InsuficientAtmFundsException("ATM has no money");
        }
        card.debit(amount);
        double cash = (amount * (100 - card.interest)) / 100;
        this.balance = this.balance - cash;
    }

    @Override
    public void withdraw(DebitCard card, double amount) {
        if (balance < card.balance) {
            throw new InsuficientAtmFundsException("ATM has no money");
        }
        card.debit(amount);
        this.balance = this.balance - amount;
    }

}
