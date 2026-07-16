package com.corejavaproject.basics.oops.aggregation;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class Order {
    String shopName;
    String shopAddress;
    String UserName;
    long mobileNo;
    Payment payment;

    public Order(String shopName, String shopAddress, String userName, long mobileNo, Payment payment) {
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        UserName = userName;
        this.mobileNo = mobileNo;
        this.payment = payment;
    }
    public void getInfo(){
        log.info("Shop Name : " + shopName);
        log.info("Shop Address : " + shopAddress);
        log.info("User Name : " + UserName);
        log.info("Mobile No : " + mobileNo);
        payment.getPayment();
    }
}
