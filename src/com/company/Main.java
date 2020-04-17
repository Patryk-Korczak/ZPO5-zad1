package com.company;

public class Main {

    public static void main(String[] args) {

        final int numberOfThreads = 10;

        for(int i = numberOfThreads; i > 0; i--) {
            GreetingPrinter temp = new GreetingPrinter(i - 1);
            temp.start();
            
            try {
                temp.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
