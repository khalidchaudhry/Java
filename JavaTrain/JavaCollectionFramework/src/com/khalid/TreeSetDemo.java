package com.khalid;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        Set treeSet=new TreeSet();
        treeSet.add("a");
        //+ for non-empty tree set if we are trying to insert null we will get null pointer exception(NPE)
        //treeSet.add(null);
        //+ Below code will throw ClassCastException(CCE)
        //treeSet.add(12);

        TreeSet treeSet2=new TreeSet();
        //treeSet2.add("H");
        //+ Will throw null pointer exception
        //treeSet2.add(null);

        TreeSet treeSet3=new TreeSet();
        treeSet3.add(new StringBuffer("A"));
        treeSet3.add(new StringBuffer("B"));
        treeSet3.add(new StringBuffer("C"));
        treeSet3.add(new StringBuffer("D"));

        //! Comparable interface

        TreeSet treeSet4=new TreeSet();
        treeSet4.add("z");
        //! k.CompareTo("z"); returns -ve as k comes before z
        treeSet4.add("k");
        //! d.CompareTo("k") returns -ve as d comes before k
        treeSet4.add("d");
        //! m.CompareTo("d") returns +ve as m after d
        treeSet4.add("m");









    }
}
