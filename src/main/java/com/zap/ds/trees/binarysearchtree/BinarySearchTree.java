package com.zap.ds.trees.binarysearchtree;

import com.zap.ds.trees.Node;

/**
 * Binary Search Trees (BSTs). As the name suggests, the main use of this representation is for searching.
 * In this representation we impose restriction on the kind of data a node can contain. As a result, it reduces
 * the worst case average search operation to O(logn).
 *
 * In binary search trees, all the left subtree elements should be less than root data and all the right
 * subtree elements should be greater than root data. This is called binary search tree property. Note
 * that, this property should be satisfied at every node in the tree.
 */
public class BinarySearchTree {
    Node root;
    public BinarySearchTree(){root = null;}

    void insert(int data){
        root = insertData(root, data);
    }

    Node insertData(Node root, int data){
        if(root == null) root = new Node(data);
        else if(data <= root.data) insertData(root.left, data);
        else root.right = insertData(root.right, data);
        return root;
    }

    Boolean search(Node root, int data){
        if(root == null) return false;
        else if(root.data == data) return true;
        else if(root.data <= data) return search(root.left, data);
        else return search(root.right, data);
    }

    public static void main(String[] args){
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(15);
        bst.insert(10);
        bst.insert(20);
        bst.insert(8);
        bst.insert(12);
        bst.insert(17);
        bst.insert(25);

        System.out.println(bst.search(bst.root, 20));
        System.out.println(bst.search(bst.root, 100));
    }
}
