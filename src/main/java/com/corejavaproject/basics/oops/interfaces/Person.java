package com.corejavaproject.basics.oops.interfaces;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class Person extends Company implements Vechile,Account{

    @Override
    public void getSavingacc() {
        log.info("Execute the Saving Account");
    }

    @Override
    public void getCurrentAcc() {
        log.info("Execute the Current Account");

    }

    @Override
    public void engine() {
        log.info("Execute the Vechile Engine");

    }

    @Override
    public void getType() {
        log.info("Execute the Vechile Type");
    }
}
