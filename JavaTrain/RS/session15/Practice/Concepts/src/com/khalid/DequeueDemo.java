package com.khalid;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueDemo {
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<>();
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);

        System.out.println("Peek first element:"+deque.peek());
        System.out.println("Remove first element:"+deque.remove());
        System.out.println("Get first element:"+deque.getFirst());
        System.out.println("Get last element:"+deque.getLast());




    }
}
