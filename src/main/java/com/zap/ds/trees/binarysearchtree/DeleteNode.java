package com.zap.ds.trees.binarysearchtree;

import com.zap.ds.trees.Node;
import com.zap.ds.trees.binarytree.InOrder;

//Not working correctly
public class DeleteNode {

    static Node delete(Node root, int data){
        if(root == null) return root;
        else if(data < root.data) root.left = delete(root.left, data);
        else if(data > root.data) root.right = delete(root.right, data);
        else {
            //case 1: No child
            if(root.left == null && root.right == null){
                root = null;
            }
            //case 2: Only left child
            else if(root.left != null){
                root = root.left;
            }else if(root.right != null){
                root = root.right;
            }
            //case 3: With 2 children
            else {
                Node temp = root;
                Node minNode = findMinimum(temp.right);
                root.data = minNode.data;
                root.right = delete(root.right, minNode.data);
            }
        }
        return root;
    }
    static Node findMinimum(Node root){
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args){
        InOrder tree = new InOrder();
        tree.root = new Node(5);
        tree.root.left = new Node(3);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(4);
        tree.root.right.right = new Node(11);
        Node newRoot = delete(tree.root, 5);
        tree.inOrder(newRoot);
    }
}
