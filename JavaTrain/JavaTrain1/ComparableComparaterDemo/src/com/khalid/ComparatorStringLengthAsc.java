package com.khalid;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class ComparatorStringLengthAsc {
    public static void main(String[] args) {
        TreeSet treeSet=new TreeSet(new MyComparator());
        treeSet.add("abcd");
        treeSet.add("a");
        treeSet.add("z");
        treeSet.add("ab");

        List test=new ArrayList();


        System.out.println(treeSet);

    }
    static class MyComparator implements Comparator{
        @Override
        public int compare(Object obj1,Object obj2){
            String s1=obj1.toString();
            String s2=obj2.toString();//! existing objects in set

            if(s1.length()<s2.length()){
                return -1;
            }else if(s1.length()>s2.length()){
                return 1;
            }else{
                return s1.compareTo(s2);
            }
        }
    }

}
