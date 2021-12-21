package com.zap.ds.trees.binarytree;

import com.zap.ds.trees.Node;

import java.util.LinkedList;
import java.util.Queue;

public class CountLeaves {

    static int countLeaves(Node root){
        if(root == null) return -1;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int count = 0;
        while (!queue.isEmpty()){
            Node temp = queue.remove();
            if(temp.left == null && temp.right == null) count++;
            if(temp.left != null) queue.add(temp.left);
            if(temp.right != null) queue.add(temp.right);
        }
        return count;
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
    public static void main(String[] args) {
        LevelOrder tree = new LevelOrder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        //tree.root.right.right = new Node(7);

        System.out.println(countLeaves(tree.root));
    }
}
