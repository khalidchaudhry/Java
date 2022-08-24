package com.khalid;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {

        Map identityMap=new IdentityHashMap();
        Integer i1=10;
        Integer i2=10;

        //! identity map will only contain 10 although i1 and i2 refers to different elements
        identityMap.put(i1,"khalid");
        identityMap.put(i2,"amit");

        System.out.println(identityMap);


    }

}
