package com.zxc.leetcode.palindromelinkedlist;

/**
 * @author xiaoye
 * @create 2021-02-28 20:34
 */
public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;

        Solution s = new Solution();
        boolean flag = s.isPalindrome(head);
        System.out.println(flag);
    }
}
