package com.corejavaproject.basics.statement.conditionalstatement;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class Transaction {

    public void getTransaction(long from,long to, double amount){
        double balance = 5000;
        if(balance>=amount){
            log.info(" Available Balance is "+balance);
            log.info("Transaction Amount is "+amount);
            log.info("Transaction is achive from"+from+" to "+to);

        }
        else{
            log.info("Transaction failed ,check balance");
        }

    }
}
