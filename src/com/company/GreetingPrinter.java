package com.company;

public class GreetingPrinter extends Thread {
    private final int number;

    public void run() {
        printGreeting();
    }
    public GreetingPrinter(int number) {
        this.number = number;
    }

    public void printGreeting() {
        System.out.println("Hello from thread " + getNumber());
    }


    public int getNumber() {
        return number;
    }
}
