package com.github.user3301.datastructures.Tree.AVLTree;

import static com.github.user3301.datastructures.Tree.AVLTree.AVLNode.height;

/**
 * Created by User3301 on 28/5/17.
 */

public class AVLTree {

    private AVLNode root;

    // constructor
    public AVLTree() {
        this.root = null;
    }

    public void insert( Comparable x )
    {
        root = insert(x, root);
    }

    private AVLNode insert( Comparable x, AVLNode t )
    {
        if( t == null )
            t = new AVLNode( x, null, null );
        else if( x.compareTo(t.data) < 0 )
        {
            t.leftNode = insert( x, t.leftNode );
            if( height( t.leftNode ) - height( t.rightNode ) == 2 )
                if( x.compareTo( t.leftNode.data ) < 0 )
                    t = rotateWithLeftChild( t );
                else
                    t = doubleWithLeftChild( t );
        }
        else if( x.compareTo( t.data ) > 0 )
        {
            t.rightNode = insert( x, t.rightNode );
            if( height( t.rightNode ) - height( t.leftNode ) == 2 )
                if( x.compareTo( t.rightNode.data ) > 0 )
                    t = rotateWithRightChild( t );
                else
                    t = doubleWithRightChild( t );
        }
        else
            ;  // Duplicate; do nothing
        t.height = max( height( t.leftNode ), height( t.rightNode ) ) + 1;
        return t;
    }

    /**
     * Return maximum of lhs and rhs.
     */
    private static int max( int lhs, int rhs )
    {
        return lhs > rhs ? lhs : rhs;
    }

    /**
     * Rotate binary tree node with right child.
     * For AVL trees, this is a single rotation for case 4.
     * Update heights, then return new root.
     */
    private static AVLNode rotateWithRightChild( AVLNode k1 )
    {
        AVLNode k2 = k1.rightNode;
        k1.rightNode = k2.leftNode;
        k2.leftNode = k1;
        k1.height = max( height( k1.leftNode ), height( k1.rightNode ) ) + 1;
        k2.height = max( height( k2.rightNode ), k1.height ) + 1;
        return k2;
    }

    /**
     * Double rotate binary tree node: first right child
     * with its left child; then node k1 with new right child.
     * For AVL trees, this is a double rotation for case 3.
     * Update heights, then return new root.
     */
    private static AVLNode doubleWithRightChild( AVLNode k1 )
    {
        k1.rightNode = rotateWithLeftChild( k1.rightNode );
        return rotateWithRightChild( k1 );
    }

    /**
     * Rotate binary tree node with left child.
     * For AVL trees, this is a single rotation for case 1.
     * Update heights, then return new root.
     */
    private static AVLNode rotateWithLeftChild( AVLNode k2 )
    {
        AVLNode k1 = k2.leftNode;
        k2.leftNode = k1.rightNode;
        k1.rightNode = k2;
        k2.height = max( height( k2.leftNode ), height( k2.rightNode ) ) + 1;
        k1.height = max( height( k1.leftNode ), k2.height ) + 1;
        return k1;
    }

    /**
     * Double rotate binary tree node: first left child
     * with its right child; then node k3 with new left child.
     * For AVL trees, this is a double rotation for case 2.
     * Update heights, then return new root.
     */
    private static AVLNode doubleWithLeftChild( AVLNode k3 )
    {
        k3.leftNode = rotateWithRightChild( k3.leftNode );
        return rotateWithLeftChild( k3 );
    }
}
