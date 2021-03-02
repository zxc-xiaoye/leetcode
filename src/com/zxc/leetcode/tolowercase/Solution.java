package com.zxc.leetcode.tolowercase;

/**
 * @author xiaoye
 * @create 2021-03-02 22:05
 */
public class Solution {
    public String toLowerCase(String str) {
        StringBuilder result = new StringBuilder();
        for(char c : str.toCharArray()) {
            if(Character.isUpperCase(c)) {
                result.append((char) (c + 32));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
