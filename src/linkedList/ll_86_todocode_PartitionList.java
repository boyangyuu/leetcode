package linkedList;

import tutorials.ListNode;

import java.util.List;

// todo 复习下思路, 最好再编下
public class ll_86_todocode_PartitionList {
    public static void main(String[] args) {
        //TreeNode
        ListNode node;
        node = ll_0_tuition.getLinkedList(10);
        ll_0_tuition.printListNode(partition1(node, 5));

        // todo bug case 小值在第一位
        ll_0_tuition.printListNode(partition1(node, 5));  // < 改为 > 即可,逻辑一样
    }

    // easy to remember
    public static ListNode partition2(ListNode head, int x) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode l1 = dummy, l2 = dummy;
        while (l2.next != null) {
            if (l2.next.val < x) {
                if (l1 == l2) {
                    l1 = l1.next;
                    l2 = l2.next;
                    continue;
                }
                //delete
                ListNode c = l2.next;
                l2.next = l2.next.next;

                //insert
                c.next = l1.next;
                l1.next = c;
                l1 = l1.next;
            } else l2 = l2.next;
        }
        return dummy.next;
    }

    public static ListNode partition1(ListNode head, int x) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode l1 = dummy, l2 = dummy;
        while (l2.next != null) {
            if (l2.next.val < x) {
                //delete
                ListNode c = l2.next;
                l2.next = l2.next.next;

                //insert
                if (c != l1.next) {
                    c.next = l1.next;
                    l1.next = c;
                }
                l1 = l1.next;
            } else l2 = l2.next;
        }
        return dummy.next;
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
 //todo 思路1 双指针分别指向最后一个小值, 和cur (不断将小值卸掉, 插入到 以前小值的尾部)
 //todo bug 注意 两个指针相等的时候, 要特殊处理

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
