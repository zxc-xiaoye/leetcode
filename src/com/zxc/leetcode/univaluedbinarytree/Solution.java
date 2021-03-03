package com.zxc.leetcode.univaluedbinarytree;

import com.zxc.leetcode.common.TreeNode;

/**
 * @author xiaoye
 * @create 2021-03-03 21:09
 */
public class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }

        boolean leftFlag = root.left == null || root.left.val == root.val && isUnivalTree(root.left);
        boolean rightFlag = root.right == null || root.right.val == root.val && isUnivalTree(root.right);

        return leftFlag && rightFlag;
    }
}
