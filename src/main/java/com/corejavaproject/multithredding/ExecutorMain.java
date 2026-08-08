package com.corejavaproject.multithredding;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorMain {
    public static void main(String[] args) {
        Payment payment = new Payment("P10", "Shashank", "Sharath", 1000);
        Payment payment2 = new Payment("P11", "Sharath", "Sharath", 1000);
        Payment payment3 = new Payment("P12", "Kumar", "Sharath", 1000);
        Payment payment4 = new Payment("P13", "asdf", "Sharath", 1000);

        List<Payment> payments = List.of(payment, payment2, payment3, payment4);

        ExecutorService exc = Executors.newFixedThreadPool(5);
        List<Future<Payment>> futures = new ArrayList<>();

        for (Payment p : payments) {
            try {
                Future<Payment> pay = exc.submit(p); // Requires Payment to implement Callable<Payment> or Runnable
                futures.add(pay);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Iterate through the Future objects to retrieve execution results
        for (Future<Payment> future : futures) {
            try {
                Payment result = future.get(); // Blocks until the thread finishes and returns result
                System.out.println("Payment Id:"+result.getPaymentId()+"Creditor Name:"+result.getCreditor()+"Debitor Name:"+result.getDebtor()+"Payment Amount:"+result.getPaymentAmount());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        // Always shut down the ExecutorService to allow the JVM to exit
        exc.shutdown();
    }
}