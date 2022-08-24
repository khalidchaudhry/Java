package com.khalid;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {



        Stack stk= new Stack();
        stk.push('a');
        stk.push('b');
        stk.push('c');
        System.out.println(stk);
        //! search returns where element is in stk. If element is at stock top,search will return 1
        System.out.println(stk.search('a'));
        System.out.println(stk.search('b'));
        System.out.println(stk.search('c'));


        List test= new ArrayList();

    }
}
