package com.zxc.leetcode.reverselinkedlist;

import com.zxc.leetcode.common.ListNode;

/**
 * @author xiaoye
 * @create 2021-02-28 20:14
 */
public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Solution s = new Solution();
        ListNode listNode = s.reverseList(head);


    }
}
