package com.corejavaproject.basics.wrapperclass;

public class UnBoxing {
    public int getUnBoxing(int a, int b) {
        return a+b;
    }
    public static void main(String[] args) {
        UnBoxing unBoxing = new UnBoxing();
        Integer a=1;
        Integer b=2;
        Integer result = unBoxing.getUnBoxing(a,b);
        System.out.println("Result:"+result);
    }

}
