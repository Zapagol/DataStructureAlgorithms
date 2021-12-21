package com.zap.ds.trees.binarysearchtree;

import com.zap.ds.trees.Node;

/**
 * - Start with root and keep moving left or right using BST property.
 *      - If data is same as node data then return
 *      - If data is less than node data then left subtree of current node
 *      - If data is more than node data then right subtree of current node
 */
public class SearchElement {

    static Node find(Node root, int data){
        if(root == null) return null;
        if(data < root.data) return find(root.left, data);
        else if(data > root.data) return find(root.right, data);
        return root;
    }

    static Node findWithOutRecursive(Node root, int data){
        if(root == null) return null;
        while (root != null){
            if(data == root.data) return root;
            else if(data < root.data) root = root.left;
            else root = root.right;
        }
        return null;
    }
}
