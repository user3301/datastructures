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

    public void insert(int i) {
        if(this.root==null) {
            root = new Node(i);
            return;
        }
        Node current = root;
        while(true) {

            if(i<current.getElement()) {
                if(current.getLeftNode()==null) {
                    current.setLeftNode(new Node(i));
                    return;
                }
                else {
                    current = current.getLeftNode();
                }
            }
            else {
                if(current.getRightNode()==null) {
                    current.setRightNode(new Node(i));
                    return;
                }
                else current = current.getRightNode();
            }
        }
    }

    public void display(Node root) {
        if (root!=null) {
            display(root.getLeftNode());
            System.out.println(root.getElement());
            display(root.getRightNode());
        }
    }


    public Node getRoot() {
        return root;
    }
}
