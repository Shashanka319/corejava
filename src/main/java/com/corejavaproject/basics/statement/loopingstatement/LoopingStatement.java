package com.corejavaproject.basics.statement.loopingstatement;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class LoopingStatement {
    public void useForLoop(int num){
        for(int i=0; i<=num;i++){
            log.info("Execute the Number using for Loop");
            log.info(i);
        }
    }
    public void useWhileLoop(int num){
        int i=0;
        while(i<=num){
            log.info("Execute the Number using while Loop");
            log.info(i);
            i++;
        }
    }
    public void useDoWhileLoop(int num){
        int i=0;
        do{
            log.info("Execute the Number using DoWhileLoop"+i);
            log.info(i);
            i++;
        }while(i<=num);
    }
}
