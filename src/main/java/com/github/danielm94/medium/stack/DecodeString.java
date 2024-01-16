package com.github.danielm94.medium.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class DecodeString {

    public String decodeString(String s) {
        var charArray = s.toCharArray();
        var closingBracketIndexMap = new HashMap<Integer, Integer>();
        searchForClosingBracketIndexes(charArray, closingBracketIndexMap);
        return decodeStringHelper(charArray, 0, s.length(), closingBracketIndexMap);
    }


    /**
     * Helper method to recursively decode a substring of the encoded string.
     *
     * @param charArray              The character array of the string to decode.
     * @param start                  The starting index of the substring to decode.
     * @param end                    The ending index of the substring to decode.
     * @param closingBracketIndexMap A map of opening bracket indices to their corresponding closing bracket indices.
     * @return The decoded substring.
     */
    private String decodeStringHelper(char[] charArray, int start, int end, Map<Integer, Integer> closingBracketIndexMap) {
        var decodedBuilder = new StringBuilder();
        var countBuilder = new StringBuilder();

        for (var i = start; i < end; i++) {
            var character = charArray[i];
            if (Character.isAlphabetic(character)) decodedBuilder.append(character);
            else if (Character.isDigit(character)) countBuilder.append(character);
            else if (character == '[') {
                var closeIndex = closingBracketIndexMap.get(i);

                var computedString = decodeStringHelper(charArray, i + 1, closeIndex, closingBracketIndexMap);

                var count = Integer.parseInt(countBuilder.toString());
                countBuilder = new StringBuilder();

                decodedBuilder.append(computedString.repeat(count));
                i = closeIndex;
            }
        }

        return decodedBuilder.toString();
    }


    /**
     * Populates the map with indices of opening and closing brackets.
     * This method uses a stack to track the indices of opening brackets and
     * pairs them with their corresponding closing brackets in the map.
     *
     * @param charArr                The character array of the string to process.
     * @param closingBracketIndexMap The map to populate with bracket indices.
     */
    private void searchForClosingBracketIndexes(char[] charArr, Map<Integer, Integer> closingBracketIndexMap) {
        var stack = new Stack<Integer>();
        for (var i = 0; i < charArr.length; i++) {
            var character = charArr[i];
            if (character == '[') stack.push(i);
            else if (character == ']') closingBracketIndexMap.put(stack.pop(), i);
        }
    }
}
