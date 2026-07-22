package com.corejavaproject.arrays;

public class Array {
    public  void getApproch1OfOne() {
        System.out.println("Execute the one dimential array using one Approch");
        int[] array = new int[3];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;

        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
        System.out.println();
    }
    

}
