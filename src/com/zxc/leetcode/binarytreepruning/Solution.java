package com.zxc.leetcode.binarytreepruning;

import com.zxc.leetcode.common.TreeNode;

/**
 * @author xiaoye
 * @create 2021-03-03 22:12
 */
public class Solution {
    public TreeNode pruneTree(TreeNode root) {

        if(!containOne(root)) {
            return null;
        }
        return root;
    }

    private boolean containOne(TreeNode root) {
        if (root == null) {
            return false;
        }

        boolean left = containOne(root.left);
        if (!left) {
            root.left = null;
        }
        boolean right = containOne(root.right);
        if (!right) {
            root.right = null;
        }
        return root.val == 1 && left || right;
    }
}
