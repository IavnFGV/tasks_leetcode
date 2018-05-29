package com.drozda.algorithms.themes.binarytree;

import org.junit.Test;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class AllTraversalTest {
    @Test
    public void inAndPreOrderTraversal() {

        List<Integer> collect = new Random().ints(0, 100).limit(100).boxed().collect(Collectors.toList());
        TreeNode root= new TreeNode(3);

        for (Integer i :
                collect) {
            root.add(i);
        }

        System.out.println(InOrderTraverse.inOrderTraversal(root).toString());
        System.out.println(PreOrderTraverse.preorderTraversal(root).toString());
        System.out.println(PostOrderTraverse.postOrderTraversal(root).toString());

    }

}
