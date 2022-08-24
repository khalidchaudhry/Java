package com.khalid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        //! initial capacity of size 10
        ArrayList arrayList=new ArrayList();

        arrayList.add("a");
        arrayList.add("b");
        arrayList.add(123);
        arrayList.add("Khalid");
        arrayList.add(null);
        //! in Java, every collection class toString method is overridden to return its content directly in the format [obj1,obj2,obj3,....]
        System.out.println(arrayList);

        //! getting the synchronized version of the array list
        List synronizedList= Collections.synchronizedList(arrayList);








    }


}
