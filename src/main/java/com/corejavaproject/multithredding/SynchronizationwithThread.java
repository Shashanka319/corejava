package com.corejavaproject.multithredding;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class SynchronizationwithThread extends Thread {
   Print print=new Print();
   String name = getName();
    @Override
    public  void run(){
      if(name.equals("Thread-0"));
        print.prints();
    }

}

