package com.company;

public class BankAccount {
    double amount;// отстаток на счете


    public double getAmount() {

        return amount;
    }

    public double deposit(double sum) {
        amount = getAmount() + sum;
        System.out.println("На вашем счету" +" " + getAmount());
        return getAmount();//положить деньги на счет
    }

    public double withDraw(double sum) throws LimitException {
        amount = getAmount() - sum;
        System.out.println("Остаток денежных средств после снятия" + " " + " " + getAmount());
        if (sum > amount) {
            throw new LimitException("Запрашиваемая сумма на снятие больше чем остаток на счете ", getAmount());
        }
        return amount;
    }
}
