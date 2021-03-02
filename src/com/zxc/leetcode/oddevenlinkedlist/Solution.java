package com.zxc.leetcode.oddevenlinkedlist;

import com.zxc.leetcode.common.ListNode;

/**
 * @author xiaoye
 * @create 2021-03-02 22:15
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;

        return head;

    }
}
