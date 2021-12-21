package com.zap.ds.trees.binarytree;

import com.zap.ds.trees.Node;

import java.util.Stack;

public class PreOrder {

    public Node root;
    public PreOrder(){
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
    public void preOrder(Node root){
        if(root != null){
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    void preOrderWithStack(Node root){
        if (root == null) return;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            // Process the current node
            Node temp = stack.pop();
            System.out.print(temp.data + " ");
            if(temp.right != null) stack.push(temp.right);
            if(temp.left != null) stack.push(temp.left);
        }
        return;
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
        PreOrder tree = new PreOrder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        /**
         * PRE-ORDER
         *
         *  1 2 4 5 3 6 7
         */
        System.out.println(
                "Preorder traversal of binary tree with recursive is ");
        tree.preOrder(tree.root);
        System.out.println();
        System.out.println(
                "Preorder traversal of binary tree without recursive is -- using stack ");
        tree.preOrderWithStack(tree.root);


    }
}
