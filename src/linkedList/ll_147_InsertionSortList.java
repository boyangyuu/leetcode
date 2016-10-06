package linkedList;

import tutorials.ListNode;

public class ll_147_InsertionSortList {
    public static void main(String[] args) {
        //TreeNode
        ListNode node;
    }

    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) return head;

        //step1
        ListNode dummy = new ListNode(0);


        // step2
        ListNode head1 = head;
        while(head1 != null) {
            // insert
            ListNode newHead1 = head1.next;

            //find
            ListNode cur = dummy;
            while(cur.next != null) {
                if (cur.next.val > head1.val) break;
                cur = cur.next;
            }

            head1.next = cur.next;
            cur.next = head1;
            head1 = newHead1;
        }

        return dummy.next;

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
 step 1
 create new dummy

 step 2
 LinkList cur : points to the node which to be insert
 traversal the head , insert to dummy

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
