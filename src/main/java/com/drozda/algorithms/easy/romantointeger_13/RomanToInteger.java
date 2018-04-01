package com.drozda.algorithms.easy.romantointeger_13;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int romanToInt(String s) {
        Parser parser = new Parser(s);
        return parser.parse();
    }

    public static class Parser {

        Map<String, Integer> lexemeMap = new HashMap<>();
        Map<String, Integer> dualLexemeMap = new HashMap<>();

        {
            lexemeMap.put("I", 1);
            lexemeMap.put("V", 5);
            lexemeMap.put("X", 10);
            lexemeMap.put("L", 50);
            lexemeMap.put("C", 100);
            lexemeMap.put("D", 500);
            lexemeMap.put("M", 1000);
            dualLexemeMap.put("IV", 4);
            dualLexemeMap.put("IX", 9);
            dualLexemeMap.put("XL", 40);
            dualLexemeMap.put("XC", 90);
            dualLexemeMap.put("CD", 400);
            dualLexemeMap.put("CM", 900);
        }


        int nextStep = 1;
        int startIndex = -1;
        int endIndex = 1;// become 2 on first iteration
        final String stringToParse;
        int sum = 0;

        public Parser(String stringToParse) {
            this.stringToParse = stringToParse;
        }

        public int parse() {
            while (endIndex <= stringToParse.length()) {
                sum += parseLexeme(nextLexeme());
            }
            return sum;
        }

        private String nextLexeme() {
            startIndex += nextStep;
            endIndex += nextStep;
            return stringToParse.substring(startIndex, Math.min(endIndex, stringToParse.length()));
        }

        private int parseLexeme(String lexeme) {
            if (lexeme.isEmpty()) {
                return 0;
            }
            Integer weight = dualLexeme(lexeme);
            if (weight != null) {
                nextStep = 2;
            } else {
                weight = singleLexeme(lexeme);
                nextStep = 1;
            }
            return weight;
        }

        private Integer singleLexeme(String lexeme) {
            return lexemeMap.get(lexeme.substring(0, 1));
        }

        private Integer dualLexeme(String lexeme) {
            return dualLexemeMap.get(lexeme);
        }
    }
}
