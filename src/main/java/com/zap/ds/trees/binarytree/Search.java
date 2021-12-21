package com.zap.ds.trees.binarytree;

import com.zap.ds.trees.Node;

import java.util.LinkedList;
import java.util.Queue;

public class Search {

    /**
     * Return true if a node with data is found in the tree. Recurse down
     * the tree, choose the left or right branch by comparing data with each nodes data.
     *
     * @param root
     * @param data
     * @return
     */
    static boolean searchWithRecursive(Node root, int data){
        if(root == null) return false;
        if(root.data == data) return true;
        return (searchWithRecursive(root.left, data) || searchWithRecursive(root.right, data));
    }

    /**
     * We can use level order traversal for solving this problem. The only change required in
     * level order traversal is, instead of printing the data, we just need to check whether
     * the root data is equal to the element we want to search.
     *
     * @param root
     * @param data
     * @return
     */
    static boolean searchWithOutRecursive(Node root, int data){
        if(root == null) return false;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node temp = queue.remove();
            if(temp.data == data) return true;
            if(temp.left != null) queue.add(temp.left);
            if(temp.right != null) queue.add(temp.right);
        }
        return false;
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

        System.out.println(searchWithRecursive(tree.root, 20));
        System.out.println(searchWithRecursive(tree.root, 100));

        System.out.println(searchWithOutRecursive(tree.root, 20));
        System.out.println(searchWithOutRecursive(tree.root, 100));
    }
}
