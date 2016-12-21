package linkedList;

import tutorials.ListNode;


// 12/20 6:01 --6.13 bf
public class ll_24_ok_SwapNodesinPairs {
    public static void main(String[] args) {
        //TreeNode
        ListNode node = ll_0_tuition.getLinkedList(1);
        ll_0_tuition.printListNode(swapPairs(null));
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1), cur = dummy;
        dummy.next = head;
        while (cur.next != null && cur.next.next != null) {
            ListNode r = cur.next.next;
            cur.next.next = r.next;
            r.next = cur.next;
            cur.next = r;
            cur = cur.next.next;
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
