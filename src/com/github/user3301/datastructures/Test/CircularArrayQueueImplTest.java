package com.github.user3301.datastructures.Test;

import com.github.user3301.datastructures.Queue.CircularArrayQueueImpl;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Zhelun Gai on 24/5/17.
 */
public class CircularArrayQueueImplTest {

    @Test
    public void enqueueTest() {
        CircularArrayQueueImpl circularArrayQueue = new CircularArrayQueueImpl(3);
        circularArrayQueue.enqueue(1);
        circularArrayQueue.enqueue(2);
        circularArrayQueue.enqueue(3);
        circularArrayQueue.enqueue(4);
        circularArrayQueue.dequeue();
        circularArrayQueue.enqueue(4);
        assertEquals(3,circularArrayQueue.getSize());
    }

    @Test
    public void dequeueTest() {
        CircularArrayQueueImpl circularArrayQueue = new CircularArrayQueueImpl(3);
        circularArrayQueue.dequeue();
        circularArrayQueue.enqueue(1);
        circularArrayQueue.dequeue();
        assertEquals(0,circularArrayQueue.getSize());
    }
}
