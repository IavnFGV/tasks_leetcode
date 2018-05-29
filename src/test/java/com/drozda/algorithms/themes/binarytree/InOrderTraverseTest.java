package com.drozda.algorithms.themes.binarytree;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class InOrderTraverseTest {

    @Test
    public void inOrderTraversal() {

        List<Integer> collect = Arrays.asList(3,2,1);
        TreeNode root= new TreeNode(3);

        for (Integer i :
                collect) {
            root.add(i);
        }

        assertEquals("[1, 2, 3]",InOrderTraverse.inOrderTraversal(root).toString());

    }



}