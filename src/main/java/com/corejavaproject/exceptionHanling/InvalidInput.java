package com.corejavaproject.exceptionHanling;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class InvalidInput extends Exception{
    public InvalidInput(){
        super();
        log.info("Execute the invalid Input....from Super Class");
    }

    public InvalidInput(String message){
        super(message);
    }
}
