package com.khalid;

import java.util.HashSet;

public class HashcodeDemo {
    public static void main(String[] args) {

        HashcodeDemo demo=new HashcodeDemo();
        int hashCode=demo.hashCode();
        System.out.println(Integer.toHexString(demo.hashCode()));
        System.out.println(demo);

    }
}
