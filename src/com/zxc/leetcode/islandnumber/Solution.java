package com.zxc.leetcode.islandnumber;

/**
 * @author xiaoye
 * @create 2021-02-28 15:05
 */
class Solution {
    int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    remove(grid, i, j);
                }
            }
        }
        return count;
    }

    private void remove(char[][] grid, int i, int j) {
        if (i < 0 || i > grid.length - 1 || j < 0 || j > grid[i].length -1 || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        remove(grid, i + 1, j);
        remove(grid, i - 1, j);
        remove(grid, i, j + 1);
        remove(grid, i, j - 1);
    }
}
