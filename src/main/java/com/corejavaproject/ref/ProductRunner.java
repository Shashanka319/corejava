package com.corejavaproject.ref;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class ProductRunner {
    public static void main(String[] args) {
        log.info("Product Category:"+Product.PRODUCT_CATEGORY);
        log.info("Product ID:"+Product.PRODUCT_ID);
        Product product=new Product();
        log.info("Colth Name:"+product.cothesName);
        log.info("Colth quantity:"+product.quantity);
        log.info("Colth price:"+product.price);
        log.info("Colthe Quality is:"+product.quality);

    }
}
