package com.khalid;

import java.util.ArrayList;
import java.util.Vector;

public class VectorListDemo {
    public static void main(String[] args) {
        //! Creates an initial capacity of size 10
        Vector vector=new Vector();
        System.out.println("Initial capacity:"+vector.capacity());

        for(int i=0;i<=10;++i){
            vector.add(i);
        }

        //! Once vector reaches its capacity , a new vector object will be created with double capacity
        System.out.println("Capacity after adding 11 elements:"+vector.capacity());

        Vector vector2=new Vector(2,100);

        vector2.add(12);
        vector2.add(13);
        vector2.add(13);
        System.out.println("vector2 capacity:"+vector2.capacity());

        ArrayList arrayList=new ArrayList();
        arrayList.add(10);
        arrayList.add(30);
        arrayList.add(100);
        arrayList.add("Hello");
        arrayList.add(32.456);

        Vector vector3=new Vector(arrayList);

        System.out.println(vector3);
     }
}
