package com.corejavaproject.ref;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class BankRunner {
    public static void main(String[] args) {
        log.info("Bank Name:"+ Bank.BANK_NAME);
        log.info("Bank IFSC Code:"+ Bank.IFSC_CODE);
        Bank bank=new Bank();
        log.info("Name:"+bank.name);
        log.info("Account Number:"+bank.accountNo);
    }
}
