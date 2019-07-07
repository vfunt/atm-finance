package main.java;

import java.util.*;

public class ATM {

    private Map<Integer, Integer> cash;
    private Set<Integer> billSet;

    public ATM() {
        this.billSet = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        this.cash = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
    }

    public Map<Integer, Integer> getCash(Integer s) {
        Iterator i = billSet.iterator();

        for (Integer e : billSet) {
            int v = (s / e);
            if (s == 0) {break;}
            if (v > 0) {cash.put(e, v);}
            s = s - e * v;
        }
        return cash;
    }

    public void setBillSet(Set<Integer> billSet) {
        this.billSet.addAll(billSet);
    }
}
