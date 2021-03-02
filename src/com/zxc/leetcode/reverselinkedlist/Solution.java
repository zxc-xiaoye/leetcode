package com.zxc.leetcode.reverselinkedlist;

import com.zxc.leetcode.common.ListNode;

/**
 * @author xiaoye
 * @create 2021-02-28 20:15
 */
public class Solution {
    ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
