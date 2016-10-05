package linkedList;

import tutorials.ListNode;

import java.util.List;

public class ll_86_PartitionList {
    public static void main(String[] args) {
        //TreeNode
        ListNode node;
    }


    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        //step 1
        ListNode pre = dummy;
        while (pre.next != null && pre.next.val < x) pre = pre.next;

        //step 2
        ListNode cur = pre;
        while (cur.next != null) {
            if (cur.next.val < x) {
                ListNode temp = cur.next;
                cur.next = cur.next.next;// todo!! bug1 should delete first
                temp.next = pre.next;
                pre.next = temp;

                pre = pre.next; // todo bug2 , always points to the head of the partition, so need to move , otherwise it will not keep
                                // origin order
            } else {
                cur = cur.next;
            }
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

 {1,6,3} 4

 step 1
 ListNode dummy
 , pre : pre the partition element , as the 1 (pre 6)

 traversal to find the first bigger than x , then divide  //todo!! attention it is not equal
 preserve the point
 ListNode pre (pre.next.value > x)

 step 2
 ListNode cur : checking the element(cur.next) to be move as the 6=>3, ..

 move the bigger one of the right part , to place before x, (pre.next)

 TODO case

 case1
 {1,6,3} 4
 k is not in array
 expected : {1,3,6}

 TODO bug
 bug1
 ListNode temp = cur.next;
 temp.next = pre.next;  // todo!! bug1 should delete first
 pre.next = temp;
 cur.next = cur.next.next;
 =>
 ListNode temp = cur.next;
 cur.next = cur.next.next;// todo!! bug1 should delete first then the element of temp is free!
 temp.next = pre.next;
 pre.next = temp;


 bug2
 //
 =>
 pre = pre.next; // todo bug2 , always points to the head of the partition, so need to move , otherwise it will not keep origin order


 bug3
 */

/*
TODO tutorial


TODO follow


 */
