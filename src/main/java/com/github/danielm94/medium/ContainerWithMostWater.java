package com.github.danielm94.medium;

public class ContainerWithMostWater {
    private int maxAreaBruteForce(int[] height) {
        var max = Integer.MIN_VALUE;

        for (var i = 0; i < height.length; i++) {
            for (var j = i + 1; j < height.length; j++) {
                var area = getArea(height, i, j);
                max = Math.max(max, area);
            }
        }
        return max;
    }

    public int maxArea(int[] height) {
        var max = Integer.MIN_VALUE;
        var left = 0;
        var right = height.length - 1;
        while (left < right) {
            var area = getArea(height, left, right);
            max = Math.max(max, area);
            if (height[left] > height[right]) {
                right--;
            } else if (height[left] < height[right]) {
                left++;
            } else {
                left++;
            }
        }
        return max;
    }

    private int getArea(int[] height, int left, int right) {
        var leftHeight = height[left];
        var rightHeight = height[right];
        var minHeight = Math.min(leftHeight, rightHeight);
        var distance = right - left;
        return minHeight * distance;
    }
}
