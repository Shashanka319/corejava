package com.corejavaproject.multithredding;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import java.util.concurrent.Callable;
@Log4j2
@Getter

public class Pay implements Callable<Pay> {
    private String payId;
    private String creditor;
    private String debtor;
    private double amount;

    public  Pay(String payId, String creditor, String debtor, double amount) {
        this.payId = payId;
        this.creditor = creditor;
        this.debtor = debtor;
        this.amount = amount;
    }
    @Override
    public Pay call() throws Exception {
        log.info("Processing paymmet:"+payId);
        Thread.sleep(5000);
        log.info("Payment Processed:"+payId);
        return this;
    }
}
