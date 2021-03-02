package com.zxc.leetcode.reverseinteger;

/**
 * @author xiaoye
 * @create 2021-03-02 21:48
 */
public class Solution {
    public int reverse(int x) {
        int reversedInt = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (reversedInt > Integer.MAX_VALUE / 10 || reversedInt == Integer.MAX_VALUE / 10 && pop > 7) {
                return 0;
            }
            if (reversedInt < Integer.MIN_VALUE / 10 || reversedInt == Integer.MIN_VALUE / 10 && pop < -8) {
                return 0;
            }
            reversedInt = reversedInt * 10 + pop;
        }
        return reversedInt;
    }
}
