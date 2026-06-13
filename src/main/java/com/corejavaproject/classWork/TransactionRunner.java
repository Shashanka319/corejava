package com.corejavaproject.classWork;

import com.corejavaproject.classWork.Transaction;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Log4j2

public class TransactionRunner
{
    public static void main(String[] args)
    {
        List<Transaction> list = new ArrayList<>();
        Transaction transaction = new Transaction();
        transaction.setId(101);
        transaction.setFrom("Shashank");
        transaction.setTo("Sharath");
        transaction.setAmount(500);
        list.add(transaction);

        Transaction transaction1 = new Transaction();
        transaction1.setId(102);
        transaction1.setFrom("Shashank");
        transaction1.setTo("Sharath");
        transaction1.setAmount(700);
        list.add(transaction1);

        //log.info("Assending Order");
        //Collections.sort(list);

       // log.info("Desending Order");
        //Collections.sort(list,Collections.reverseOrder());

        log.info("Transaction List using comparator");
       Collections.sort(list,new TransactionSorting());
        //list.sort(Comparator.comparing(Transaction::getId));

        log.info("Transaction List using for Each");
        for (Transaction data : list)
        {
            log.info(data.toString());
        }

        log.info("Transaction List using lamda Expression");
        list.forEach(data ->log.info(data));

        log.info("Transaction List using Iterator");
        Iterator<Transaction> iterator = list.iterator();
        while (iterator.hasNext())
        {
            log.info(iterator.next().toString());
        }

        log.info("Transaction List using ListIterator in Forward");
        ListIterator<Transaction> listIterator = list.listIterator();
        while (listIterator.hasNext())
        {
            log.info(listIterator.next().toString());
        }
        log.info("Transaction List using ListIterator in Backword");
        while(listIterator.hasPrevious())
        {
            log.info(listIterator.previous().toString());
        }

    }
}