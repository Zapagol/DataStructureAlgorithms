package com.zap.ds.trees.binarytree;

import com.zap.ds.trees.Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Reverse Level order is same as Level Order Reversal.
 * Instead of printing element, add all elements to stack
 * And then iterate data from from stack.
 */
public class ReverseLevelOrder {

    static void reverseLevelOrder(Node root){
        if(root == null) return;
        Queue<Node> queue = new LinkedList<>();
        Stack<Node> stack = new Stack<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node temp = queue.remove();
            stack.push(temp);
            if(temp.left != null) queue.add(temp.left);
            if(temp.right != null) queue.add(temp.right);
        }

        while (!stack.isEmpty()) System.out.print(stack.pop().data + " ");
    }

    public static void main(String[] args) {
        LevelOrder tree = new LevelOrder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        reverseLevelOrder(tree.root);
    }
}
