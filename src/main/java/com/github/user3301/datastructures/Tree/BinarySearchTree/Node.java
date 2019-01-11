package com.github.user3301.datastructures.Tree.BinarySearchTree;

/**
 * Created by User3301 on 26/5/17.
 */
public class Node{

    private int element;
    private Node leftNode;
    private Node rightNode;

    public Node (int root) {
       this(root,null,null);
    }

    public Node (int element, Node leftNode, Node rightNode) {
        this.element = element;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

}
