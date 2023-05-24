package com.danil.javacore.chapter18;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

class HTDemo2 {
    public static void main(String[] args) {
        Hashtable<String, Double> balance = new Hashtable<>();

        String str;
        double bal;

        balance.put("Jhon Doe", 3434.34);
        balance.put("Tom Smith", 123.22);
        balance.put("Jane Baker", 1378.00);
        balance.put("Tod Hall", 99.22);
        balance.put("Ralph Smith", -19.08);

        Set<String> set = balance.keySet();
        Iterator<String> itr = set.iterator();

        while (itr.hasNext()) {
            str = itr.next();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();

        bal = balance.get("Jhon Doe");
        balance.put("Jhon Doe", bal + 1000);
        System.out.println("New Jhon Doe balance: " + balance.get("Jhon Doe"));
    }
}
