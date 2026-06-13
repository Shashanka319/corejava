package com.corejavaproject.classWork;

import java.util.Comparator;

public class TransactionSorting implements Comparator<Transaction> {
    public int compare(Transaction transaction, Transaction transaction1) {
        return transaction.getId() - transaction1.getId();
    }

}
