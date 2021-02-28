package com.zxc.leetcode.twosum2;

/**
 * @author xiaoye
 * @create 2021-02-28 15:51
 */
class Solution {
    int[] twoSum(int[] numbers, int target) {
        int aIndex = 0;
        int bIndex = numbers.length - 1;
        while (aIndex < bIndex) {
            if (numbers[aIndex] + numbers[bIndex] < target) {
                aIndex ++;
            } else if (numbers[aIndex] + numbers[bIndex] > target) {
                bIndex --;
            } else {
                return new int[] {aIndex + 1, bIndex + 1};
            }
        }

        return null;
    }
}
