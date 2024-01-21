package com.github.danielm94.easy.twopointer;

public class FindTheArrayConcatenationValue {

    public long findTheArrayConcValWithStringConcat(int[] nums) {
        var sum = 0L;
        var left = 0;
        var right = nums.length - 1;

        while (left <= right) {
            var leftVal = nums[left];
            var rightVal = nums[right];
            if (left == right) {
                sum += leftVal;
                break;
            } else {
                var concat = leftVal + String.valueOf(rightVal);
                sum += Long.parseLong(concat);
            }
            left++;
            right--;
        }

        return sum;
    }

    public long findTheArrayConcVal(int[] nums) {
        var sum = 0L;
        var left = 0;
        var right = nums.length - 1;

        while (left <= right) {
            var leftVal = nums[left];
            var rightVal = nums[right];
            if (left == right) {
                sum += leftVal;
                break;
            } else {
                var rightNumDigits = (int) Math.log10(rightVal) + 1;
                sum += (long) (leftVal * Math.pow(10, rightNumDigits)) + rightVal;
            }
            left++;
            right--;
        }

        return sum;
    }
}
