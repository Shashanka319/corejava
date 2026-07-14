package com.corejavaproject.basics.oops.abstraction;

public abstract class Account {
    public static final String BANK_NAME="Canara Bank";
    protected String accNo;
    protected double balance;

    public Account(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }
    public abstract  void deposit(double amount);
    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
    public String getAccNo() {
        return accNo;
    }

}
