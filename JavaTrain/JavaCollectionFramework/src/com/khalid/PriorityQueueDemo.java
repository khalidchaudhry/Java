package com.khalid;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue();
        System.out.println(pq.peek());
        for(int i=0;i<=10;++i){
            pq.offer(i);
        }
        System.out.println(pq);

        //System.out.println(pq.poll());

        while (pq.size()!=0)
        System.out.print(pq.poll());

        System.out.println();

        PriorityQueue pq2=new PriorityQueue(new MyComparator());

        pq2.offer("A");
        pq2.offer("Z");
        pq2.offer("L");
        pq2.offer("B");

        while (pq2.size()!=0){
            System.out.print(pq2.poll());
        }
        System.out.println();
    }
    public static class MyComparator implements Comparator{


        @Override
        public int compare(Object o1, Object o2) {
            return o2.toString().compareTo(o1.toString());
        }
    }
}

