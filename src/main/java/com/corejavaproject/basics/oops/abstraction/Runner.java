package com.corejavaproject.basics.oops.abstraction;

public class Runner {
    public static void main(String[] args) {
        SavingAcc savingAcc =new SavingAcc("656557",1000.0);
        savingAcc.deposit(500.0);
        savingAcc.withdraw(300.0);
        savingAcc.getSavingAcc();

    }
}
