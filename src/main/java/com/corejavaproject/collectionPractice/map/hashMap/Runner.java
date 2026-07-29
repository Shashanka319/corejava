package com.corejavaproject.collectionPractice.map.hashMap;

import lombok.extern.log4j.Log4j2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Log4j2

public class Runner {
    public static void main(String[] args) {
        Customer customer = new Customer(101,"Shashank","Hodigere");
        Customer customer2 = new Customer(102,"Sharath","Bangalore");
        Customer customer3 = new Customer(103,"Shashi","Niladri nagar");
        Customer customer4 = new Customer(103,"Shashi","Niladri nagar");


        Account account = new Account("Canara Bank",15601080,5675.09);
        Account account1 = new Account("SBI Bank",15601280,6575.09);
        Account account2 = new Account("Canara Bank",76601200,6575.09);

        Map<Customer,Account> map = new HashMap<Customer,Account>();
        map.put(customer,account);
        map.put(customer2,account1);
        map.put(customer3,account2);
        map.put(customer4,account);

        map.forEach((c,a)->{log.info("Key:{} and Value:{}",c,a);});

       Set<Map.Entry<Customer,Account>> entrySetset =map.entrySet();
       for(Map.Entry<Customer,Account> entry: entrySetset){
           log.info("Key:{} and Value:{}",entry.getKey(),entry.getValue());
       }

    }
}
