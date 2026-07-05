package com.corejavaproject.string;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class StringComparision {
    public void stringCompare(String str1,String str2){
        if(str1 == str2){
            log.info("String Are Equal");
        }else{
            log.info("String Are Not Equal");
        }
    }
    public void stringCompare1(String str1,String str2){
        if(str1 .equals(str2)){
            log.info("String Are Equal");
        }else {
            log.info("String Are Not Equal");
        }
    }
    public void stringCompare2(String str1,String str2){
        if(str1.compareTo(str2) == 0){
            log.info("String Are Equal");
        }else  {
            log.info("String Are Not Equal");
        }
    }
    public void eualIgnore(String str1,String str2){
        if(str1.equalsIgnoreCase(str2)){
            log.info("String Are Equal");
        }
    }
}
