package com.corejavaproject.string;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class StringBuilder {

    public void display(String word1, String word2, String word3) {


        StringBuilder builder = new StringBuilder();
        builder.append(word1);
        builder.append(" " + word2);
        builder.append(" " + word3);
        builder.toString();
        log.info(builder);
    }

    private void append(String str) {
        System.out.println(str);
    }


}