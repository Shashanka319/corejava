package com.corejavaproject.basics.statement.conditionalstatement;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class Restorent {
    public void getInfo(boolean restorentOpen, double price){
       if (price<100) {
            log.info("Order full meals");
        } else if (price<50) {
            log.info("Order coffee");

        }else{
            log.info("can not order anything");
        }
    }
}
