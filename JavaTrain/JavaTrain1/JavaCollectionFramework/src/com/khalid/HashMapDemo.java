package com.khalid;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {

        Map map=new HashMap();

        map.put("khalid",700);
        map.put("amit",1000);
        map.put("arpit",200);
        map.put("test",1000);

        System.out.println(map);

        System.out.println(map.put("khalid",400)); //! will return 700 which is an old value

        Collection c= map.values();
        System.out.println(c);

        Set s1= map.entrySet();

        Iterator it=s1.iterator();
        while (it.hasNext()){
            Map.Entry m1=(Map.Entry)it.next();
            System.out.println(m1.getKey()+"----------"+m1.getValue());
            if(m1.getKey().equals("khalid")){
                m1.setValue(10000);
            }
        }
        System.out.println(map);


    }
}
