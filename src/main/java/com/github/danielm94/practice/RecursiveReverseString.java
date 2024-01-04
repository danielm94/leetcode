package com.github.danielm94.practice;

public class RecursiveReverseString {

    public static void main(String[] args) {
        System.out.println(new RecursiveReverseString().reverseString("Hello"));
    }

    public String reverseString(String s) {
        return reverseStringHelper(s, s.length() - 1, "");
    }

    private String reverseStringHelper(String s, int i, String result) {
        if (i < 0) return result;
        return reverseStringHelper(s, i - 1, result + s.charAt(i));
    }
}
