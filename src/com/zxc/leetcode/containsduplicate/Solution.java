package com.zxc.leetcode.containsduplicate;

import java.util.Arrays;

/**
 * @author xiaoye
 * @create 2021-02-28 20:04
 */
class Solution {
    boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
