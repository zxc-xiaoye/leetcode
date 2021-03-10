package com.zxc.leetcode.swapnodesinpairs;

import com.zxc.leetcode.common.ListNode;

/**
 * @author xiaoye
 * @create 2021-03-10 21:27
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode temp = new ListNode(0);
        temp.next = head;

        ListNode current = temp;

        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = first.next;
            current.next = second;
            first.next = second.next;
            second.next = first;

            current = current.next.next;
        }
        return temp.next;
    }
}
