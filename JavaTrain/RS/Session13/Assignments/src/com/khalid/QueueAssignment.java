package com.khalid;

import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueAssignment {
    public static void main(String[] args) {
        Queue<Integer> pq=new PriorityQueue();
        System.out.println("pq add method returns: "+pq.add(10));
        System.out.println("pq offer method returns: "+pq.offer(20));
        System.out.println("pq remove method returns:"+pq.remove());
        System.out.println("pq poll method returns:"+pq.poll());
        //! below statement throws exception as queue is empty
        try {
            System.out.println("pq element is used to retrieve pq head:" + pq.element());
        }catch (NoSuchElementException e){
            System.out.println("Exception thrown as queue is empty");
        }
        System.out.println("pq peek is used to retrieve pq head:"+pq.peek());






    }
}