package com.khalid;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        //! Creates an empty list
        LinkedList linkedList=new LinkedList();
        //! appends the elements to the end of the linked list. Equivalent to add last
        linkedList.add("test");
        linkedList.add(0,"first");

        linkedList.set(1,"second");

        linkedList.removeLast();
        linkedList.addFirst(0);
        linkedList.add(null);

        System.out.println(linkedList);
    }
}
