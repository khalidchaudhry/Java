package com.edureka.khalid.assignments.assignment4.interfacesassignment;

import java.util.LinkedList;

public class QueueTest implements MyQueue {
    private java.util.Queue<Integer> queue;

    public QueueTest() {
        this.queue = new LinkedList<>();
    }

    @Override
    public void delete() {

        this.queue.remove();
    }

    @Override
    public void insert(Integer item) {
        this.queue.add(item);
    }

}
