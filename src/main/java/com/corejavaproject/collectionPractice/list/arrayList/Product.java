package com.javapractice.collectionPractice.list.arrayList;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Product {
    com.corejavaproject.collectionPractice.list.arrayList.Mall mall;
    int productId;
    String productName;
    boolean stockAvailable;
    double productPrice;
    com.corejavaproject.collectionPractice.list.arrayList.UserInfo userInfo;
}
