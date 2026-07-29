package com.corejavaproject.collectionPractice.map.linkedHashMap;

import lombok.ToString;
@ToString

public class Account {
    String bankName;
    long accNo;
    double balance;

    Account(String bankName,long accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
        this.bankName = bankName;
    }
}


