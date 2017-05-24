package com.github.user3301.datastructures.Test;

import com.github.user3301.datastructures.Queue.QueueWithArray;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Stan on 24/5/17.
 */
public class QueueWithArrayTest {

    @Test
    public void enqueueTest() {
        QueueWithArray queueWithArray = new QueueWithArray(10);
        queueWithArray.enqueue(1);
        assertEquals(1,queueWithArray.getSize());
    }

    @Test
    public void dequeueTest() {
        QueueWithArray queueWithArray = new QueueWithArray(10);
        queueWithArray.enqueue(1);
        queueWithArray.dequeue();
        assertEquals(0,queueWithArray.getSize());
    }
}