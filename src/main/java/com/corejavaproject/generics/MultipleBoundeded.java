package com.corejavaproject.generics;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class MultipleBoundeded {

    public <T extends String ,V extends Number> void getData(T name,V age) {
        log.info("Name:"+name + " " +"Age:"+ age);

    }
}
