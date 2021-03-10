package com.zxc.leetcode.narytreepreordertraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author xiaoye
 * @create 2021-03-10 22:14
 */
public class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node current = stack.pop();
            result.add(current.val);
            if (current.children != null) {
                for (int i = current.children.size() - 1; i >= 0; i--) {
                    stack.push(current.children.get(i));
                }
            }
        }
        return result;
    }
}
