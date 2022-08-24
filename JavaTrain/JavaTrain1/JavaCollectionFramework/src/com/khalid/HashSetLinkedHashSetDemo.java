package com.khalid;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetLinkedHashSetDemo {
    public static void main(String[] args) {
        //+ insertion order is not maintained
        HashSet hs=new HashSet();
        hs.add("a");
        hs.add("b");
        hs.add("c");
        hs.add("e");
        //! Allow one null value
        hs.add(null);
        hs.add(null);
        //! returns false if element not added successfully
        System.out.println(hs.add("a"));
        System.out.println(hs);

       //! insertion order is maintained
        LinkedHashSet lhs=new LinkedHashSet();

        lhs.add('a');
        lhs.add('b');
        lhs.add('c');
        lhs.add('d');
        lhs.add(null);
        System.out.println(lhs);


    }
}
