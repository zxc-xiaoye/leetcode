package com.zxc.leetcode.palindromenumber;

/**
 * @author xiaoye
 * @create 2021-03-02 21:13
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if( x==0 ) {
            return true;
        }
        if(x<0 || x % 10 == 0){
            return false;
        }

        int reversedInt = 0;
        while(x > reversedInt) {
            int pop = x % 10;
            x /= 10;
            reversedInt = reversedInt * 10 + pop;
        }

        return x == reversedInt || reversedInt / 10 == x;
    }
}
