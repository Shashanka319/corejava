package com.corejavaproject.collectionPractice.list.arrayList;

import com.corejavaproject.jdbc.User;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Product {
    Mall mall;
    int productId;
    String productName;
    boolean stockAvailable;
    double productPrice;

}
