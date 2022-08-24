package com.khalid;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

    public static void main(String[] args) {
        List ll=new LinkedList();
        ll.add("Khalid");
        ll.add("Amit");
        ll.add("Arpit");
        ll.add("Farrukh");
        ll.add("Arsalan");
        System.out.println(ll);

        ListIterator listIterator=  ll.listIterator();

        int idx=0;
        while (listIterator.hasNext()){
            String name=(String)listIterator.next();
            if(idx==3 && listIterator.hasPrevious()){
                listIterator.previous();
            }
            System.out.println(name);
            ++idx;

        }








    }
}
