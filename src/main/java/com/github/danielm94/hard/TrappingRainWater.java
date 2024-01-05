package com.github.danielm94.hard;

public class TrappingRainWater {
    public int trap(int[] height) {
        var trappedWater = 0;
        if (height.length < 3) return trappedWater;
        var length = height.length;
        var maxLeft = new int[length];
        var maxRight = new int[length];

        for (var i = 1; i < length; i++) {
            maxLeft[i] = Math.max(maxLeft[i - 1], height[i - 1]);
        }
        for (var i = length - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], height[i + 1]);
        }

        for (var i = 0; i < length; i++) {
            var trapped = Math.min(maxLeft[i], maxRight[i]) - height[i];
            trappedWater += Math.max(trapped, 0);
        }

        return trappedWater;
    }
}
