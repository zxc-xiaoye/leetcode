package com.zxc.leetcode.pascalstriangle;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaoye
 * @create 2021-02-28 15:30
 */
class Solution {
    List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        List<Integer> first = new ArrayList<>();
        first.add(1);
        result.add(first);

        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> preRow = result.get(i - 1);

            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(preRow.get(j - 1) + preRow.get(j));
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }
}
