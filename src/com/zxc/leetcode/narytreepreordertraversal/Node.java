package com.zxc.leetcode.narytreepreordertraversal;

import java.util.List;

/**
 * @author xiaoye
 * @create 2021-03-10 22:14
 */
public class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
}
