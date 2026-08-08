package com.corejavaproject.multithredding;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PaymentRunner {
    public static void main(String[] args) {
        Payment payment = new Payment("P10", "Shashank", "Sharath", 1000);
        Payment payment2 = new Payment("P11", "Sharath", "Sharath", 1000);
        Payment payment3 = new Payment("P12", "Kumar", "Sharath", 1000);
        Payment payment4 = new Payment("P13", "asdf", "Sharath", 1000);

        List<Payment> payments = List.of(payment, payment2, payment3, payment4);

        ExecutorService exc = Executors.newFixedThreadPool(5);

        List<Future<Payment>> futures = new ArrayList<>();
        payments.forEach(f -> {
            try {
                Future<Payment> pay = exc.submit(f);
                futures.add(pay);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        // Loop over 'futures' instead of 'payments'
        futures.forEach(future -> {
            try {
                Payment pay = future.get(); // Called on Future<Payment>
                System.out.println(pay);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });

        // Always shutdown the thread pool so the application exits cleanly
        exc.shutdown();
    }
}