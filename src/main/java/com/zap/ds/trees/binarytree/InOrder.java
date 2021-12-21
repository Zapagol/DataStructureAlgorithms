package com.zap.ds.trees.binarytree;

import com.zap.ds.trees.Node;

import java.util.Stack;

public class InOrder {

    public Node root;
    public InOrder(){
        root = null;
    }
    /**
     * In pre-order traversal, each node is processed before (pre) either of its subtrees.
     *
     * Pre-order traversal is defined as follows:
     *      - Traverse the left subtree in pre-order
     *      - Visit the root
     *      - Traverse the right subtree in pre-order
     *
     * @param root
     */
    public void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    /**
     * Steps:
     *  1. Create an empty stack
     *  2. Initialize current node as root
     *  3. Push current node to stack and set current = current.left until current is null
     *  4. If current is NULL and stack is not empty then
     *      - Pop the top element from stack
     *      - Print the popped item, set current = current.right
     *      - go to step 3
     *  5. If current is NULL and stack is empty then we are done
     * @param root
     */
    void inOrderWithStack(Node root){
        if (root == null) return;
        Stack<Node> stack = new Stack<>();
        Node current = root;
        //Traverse the tree
        while (current != null || !stack.isEmpty()){
            //Reach the left most Node of the current node
            while (current != null){
                //Place pointer to stack before moving to left subtree
                stack.push(current);
                current = current.left;
            }
            //Current must be NULL
            current = stack.pop();
            System.out.print(current.data + " ");
            //Visited the node and it left subtree. Visit right subtree now
            current = current.right;
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
        InOrder tree = new InOrder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        /**
         * IN-ORDER
         *
         *  4 2 5 1 6 3 7
         */
        System.out.println(
                "Inorder traversal of binary tree with recursive is ");
        tree.inOrder(tree.root);
        System.out.println();
        System.out.println(
                "Inorder traversal of binary tree without recursive is -- using stack ");
        tree.inOrderWithStack(tree.root);


    }
}
