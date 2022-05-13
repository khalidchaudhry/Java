package com.khalid;

import java.util.TreeSet;

public class ComparableDemo {
    public static void main(String[] args) {
        Employee e1=new Employee(200);
        Employee e2=new Employee(100);
        Employee e3=new Employee(500);
        Employee e4=new Employee(500);
        Employee e5=new Employee(700);

        TreeSet t1=new TreeSet();
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);



    }
}
