package com.github.user3301.datastructures.Queue;


/**
 * Created by Zhelun Gai on 24/5/17.
 */
public class QueueWithArray<E> {
    private int front=-1,back = -1;
    private E[] array;
    private int size = 0;

    public QueueWithArray(int size) {
        array = (E[]) new Object[size];
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
        if(isFull()) {
            ensureCapacity();
            array[back] = element;
            size++;
        }
        else if(isEmpty()) {
            front = back = 0;
            array[0] = element;
            size++;
        }
        else {
            back +=back;
            array[back] = element;
            size++;
        }
    }

    public void ensureCapacity() {
        QueueWithArray queueWithArray = new QueueWithArray(size*2);
        for (int i = 0; i < array.length; i++) {
            queueWithArray.array[i] = array[i];
        }
        front = 0;
        back = size;
        this.array = (E[]) queueWithArray.array;

    }

    public void dequeue() {
        if(isEmpty()) {
            System.out.println("The queue is empty!");
            return;
        }
        else if(front==back) {
            front = back = -1;
            size--;
        }
        else {
            front+=front;
            size--;
        }
    }
}
