package com.github.user3301.datastructures.Tree.AVLTree;

/**
 * Created by Zhelun Gai on 28/5/17.
 *
 * as all the comparison method is based on the CompareTo method, so the data in
 * the node is the implementation of the interface Comparable
 */
public class AVLNode {

    private Comparable data;
    private AVLNode leftNode;
    private AVLNode rightNode;
    private int height;

    //constructor
    public AVLNode(Comparable data) {
        this.data = data;
        this.leftNode = null;
        this.rightNode = null;
        this.height = 0;
    }
}
