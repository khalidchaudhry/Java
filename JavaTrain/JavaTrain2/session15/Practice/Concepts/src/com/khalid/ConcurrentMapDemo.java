package com.khalid;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapDemo {
    public static void main(String[] args) {
        ConcurrentMap<Integer,String> map=new ConcurrentHashMap<Integer, String>();
        //+ null is not allowed as key or value. Else we will get null pointer exception at run time
        //map.put(null,null);
        map.put(1,"Khalid");
        map.put(2,"Syeed");
        map.put(3,"John");
        map.put(4,"Donald");

        Iterator iterator=map.entrySet().iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
            //! Allowed to enter value while iterating the map because its concurrent map
            map.putIfAbsent(10,"Trumph");
        }
        System.out.println(map);
    }
}
