package com.corejavaproject.enum1;
import lombok.extern.log4j.Log4j2;
@Log4j2
public class CustomerRunner {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Shashank");
        customer.setEmail("shashank@gmail.com");
        customer.setAccountType(AccountType.SAVING_ACCOUNT);
        log.info("Customer Detailes: " + customer);

        Customer customer1 = new Customer();
        customer1.setName("Sharath");
        customer1.setEmail("sharath@gmail.com");
        customer1.setAccountType(AccountType.LOAN_ACCOUNT);
        log.info("Customer Detailes: " + customer1);



    }
}
