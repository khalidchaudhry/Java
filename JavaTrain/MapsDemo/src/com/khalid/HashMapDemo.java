package com.khalid;

import java.util.*;
import java.util.Map.Entry;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        map.put("Khalid",123);
        map.put("Amit",456);
        map.put("Test",654);

        //! entrySet
        Set<Entry<String,Integer>> entry= map.entrySet();
        for(Entry<String,Integer> e :map.entrySet()){
            System.out.print(e.getKey());
            System.out.print("\t");
            System.out.print(e.getValue());

            System.out.println();
        }
        //! map.values
        Collection c=map.values();

        ArrayList arrayList=new ArrayList(c);
        System.out.println(arrayList);

        //! keySet
        Set<String> test=map.keySet();

        for(String t:test){
            System.out.print(t);
        }

        for (String key : map.keySet())
            System.out.println(key);



    }
}
