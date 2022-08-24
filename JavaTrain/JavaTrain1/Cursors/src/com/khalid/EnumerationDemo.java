package com.khalid;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String[] args) {

        Stack stk=new Stack();
        stk.push('a');
        stk.push('b');
        stk.push('c');

       //! Enumeration only works with legacy classes
        Enumeration e=stk.elements();
        while (e.hasMoreElements()){

            System.out.println(e.nextElement());
        }

        Vector vector=new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);

        Enumeration e2=vector.elements();
        while (e2.hasMoreElements()){
            System.out.println(e2.nextElement());
        }

    }

}
