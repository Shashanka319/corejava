package com.corejavaproject.assignment;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Product {
    int productId;
    String productName;
    boolean stockAvailable;
    double productPrice;
}
