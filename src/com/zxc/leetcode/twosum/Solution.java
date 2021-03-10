package com.zxc.leetcode.twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaoye
 * @create 2021-03-10 22:02
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0 ; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numsMap.containsKey(complement)) {
                return new int[] {i, numsMap.get(complement)};
            }
            numsMap.put(nums[i], i);
        }
        return null;
    }
}
