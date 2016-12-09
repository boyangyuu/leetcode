package linkedList;

import tutorials.ListNode;

// todo 需要重做 以提高熟练度 bug2

public class ll_92_bug_ReverseLinkedList2 {
    public static void main(String[] args) {
        //TreeNode
        ListNode node = ll_0_tuition.getLinkedList(10);
        ll_0_tuition.printListNode(node);
        ll_0_tuition.printListNode( reverseBetween(node, 9, 10));

        // bug case
        ListNode node1 = ll_0_tuition.getLinkedList(2);
        ll_0_tuition.printListNode( reverseBetween(node1, 1, 2));
    }

    public static ListNode reverseBetween(ListNode head, int m, int n) {
        int mt = m;
        ListNode head1 = new ListNode(-1);
        ListNode res = head1;
        head1.next = head;
        while(--mt != 0) head1 = head1.next;

        ListNode cur = head1.next;
        while (n-- != m) {
            ListNode tmp = head1.next;
            head1.next = cur.next;
            cur.next = cur.next.next;
            head1.next.next = tmp;
        }
        return res.next;
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
