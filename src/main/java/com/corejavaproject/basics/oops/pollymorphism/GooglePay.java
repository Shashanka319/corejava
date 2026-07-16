package com.corejavaproject.basics.oops.pollymorphism;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class GooglePay implements PaymentMethod {
    @Override
    public void credit() {
        log.info("Credit the Amount through Google Pay");
    }
    @Override
    public void debit() {
        log.info("Debit the Amount through Google Pay");
    }
}
