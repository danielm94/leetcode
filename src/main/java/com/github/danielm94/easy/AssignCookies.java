package com.github.danielm94.easy;

import lombok.AllArgsConstructor;
import lombok.val;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.
 * <p>
 * Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with; and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content. Your goal is to maximize the number of your content children and output the maximum number.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: g = [1,2,3], s = [1,1]
 * Output: 1
 * Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3.
 * And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
 * You need to output 1.
 * <p>
 * Example 2:
 * <p>
 * Input: g = [1,2], s = [1,2,3]
 * Output: 2
 * Explanation: You have 2 children and 3 cookies. The greed factors of 2 children are 1, 2.
 * You have 3 cookies and their sizes are big enough to gratify all the children,
 * You need to output 2.
 * <p>
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= g.length <= 3 * 104
 * 0 <= s.length <= 3 * 104
 * 1 <= g[i], s[j] <= 231 - 1
 */

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        if (s.length == 0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);

        int count = 0;
        int cookiePointer = 0;
        for (int i = 0; i < g.length && cookiePointer < s.length; i++) {
            int greed = g[i];
            int size = s[cookiePointer];
            for (int j = cookiePointer; j < s.length; j++) {
                size = s[j];
                if (size >= greed) {
                    cookiePointer = j;
                    break;
                }
            }
            if (size >= greed) {
                count++;
                cookiePointer++;
            }
        }
        return count;
    }
}
