package com.github.user3301.datastructures.Test;

import com.github.user3301.datastructures.List.LinkedList.MyLinkedList;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Zhelun Gai on 23/5/17.
 */
public class MyLinkedListTest {

    @Test
    public void addTest() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        assertEquals(1,myLinkedList.size());
        assertEquals(1,myLinkedList.getHeader().previous.element);
    }

    @Test
    public void removeTest() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.remove(1);
        System.out.println(myLinkedList.size());
    }
}
