package com.corejavaproject.basics.oops.interfaces;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class Caluclator1 implements  Calucalator{
    @Override
    public void sum() {
        int a=10;
        int b=20;
        int c=a+b;
        log.info("Total Sum is :{}",c);

    }

    @Override
    public void sub() {
        int a =19;
        int b=20;
        int c=a-b;
        log.info("The Answer of Substraction is:{}",c);

    }
}
