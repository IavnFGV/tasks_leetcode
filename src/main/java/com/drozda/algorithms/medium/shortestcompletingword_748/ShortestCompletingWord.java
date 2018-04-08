package com.drozda.algorithms.medium.shortestcompletingword_748;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ShortestCompletingWord {

    public static String shortestCompletingWord(String licensePlate, String[] words) {
        String onlyChars = licensePlate.replaceAll("\\P{L}+", "").toLowerCase();
        int charCount = onlyChars.length();
        String bestCandidate = null;
        lb1:
        for (String word : words
                ) {
            if (word.length() < charCount) {
                continue;
            }
            List<Character> charsInWord = word.chars().mapToObj(c -> (char) c).collect(Collectors.toCollection(LinkedList::new));
            for (char ch : onlyChars.toCharArray()
                    ) {
                if (!charsInWord.remove((Character) ch)) {
                    continue lb1;
                }
            }
            bestCandidate = bestCandidate == null ? word : bestCandidate;
            if (bestCandidate.length() > word.length()) {
                bestCandidate = word;
            }
        }

        return bestCandidate;
    }
}
