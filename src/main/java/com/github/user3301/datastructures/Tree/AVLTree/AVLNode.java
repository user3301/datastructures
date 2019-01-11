package com.github.user3301.datastructures.Tree.AVLTree;

/**
 * Created by User3301 on 28/5/17.
 *
 * as all the comparison method is based on the CompareTo method, so the data in
 * the node is the implementation of the interface Comparable
 */
public class AVLNode {

     Comparable data;
     AVLNode leftNode;
     AVLNode rightNode;
     int height;

    //constructor
    public AVLNode(Comparable data) {
        this.data = data;
        this.leftNode = null;
        this.rightNode = null;
        this.height = 0;
    }

    public AVLNode(Comparable data, AVLNode leftNode, AVLNode rightNode) {
        this.data = data;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.height = 0;
    }

    public static int height(AVLNode t) {
        return t==null?-1:t.height;
    }

}
