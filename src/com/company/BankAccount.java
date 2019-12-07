package com.company;

public class BankAccount {
    double amount;// отстаток на счете


    public double getAmount() {

        return amount;
    }

    public void deposit(double sum) {
        amount = amount + sum;
        System.out.println("На вашем счету" +" " + getAmount());//положить деньги на счет
    }

    public void withDraw(double sum) throws LimitException {// снимает деньги
        if (sum > getAmount()) {
            throw new LimitException("Запрашиваемая сумма на снятие больше чем остаток на счете ", amount);
        }
        amount = amount - sum;
        System.out.println("Вы сняли" + " " + " " + sum);

    }

}
