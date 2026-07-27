package com.corejavaproject.assignment;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;

@Getter
@Setter
@ToString
public class ProductWithComparable implements Comparable<ProductWithComparable>{
    public static void main(String[] args) {
        ProductWithComparable pc = new ProductWithComparable();
        pc.setProductId(101);
        pc.setProductName("Fan");
        pc.setProductPrice(560.0);

        ProductWithComparable pc1 = new ProductWithComparable();
        pc1.setProductId(101);
        pc1.setProductName("Fan");
        pc1.setProductPrice(560.0);

        ProductWithComparable pc2 = new ProductWithComparable();
        pc2.setProductId(104);
        pc2.setProductName("Book");
        pc2.setProductPrice(160.0);

        ProductWithComparable pc3 = new ProductWithComparable();
        pc3.setProductId(102);
        pc3.setProductName("Mixer");
        pc3.setProductPrice(2560.0);

        ProductWithComparable pc4 = new ProductWithComparable();
        pc4.setProductId(103);
        pc4.setProductName("Bag");
        pc4.setProductPrice(560.0);

        List<ProductWithComparable> list = new LinkedList<>();
        list.add(pc);
        list.add(pc1);
        list.add(pc2);
        list.add(pc3);
        list.add(pc4);

        Collections.sort(list);
        list.forEach(System.out::println);
    }
    int productId;
    String productName;
    double productPrice;

    @Override
    public int compareTo(ProductWithComparable product) {
        return Integer.compare(this.productId, product.productId);
    }
}
