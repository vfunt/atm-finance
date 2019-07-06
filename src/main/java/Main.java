package main.java;

import java.util.*;

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


        Scanner scanner = new Scanner(System.in);
        System.out.print("Hello, please enter required sum: ");
        Integer s = scanner.nextInt();

        Set<Integer> set = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        set.addAll(bills.keySet());
        Iterator i = set.iterator();
        Map<Integer, Integer> cash = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (Integer e : set) {
            System.out.println(e);
            int v = (s / e);
            if (s == 0) {break;}
            if (v > 0) {cash.put(e, v);}
            s = s - e * v;

        }
        System.out.println(cash);
    }
}