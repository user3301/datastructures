package com.github.user3301.datastructures.Tree.BinarySearchTree;

/**
 * Created by Zhelun Gai on 26/5/17.
 */
public class BinarySearchTree {
    private Node root;

    public BinarySearchTree () {
        this.root = null;
    }

    public boolean find(int i) {
        Node current = root;
        while (current!=null) {
            if(current.getElement()==i) {
                return true;
            }
            else if(current.getElement()>i) {
                current = current.getLeftNode();
            }
            else {
                current = current.getRightNode();
            }
        }
        return false;
    }

    
}
