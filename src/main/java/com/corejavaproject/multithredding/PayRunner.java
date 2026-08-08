package com.corejavaproject.multithredding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PayRunner {
    public static void main(String[] args) {
        Pay pay  = new Pay("P001","Shashak","Sharath",1000);
        Pay pay2 = new Pay("P002","ADEF","Sharath",1000);
        Pay pay3 = new Pay("P003","ASDF","QWER",1000);
        Pay pay4 = new Pay("P004","Sharath","Shashi",1000);
        Pay pay5 = new Pay("P005","kjlj","erht",7888.0);

        List<Pay> paylist = List.of(pay,pay2,pay3,pay4,pay5);

        ExecutorService executor = Executors.newFixedThreadPool(5);

        List<Future<Pay>> futures = null;
        try{
            futures=executor.invokeAll(paylist);
        }catch(InterruptedException e){
            throw  new RuntimeException(e);
        }
        futures.forEach(f->{
            try {
                Pay pays=f.get();
                System.out.println("Payment Id"+pays.getPayId()+"Creditor:"+pays.getCreditor()+"Debitor:"+pays.getDebtor()+"Amount:"+pays.getAmount());
            }catch (Exception e){
                e.printStackTrace();
            }
        });
    }
}
