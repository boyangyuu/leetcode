package linkedList;

import tutorials.ListNode;


// 建议再code 一遍
public class ll_147_todo_InsertionSortList {
    public static void main(String[] args) {
        //TreeNode
        ListNode node = ll_0_tuition.getLinkedList(3);
        ListNode res = insertionSortList1(node);
        ll_0_tuition.printListNode(res);

    }
    public static ListNode insertionSortList1(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode l1 = dummy.next;
        while (l1.next != null) {
            ListNode cur = dummy;
            while (cur.next != null && cur != l1) {
                if (cur.next.val < l1.next.val){
                    //delete
                    ListNode t = l1.next;
                    l1.next = l1.next.next;

                    //insert
                    t.next = cur.next;
                    cur.next = t;
                    break;
                } else cur = cur.next;
            }
            if (cur == l1) l1 = l1.next;
        }
        return dummy.next;
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
