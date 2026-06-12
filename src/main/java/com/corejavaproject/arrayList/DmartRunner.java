package com.corejavaproject.arrayList;

import java.util.List;

public class DmartRunner {
    public static void main(String[] args) {
        ProductList productList = new ProductList();
        List<Dmart> list = productList.getProductList();
        productList.setProductList(list);

    }
}
