package com.github.user3301.datastructures.Stack;

/** stack interface  (LIFO) - last in first out
 * Created by User3301 on 20/5/17.
 */
public interface Stack<T> {
    /**
     *  check if the stack is empty
     * @return
     */
    boolean isEmpty();

    /**
     *  push data into the stack
     * @param data
     */
    void push(T data);

    /**
     * return the top element of the stack
     */
    T peek();

    /**
     *  return the top element of the stack, the element is removed from the stack
     * @return
     */
    T pop();
}
