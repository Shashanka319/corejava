package com.corejavaproject.basics.oops.interfaces;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class PerformCalsi implements Calsi{
    @Override
    public void mul() {
        log.info("Execute the Multiplication using Calsi");
    }

    @Override
    public void sum() {
        log.info("Execute the SUm Using Problem");
    }

    @Override
    public void sub() {
        log.info("Execute the Subtraction using Problem1");

    }
}
