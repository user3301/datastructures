package com.github.user3301.datastructures.List;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by Zhelun Gai on 21/5/17.
 */
public class MyArrayList<T> implements Iterable<T> {
    private static final int DEFAULT_CAPCITY = 10;
    private int size;
    private T[] data;

    /**
     * constructor 1
     */
    public MyArrayList() {
        this.data = (T[]) new Object[DEFAULT_CAPCITY];
    }

    /**
     * constructor 2
     *
     * @param capacity
     */
    public MyArrayList(int capacity) {
        this.data = (T[]) new Object[capacity];
    }

    /**
     * constructor 3
     *
     * @param collection
     */
    public MyArrayList(Collection<T> collection) {
        this.data = (T[]) new Object[collection.toArray().length];
        this.size = data.length;
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public T[] getData() {
        return this.data;
    }

    public T get(int index) {
        if (index < 0 || index >= getSize()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.data[index];
    }

    public void add(T element) {
        if (getSize() + 1 >= this.data.length) {
            ensureCapacity(size * 2 + 1);
        }
        this.data[size++] = element;
    }

    private void ensureCapacity(int newCapacity) {
        if (newCapacity < this.size)
            return;
        T[] old = data;
        data = (T[]) new Object[newCapacity];
        for (int i = 0; i < this.data.length; i++) {
            data[i] = old[i];
        }
    }

    public void remove(T element) {
        int index = indexOf(element);
        for (int i = index; i < getSize(); i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    public int indexOf(T element) {
        int index = 0;
        for (int i = 0; i < getSize(); i++) {
            if (data[i] == element) {
                index = i;
            }
        }
//        if (index==-1) {
//            throw new IndexOutOfBoundsException();
//        }
        return index;
    }

    public void trimToSize() {
        if (getSize() < data.length) {
            ensureCapacity(getSize());
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<T>();
    }

    private class MyIterator<T> implements Iterator<T> {
        private int current;
        @Override
        public boolean hasNext() {
            return current<MyArrayList.this.getSize();
        }

        @Override
        public T next() {
            return (T) MyArrayList.this.get(current++);
        }
    }
}

