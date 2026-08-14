package com.corejavaproject.generics;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class GenericMethod {
    public<T extends Number> void getMethod(T data) {
        log.info("Method Info: " + data);
    }
}
