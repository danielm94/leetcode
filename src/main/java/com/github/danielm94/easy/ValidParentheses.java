package com.github.danielm94.easy;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        if (s == null || s.length() < 2) return false;
        var bracketMap = new HashMap<Character, Character>();
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');
        bracketMap.put(')', '(');
        var bracketStack = new Stack<Character>();
        var charArr = s.toCharArray();
        for (var character : charArr) {
            if (isOpeningBracket(character)) bracketStack.add(character);
            else {
                if (bracketStack.isEmpty()) return false;
                var previousOpeningBracket = bracketStack.pop();
                var expectedOpeningBracket = bracketMap.get(character);
                if (previousOpeningBracket != expectedOpeningBracket) return false;
            }
        }
        return bracketStack.isEmpty();
    }

    public boolean isOpeningBracket(char c) {
        return c == '{' || c == '[' || c == '(';
    }
}
