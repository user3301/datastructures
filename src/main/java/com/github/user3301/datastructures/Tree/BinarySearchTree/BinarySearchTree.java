package com.github.user3301.datastructures.Tree.BinarySearchTree;

import java.util.NoSuchElementException;

/**
 * Created by User3301 on 26/5/17.
 *  Thanks to http://algorithms.tutorialhorizon.com/binary-search-tree-complete-implementation/
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


    /**
     * there are 3 cases:
     *  1.Node to be deleted is a leaf node ( No Children).
     *if a node to be deleted has no children then just tra­verse to that node, keep track of parent node and the side in which the node exist(left or right) and set parent.left = null or parent.right = null;
        2.Node to be deleted has only one child.
     if a node to be deleted(deleteNode) has only one child then just traverse to that node, keep track of parent node and the side in which the node exist(left or right).
     check which side child is null (since it has only one child).
     Say node to be deleted has child on its left side . Then take the entire sub tree from the left side and add it to the parent and the side on which deleteNode exist, see step 1 and example.
        3.Node to be deleted has two childrens.
     Suc­ces­sor is the node which will replace the deleted node. Now the ques­tion is to how to find it and where to find it.

     Suc­ces­sor is the smaller node in the right sub tree of the node to be deleted.
     * @param i
     * @return
     */
    public boolean delete(int i){
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while(current.getElement()!=i){
            parent = current;
            if(current.getElement()>i){
                isLeftChild = true;
                current = current.getLeftNode();
            }else{
                isLeftChild = false;
                current = current.getRightNode();
            }
            if(current ==null){
                return false;
            }
        }
        //if i am here that means we have found the node
        //Case 1: if node to be deleted has no children
        if(current.getLeftNode()==null && current.getRightNode()==null){
            if(current==root){
                root = null;
            }
            if(isLeftChild ==true){
                parent.setLeftNode(null);
            }else{
                parent.setRightNode(null);
            }
        }
        //Case 2 : if node to be deleted has only one child
        else if(current.getRightNode()==null){
            if(current==root){
                root = current.getLeftNode();
            }else if(isLeftChild){
                parent.setLeftNode(current.getLeftNode());
            }else{
                parent.setRightNode(current.getLeftNode());
            }
        }
        else if(current.getLeftNode()==null){
            if(current==root){
                root = current.getRightNode();
            }else if(isLeftChild){
                parent.setLeftNode(current.getRightNode());
            }else{
                parent.setRightNode(current.getRightNode());
            }
        }else if(current.getLeftNode()!=null && current.getRightNode()!=null){

            //now we have found the minimum element in the right sub tree
            Node successor	 = getSuccessor(current);
            if(current==root){
                root = successor;
            }else if(isLeftChild){
                parent.setLeftNode(successor);
            }else{
                parent.setRightNode(successor);
            }
            successor.setLeftNode(current.getLeftNode());
        }
        return true;
    }

    public Node getSuccessor(Node deleleNode){
        Node successsor =null;
        Node successsorParent =null;
        Node current = deleleNode.getRightNode();
        while(current!=null){
            successsorParent = successsor;
            successsor = current;
            current = current.getLeftNode();
        }
        //check if successor has the right child, it cannot have left child for sure
        // if it does have the right child, add it to the left of successorParent.
//		successsorParent
        if(successsor!=deleleNode.getRightNode()){
            successsorParent.setLeftNode(successsor.getRightNode());
            successsor.setRightNode(deleleNode.getRightNode());
        }
        return successsor;
    }

    public int finMin(Node root) throws Exception {
        if(this.getRoot()==null)  {
            throw new NoSuchElementException();
        }
        else if(root.getLeftNode()==null) {
            return root.getElement();
        }
        return finMin(root.getLeftNode());
    }

    public int findMax(Node root) {
        if(this.getRoot()==null) {
            throw new NoSuchElementException();
        }
        else if(root.getRightNode()==null) {
            return root.getElement();
        }
        return findMax(root.getRightNode());
    }


    public Node getRoot() {
        return root;
    }
}
