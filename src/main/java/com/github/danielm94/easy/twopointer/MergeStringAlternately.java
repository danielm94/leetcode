package com.github.danielm94.easy.twopointer;

public class MergeStringAlternately {
    public String mergeAlternately(String word1, String word2) {
        var builder = new StringBuilder();

        for (int i = 0, j = 0; i < word1.length() || j < word2.length(); i++, j++) {
            if (i < word1.length()) builder.append(word1.charAt(i));
            if (j < word2.length()) builder.append(word2.charAt(j));
        }

        return builder.toString();
    }
}
