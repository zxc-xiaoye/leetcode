package com.zxc.leetcode.invertbinarytree;

import com.zxc.leetcode.common.TreeNode;

/**
 * @author xiaoye
 * @create 2021-03-02 21:24
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}
