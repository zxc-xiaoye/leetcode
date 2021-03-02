package com.zxc.leetcode.linkedlistcycle;

import com.zxc.leetcode.common.ListNode;

/**
 * @author xiaoye
 * @create 2021-03-02 22:30
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
