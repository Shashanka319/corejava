package com.corejavaproject.ref;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class AccountRunner {
    public static void main(String[] args) {
        log.info("Bank Name:"+AccountStatic.BANK_NAME);
        log.info("Bank IFSC Code:"+AccountStatic.IFSC_CODE);
    }
}
