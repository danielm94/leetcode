package com.github.danielm94.easy;

import lombok.val;

import java.util.HashMap;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] sArray = new int[26];
        int[] tArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            sArray[sChar - 'a'] = sArray[sChar - 'a'] + 1;
            tArray[tChar - 'a'] = tArray[tChar - 'a'] + 1;
        }

        for (int i = 0; i < tArray.length; i++) {
            if (sArray[i] != tArray[i]) return false;
        }

        return true;
    }

    public boolean isAnagramUnicode(String s, String t) {
        if (s.length() != t.length()) return false;
        val sMap = new HashMap<Character, Integer>();
        val tMap = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            val sChar = s.charAt(i);
            val tChar = t.charAt(i);
            sMap.put(sChar, sMap.getOrDefault(sChar, 0) + 1);
            tMap.put(tChar, tMap.getOrDefault(tChar, 0) + 1);
        }

        return sMap.equals(tMap);
    }
}
