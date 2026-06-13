package com.corejavaproject.classWork;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Transaction implements Comparable<Transaction>{
    int id;
    String from;
    String to;
    double amount;

    @Override
    public int compareTo(Transaction transaction) {
        return this.getId() - transaction.getId();
    }
}