package com.corejavaproject.interfaces;

public class DMart implements  Comparable<DMart>{
    private String productName;
    private int count;
    private double price;

    public DMart(String productName, int count, double price){
        this.productName=productName;
        this.count=count;
    }


    @Override
    public int compareTo(DMart o) {
        return 0;
    }
}
// Sort :
//1 compare
//2 Comparator
