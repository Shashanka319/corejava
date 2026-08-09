package com.corejavaproject.multithredding;

import java.util.concurrent.Semaphore;

public class PresentationRunner {
    public static void main(String[] args) {
        Presentation presentation = new Presentation();
        for(int i=1;i<=10;i++){
            final String student="student"+i;
            new Thread(()->presentation.vision(student)).start();
        }
    }
}
