package com.khalid;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable hashtable=new Hashtable();
        hashtable.put(1,"test");
        hashtable.put("hello","test2");
        //+ Below line will throw null pointer exception
        //hashtable.put(null,"test");



    }
}
