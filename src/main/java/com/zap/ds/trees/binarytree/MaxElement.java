package com.zap.ds.trees.binarytree;

import com.zap.ds.trees.Node;

import java.util.LinkedList;
import java.util.Queue;

public class MaxElement {
    /**
     * One simple way of solving this problem is with Recursive.
     *  1. Find maximum element of left subtree
     *  2. Find maximum element of right subtree
     *  3. Compare them with root data
     *  4. Select the one with gives maximum value
     *
     * @param root
     * @return
     */
    static int maxWithRecursive(Node root){
        int maxValue = Integer.MIN_VALUE;
        if(root != null){
            int temp = root.data;
            if (temp > maxValue) {
                maxValue = temp;
            }
            maxWithRecursive(root.left);
            maxWithRecursive(root.right);
        }
        return maxValue;

    }

    /**
     * Using Level Order Traversal. Just observe the data while traversing.
     *
     * @param root
     * @return
     */
    static int maxWithOutRecursive(Node root){
        if(root == null) return -1;
        int maxValue = Integer.MIN_VALUE;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node temp = queue.remove();
            if(temp.data > maxValue) maxValue = temp.data;
            if(temp.left != null) queue.add(temp.left);
            if(temp.right != null) queue.add(temp.right);
        }
        return maxValue;
    }

    public static void main(String args[]){
        LevelOrder tree = new LevelOrder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(20);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println(maxWithRecursive(tree.root));
        System.out.println(maxWithOutRecursive(tree.root));
    }
}
