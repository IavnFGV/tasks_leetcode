package com.drozda.algorithms.themes.binarytree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class PreOrderTraverse {

    private static List<Integer> list = new ArrayList<>();

    public static List<Integer> preorderTraversal(TreeNode root) {
        traverseIterative(root);
        return list;
    }

    private static void traverseRecursion(TreeNode node) {
        if (node == null)
            return;

        PreOrderTraverse.list.add(node.val);
        traverseRecursion(node.left);
        traverseRecursion(node.right);
    }


    private static void traverseIterative(TreeNode node) {
        if (node == null)
            return;
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode current;
        stack.push(node);
        while (!stack.isEmpty()) {
            current = stack.pop();
            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
            list.add(current.val);
        }
    }
}
