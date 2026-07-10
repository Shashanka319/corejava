package com.corejavaproject.string;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class StringBuilder {

    public void display(String word1, String word2, String word3) {
        java.lang.StringBuilder builder = new java.lang.StringBuilder();

        builder.append(word1);
        builder.append(" ").append(word2);
        builder.append(" ").append(word3);

        String result = builder.toString();
        log.info(result);
    }
}