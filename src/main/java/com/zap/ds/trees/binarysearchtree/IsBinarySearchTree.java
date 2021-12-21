package com.zap.ds.trees.binarysearchtree;

import com.zap.ds.trees.Node;
import com.zap.ds.trees.binarytree.LevelOrder;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class IsBinarySearchTree {

    /* Returns true if the given tree is a BST and its
      values are >= min and <= max. */
    static boolean isBSTUtil(Node node, int min, int max)
    {
        /* an empty tree is BST */
        if (node == null)
            return true;

        /* false if this node violates the min/max constraints */
        if (node.data < min || node.data > max)
            return false;

        /* otherwise check the subtrees recursively
        tightening the min/max constraints */
        // Allow only distinct values
        return (isBSTUtil(node.left, min, node.data-1) &&
                isBSTUtil(node.right, node.data+1, max));
    }

    static boolean isBST(Node root){
        return isBSTUtil(root, Integer.MIN_VALUE,
                Integer.MAX_VALUE);
    }

    /**
     * 1) Do In-Order Traversal of the given tree and store the result in a temp array.
     *
     * 2) This method assumes that there are no duplicate values in the tree
     * 3) Check if the temp array is sorted in ascending order, if it is, then the tree is BST.
     * Time Complexity: O(n)
     *
     * We can avoid the use of a Auxiliary Array. While doing In-Order traversal, we can keep
     * track of previously visited node. If the value of the currently visited node is less than
     * the previous value, then tree is not BST. Thanks to ygos for this space optimization.
     *
     * @param node
     * @return
     */
    static boolean isBSTUsingLevelOrder(Node node){

        // To keep tract of previous node in Inorder Traversal
        Node prev = null;

        // traverse the tree in inorder fashion and
        // keep a track of previous node
        if (node != null)
        {
            if (!isBST(node.left))
                return false;

            // allows only distinct values node
            if (prev != null && node.data <= prev.data )
                return false;
            prev = node;
            return isBST(node.right);
        }
        return true;

    }

    public static void main(String[] args){
        LevelOrder tree = new LevelOrder();
        tree.root = new Node(8);
        tree.root.left = new Node(5);
        tree.root.right = new Node(12);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(6);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(16);

        System.out.println(isBST(tree.root)); // true

//        LevelOrder tree1 = new LevelOrder();
//        tree1.root = new Node(1);
//        tree1.root.left = new Node(2);
//        tree1.root.right = new Node(3);
//        tree1.root.left.left = new Node(4);
//        tree1.root.left.right = new Node(5);
//        tree1.root.right.left = new Node(6);
//        tree1.root.right.right = new Node(7);
//
//        System.out.println(isBST(tree.root)); // false
//
//
//        tree.root = new Node(4);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(5);
//        tree.root.left.left = new Node(1);
//        tree.root.left.right = new Node(3);
    }
}
