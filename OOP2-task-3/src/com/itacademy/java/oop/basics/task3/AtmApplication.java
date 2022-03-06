package com.itacademy.java.oop.basics.task3;

public class AtmApplication {
    public static void main(String[] args) {
        try {
            CreditCard creditCard = new CreditCard();
            DebitCard debitCard = new DebitCard();
            MyBankAtm atm = new MyBankAtm();
            atm.withdraw(creditCard, 100);
            creditCard.credit(100);
            debitCard.credit(100);
            atm.withdraw(debitCard, 100);

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
}
