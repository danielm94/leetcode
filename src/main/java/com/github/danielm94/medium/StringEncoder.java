package com.github.danielm94.medium;

import java.util.ArrayList;
import java.util.List;

public class StringEncoder {
    private static final char DELIMITER = '\t';

    public String encode(List<String> strs) {
        var builder = new StringBuilder();
        for (var str : strs) {
            builder.append(str).append(DELIMITER);
        }
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }

    /*
     * @param str: A string
     * @return: decodes a single string to a list of strings
     */
    public List<String> decode(String str) {
        var result = new ArrayList<String>();
        var builder = new StringBuilder();
        for (var character : str.toCharArray()) {
            if (character == DELIMITER) {
                var string = builder.toString();
                result.add(string);
                builder = new StringBuilder();
                continue;
            }
            builder.append(character);
        }

        result.add(builder.toString());
        return result;
    }
}
