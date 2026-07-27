package com.corejavaproject.assignment;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
        



    }
    int productId;
    String productName;
    double productPrice;

    @Override
    public int compareTo(ProductWithComparable product) {
        return Integer.compare(this.productId, product.productId);
    }
}
