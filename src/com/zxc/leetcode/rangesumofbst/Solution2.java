package com.zxc.leetcode.rangesumofbst;

import com.zxc.leetcode.common.TreeNode;

import java.util.Stack;

/**
 * @author xiaoye
 * @create 2021-03-03 21:23
 */
public class Solution2 {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode pop;
        while (!stack.isEmpty()) {
            pop = stack.pop();
            if (pop != null) {
                if (pop.val >= low && pop.val <= high) {
                    sum += pop.val;
                }
                if (pop.val > low) {
                    stack.push(pop.left);
                }
                if (pop.val < high) {
                    stack.push(pop.right);
                }
            }
        }
        return sum;
    }
}
