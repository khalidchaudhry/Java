package com.khalid;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map treeMap=new TreeMap();
        //+ Below line will throw Null pointer exception
        //treeMap.put(null,null);
        treeMap.put(100,"zzz");
        treeMap.put(103,"yyy");
        treeMap.put(101,"test");

        System.out.println(treeMap);

        TreeMap t=new TreeMap();
        t.put("xxx",10);
        t.put("AAA",20);
        t.put("zzz",30);

        System.out.println(t);

    }
    public static class  MyComparator implements Comparator{


        @Override
        public int compare(Object o1, Object o2) {
            return o2.toString().compareTo(o1.toString());
        }
    }
}
