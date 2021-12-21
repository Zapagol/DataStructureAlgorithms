package com.zap.ds.trees.binarysearchtree;

import com.zap.ds.trees.Node;

public class MinMaxElementInBST {

    int min(Node root){
        if(root == null) return -1;
        Node temp = root;
        while (temp.left != null){
            temp = temp.left;
        }
        return temp.data;
    }
    int max(Node root){
        if(root == null) return -1;
        Node temp = root;
        while (temp.right != null){
            temp = temp.right;
        }
        return temp.data;
    }
    int minWithRecursive(Node root){
        if(root == null) return -1;
        else if (root.left == null){
            return root.left.data;
        }
        return minWithRecursive(root.left);
    }
    public static void main(String[] args){

    }
}
