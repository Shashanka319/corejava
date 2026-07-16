package com.corejavaproject.basics.oops.pollymorphism;

public class PaymentInfo {
    public void getInfo(PaymentMethod payment) {
        payment.credit();
        payment.debit();
    }
}
