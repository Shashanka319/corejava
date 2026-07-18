package com.corejavaproject.multithredding;

public class Runner {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        ticket.start();

        Ticket ticket2 = new Ticket();
        ticket2.start();
    }
}