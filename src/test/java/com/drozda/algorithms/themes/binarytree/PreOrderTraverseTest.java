package com.drozda.algorithms.themes.binarytree;

import org.junit.Test;

import static org.junit.Assert.*;

public class PreOrderTraverseTest {

    @Test
    public void preorderTraversal() {

        TreeNode leftRightRoot= new TreeNode(3);
        TreeNode rightRoot= new TreeNode(2,leftRightRoot,null);
        TreeNode root= new TreeNode(1,null,rightRoot);

        assertEquals("[1, 2, 3]",PreOrderTraverse.preorderTraversal(root).toString());

    }
}