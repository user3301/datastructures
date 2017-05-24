package com.github.user3301.datastructures.Queue;

/**
 *  circular array implementation of queue ADT
 * Created by Zhelun Gai on 24/5/17.
 */
public class CircularArrayQueueImpl<E> {
    private int front=-1,back=-1;
    private E[] array;
    private int size;

    public CircularArrayQueueImpl(int capacity) {
        this.array = (E[]) new Object[capacity];
    }

    public boolean isEmpty() {
        return front==-1&&back==-1;
    }

    public boolean isFull() {
        return size==array.length;
    }

    public int getSize() {
        return this.size;
    }

    public void enqueue(E element) {
        if(isEmpty()) {
            front = back = 0;
            array[0] = element;
            size++;
        }
        else if(isFull()) {
            System.out.println("The queue is full!");
            return;
        }
        else {
            back+=back;
            array[back] = element;
            size++;
        }
    }

    public void dequeue() {
        if(isEmpty()) {
            System.out.println("The queue is empty");
            return;
        }
        else {
            front++;
            size--;
        }
    }
}
