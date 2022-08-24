package com.khalid;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        CopyOnWriteArrayList<Integer> arrayList=new CopyOnWriteArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        ListIterator iterator=arrayList.listIterator();
        while (iterator.hasNext()){
             arrayList.add(50);
            //iterator.add(35);
            System.out.println(iterator.next());
        }
        System.out.println(arrayList);

    }
}