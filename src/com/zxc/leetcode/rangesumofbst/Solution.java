package com.zxc.leetcode.rangesumofbst;

import com.zxc.leetcode.common.TreeNode;

/**
 * @author xiaoye
 * @create 2021-03-03 21:16
 */
public class Solution {
    int sum;
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        countSum(root, low, high);
        return sum;
    }

    private void countSum(TreeNode node, int low, int high) {
        if (node != null) {

            if (node.val >= low && node.val <= high) {
                sum += node.val;
            }
            if (node.val > low) {
                countSum(node.left, low, high);
            }
            if (node.val < high) {
                countSum(node.right, low, high);
            }
        }
    }
}
