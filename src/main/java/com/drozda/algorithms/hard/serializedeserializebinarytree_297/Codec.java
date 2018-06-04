package com.drozda.algorithms.hard.serializedeserializebinarytree_297;

import com.drozda.algorithms.themes.binarytree.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        InOrderTraverse inOrderTraverse = new InOrderTraverse();
        inOrderTraverse.traverse(root);
        return String.valueOf(inOrderTraverse.result);
    }

//    // Decodes your encoded data to tree.
//    public TreeNode deserialize(String data) {
//
//    }
}


class InOrderTraverse {

    List<Integer> result = new LinkedList<>();

    public List<Integer> getResult() {
        return result;
    }

    public void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        traverse(root.getLeft());
        result.add(root.getVal());
        traverse(root.getRight());
    }

}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));