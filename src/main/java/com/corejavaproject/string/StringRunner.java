package com.corejavaproject.string;

public class StringRunner {
    public static void main(String[] args) {
        String str="Shashank";
        String str1 = new String("Shashank");
        String str2 = "Shashank Kumbar";
        String str3 = "Shank kambar";
        String str4 = "Shank";
        String str5 = "Shank Kumar";
        StringComparision stringComparision=new StringComparision();
        stringComparision.stringCompare(str,str1);
        stringComparision.stringCompare1(str,str1);
        stringComparision.stringCompare2(str,str1);
        stringComparision.caseIgnore(str2,str3);
        stringComparision.caseIgnore(str3,str4);
        stringComparision.caseIgnore(str4,str5);
    }
}
