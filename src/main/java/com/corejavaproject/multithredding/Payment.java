package com.corejavaproject.multithredding;

import lombok.Getter;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

import java.util.concurrent.Callable;
@Log4j2
@Getter
@ToString

public class Payment implements Callable {
    private String paymentId;
    private String creditor;
    private  String debtor;
    private double paymentAmount;

    Payment(String paymentId, String creditor, String debtor, double paymentAmount) {
        this.paymentId = paymentId;
        this.creditor = creditor;
        this.debtor = debtor;
        this.paymentAmount = paymentAmount;
    }

    @Override
    public Payment call() throws Exception {
            log.info("Start the Payment Process");
            Thread.sleep(5000);
            log.info("Terminate the Payment Process");
            return this;
    }
}
