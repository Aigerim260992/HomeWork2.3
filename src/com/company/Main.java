package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);

        int x = 1;

        while (x==1) {
            try {
                bankAccount.withDraw(6000);
                System.out.println("На вашем счету осталось" + " " + bankAccount.getAmount());
            } catch (LimitException e) {
                e.printStackTrace();
            }
            System.out.println("Можно снять сумму" + " " + bankAccount.getAmount());
            System.out.println("Вы сняли остаток со счета" + " " + bankAccount.getAmount());
          x=1;

        }


    }
}
