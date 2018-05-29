package com.drozda.algorithms.themes.binarytree;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public void add(int val) {
        if (val == this.val) {
            return;
        }
        if (val < this.val) {
            if (this.left == null) {
                this.left = new TreeNode(val, null, null);
            } else {
                this.left.add(val);
            }
        } else {
            if (this.right == null) {
                this.right = new TreeNode(val, null, null);
            } else {
                this.right.add(val);
            }

        }
    }
}
