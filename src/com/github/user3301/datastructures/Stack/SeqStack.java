package com.github.user3301.datastructures.Stack;

import java.util.EmptyStackException;

/** implementation of sequence stack using array
 * Created by Stan on 20/5/17.
 */
public class SeqStack<T> implements Stack<T> {

    private int top = -1; //set current index -1
    private int capacity = 10; //capacity of the stack
    private T[] array;
    private int size=0;


    @Override
    public boolean isEmpty() {
        return this.top==-1;
    }

    /**
     *  constructor with customizing capacity
     * @param capacity
     */
    public SeqStack(int capacity) {
        this.array = (T[]) new Object[capacity];
    }

    /**
     * constructor with default capacity
     */
    public SeqStack() {
        this.array = (T[]) new Object[this.capacity];
    }

    @Override
    public void push(T data) {
        if(array.length==size) {
            ensureCapacity(size=10);
        }
        array[++top] =data;
        size++;
    }

    private void ensureCapacity(int newCapacity) {
        if(newCapacity<this.capacity)
            return;
        T[] oldArray = array;
        array = (T[]) new Object[newCapacity];
        //put all the existing element to the new array
        for (int i = 0; i < oldArray.length; i++) {
            array[i] = oldArray[i];
        }
    }

    /**
     *
     * @return the element been pushed in last
     */
    @Override
    public T peek() {
        if(isEmpty()) {
            new EmptyStackException();
        }
        return array[top];
    }


    @Override
    public T pop() {
        if(isEmpty()) {
            new EmptyStackException();
        }
        size--;
        return array[top--];
    }
}
