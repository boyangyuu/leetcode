package linkedList;

import tutorials.ListNode;


// 12/20 5:40-- 5:59 bf
public class ll_21_ok_MergeTwoSortedLists {
    public static void main(String[] args) {
        //TreeNode
        ListNode dummy = new ListNode(-1), cur = dummy;
        for (int i = 0; i < 10; i++) {
            ListNode t = new ListNode(i * 2 + 1);
            cur.next = t;
            cur = cur.next;
        }

        ListNode dummy2 = new ListNode(-1), cur2 = dummy2;
        for (int i = 0; i < 10; i++) {
            ListNode t = new ListNode(i * 2);
            cur2.next = t;
            cur2 = cur2.next;
        }

        ListNode res = mergeTwoLists(dummy.next, dummy2.next);
        while (res != null) {
            System.out.print(res.val + " ,");
            res = res.next;
        }
    }


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1), cur = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        if (l1 != null) cur.next = l1;
        if (l2 != null) cur.next = l2;
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
