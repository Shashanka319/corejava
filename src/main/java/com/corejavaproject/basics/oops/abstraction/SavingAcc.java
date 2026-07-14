package com.corejavaproject.basics.oops.abstraction;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class SavingAcc extends Account{
    public SavingAcc(String accNo,double balance){
        super(accNo,balance);
    }
    @Override
    public void deposit(double amount) {
        log.info("Depositing Amount:{}",amount);
        balance += amount;
        log.info("Totatl Balance:{}",amount);
    }
    @Override
    public void withdraw(double amount) {
        log.info("Withdrawing Amount:{}",amount);
        if(balance >= amount){
            balance -= amount;
            log.info("Totatl Balance:{}",amount);
        }else{
            log.info("Not enough balance");
        }
    }
    public void getSavingAcc(Account account){
        log.info("Execute the Saving Acc Information");
        account.getAccNo();
    }

}
