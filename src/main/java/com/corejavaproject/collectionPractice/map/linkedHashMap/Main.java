package com.corejavaproject.collectionPractice.map.linkedHashMap;

import lombok.extern.log4j.Log4j2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

@Log4j2

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(101,"Shashank","Hodigere");
        Customer customer2 = new Customer(102,"Sharath","Bangalore");
        Customer customer3 = new Customer(103,"Shashi","Niladri nagar");

        Account account = new Account("Canara Bank",15601080,5675.09);
        Account account1 = new Account("SBI Bank",15601280,6575.09);
        Account account2 = new Account("Canara Bank",76601200,6575.09);

        Map<Customer,Account> map = new LinkedHashMap<>();
        map.put(customer,account);
        map.put(customer2,account1);
        map.put(customer3,account2);
        map.forEach((c,a)->{log.info("Key:{} and Value:{}",c,a);});

          Set<Map.Entry<Customer,Account>> set = map.entrySet();
          for(Map.Entry<Customer,Account> entry: set){
              log.info("Key:{} and Value:{}",entry.getKey(),entry.getValue());
          }

    }
}
