package com.khalid;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorSortingDesc {
    public static void main(String[] args) {
        TreeSet t=new TreeSet(new MyComparator());
        t.add(20);
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(10);

        System.out.println(t);


    }
    static class MyComparator implements Comparator{
        @Override
        public int compare(Object obj1,Object obj2){
//            Integer i1=(Integer)obj1;
//            Integer i2=(Integer)obj2; //!existing element(s) in set
//
//            if(i1<i2){
//                return 1;
//            } else if (i1>i2) {
//                return -1;
//            }else {
//                return 0;
//            }
              return ((Integer) obj2).compareTo((Integer)(obj1));
        }
    }
}

