package com.corejavaproject.exceptionHanling;

public class InvalidInput extends Exception{
    public InvalidInput(){
        super();
    }

    public InvalidInput(String message){
        super(message);
    }
}
