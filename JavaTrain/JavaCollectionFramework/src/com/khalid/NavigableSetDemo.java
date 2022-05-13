package com.khalid;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {
    public static void main(String[] args) {
        NavigableSet navigableSet=new TreeSet();

        navigableSet.add(1000);
        navigableSet.add(2000);
        navigableSet.add(3000);
        navigableSet.add(4000);
        navigableSet.add(5000);

        System.out.println(navigableSet);

        System.out.println(navigableSet.ceiling(2000));
        System.out.println(navigableSet.higher(2000));
        System.out.println(navigableSet.floor(3000));
        System.out.println(navigableSet.lower(3000));
        System.out.println(navigableSet.pollFirst());
        System.out.println(navigableSet.pollLast());

        System.out.println(navigableSet.descendingSet());
        System.out.println(navigableSet);




    }
}
