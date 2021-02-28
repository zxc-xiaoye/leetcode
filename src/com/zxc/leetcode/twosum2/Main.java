package com.zxc.leetcode.twosum2;

import java.util.Arrays;

/**
 * @author xiaoye
 * @create 2021-02-28 15:50
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numbers = new int[]{1, 3, 5, 6, 9 };

        int[] result = s.twoSum(numbers, 11);
        System.out.println(Arrays.toString(result));
    }
}
