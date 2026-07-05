package com.corejavaproject.string;

public class StringRunner {
    public static void main(String[] args) {
        String str="Shashank";
        String str1 = new String("Shashank K");
        StringComparision stringComparision=new StringComparision();
        stringComparision.stringCompare(str,str1);
        stringComparision.stringCompare1(str,str1);
        stringComparision.stringCompare2(str,str1);
        stringComparision.eualIgnore(str,str1);
    }
}
