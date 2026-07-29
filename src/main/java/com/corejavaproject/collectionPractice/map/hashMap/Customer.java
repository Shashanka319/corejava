package com.corejavaproject.collectionPractice.map.hashMap;

import lombok.ToString;

import java.util.Objects;

@ToString
public class Customer {
    int id;
    String name;
    String address;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && Objects.equals(name, customer.name) && Objects.equals(address, customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }

    Customer(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

}
