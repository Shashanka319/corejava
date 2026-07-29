package com.corejavaproject.collectionPractice.map.SortedMap.treeMap;

import lombok.ToString;

import java.util.Objects;

@ToString

public class Account {
    String bankName;
    long accNo;
    double balance;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accNo == account.accNo && Double.compare(balance, account.balance) == 0 && Objects.equals(bankName, account.bankName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankName, accNo, balance);
    }

    Account(String bankName, long accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
        this.bankName = bankName;
    }
}


