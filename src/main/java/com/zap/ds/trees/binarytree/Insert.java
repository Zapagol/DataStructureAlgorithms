package com.zap.ds.trees.binarytree;

import com.zap.ds.trees.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Since given tree Binary Tree, we can insert the element wherever we want
 * To insert an element, we can use the level order traversal and insert the
 * element wherever we find the node whose left or right child is NULL.
 *
 */
public class Insert {
    Node root;

    public Insert(){root = null;}

    Queue<Node> queue1 = new LinkedList<>();
    Queue<Node> queue2 = new LinkedList<>();
    Node insert(Node root, int data){
        queue1.add(root);
        while (queue1.size() != 0){
            Node temp = queue1.remove();
            //System.out.print(temp.data + " ");
            if(temp.left != null) {
                queue1.add(temp.left);
            }else {
                temp.left = new Node(data);
                return root;
            }
            if(temp.right != null) {
                queue1.add(temp.right);
            }else {
                temp.right = new Node(data);
                return root;
            }
        }
        return root;
    }
    void print(Node root){
        queue2.add(root);
        while (queue2.size() != 0){
            Node temp = queue2.remove();
            System.out.print(temp.data + " ");
            if(temp.left != null) {
                queue2.add(temp.left);
            }
            if(temp.right != null) {
                queue2.add(temp.right);
            }
        }
    }

    public static void main(String[] args){
        Insert tree = new Insert();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        tree.insert(tree.root, 8);
        tree.insert(tree.root, 9);
        Node root = tree.insert(tree.root, 10);
        tree.print(root);
    }
}
