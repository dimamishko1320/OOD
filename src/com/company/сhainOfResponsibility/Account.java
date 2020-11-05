package com.company.сhainOfResponsibility;

public abstract class Account {
    protected Account next;
    protected int balance;


    public abstract String getName();

    public void setNext(Account account) {
        next = account;
    }

    public void pay(int amountToPay) {
        if (this.canPay(amountToPay)) {
            System.out.println("Оплата " + amountToPay + " используя " + this.getName());
            this.balance-=amountToPay;
        } else if (this.next!=null) {
            System.out.println("Нельзя заплатить, используя " + this.getName() + ". Обработка ..");
            this.next.pay(amountToPay);
        } else {
            System.out.println("Ни на одном из аккаунтов нет необходимого количества денег");
        }
    }

    public boolean canPay(int amount) {
        return this.balance >= amount;
    }

    public int getBalance() {
        return balance;
    }


}
