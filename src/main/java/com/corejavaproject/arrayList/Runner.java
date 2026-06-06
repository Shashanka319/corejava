package com.corejavaproject.arrayList;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        ArrayListExp arrayListExp =new ArrayListExp();
        List<String> list = arrayListExp.getGames();
        arrayListExp.iterateWithLambda(list);
    }
}
