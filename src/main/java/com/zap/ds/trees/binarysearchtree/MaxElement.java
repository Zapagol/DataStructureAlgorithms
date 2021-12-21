package com.zap.ds.trees.binarysearchtree;

import com.zap.ds.trees.Node;
import com.zap.ds.trees.binarytree.LevelOrder;

public class MaxElement {
    static int maxWithOutRecursive(Node root){
        if(root == null) return -1;
        Node temp = root;
        while(temp.right != null){
            temp = temp.right;
        }
        return temp.data;
    }
    static int maxWithRecursive(Node root){
        if(root == null) return -1;
        else if(root.right == null) return root.data;
        return maxWithRecursive(root.right);
    }
    public static void main(String[] args){
        LevelOrder tree = new LevelOrder();
        tree.root = new Node(15);
        tree.root.left = new Node(10);
        tree.root.right = new Node(20);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(12);
        tree.root.right.left = new Node(17);
        //tree.root.right.right = new Node(100);

        System.out.println(maxWithOutRecursive(tree.root));
        System.out.println(maxWithRecursive(tree.root));
    }
}
