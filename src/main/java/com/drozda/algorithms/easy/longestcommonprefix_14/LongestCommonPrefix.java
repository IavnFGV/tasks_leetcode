package com.drozda.algorithms.easy.longestcommonprefix_14;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs[0].isEmpty()) {
            return "";
        }
        int iterator = 0;
        String prefixToCheck = "";
        String lastCorrectPrefix = "";
        while (isCommonPrefix(strs, prefixToCheck)) {
            lastCorrectPrefix = prefixToCheck;
            if (iterator >= strs[0].length()) {
                break;
            }
            prefixToCheck = strs[0].substring(0, ++iterator);
        }
        return lastCorrectPrefix;
    }

    private static boolean isCommonPrefix(String[] strs, String prefix) {
        for (String s : strs) {
            if (!s.startsWith(prefix)) {
                return false;
            }
        }
        return true;
    }

}
