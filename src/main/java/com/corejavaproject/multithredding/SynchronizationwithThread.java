package com.corejavaproject.multithredding;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class SynchronizationwithThread extends Thread {
   Print print=new Print();
    @Override
    public  void run(){
      if(print.equals("Thread-0"));
        print.prints();
    }

}

