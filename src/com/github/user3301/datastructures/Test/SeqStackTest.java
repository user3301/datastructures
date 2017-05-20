package com.github.user3301.datastructures.Test;

import com.github.user3301.datastructures.Stack.SeqStack;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Stan on 20/5/17.
 */
public class SeqStackTest {

    @Test
    public void isEmptyTest() {
        SeqStack seqStack = new SeqStack();
        boolean flag1 = seqStack.isEmpty();
        assertEquals(true,flag1);

        seqStack.push(new Integer(1));
        boolean flag2 = seqStack.isEmpty();
        assertEquals(false,flag2);
    }

    @Test
    public void peekTest() {
        SeqStack seqStack = new SeqStack();
        seqStack.push(new Integer(1));
        assertEquals(1,seqStack.peek());
    }

    @Test
    public void popTest() {
        SeqStack seqStack = new SeqStack();
        seqStack.push(new Integer(1));
        assertEquals(1,seqStack.pop());
    }

    @Test
    public void expandCapacityTest() {
        SeqStack seqStack = new SeqStack(1);
        seqStack.push(1);
        seqStack.push(2);
        assertEquals(2,seqStack.peek());
    }
}
