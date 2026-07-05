package com.corejavaproject.basics.wrapperclass;

public class AutoBoxing {
    public int getInteger(Integer a, Integer b) {
        return a + b;
    }
    public static void main(String[] args) {
        AutoBoxing autoBoxing = new AutoBoxing();

        int result = autoBoxing.getInteger(2,3);
        System.out.println("Result :"+result);
    }
}
