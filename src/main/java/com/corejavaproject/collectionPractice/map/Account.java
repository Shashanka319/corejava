package com.corejavaproject.collectionPractice.map;

import lombok.ToString;

@ToString
public class Account {
    long accNo;
    double balance;

    Account(long accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }
}
