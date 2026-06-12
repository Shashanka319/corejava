package com.corejavaproject.arrayList;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class Dmart {
    int id;
    String product;
    String address;
    boolean available;

    public Dmart(int id, String product, String address, boolean available) {
        this.id = id;
        this.product = product;
        this.address = address;
        this.available = available;
    }

    public String toString(){
        log.info("Product Information In Dmart...");
        return "[Dmart Product Id="+this.id +"\n Dmart Product="+this.product +"\nDmart Address="+this.address +"\nDmart Available="+this.available+"]";
    }

}
