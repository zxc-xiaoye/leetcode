package com.zxc.leetcode.containsduplicate;

/**
 * @author xiaoye
 * @create 2021-02-28 20:03
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 5, 3, 3, 2, 7, 9};
        Solution s = new Solution();
        boolean b = s.containsDuplicate(nums);
        System.out.println(b);
    }

}
