package com.corejavaproject.basics.oops.composition;

import com.corejavaproject.basics.oops.aggregation.Payment;

import lombok.extern.log4j.Log4j2;
@Log4j2
public class Order {
    String shopName;
    String shopAddress;
    String UserName;
    long mobileNo;

    public Order(String shopName, String shopAddress, String userName, long mobileNo) {
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        UserName = userName;
        this.mobileNo = mobileNo;
    }

    public void getInfo() {
        log.info("Shop Name : " + shopName);
        log.info("Shop Address : " + shopAddress);
        log.info("User Name : " + UserName);
        log.info("Mobile No : " + mobileNo);
        Payment payment = new Payment(true,"Formal Shirt",1000.0);
        payment.getPayment();
    }
}
