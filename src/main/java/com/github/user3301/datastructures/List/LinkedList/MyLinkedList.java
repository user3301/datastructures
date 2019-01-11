package com.github.user3301.datastructures.List.LinkedList;

import java.util.*;

/**
 * Created by User3301 on 23/5/17.
 */
public class MyLinkedList<T> {
    private Node<T> header = new Node<T>(null,null,null);
    private int size = 0;

    public MyLinkedList () {
        this.header.next = this.header.previous = this.header;
    }


    public int size() {
        return this.size;
    }

    public Node<T> getHeader() {
        return header;
    }

    public boolean add(T element) {
        addBefore(element,header);
        return true;

    }

    private Node<T> addBefore(T element,Node<T> node) {
        Node<T> newNode = new Node<T>(node.previous,element,node);
        newNode.previous.next = newNode;
        newNode.next.previous = newNode;
        size++;
        return newNode;
    }

    public Boolean remove(T element) {
       if(element==null) {
           for(Node<T> n =header.next;n!=header;n=n.next ) {
               if(n.element==null) {
                   remove(n);
                   return true;
               }
           }
       }
       else {
           for (Node<T> n=header.next;n!=header;n=n.next) {
               if(n.element.equals(element)) {
                   remove(n);
                   return true;
               }
           }
       }
       return false;
    }

    public T remove(Node<T> node){
        if(node==header) {
            throw new NoSuchElementException();
        }
        node.previous.next = node.next;
        node.next.previous = node.previous;

        size--;
        return node.element;
    }

    public int indexOf(Object o) {
        int index = 0;
        if(o==null) {
            for(Node<T> n = header.next; n!=header; n=n.next) {
                if(n.element==null) {
                    return index;
                }
                index++;
            }
        }
        else {
            for(Node<T> n = header.next;n!=header;n=n.next) {
                if(o.equals(n.element)) {
                    return index;
                }
                index++;
            }
        }
        return -1;
    }


}
