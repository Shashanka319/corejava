package com.corejavaproject.multithredding;

public class SynchMain {
    public static void main(String[] args) {
            Print print = new Print();
            SynchronizationwithThread synchronization = new SynchronizationwithThread();
           synchronization.start();

           SynchronizationwithThread synchronization2 = new SynchronizationwithThread();
           synchronization2.start();

           SynchronizationwithThread synchronization3 = new SynchronizationwithThread();
           synchronization3.start();
    }
}
