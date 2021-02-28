package com.zxc.leetcode.islandnumber;

/**
 * @author xiaoye
 * @create 2021-02-28 15:07
 */
public class Main {
    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };

        Solution solution = new Solution();
        int i = solution.numIslands(grid);
        System.out.println(i);
    }
}
