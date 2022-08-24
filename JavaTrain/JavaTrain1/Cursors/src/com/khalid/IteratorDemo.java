package com.khalid;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class IteratorDemo {
    public static void main(String[] args) {
        Set hs=new HashSet();
        //! returns true or false if element added successfully to hashset
        hs.add("a");
        hs.add("b");
        hs.add("c");
        Iterator i=hs.iterator();

        int idx=0;
        while (i.hasNext()){
            i.next();
//            if(idx==0){
//             i.remove();
//            }
            ++idx;
        }
        i=hs.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
