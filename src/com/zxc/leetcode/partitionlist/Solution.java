package com.zxc.leetcode.partitionlist;

import com.zxc.leetcode.common.ListNode;

/**
 * @author xiaoye
 * @create 2021-03-03 21:45
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode beforeHead = new ListNode(0);
        ListNode before = beforeHead;
        ListNode afterHead = new ListNode(0);
        ListNode after = afterHead;

        while (head != null){
            if (head.val < x) {
                before.next = head;
                before = before.next;
            } else {
                after.next = head;
                after = after.next;
            }

            head = head.next;
        }

        // after 到最后了 清除后面的值
        after.next = null;
        before.next = afterHead.next;

        return beforeHead.next;
    }
}
