package linkedList;

import tutorials.ListNode;

public class ll_83_RemoveDuplicatesfromSortedList {
    public static void main(String[] args) {
        //TreeNode
        ListNode node;
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        int cur = head.val;
        ListNode index = head;
        while (index.next != null) {
            if (cur == index.next.val) index.next = index.next.next;
            else {
                cur = index.next.val;
                index = index.next;
            }
        }
        return head;
    }








}
/** 题
 *
 * http:
 *


 */

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站


 TODO solotion


 TODO case

 TODO bug
 bug1


 bug2

 bug3
 */

/*
TODO tutorial


TODO follow


 */
