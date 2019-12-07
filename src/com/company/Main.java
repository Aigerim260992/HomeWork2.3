package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);

        double x = 1;
        while (x==1) {
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException e) {
                e.printStackTrace();
                x = 0;
            }
            System.out.println("Можно снять сумму" + " " + bankAccount.getAmount());
        }
        System.out.println("Вы сняли остаток со счета" + " " + bankAccount.getAmount());
    }
}
