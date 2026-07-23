package com.corejavaproject.collectionPractice.list.arrayList;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;
@Log4j2

public class UserRunner {
    public static void main(String[] args) {
        List<UserInfo> list = new ArrayList<>();
        log.info("Users Informations in Mall");
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("Shashank K");
        userInfo.setEmail("sharathshashank1986@gmail.com");
        userInfo.setPhoneNumber(9743873982L);
        userInfo.setAddress("Niladri Nagar");

        list.add(userInfo);
        list.forEach(data -> log.info(data));
    }
}
