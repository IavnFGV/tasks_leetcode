package com.drozda.algorithms.hard.serializedeserializebinarytree_297;

import com.drozda.algorithms.themes.binarytree.TreeNode;
import org.junit.Test;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class CodecTest {
    Codec  codec= new Codec();
    @Test
    public void test(){


        List<Integer> collect = new Random().ints(0, 100).limit(100).boxed().collect(Collectors.toList());
        TreeNode root= new TreeNode(3);

        for (Integer i :
                collect) {
            root.add(i);
        }
        System.out.println(codec.serialize(root));
    }

}
