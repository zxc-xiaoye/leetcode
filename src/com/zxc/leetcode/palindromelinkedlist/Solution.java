package com.zxc.leetcode.palindromelinkedlist;

/**
 * @author xiaoye
 * @create 2021-02-28 20:34
 */
public class Solution {
    boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode reverse = reverse(slow);
        fast = head;

        while (reverse!= null ) {
            if (reverse.val != fast.val) {
                return false;
            }
            reverse = reverse.next;
            fast = fast.next;
        }

        return true;
    }

    private ListNode reverse(ListNode head) {
        if (head == null) {
            return null;
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
