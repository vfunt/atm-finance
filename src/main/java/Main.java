package main.java;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        Map<Integer, Integer> bills = new TreeMap<>();
        bills.put(1, 100);
        bills.put(2, 100);
        bills.put(5, 100);
        bills.put(10, 100);
        bills.put(20, 100);
        bills.put(50, 100);
        bills.put(100, 100);
        bills.put(200, 100);
        bills.put(500, 100);

        ATM atm = new ATM();
        atm.setBillSet(bills.keySet());
        System.out.print("Hello, please enter required sum: ");
        System.out.println(atm.getCash(ATMUtils.setReader().nextInt()));

//        24565 to 35789
        Map<Long,Integer> timestamps = new TreeMap<>();
        for (int i = 24565; i <= 35789; i++) {
            long startTime = System.nanoTime();
            atm.getCash(i);
            long endTime = System.nanoTime();
            timestamps.put(endTime - startTime,i);
        }

        for (Long e: timestamps.keySet()) {
            System.out.println("Elapsed time: " + TimeUnit.NANOSECONDS.toMicros(e) + " microseconds for " + timestamps.get(e));
        }
    }
}