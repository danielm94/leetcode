package com.github.danielm94.easy.twopointer;

public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        if (image == null) return null;

        for (var row : image) {
            flipAndInvertRow(row);
        }
        return image;
    }

    private void flipAndInvertRow(int[] row) {
        var left = 0;
        var right = row.length - 1;
        while (left <= right) {
            var temp = row[left];
            row[left++] = row[right] ^ 1;
            row[right--] = temp ^ 1;
        }
    }
}
