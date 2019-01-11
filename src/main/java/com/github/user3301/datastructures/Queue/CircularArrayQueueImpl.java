package com.github.user3301.datastructures.Queue;

/**
 *  circular array implementation of queue ADT
 * Created by User3301 on 24/5/17.
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
            ensureCapacity();
            array[back] = element;
            size++;
        }
        else {
            back+=back;
            array[back] = element;
            size++;
        }
    }

    public void ensureCapacity() {
        CircularArrayQueueImpl circularArrayQueue = new CircularArrayQueueImpl(size*2);
        for (int i = 0; i < array.length; i++) {
            circularArrayQueue.array[i] = array[i];
        }
        front = 0;
        back = size;
        this.array = (E[]) circularArrayQueue.array;

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
