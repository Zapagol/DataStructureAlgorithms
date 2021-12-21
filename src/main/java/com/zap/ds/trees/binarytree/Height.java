package com.zap.ds.trees.binarytree;

import com.zap.ds.trees.Node;

/**
 * - Calculate height/size of left subtree
 * - Calculate height/size of right subtree
 * - Take max of both subtree and then add 1
 */
public class Height {

    int height(Node root){
        if(root == null) return -1;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return (leftHeight > rightHeight) ? leftHeight + 1 : rightHeight + 1;
    }
}
