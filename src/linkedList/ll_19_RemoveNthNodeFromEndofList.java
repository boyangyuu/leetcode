package linkedList;

import tutorials.ListNode;

// todo 写的不够快
public class ll_19_RemoveNthNodeFromEndofList {
    public static void main(String[] args) {
        //TreeNode
        ListNode node = ll_0_tuition.getLinkedList(10);

        ll_0_tuition.printListNode(node);
        ll_0_tuition.printListNode(removeNthFromEnd(node, 1));
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast = dummy, slow = dummy;
        for (int i = 0; i < n; i++) fast = fast.next;

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
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
 ######s1######
 --O(n)--

 --data--

 --step1--

 --step2--

 ######s2######
 --O(n)--

 --data--

 --step1--

 --step2--


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
