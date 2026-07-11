package com.corejavaproject.basics.statement.conditionalstatement;

public class TransactionRunner {
    public static void main(String[] args) {
        Transaction transaction = new Transaction();
        transaction.getTransaction(1560108012106L,1560108012206L,4000);
    }
}
