package com.drozda.algorithms.easy.longestcommonprefix_14;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {


    @Test
    public void testWithOneElementInArray() {
        Assert.assertEquals("a", LongestCommonPrefix.longestCommonPrefix(new String[]{"a"}));
    }

    @Test
    public void shoulReturnEmptyOnNoCommonPrefix() {
        Assert.assertEquals("", LongestCommonPrefix.longestCommonPrefix(new String[]{"a", "b"}));
    }
}