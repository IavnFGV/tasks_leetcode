package com.drozda.algorithms.medium.shortestcompletingword_748;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShortestCompletingWordTest {

    @Test
    public void shouldReturn_steps() {
        String licensePlate = "1s3 PSt";
        String[] words = {"step", "steps", "stripe", "stepple"};
        assertEquals("steps", ShortestCompletingWord.shortestCompletingWord(
                licensePlate, words
        ));
    }

    @Test
    public void shouldReturn_pest() {
      String licensePlate = "1s3 456";
        String[] words = {"looks", "pest", "stew", "show"};
        assertEquals("pest", ShortestCompletingWord.shortestCompletingWord(
                licensePlate, words
        ));
    }
}