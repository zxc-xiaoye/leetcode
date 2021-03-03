package com.zxc.leetcode.findbottomlefttreevalue;

import com.zxc.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author xiaoye
 * @create 2021-03-03 21:56
 */
public class Solution {
    public int findBottomLeftValue(TreeNode root) {
        if (root == null) {
            return -1;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode poll = root;
        while (!queue.isEmpty()) {
            poll = queue.poll();
            if (poll != null) {
                if (poll.right != null) {
                    queue.offer(poll.right);
                }
                if (poll.left != null) {
                    queue.offer(poll.left);
                }
            }
        }
        return poll.val;
    }
}
