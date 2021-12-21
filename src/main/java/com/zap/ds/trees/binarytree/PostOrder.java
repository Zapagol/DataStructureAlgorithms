package com.zap.ds.trees.binarytree;

import com.zap.ds.trees.Node;

import java.util.Stack;

public class PostOrder {

    Node root;
    public PostOrder(){
        root = null;
    }
    /**
     * In preorder traversal, each node is processed before (pre) either of its subtrees.
     *
     * Preorder traversal is defined as follows:
     *      - Visit the root
     *      - Traverse the left subtree in preorder
     *      - Traverse the right subtree in preorder
     *
     * @param root
     */
    void PostOrder(Node root){
        if(root != null){
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.data + " ");
        }
    }


    // Driver method

    /**
     *
     * TREE STRUCTURE
     *           1
     *       2       3
     *    4     5 6      7
     *
     * @param args
     */
    public static void main(String[] args)
    {
        PostOrder tree = new PostOrder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        /**
         * POST-ORDER
         *
         *  4 5 2 6 7 3 1
         */
        System.out.println(
                "Post-Order traversal of binary tree with recursive is ");
        tree.PostOrder(tree.root);

    }
}
