package com.corejavaproject.basics.oops.interfaces;

public class Runner {
    public static void main(String[] args) {
        Caluclator1 caluclator1 = new Caluclator1();
        CaluClator2 clator2 = new CaluClator2();
        Caluclator3 caluclator3 = new Caluclator3();
        Math math = new Math();
        math.getMath(caluclator1);
        math.getMath(clator2);
        math.getMath(caluclator3);
    }
}
