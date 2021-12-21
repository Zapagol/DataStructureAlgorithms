package com.zap.ds.trees.binarytree;

import com.zap.ds.trees.Node;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {

    public Node root;
    public LevelOrder(){
        root = null;
    }
    /**
     * In preorder traversal, each node is processed before (pre) either of its subtrees.
     *
     * Preorder traversal is defined as follows:
     *      - Traverse the left subtree in preorder
     *      - Visit the root
     *      - Traverse the right subtree in preorder
     *
     * @param root
     */
    Queue<Node> queue = new LinkedList<>();
    void levelOrder(Node root){
        if (root == null) return;
        queue.add(root);
        while(queue.size() != 0){
            Node temp = queue.remove();
            System.out.print(temp.data + " ");
            if(temp != null) queue.add(temp.left);
            if (temp != null) queue.add(temp.right);
        }
    }
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
        LevelOrder tree = new LevelOrder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        /**
         * Level-ORDER
         *
         *  1 2 3 4 5 6 7
         */
        System.out.println(
                "Level Order traversal of binary tree is ");
        tree.levelOrder(tree.root);
    }
}
