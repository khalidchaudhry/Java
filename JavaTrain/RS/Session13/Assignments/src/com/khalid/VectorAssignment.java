package com.khalid;

import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorAssignment {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        vector.add(12);
        vector.add(34);
        vector.add(100);
        Enumeration<Integer> e= Collections.enumeration(vector);//vector.elements();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

    }
}
