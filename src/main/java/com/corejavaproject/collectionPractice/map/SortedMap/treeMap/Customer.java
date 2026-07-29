package com.corejavaproject.collectionPractice.map.SortedMap.treeMap;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class Customer {
    int id;
    String name;
    String address;
    Customer(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
