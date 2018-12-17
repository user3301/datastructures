package com.github.user3301.datastructures.List.LinkedList;

/**
 * Created by Zhelun Gai on 23/5/17.
 */
public class Node<T> {
    public T element;
     public Node<T> previous;
      public Node<T> next;

    Node(Node<T> previous, T value, Node<T> next) {
        this.element = value;
        this.previous = previous;
        this.next = next;
    }


}
