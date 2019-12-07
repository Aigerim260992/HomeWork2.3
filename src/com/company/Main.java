package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);

        while (true) {
            try {
                bankAccount.withDraw(6000);
                System.out.println("На вашем счете осталось" + " " + bankAccount.getAmount());
            } catch (LimitException e) {
                e.printStackTrace();
            }
            System.out.println("Можно снять сумму" + " " + bankAccount.getAmount());
            bankAccount.amount = bankAccount.amount - bankAccount.getAmount();
            System.out.println("Вы сняли все деньги с вашего счета" + " " + bankAccount.getAmount());
            break;

        }


    }
}
